<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.batch
>  
>FIRE schema for representing bulk collections of bank objects.
> 
<img src='images/fire.model.batch.svg'/>


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
        <td>data</td>
        <td>list< tuple< account : <a href='UDT-fire.model.account.html'><img src='images/recordType.svg'/>&nbsp;fire.model.account</a>, collateral : <a href='UDT-fire.model.collateral.html'><img src='images/recordType.svg'/>&nbsp;fire.model.collateral</a>, customer : <a href='UDT-fire.model.customer.html'><img src='images/recordType.svg'/>&nbsp;fire.model.customer</a>, derivative : <a href='UDT-fire.model.derivative.html'><img src='images/recordType.svg'/>&nbsp;fire.model.derivative</a>, derivative_cash_flow : <a href='UDT-fire.model.derivative_cash_flow.html'><img src='images/recordType.svg'/>&nbsp;fire.model.derivative_cash_flow</a>, exchange_rate : <a href='UDT-fire.model.exchange_rate.html'><img src='images/recordType.svg'/>&nbsp;fire.model.exchange_rate</a>, guarantor : <a href='UDT-fire.model.guarantor.html'><img src='images/recordType.svg'/>&nbsp;fire.model.guarantor</a>, issuer : <a href='UDT-fire.model.issuer.html'><img src='images/recordType.svg'/>&nbsp;fire.model.issuer</a>, loan : <a href='UDT-fire.model.loan.html'><img src='images/recordType.svg'/>&nbsp;fire.model.loan</a>, loan_transaction : <a href='UDT-fire.model.loan_transaction.html'><img src='images/recordType.svg'/>&nbsp;fire.model.loan_transaction</a>, security : <a href='UDT-fire.model.security.html'><img src='images/recordType.svg'/>&nbsp;fire.model.security</a> > ></td>
        <td><p>An array of data items of a single type</p>
</td>
    </tr>
    <tr>
        <td>count</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>Number of records in this batch</p>
</td>
    </tr>
    <tr>
        <td>name</td>
        <td>string</td>
        <td><p>A unique identifier for the data batch</p>
</td>
    </tr>
    <tr>
        <td>links</td>
        <td><i>list< <a href='UDT-fire.model.batch_links.html'><img src='images/recordType.svg'/>&nbsp;fire.model.batch_links</a> ></i> <b>?</b></td>
        <td><p>An array describing the page structure of the full data batch</p>
</td>
    </tr>

  </tbody>
</table>
      
