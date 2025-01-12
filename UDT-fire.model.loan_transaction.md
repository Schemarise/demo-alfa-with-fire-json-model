<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.loan_transaction
>  
>A Loan Transaction is an event that has an impact on a loan, typically the balance.
> 
<img src='images/fire.model.loan_transaction.svg'/>


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
        <td><p>The size of the transaction in the loan transaction event. Monetary type represented as a naturally positive integer number of cents/pence.</p>
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
        <td><i><a href='UDT-fire.model.loan_transaction_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.loan_transaction_type</a></i> <b>?</b></td>
        <td><p>The type of impact on the balance of the loan.</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>loan_id</td>
        <td>string</td>
        <td><p>The unique identifier for the affected loan/s within the financial institution.</p>
</td>
    </tr>
    <tr>
        <td>value_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the transaction was valued or took place. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>

  </tbody>
</table>
      

<br/>

### Referenced from fields in:
- <img src='images/recordType.svg'/> [fire.model.batch](UDT-fire.model.batch.md)
- <img src='images/recordType.svg'/> [fire.model.example_data](UDT-fire.model.example_data.md)
