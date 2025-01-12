<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.security
>  
>A security represents a tradable financial instrument held or financed by an institution for investment or collateral.
> 
<img src='images/fire.model.security.svg'/>


## Local Fields

<table >
  <thead>
    <tr>
      <th>Name</th>
      <th>Datatype</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
        <td>accounting_treatment</td>
        <td><i><a href='UDT-fire.model.accounting_treatment.html'><img src='images/enumType.svg'/>&nbsp;fire.model.accounting_treatment</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>ccf</td>
        <td><i>double(0.0, *)</i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>impairment_amount</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>The impairment amount for a security is the allowance set aside by the firm for losses.</p>
</td>
    </tr>
    <tr>
        <td>reporting_entity_name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The name of the reporting legal entity for display purposes.</p>
</td>
    </tr>
    <tr>
        <td>day_count_convention</td>
        <td><i><a href='UDT-fire.model.day_count_convention.html'><img src='images/enumType.svg'/>&nbsp;fire.model.day_count_convention</a></i> <b>?</b></td>
        <td><p>The standardised methodology for calculating the number of days between two dates. It is used to calculate the amount of accrued interest or the present value.</p>
</td>
    </tr>
    <tr>
        <td>type</td>
        <td><i><a href='UDT-fire.model.security_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_type</a></i> <b>?</b></td>
        <td><p>This is the type of the security with regards to common regulatory classifications.</p>
</td>
    </tr>
    <tr>
        <td>moodys_st</td>
        <td><i><a href='UDT-fire.model.security_moodys_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_moodys_st</a></i> <b>?</b></td>
        <td><p>Moodys short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>balance</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Outstanding amount including accrued interest. Monetary integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>snp_st</td>
        <td><i><a href='UDT-fire.model.security_snp_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_snp_st</a></i> <b>?</b></td>
        <td><p>S&amp;P short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td>string</td>
        <td><p>The unique identifier for the record within the firm.</p>
</td>
    </tr>
    <tr>
        <td>deal_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier used by the financial institution to identify the deal for this product that links it to other products of the same or different type.</p>
</td>
    </tr>
    <tr>
        <td>rehypothecation</td>
        <td><i>boolean</i> <b>?</b></td>
        <td><p>Can the security be rehypothecated by the borrower?</p>
</td>
    </tr>
    <tr>
        <td>lgd_floored</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The final LGD value after the relevant floors have been applied. To be used in the IRB RWA calculations.</p>
</td>
    </tr>
    <tr>
        <td>call_dates</td>
        <td><i>list< datetime ></i> <b>?</b></td>
        <td><p>Dates where this contract can be called (by the customer). Formatted as YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>originator_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier used by the financial institution to identify the originator of the security or securitisation.</p>
</td>
    </tr>
    <tr>
        <td>moodys_lt</td>
        <td><i><a href='UDT-fire.model.security_moodys_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_moodys_lt</a></i> <b>?</b></td>
        <td><p>Moody's long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>dbrs_lt</td>
        <td><i><a href='UDT-fire.model.security_dbrs_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_dbrs_lt</a></i> <b>?</b></td>
        <td><p>DBRS long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>attachment_point</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The threshold at which losses within the pool of underlying exposures would start to be allocated to the relevant securitisation position.</p>
</td>
    </tr>
    <tr>
        <td>base_rate</td>
        <td><i><a href='UDT-fire.model.security_base_rate.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_base_rate</a></i> <b>?</b></td>
        <td><p>The base rate represents the basis of the rate on the balance at the given date as agreed in the terms of the financial product.</p>
</td>
    </tr>
    <tr>
        <td>asset_liability</td>
        <td><i><a href='UDT-fire.model.asset_liability.html'><img src='images/enumType.svg'/>&nbsp;fire.model.asset_liability</a></i> <b>?</b></td>
        <td><p>Is the security (valued at either amortised cost or fair value) an asset or a liability on the firm's balance sheet.</p>
</td>
    </tr>
    <tr>
        <td>reversion_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that indicates the end of an initial period where the 'rate' is applied to a security. After this the interest is calculated using the 'reversion_rate'. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>cost_center_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The organizational unit or sub-unit to which costs/profits are booked.</p>
</td>
    </tr>
    <tr>
        <td>hqla_class</td>
        <td><i><a href='UDT-fire.model.security_hqla_class.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_hqla_class</a></i> <b>?</b></td>
        <td><p>What is the HQLA classification of this security?</p>
</td>
    </tr>
    <tr>
        <td>status</td>
        <td><i><a href='UDT-fire.model.security_status.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_status</a></i> <b>?</b></td>
        <td><p>Provides additional information regarding the status of the security.</p>
