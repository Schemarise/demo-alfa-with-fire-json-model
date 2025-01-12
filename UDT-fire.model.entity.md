<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.entity
>  
>Data schema to define a person or legal entity.
> 
<img src='images/fire.model.entity.svg'/>


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
        <td>date</td>
        <td>datetime</td>
        <td><p>The observation or value date for the data in this object. Formatted as YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>intra_group</td>
        <td><i>boolean</i> <b>?</b></td>
        <td><p>Flag to indicate that this should be considered an intra-group entity.</p>
</td>
    </tr>
    <tr>
        <td>naics_code</td>
        <td><i>int(10, 999999)</i> <b>?</b></td>
        <td><p>North American Industry Classification System - NAICS Code</p>
</td>
    </tr>
    <tr>
        <td>cqs_irb</td>
        <td><i>int(1, 12)</i> <b>?</b></td>
        <td><p>The credit quality step for internal ratings based approach.</p>
</td>
    </tr>
    <tr>
        <td>pd_irb</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The probability of default as determined by internal rating-based methods, represented as a number between 0 and 1.</p>
</td>
    </tr>
    <tr>
        <td>headcount</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The number of full time staff.</p>
</td>
    </tr>
    <tr>
        <td>total_assets</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The annual balance sheet total of the entity as at the last accounting reference date.</p>
</td>
    </tr>
    <tr>
        <td>risk_country_code</td>
        <td><i><a href='UDT-fire.model.country_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.country_code</a></i> <b>?</b></td>
        <td><p>Two-letter country code describing where the risk for the security resides. In accordance with ISO 3166-1</p>
</td>
    </tr>
    <tr>
        <td>internal_rating</td>
        <td><i><a href='UDT-fire.model.entity_internal_rating.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_internal_rating</a></i> <b>?</b></td>
        <td><p>Categorization of unrated exposure</p>
</td>
    </tr>
    <tr>
        <td>dbrs_st</td>
        <td><i><a href='UDT-fire.model.entity_dbrs_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_dbrs_st</a></i> <b>?</b></td>
        <td><p>DBRS short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>kbra_lt</td>
        <td><i><a href='UDT-fire.model.entity_kbra_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_kbra_lt</a></i> <b>?</b></td>
        <td><p>KBRA long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>scra</td>
        <td><i><a href='UDT-fire.model.entity_scra.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_scra</a></i> <b>?</b></td>
        <td><p>Grade calculated using the Basel Standardised Credit Risk Assessment</p>
</td>
    </tr>
    <tr>
        <td>source</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The source(s) where this data originated. If more than one source needs to be stored for data lineage, it should be separated by a dash. eg. Source1-Source2</p>
</td>
    </tr>
    <tr>
        <td>type</td>
        <td><i><a href='UDT-fire.model.entity_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_type</a></i> <b>?</b></td>
        <td><p>The designated financial or legal entity category this person or legal entity falls under</p>
</td>
    </tr>
    <tr>
        <td>fitch_lt</td>
        <td><i><a href='UDT-fire.model.entity_fitch_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_fitch_lt</a></i> <b>?</b></td>
        <td><p>Fitch long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td><p>Currency in accordance with ISO 4217. It should be consistent with the figures for turnover and total assets.</p>
</td>
    </tr>
    <tr>
        <td>nace_code</td>
        <td><i><a href='UDT-fire.model.entity_nace_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_nace_code</a></i> <b>?</b></td>
        <td><p>The EU NACE economic activity classification.</p>
</td>
    </tr>
    <tr>
        <td>kbra_st</td>
        <td><i><a href='UDT-fire.model.entity_kbra_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_kbra_st</a></i> <b>?</b></td>
        <td><p>KBRA short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>moodys_st</td>
        <td><i><a href='UDT-fire.model.entity_moodys_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_moodys_st</a></i> <b>?</b></td>
        <td><p>Moodys short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>credit_impaired</td>
        <td><i>boolean</i> <b>?</b></td>
        <td><p>Flag to determine if the entity credit quality is impaired.</p>
</td>
    </tr>
    <tr>
        <td>snp_st</td>
        <td><i><a href='UDT-fire.model.entity_snp_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_snp_st</a></i> <b>?</b></td>
        <td><p>S&amp;P short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>lei_code</td>
        <td><i>string(20, 20)</i> <b>?</b></td>
        <td><p>The LEI code for the legal entity (for corporates).</p>
