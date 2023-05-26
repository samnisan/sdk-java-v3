

# AppendedField

<p>Types of fields you will see here include</p>  <table class=\"help-page-table\">    <thead>      <tr>        <td>          <b>FieldName</b>        </td>        <td>          <b>Data</b>        </td>        <td>          <b>Comments</b>        </td>      </tr>    </thead>    <tbody>      <tr>        <td>WatchlistState</td>        <td>Clear</td>        <td>If the submitted individual did not match any watchlist checks, the appended field data will appear as clear</td>      </tr>      <tr>        <td>WatchlistState</td>        <td>Hit</td>        <td>If the submitted individual triggered a watchlist hit, the watchlistdata field also be included as below:</td>      </tr>      <tr>        <td>WatchlistData</td>        <td>Name|URL\\tName2|URL</td>        <td> Name of the source a pipe (|) the url of the source each source is separated with a tab (\\t )</td>      </tr>      <tr>        <td>CanadaSixMonthResidency</td>        <td>YES</td>        <td>The Canadian Credit Agency provides a flag to indicate that an individual has been at the specified              residence for at least six months.The canadasixmonthresidency field is returned with a value of either YES or NO.</td>      </tr>      <tr>        <td>IsDeceased</td>        <td>False</td>        <td>The IsDeceased field is returned by various datasources to indicate whether the input information was screened against an available death file.              Check with your Trulioo Technical Account Manager to see which datasources support this option.</td>      </tr>      <tr>        <td>IsDeceased</td>        <td>True</td>        <td></td>      </tr>      <tr>        <td>FraudFlag</td>        <td>True</td>        <td></td>      </tr>      <tr>        <td>FraudFlag</td>        <td>False</td>        <td></td>      </tr>    </tbody>  </table>  <p>If you are retrieving transaction with address corrected values you will also see address fields in appended data</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldName** | **String** |  |  [optional] |
|**data** | **Object** |  |  [optional] |



