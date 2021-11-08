<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
   
   function confirmDelete(){
	   return confirm("Are You sure? do you want to delete...!");
   }
   

</script>
</head>
<body>

	<a href="/contact">Add New Contact</a>

	<table border="1">

		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Phone No</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${contacts}" var="contact">
				<tr>
					<td>${contact.contactName}</td>
					<td>${contact.contactEmail}</td>
					<td>${contact.contactPhoNo}</td>
					<td>
					    <a href="editContact?cid=${contact.contactId}">Edit</a> 
					    <a href="delete?cid=${contact.contactId}" onclick="return confirmDelete()">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>



	</table>


</body>
</html>