<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.loan_cash_flow
>  
>A loan cash flow represents the future movement of cash as part of contractually agreed payments for an existing loan.
> 
<img src='images/fire.model.loan_cash_flow.svg'/>


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
        <td>amount</td>
        <td>int</td>
        <td><p>The size of the cash flow. Monetary type represented as a naturally positive integer number of cents/pence denominated in the currency code.</p>
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
        <td><a href='UDT-fire.model.loan_cash_flow_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.loan_cash_flow_type</a></td>
        <td><p>The type of the payment, signifying whether interest or principal is being paid.</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></td>
        <td></td>
    </tr>
    <tr>
        <td>payment_date</td>
        <td>datetime</td>
        <td><p>The timestamp that the cash flow will occur or was paid. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>loan_id</td>
        <td>string</td>
        <td><p>The unique identifier for the affected loan/s within the financial institution.</p>
</td>
    </tr>

  </tbody>
</table>
      
