<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.collateral
>  
>Data schema to define collateral (currently can reference loans or accounts).
> 
<img src='images/fire.model.collateral.svg'/>


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
        <td>end_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The end date for recognition of the collateral</p>
</td>
    </tr>
    <tr>
        <td>account_ids</td>
        <td><i>list< string ></i> <b>?</b></td>
        <td><p>The unique identifier/s for the account/s within the financial institution.</p>
</td>
    </tr>
    <tr>
        <td>charge</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>Lender charge on collateral, 1 indicates first charge, 2 second and so on. 0 indicates a combination of charge levels.</p>
</td>
    </tr>
    <tr>
        <td>orig_value</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The valuation as used by the bank for the collateral at the origination of the related loan or line of credit. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>encumbrance_type</td>
        <td><i><a href='UDT-fire.model.collateral_encumbrance_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.collateral_encumbrance_type</a></i> <b>?</b></td>
        <td><p>The type of the encumbrance causing the encumbrance_amount.</p>
</td>
    </tr>
    <tr>
        <td>regulatory_book</td>
        <td><i><a href='UDT-fire.model.regulatory_book.html'><img src='images/enumType.svg'/>&nbsp;fire.model.regulatory_book</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>source</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The source(s) where this data originated. If more than one source needs to be stored for data lineage, it should be separated by a dash. eg. Source1-Source2</p>
</td>
    </tr>
    <tr>
        <td>version_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The version identifier of the data such as the firm's internal batch identifier.</p>
</td>
    </tr>
    <tr>
        <td>type</td>
        <td><i><a href='UDT-fire.model.collateral_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.collateral_type</a></i> <b>?</b></td>
        <td><p>The collateral type defines the form of the collateral provided</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>vol_adj_fx</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The volatility adjustment appropriate to currency mismatch.</p>
</td>
    </tr>
    <tr>
        <td>loan_ids</td>
        <td><i>list< string ></i> <b>?</b></td>
        <td><p>The unique identifiers for the loans within the financial institution.</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td>string</td>
        <td><p>The unique identifier for the record within the firm.</p>
</td>
    </tr>
    <tr>
        <td>encumbrance_amount</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The amount of the collateral that is encumbered by potential future commitments or legal liabilities. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>vol_adj</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The volatility adjustment appropriate to the collateral.</p>
</td>
    </tr>
    <tr>
        <td>value</td>
        <td>int</td>
        <td><p>The valuation as used by the bank for the collateral on the value_date. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>security_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier used by the financial institution to identify the security representing collateral.</p>
</td>
    </tr>
    <tr>
        <td>start_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The start date for recognition of the collateral</p>
</td>
    </tr>
    <tr>
        <td>value_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the collateral was valued. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>

  </tbody>
</table>
      

<br/>

### Referenced from fields in:
- <img src='images/recordType.svg'/> [fire.model.batch](UDT-fire.model.batch.md)
- <img src='images/recordType.svg'/> [fire.model.example_data](UDT-fire.model.example_data.md)
