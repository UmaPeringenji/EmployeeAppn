<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>All Employee Details</h1>
<table border="1">
<tr>
<th>EmpID</th>
<th>EmpName</th>
<th>Designation</th>
<th>Salary</th>
<th>TA</th>
<th>DA</th>
<th>Pf</th>
<th>Gross_salary</th>
<th>Net_salary</th>
</tr>

<tr>
<c:forEach var="emp" items="${emps}">
<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.designation}</td>
<td>${emp.salary}</td>
<td>${emp.ta}</td>
<td>${emp.da}</td>
<td>${emp.pf}</td>
<td>${emp.gross_salary}</td>
<td>${emp.net_salary}</td>
<td><a href="/delete/${emp.id}">Delete</a></td>
<td><a href="/edit/${emp.id}">Edit</a></td>
</tr>
</c:forEach>
</tr>
</table>