</td>
    </tr>
    <tr>
        <td>end_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>mic_code</td>
        <td><i>string(4, 4)</i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>pd_irb</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The probability of default as determined by internal rating-based methods, represented as a number between 0 and 1.</p>
</td>
    </tr>
    <tr>
        <td>kbra_lt</td>
        <td><i><a href='UDT-fire.model.security_kbra_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_kbra_lt</a></i> <b>?</b></td>
        <td><p>KBRA long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>interest_repayment_frequency</td>
        <td><i><a href='UDT-fire.model.security_interest_repayment_frequency.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_interest_repayment_frequency</a></i> <b>?</b></td>
        <td><p>Repayment frequency of the interest.</p>
</td>
    </tr>
    <tr>
        <td>notional_amount</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The notional value is the total amount of a security's underlying asset at its spot price. Monetary number of cents.</p>
</td>
    </tr>
    <tr>
        <td>regulatory_book</td>
        <td><i><a href='UDT-fire.model.regulatory_book.html'><img src='images/enumType.svg'/>&nbsp;fire.model.regulatory_book</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>guarantee_start_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The first day the security became guaranteed by the guarantor. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>risk_weight_irb</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The internal risk weight represented as a decimal/float such that 1.5% is 0.015.</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td><p>Actual currency of the security in accordance with ISO 4217 standards. It should be consistent with balance, accrued_interest, guarantee_amount and other monetary amounts.</p>
</td>
    </tr>
    <tr>
        <td>repayment_type</td>
        <td><i><a href='UDT-fire.model.security_repayment_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_repayment_type</a></i> <b>?</b></td>
        <td><p>The repayment or amortisation mechanism of the security or securitisation.</p>
</td>
    </tr>
    <tr>
        <td>on_balance_sheet</td>
        <td><i>boolean</i> <b>?</b></td>
        <td><p>Is the security reported on the balance sheet of the financial institution?</p>
</td>
    </tr>
    <tr>
        <td>issue_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date on which the security is issued. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>insolvency_rank</td>
        <td><i>int(1, *)</i> <b>?</b></td>
        <td><p>The insolvency ranking as per the national legal fraamework of the reporting institution.</p>
</td>
    </tr>
    <tr>
        <td>cr_approach</td>
        <td><i><a href='UDT-fire.model.cr_approach.html'><img src='images/enumType.svg'/>&nbsp;fire.model.cr_approach</a></i> <b>?</b></td>
        <td><p>Specifies the approved credit risk rwa calculation approach to be applied to the exposure.</p>
</td>
    </tr>
    <tr>
        <td>csa_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier of the credit support annex this security falls under. Typically where used as derivatives collateral.</p>
</td>
    </tr>
    <tr>
        <td>index_composition</td>
        <td><i>set< <a href='UDT-fire.model.security_index_composition.html'><img src='images/recordType.svg'/>&nbsp;fire.model.security_index_composition</a> ></i> <b>?</b></td>
        <td><p>Constituents and their proportion in an index.</p>
</td>
    </tr>
    <tr>
        <td>cqs_standardised</td>
        <td><i>int(1, 17)</i> <b>?</b></td>
        <td><p>The credit quality step for standardised approach.</p>
</td>
    </tr>
    <tr>
        <td>forbearance_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date on which the first forbearance measure was granted to this product.  Format should be YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>detachment_point</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The threshold at which losses within the pool of underlying exposures would result in a complete loss of principal for the tranche containing the relevant securitisation position.</p>
</td>
    </tr>
    <tr>
        <td>start_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the trade or financial product commences. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>impairment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date upon which the product became considered impaired. Format should be YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>trade_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the trade or financial product terms are agreed. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>issuer_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier for the issuer within the financial institution.</p>
</td>
    </tr>
    <tr>
        <td>cover_pool_balance</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>The balance of the assets that are held in the cover pool</p>
</td>
    </tr>
    <tr>
        <td>cb_haircut</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The haircut as determined by the firm's central bank</p>
</td>
    </tr>
    <tr>
        <td>first_arrears_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The first date on which this security was in arrears.</p>
</td>
    </tr>
    <tr>
        <td>accrued_interest</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The accrued interest since the last payment date and due at the next payment date. Monetary type represented as an integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>customer_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier used by the financial institution to identify the customer for this product.</p>
</td>
    </tr>
    <tr>
        <td>movement</td>
        <td><i><a href='UDT-fire.model.security_movement.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_movement</a></i> <b>?</b></td>
        <td><p>The movement parameter describes how the security arrived to the firm.</p>