</td>
    </tr>
    <tr>
        <td>cqs_standardised</td>
        <td><i>int(1, 17)</i> <b>?</b></td>
        <td><p>The credit quality step for standardised approach.</p>
</td>
    </tr>
    <tr>
        <td>national_reporting_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>Unique identifier established by the national reporting system</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td>string</td>
        <td><p>The unique identifier for the record within the firm.</p>
</td>
    </tr>
    <tr>
        <td>relationship</td>
        <td><i><a href='UDT-fire.model.entity_relationship.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_relationship</a></i> <b>?</b></td>
        <td><p>Relationship to parent.</p>
</td>
    </tr>
    <tr>
        <td>turnover</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The annual turnover of the entity as at the last accounting reference date.</p>
</td>
    </tr>
    <tr>
        <td>boe_sector_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>Bank of England sector code.</p>
</td>
    </tr>
    <tr>
        <td>count</td>
        <td><i>int(1, *)</i> <b>?</b></td>
        <td><p>Describes the number of entities represented by this record. eg. joint customers should have a count &gt; 1.</p>
</td>
    </tr>
    <tr>
        <td>boe_industry_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>Bank of England industry code.</p>
</td>
    </tr>
    <tr>
        <td>moodys_lt</td>
        <td><i><a href='UDT-fire.model.entity_moodys_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_moodys_lt</a></i> <b>?</b></td>
        <td><p>Moody's long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>version_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The version identifier of the data such as the firm's internal batch identifier.</p>
</td>
    </tr>
    <tr>
        <td>risk_group_id_2</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The secondary identifier for the secondary group representing a single risk entity where no relationship of control exists</p>
</td>
    </tr>
    <tr>
        <td>snp_lt</td>
        <td><i><a href='UDT-fire.model.entity_snp_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_snp_lt</a></i> <b>?</b></td>
        <td><p>S&amp;P long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>dbrs_lt</td>
        <td><i><a href='UDT-fire.model.entity_dbrs_lt.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_dbrs_lt</a></i> <b>?</b></td>
        <td><p>DBRS long term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>address_city</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>City, town or village.</p>
</td>
    </tr>
    <tr>
        <td>country_code</td>
        <td><i><a href='UDT-fire.model.country_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.country_code</a></i> <b>?</b></td>
        <td><p>The person or entity country of residence. Two-letter country code as defined according to ISO 3166-1.</p>
</td>
    </tr>
    <tr>
        <td>lgd_irb</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The loss given default as determined by internal rating-based methods, represented as a number between 0 and 1.</p>
</td>
    </tr>
    <tr>
        <td>sic_code</td>
        <td><i>int(0, 99999)</i> <b>?</b></td>
        <td><p>The UK SIC 2007 standard industry and sector classification.</p>
</td>
    </tr>
    <tr>
        <td>fitch_st</td>
        <td><i><a href='UDT-fire.model.entity_fitch_st.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_fitch_st</a></i> <b>?</b></td>
        <td><p>Fitch short term credit ratings</p>
</td>
    </tr>
    <tr>
        <td>parent_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier for the ultimate parent of the person or legal entity.</p>
</td>
    </tr>
    <tr>
        <td>reporting_relationship</td>
        <td><i><a href='UDT-fire.model.entity_reporting_relationship.html'><img src='images/enumType.svg'/>&nbsp;fire.model.entity_reporting_relationship</a></i> <b>?</b></td>
        <td><p>Relationship to reporting entity. See: relationship.</p>
</td>
    </tr>
    <tr>
        <td>name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The name of the person or legal entity to be used for display and reference purposes.</p>
</td>
    </tr>
    <tr>
        <td>risk_group_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier for the group representing a single risk entity where no relationship of control exists</p>
</td>
    </tr>
    <tr>
        <td>legal_entity_name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The official legal name of the entity.</p>
</td>
    </tr>
    <tr>
        <td>ssic_code</td>
        <td><i>int(0, 99999)</i> <b>?</b></td>
        <td><p>The Singaporean standard industry and sector classification.</p>
</td>
    </tr>

  </tbody>
</table>
      
