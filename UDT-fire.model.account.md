<sub>&lt;&nbsp; [Namespace](index.md)</sub>
# <img src='images/recordType-lg.svg'/> fire.model.account
>  
>An Account represents a financial account that describes the funds that a customer has entrusted to a financial institution in the form of deposits or credit balances.
> 
<img src='images/fire.model.account.svg'/>


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
        <td>risk_weight_std</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The standardised approach risk weight represented as a decimal/float such that 1.5% is 0.015.</p>
</td>
    </tr>
    <tr>
        <td>accounting_treatment</td>
        <td><i><a href='UDT-fire.model.accounting_treatment.html'><img src='images/enumType.svg'/>&nbsp;fire.model.accounting_treatment</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>impairment_status</td>
        <td><i><a href='UDT-fire.model.impairment_status.html'><img src='images/enumType.svg'/>&nbsp;fire.model.impairment_status</a></i> <b>?</b></td>
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
        <td><p>The impairment amount is the allowance set aside by the firm that accounts for the event that the asset becomes impaired in the future.</p>
</td>
    </tr>
    <tr>
        <td>reporting_entity_name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The name of the reporting legal entity for display purposes.</p>
</td>
    </tr>
    <tr>
        <td>orig_credit_score</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The credit score of the customer at origination of the product using a commercially available credit bureau score.</p>
</td>
    </tr>
    <tr>
        <td>source</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The source(s) where this data originated. If more than one source needs to be stored for data lineage, it should be separated by a dash. eg. Source1-Source2</p>
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
        <td><i><a href='UDT-fire.model.account_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_type</a></i> <b>?</b></td>
        <td><p>This is the type of the account with regards to common regulatory classifications.</p>
</td>
    </tr>
    <tr>
        <td>arrears_balance</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The balance of the capital amount that is considered to be in arrears (for overdrafts/credit cards). Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>ledger_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The internal ledger code or line item name.</p>
</td>
    </tr>
    <tr>
        <td>balance</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The contractual balance on the date and in the currency given. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>limit_amount</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The minimum balance the customer can go overdrawn in their account.</p>
</td>
    </tr>
    <tr>
        <td>id</td>
        <td>string</td>
        <td><p>The unique identifier for the record within the firm.</p>
</td>
    </tr>
    <tr>
        <td>withdrawal_penalty</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>This is the penalty incurred by the customer for an early withdrawal on this account. An early withdrawal is defined as a withdrawal prior to the next_withdrawal_date. Monetary type represented as a naturally positive integer number of cents/pence.</p>
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
        <td>mtd_interest_paid</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Month to date interest added to account as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>count</td>
        <td><i>int(1, *)</i> <b>?</b></td>
        <td><p>Describes the number of accounts aggregated into a single row.</p>
</td>
    </tr>
    <tr>
        <td>last_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The final payment date for interest payments, often coincides with end_date.</p>
</td>
    </tr>
    <tr>
        <td>product_name</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The name of the product as given by the financial institution to be used for display and reference purposes.</p>
</td>
    </tr>
    <tr>
        <td>country_code</td>
        <td><i><a href='UDT-fire.model.country_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.country_code</a></i> <b>?</b></td>
        <td><p>Two-letter country code for account location/jurisdiction. In accordance with ISO 3166-1.</p>
</td>
    </tr>
    <tr>
        <td>base_rate</td>
        <td><i><a href='UDT-fire.model.account_base_rate.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_base_rate</a></i> <b>?</b></td>
        <td><p>The base rate represents the basis of the rate on the balance at the given date as agreed in the terms of the account.</p>
</td>
    </tr>
    <tr>
        <td>asset_liability</td>
        <td><i><a href='UDT-fire.model.asset_liability.html'><img src='images/enumType.svg'/>&nbsp;fire.model.asset_liability</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>first_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The first payment date for interest payments.</p>
</td>
    </tr>
    <tr>
        <td>last_drawdown_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The last date on which a drawdown was made on this account (overdraft).</p>
</td>
    </tr>
    <tr>
        <td>cost_center_code</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The organizational unit or sub-unit to which costs/profits are booked.</p>
