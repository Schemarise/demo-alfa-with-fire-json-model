<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.curve
>  
>A Curve represents a series of points on a plot. Typically, interest rates, volatility or forward prices.
> 
<img src='images/fire.model.curve.svg'/>


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
        <td>values</td>
        <td>set< <a href='UDT-fire.model.curve_values.html'><img src='images/recordType.svg'/>&nbsp;fire.model.curve_values</a> ></td>
        <td><p>The list of values for this curve.</p>
</td>
    </tr>
    <tr>
        <td>name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The internal name of the curve.</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td>string</td>
        <td><p>The unique identifier for the record within the firm.</p>
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
        <td>type</td>
        <td><i><a href='UDT-fire.model.curve_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.curve_type</a></i> <b>?</b></td>
        <td><p>The curve type.</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td><p>The currency reference code in accordance with ISO 4217 standards.</p>
</td>
    </tr>

  </tbody>
</table>
      

<br/>

### Referenced from fields in:
- <img src='images/recordType.svg'/> [fire.model.example_data](UDT-fire.model.example_data.md)