</td>
    </tr>
    <tr>
        <td>seniority</td>
        <td><i><a href='UDT-fire.model.security_seniority.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_seniority</a></i> <b>?</b></td>
        <td><p>The seniority of the security in the event of sale or bankruptcy of the issuer.</p>
</td>
    </tr>
    <tr>
        <td>sft_type</td>
        <td><i><a href='UDT-fire.model.security_sft_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_sft_type</a></i> <b>?</b></td>
        <td><p>The sft_type parameter defines the transaction mechanism conducted for the SFT for this security product.</p>
</td>
    </tr>
    <tr>
        <td>value_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the trade or financial product was valued. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>date</td>
        <td>datetime</td>
        <td><p>The observation or value date for the data in this object. Formatted as YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>cqs_irb</td>
        <td><i>int(1, 12)</i> <b>?</b></td>
        <td><p>The credit quality step for internal ratings based approach.</p>
</td>
    </tr>
    <tr>
        <td>risk_weight_std</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The standardised approach risk weight represented as a decimal/float such that 1.5% is 0.015.</p>
</td>
    </tr>
    <tr>
        <td>securitisation_type</td>
        <td><i><a href='UDT-fire.model.security_securitisation_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_securitisation_type</a></i> <b>?</b></td>
        <td><p>The type of securitisation with regards to common regulatory classifications.</p>
</td>
    </tr>
    <tr>
        <td>mtm_clean</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The mark-to-market value of the security excluding interest. Monetary number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>impairment_status</td>
        <td><i><a href='UDT-fire.model.impairment_status.html'><img src='images/enumType.svg'/>&nbsp;fire.model.impairment_status</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>transferable</td>
        <td><i>boolean</i> <b>?</b></td>
        <td><p>Can the security be transferred between parties or negotiated on the capital market?</p>
</td>
    </tr>
    <tr>
        <td>source</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The source(s) where this data originated. If more than one source needs to be stored for data lineage, it should be separated by a dash. eg. Source1-Source2</p>
</td>
    </tr>
    <tr>
        <td>fitch_lt</td>
        <td><i><a href='UDT-fire.model.security_fitch_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_fitch_lt</a></i> <b>?</b></td>
        <td><p>Fitch long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>kbra_st</td>
        <td><i><a href='UDT-fire.model.security_kbra_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_kbra_st</a></i> <b>?</b></td>
        <td><p>KBRA short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>ledger_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The internal ledger code or line item name.</p>
</td>
    </tr>
    <tr>
        <td>isin_code</td>
        <td><i>string(12, 12)</i> <b>?</b></td>
        <td><p>The unique International Securities Identification Number for the security according to ISO 6166.</p>
</td>
    </tr>
    <tr>
        <td>issue_size</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The size of the issue denominated in the original currency of the security</p>
</td>
    </tr>
    <tr>
        <td>risk_profile</td>
        <td><i>int(1, 10)</i> <b>?</b></td>
        <td><p>The evaluation of the financial risk associated to the portfolio</p>
</td>
    </tr>
    <tr>
        <td>last_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The final payment date for interest payments, often coincides with end_date or the maturity date</p>
</td>
    </tr>
    <tr>
        <td>product_name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The name of the product as given by the financial institution to be used for display and reference purposes.</p>
</td>
    </tr>
    <tr>
        <td>excess_spread_type</td>
        <td><i><a href='UDT-fire.model.security_excess_spread_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_excess_spread_type</a></i> <b>?</b></td>
        <td><p>Excess spread</p>
</td>
    </tr>
    <tr>
        <td>retention_type</td>
        <td><i><a href='UDT-fire.model.security_retention_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_retention_type</a></i> <b>?</b></td>
        <td><p>The repayment or amortisation mechanism of the security or securitisation.</p>
</td>
    </tr>
    <tr>
        <td>country_code</td>
        <td><i><a href='UDT-fire.model.country_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.country_code</a></i> <b>?</b></td>
        <td><p>Two-letter country code for security location/jurisdiction. In accordance with ISO 3166-1.</p>
</td>
    </tr>
    <tr>
        <td>fitch_st</td>
        <td><i><a href='UDT-fire.model.security_fitch_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_fitch_st</a></i> <b>?</b></td>
        <td><p>Fitch short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>first_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The first payment date for interest payments.</p>
</td>
    </tr>
    <tr>
        <td>guarantor_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier for the guarantor within the financial institution.</p>