</td>
    </tr>
    <tr>
        <td>status</td>
        <td><i><a href='UDT-fire.model.account_status.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_status</a></i> <b>?</b></td>
        <td><p>Describes if the Account is active or been cancelled.</p>
</td>
    </tr>
    <tr>
        <td>end_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The end or maturity date of the account. Format should be YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>pd_irb</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The probability of default as determined by internal rating-based methods, represented as a number between 0 and 1.</p>
</td>
    </tr>
    <tr>
        <td>purpose</td>
        <td><i><a href='UDT-fire.model.account_purpose.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_purpose</a></i> <b>?</b></td>
        <td><p>The purpose for which the account was created or is being used.</p>
</td>
    </tr>
    <tr>
        <td>risk_country_code</td>
        <td><i><a href='UDT-fire.model.country_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.country_code</a></i> <b>?</b></td>
        <td><p>Two-letter country code describing where the risk for the account resides. In accordance with ISO 3166-1</p>
</td>
    </tr>
    <tr>
        <td>fraud_loss</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The total value of accounting losses incurred by the Financial Institution due to fraudulent activities within the reporting segment.</p>
</td>
    </tr>
    <tr>
        <td>fvh_level</td>
        <td><i>int(1, 3)</i> <b>?</b></td>
        <td><p>Fair value hierarchy category according to IFRS 13.93 (b)</p>
</td>
    </tr>
    <tr>
        <td>rollover_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>A particular predetermined date at which an account is rolled-over.</p>
</td>
    </tr>
    <tr>
        <td>encumbrance_type</td>
        <td><i><a href='UDT-fire.model.account_encumbrance_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_encumbrance_type</a></i> <b>?</b></td>
        <td><p>The type of the encumbrance causing the encumbrance_amount.</p>
</td>
    </tr>
    <tr>
        <td>interest_repayment_frequency</td>
        <td><i><a href='UDT-fire.model.account_interest_repayment_frequency.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_interest_repayment_frequency</a></i> <b>?</b></td>
        <td><p>Repayment frequency of the interest.</p>
</td>
    </tr>
    <tr>
        <td>mtd_withdrawals</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Month to date amount withdrawn from the account as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>regulatory_book</td>
        <td><i><a href='UDT-fire.model.regulatory_book.html'><img src='images/enumType.svg'/>&nbsp;fire.model.regulatory_book</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>behavioral_curve_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier for the behavioral curve used by the financial institution.</p>
</td>
    </tr>
    <tr>
        <td>currency_code</td>
        <td><i><a href='UDT-fire.model.currency_code.html'><img src='images/enumType.svg'/>&nbsp;fire.model.currency_code</a></i> <b>?</b></td>
        <td><p>Actual currency of the Account in accordance with ISO 4217 standards. It should be consistent with balance, accrued_interest, guarantee_amount and other monetary amounts.</p>
</td>
    </tr>
    <tr>
        <td>next_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The next date at which interest will be paid or accrued_interest balance returned to zero.</p>
</td>
    </tr>
    <tr>
        <td>rate_type</td>
        <td><i><a href='UDT-fire.model.account_rate_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_rate_type</a></i> <b>?</b></td>
        <td><p>Describes the type of interest rate applied to the account.</p>
</td>
    </tr>
    <tr>
        <td>minimum_balance</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Indicates the minimum balance of each account within the aggregate. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>on_balance_sheet</td>
        <td><i>boolean</i> <b>?</b></td>
        <td><p>Is the account or deposit reported on the balance sheet of the financial institution?</p>
</td>
    </tr>
    <tr>
        <td>rate</td>
        <td><i>double</i> <b>?</b></td>
        <td><p>The full interest rate applied to the account balance in percentage terms. Note that this therefore includes the base_rate (ie. not the spread).</p>
</td>
    </tr>
    <tr>
        <td>insolvency_rank</td>
        <td><i>int(1, *)</i> <b>?</b></td>
        <td><p>The insolvency ranking as per the national legal framework of the reporting institution.</p>
</td>
    </tr>
    <tr>
        <td>capital_tier</td>
        <td><i><a href='UDT-fire.model.account_capital_tier.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_capital_tier</a></i> <b>?</b></td>
        <td><p>The capital tiers based on own funds requirements.</p>
