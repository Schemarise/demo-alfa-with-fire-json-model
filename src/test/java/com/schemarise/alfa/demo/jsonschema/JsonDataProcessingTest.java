package com.schemarise.alfa.demo.jsonschema;

import com.schemarise.alfa.runtime.Alfa;
import com.schemarise.alfa.runtime.AlfaRuntimeValiationException;
import com.schemarise.alfa.runtime.codec.json.JsonCodecConfig;
import fire.model.asset_liability;
import fire.model.example;
import fire.model.loan;
import fire.model.loan_type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class JsonDataProcessingTest {

    /**
     * Test that we can read a Fire JSON file and validate its contents
     */
    @Test
    public void testReadLoan() throws IOException {
        String pathStr = getClass().getResource("/").getPath() + "../../src/main/resources/fire/examples/bbl_loans.json";
        InputStream is = Files.newInputStream(Paths.get(pathStr));

        // Set the class type we are expecting
        JsonCodecConfig dc = Alfa.jsonCodecConfigBuilder().setAssignableToClass(example.class).build();

        // Read JSON and construct ALFA object
        example obj = Alfa.jsonCodec().importObj(dc, is);

        // Perform checks on what has been deserialized
        Assertions.assertTrue( obj.getData().getLoan().isPresent() );

        Set<loan> loans = obj.getData().getLoan().get();
        assertEquals(3, loans.size());

        loans.forEach( l -> {
            assertEquals(l.getAsset_liability().get(), asset_liability.asset);
            assertEquals(l.getType().get(), loan_type.commercial);
        } );

        // Create a new set of loans with fees set to 100
        List<loan> loansWithFees = loans.stream().map(l -> {
            loan.loanBuilder lb = l.toBuilder();
            lb.setFees(100);
            return lb.build();
        }).toList();

        // validate the fees
        loansWithFees.forEach( l -> assertEquals(l.getFees().get(), 100));
    }

    @Test
    public void failOnInvalidJson() throws IOException {

        // Error in the JSON - "asset_liability": "set" <- typo in 'set', should 'asset'
        var json = """
                  {
                    "date": "2020-08-08T00:00:00+00:00",
                    "id": "BBL1",
                    "asset_liability": "set",
                    "balance": 2500000,
                    "currency_code": "GBP"
                  }""";

        JsonCodecConfig dc = Alfa.jsonCodecConfigBuilder().setAssignableToClass(loan.class).build();

        // Attempting to read should fail with a validation error
        Exception excp = assertThrows( AlfaRuntimeValiationException.class, () -> Alfa.jsonCodec().fromJsonString(dc, json) );
        assertEquals("Failed to process field 'asset_liability'. " +
                        "Invalid value 'set' for type 'fire.model.asset_liability' at line:4 column:27 offset:83",
                excp.getMessage() );
    }
}
