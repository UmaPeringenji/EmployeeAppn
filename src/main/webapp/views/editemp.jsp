<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<body bgcolor="pink" >
<h1>Edit Employee Data</h1>
<form:form action="/editu">
<table>
<tr>
<td></td>
<td><form:hidden path="id"/></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Designation:</td>
<td><form:input path="designation"/></td>
</tr>
<tr>
<td>Salary:</td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td>TA:</td>
<td><form:input path="ta"/></td>
</tr>
<tr>
<td>DA:</td>
<td><form:input path="da"/></td>
</tr>
<tr>
<td>PF:</td>
<td><form:input path="pf"/></td>
</tr>
<tr>
<td>Gross_salarry:</td>
<td><form:input path="gross_salary"/></td>
</tr>
<tr>
<td>Net_Salary:</td>
<td><form:input path="net_salary"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="editAndsave"/>
</tr>
</table>
</form:form>
</body>