</td>
    </tr>
    <tr>
        <td>cr_approach</td>
        <td><i><a href='UDT-fire.model.cr_approach.html'><img src='images/enumType.svg'/>&nbsp;fire.model.cr_approach</a></i> <b>?</b></td>
        <td><p>Specifies the approved credit risk rwa calculation approach to be applied to the exposure.</p>
</td>
    </tr>
    <tr>
        <td>economic_loss</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The definition of loss, used in estimating Loss Given Default for the reporting segment. When measuring economic loss, as opposed to accounting loss</p>
</td>
    </tr>
    <tr>
        <td>guarantee_amount</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>The amount of the account that is guaranteed under a Government Deposit Guarantee Scheme. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>prev_payment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The most recent previous date at which interest was paid or accrued_interest balance returned to zero.</p>
</td>
    </tr>
    <tr>
        <td>forbearance_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date on which the first forbearance measure was granted to this product.  Format should be YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>encumbrance_amount</td>
        <td><i>int(0, *)</i> <b>?</b></td>
        <td><p>The amount of the account that is encumbered by potential future commitments or legal liabilities. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>break_dates</td>
        <td><i>list< datetime ></i> <b>?</b></td>
        <td><p>Dates where this contract can be broken (by either party). Formatted as YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>start_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the trade or financial product commences. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>guarantee_scheme</td>
        <td><i><a href='UDT-fire.model.account_guarantee_scheme.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_guarantee_scheme</a></i> <b>?</b></td>
        <td><p>The Government Deposit Scheme scheme under which the guarantee_amount is guaranteed.</p>
</td>
    </tr>
    <tr>
        <td>impairment_type</td>
        <td><i><a href='UDT-fire.model.impairment_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.impairment_type</a></i> <b>?</b></td>
        <td></td>
    </tr>
    <tr>
        <td>mtd_deposits</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Month to date amount deposited within the account as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>impairment_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date upon which the product became considered impaired. Format should be YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601</p>
</td>
    </tr>
    <tr>
        <td>uk_funding_type</td>
        <td><i><a href='UDT-fire.model.account_uk_funding_type.html'><img src='images/enumType.svg'/>&nbsp;fire.model.account_uk_funding_type</a></i> <b>?</b></td>
        <td><p>Funding type calculated according to BIPRU 12.5/12.6</p>
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
        <td>trade_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The timestamp that the trade or financial product terms are agreed. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>
    <tr>
        <td>lgd_irb</td>
        <td><i>double(0.0, 1.0)</i> <b>?</b></td>
        <td><p>The loss given default as determined by internal rating-based methods, represented as a number between 0 and 1.</p>
</td>
    </tr>
    <tr>
        <td>minimum_balance_eur</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Indicates the minimum balance, in Euros, of each account within the aggregate. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>first_arrears_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The first date on which this account was in arrears.</p>
</td>
    </tr>
    <tr>
        <td>next_withdrawal_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The next date at which customer is allowed to withdraw money from this account.</p>
</td>
    </tr>
    <tr>
        <td>acc_fv_change_before_taxes</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>Accumulated change in fair value before taxes.</p>
</td>
    </tr>
    <tr>
        <td>accrued_interest</td>
        <td><i>int</i> <b>?</b></td>
        <td><p>The accrued interest since the last payment date and due at the next payment date. Monetary type represented as a naturally positive integer number of cents/pence.</p>
</td>
    </tr>
    <tr>
        <td>customer_id</td>
        <td><i>string</i> <b>?</b></td>
        <td><p>The unique identifier used by the financial institution to identify the customer that owns the account.</p>
</td>
    </tr>
    <tr>
        <td>next_repricing_date</td>
        <td><i>datetime</i> <b>?</b></td>
        <td><p>The date on which the interest rate of the account will be re-calculated. YYYY-MM-DDTHH:MM:SSZ in accordance with ISO 8601.</p>
</td>
    </tr>

  </tbody>
</table>
      

<br/>

### Referenced from fields in:
- <img src='images/recordType.svg'/> [fire.model.batch](UDT-fire.model.batch.md)
- <img src='images/recordType.svg'/> [fire.model.example_data](UDT-fire.model.example_data.md)
