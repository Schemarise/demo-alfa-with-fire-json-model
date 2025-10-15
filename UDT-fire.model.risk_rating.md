<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.risk_rating
>  
>A risk rating entry for a risk rating system
> 
<img src='images/fire.model.risk_rating.svg'/>


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
        <td>pd_max</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>Maximum Probability of Default</p>
</td>
    </tr>
    <tr>
        <td>name</td>
        <td>string</td>
        <td><p>The name or classification of the risk rating, used for reporting and segmentation.</p>
</td>
    </tr>
    <tr>
        <td>description</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>A description of the internal risk rating.</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td>string</td>
        <td><p>Unique identifier for the risk rating</p>
</td>
    </tr>
    <tr>
        <td>pd_min</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>Minimum Probability of Default</p>
</td>
    </tr>
    <tr>
        <td>source</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The source where this data originated.</p>
</td>
    </tr>
    <tr>
        <td>version_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The version identifier of the data such as the firm's internal batch identifier.</p>
</td>
    </tr>
    <tr>
        <td>lgd_max</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>Maximum Loss Given Default, representing the highest expected loss as a percentage of exposure at default.</p>
</td>
    </tr>
    <tr>
        <td>lgd_min</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>Minimum Loss Given Default, representing the lowest expected loss as a percentage of exposure at default.</p>
</td>
    </tr>
    <tr>
        <td>risk_rating_system_id</td>
        <td>string</td>
        <td><p>Reference to the risk rating system that this Internal Risk Rating belongs to</p>
</td>
    </tr>

  </tbody>
</table>
      