</td>
    </tr>
    <tr>
        <td>reversion_rate</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The rate to which the security will revert after the reversion date. Percentages represented as a decimal/float, so 1.5 implies 1.5%.</p>
</td>
    </tr>
    <tr>
        <td>stress_change</td>
        <td><i>double(0.0, *)</i> <b>?</b></td>
        <td><p>The level of variation on the security's price or haircut or during a 30 day calendar market stress period in percentage terms</p>
</td>
    </tr>
    <tr>
        <td>purpose</td>
        <td><i><a href='UDT-fire.model.security_purpose.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_purpose</a></i> <b>?</b></td>
        <td><p>The purpose for which the security is being held.</p>
</td>
    </tr>
    <tr>
        <td>risk_country_code</td>
        <td><i><a href='UDT-fire.model.country_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.country_code</a></i> <b>?</b></td>
        <td><p>Two-letter country code describing where the risk for the security resides. In accordance with ISO 3166-1</p>
</td>
    </tr>
    <tr>
        <td>dbrs_st</td>
        <td><i><a href='UDT-fire.model.security_dbrs_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_dbrs_st</a></i> <b>?</b></td>
        <td><p>DBRS short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>fvh_level</td>
        <td><i>int(1, 3)</i> <b>?</b></td>
        <td><p>Fair value hierarchy category according to IFRS 13.93 (b)</p>
</td>
    </tr>
    <tr>
        <td>maturity_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date on which the principal repayment of the security is due. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>retention_pct</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The percentage of the issuance retained by the issuer. e.g. 0.05 is 5%.</p>
</td>
    </tr>
    <tr>
        <td>next_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The next date at which interest will be paid or accrued_interest balance returned to zero.</p>
</td>
    </tr>
    <tr>
        <td>rate</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The full interest rate applied to the security notional in percentage terms. Note that this therefore includes the base_rate (ie. not the spread).</p>
</td>
    </tr>
    <tr>
        <td>capital_tier</td>
        <td><i><a href='UDT-fire.model.security_capital_tier.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_capital_tier</a></i> <b>?</b></td>
        <td><p>The capital tiers based on own funds requirements.</p>
</td>
    </tr>
    <tr>
        <td>ccr_approach</td>
        <td><i><a href='UDT-fire.model.security_ccr_approach.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_ccr_approach</a></i> <b>?</b></td>
        <td><p>Specifies the approved counterparty credit risk methodology for calculating exposures.</p>
</td>
    </tr>
    <tr>
        <td>prev_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The most recent previous date at which interest was paid or accrued_interest balance returned to zero.</p>
</td>
    </tr>
    <tr>
        <td>encumbrance_amount</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>The amount of the security that is encumbered by potential future commitments or legal liabilities such as within a repo pool. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>break_dates</td>
        <td><i>list< datetime ></i> <b>?</b></td>
        <td><p>Dates where this contract can be broken (by either party). Formatted as YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>call_type</td>
        <td><i><a href='UDT-fire.model.security_call_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_call_type</a></i> <b>?</b></td>
        <td><p>The call mechanism, if present, for the issuance. For securitisations and other callable securities.</p>
</td>
    </tr>
    <tr>
        <td>mna_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier of the Master Netting Agreement this security falls under. Typically where used as derivatives collateral.</p>
</td>
    </tr>
    <tr>
        <td>reporting_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The internal ID for the legal entity under which the account is being reported.</p>
</td>
    </tr>
    <tr>
        <td>version_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The version identifier of the data such as the firm's internal batch identifier.</p>
</td>
    </tr>
    <tr>
        <td>snp_lt</td>
        <td><i><a href='UDT-fire.model.security_snp_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.security_snp_lt</a></i> <b>?</b></td>
        <td><p>S&amp;P long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>acc_fv_change_credit_risk</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Accumulated changes in fair value due to credit risk.</p>
</td>
    </tr>
    <tr>
        <td>lgd_irb</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The loss given default as determined by internal rating-based methods, represented as a number between 0 and 1.</p>
</td>
    </tr>
    <tr>
        <td>mtm_dirty</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The mark-to-market value of the security including interest. Monetary number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>acc_fv_change_before_taxes</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Accumulated change in fair value before taxes.</p>
</td>
    </tr>
    <tr>
        <td>next_repricing_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date on which the interest rate of the security will be re-calculated. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>

  </tbody>
</table>
      

<br/>

### Referenced from fields in:
- <img src='images/recordType.svg'/> [fire.model.batch](UDT-fire.model.batch.md)
- <img src='images/recordType.svg'/> [fire.model.example_data](UDT-fire.model.example_data.md)
