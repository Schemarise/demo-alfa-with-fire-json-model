<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.adjustment
<img src='images/fire.model.adjustment.svg'/>


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
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The observation or value date for the data in this object. Formatted as YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>col</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The column of the report that this adjustment relates to.</p>
</td>
    </tr>
    <tr>
        <td>reporting_entity_name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The name of the reporting legal entity for display purposes.</p>
</td>
    </tr>
    <tr>
        <td>report_type</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The report that this adjustment relates to.</p>
</td>
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
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td><p>The currency of the contribution_amount in accordance with ISO 4217 standards.</p>
</td>
    </tr>
    <tr>
        <td>comment</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The description or commentary around the adjustment.</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier for the record within the firm.</p>
</td>
    </tr>
    <tr>
        <td>page</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The page of the report that this adjustment relates to.</p>
</td>
    </tr>
    <tr>
        <td>row</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The row of the report that this adjustment relates to.</p>
</td>
    </tr>
    <tr>
        <td>contribution_text</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The text to use for the adjustment where the reported cell is not a monetary value.</p>
</td>
    </tr>
    <tr>
        <td>contribution_amount</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The contribution amount this adjustment should make to the specified report cell. A positive/negative number in minor units (cents/pence).</p>
</td>
    </tr>

  </tbody>
</table>
      

<br/>

### Referenced from fields in:
- <img src='images/recordType.svg'/> [fire.model.example_data](UDT-fire.model.example_data.md)
