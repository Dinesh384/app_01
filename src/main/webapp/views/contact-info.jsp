<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h4>Contact Details</h4>

	<font color='green'>${SucessMsg}</font>
	<font color='red'>${ErrMsg}</font>


	<form:form action="saveContact?contactId=${contact.contactId}"
		modelAttribute="contact" method="POST">
		<table>
			<tr>
				<td>Contact Name :</td>
				<td><form:input path="contactName" /></td>
			</tr>

			<tr>
				<td>Contact Email :</td>
				<td><form:input path="contactEmail" /></td>
			</tr>

			<tr>
				<td>Contact PhoneNo :</td>
				<td><form:input path="contactPhoNo" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>

		</table>


	</form:form>

	<a href="viewContacts">View All Contacts</a>
</body>
</html>