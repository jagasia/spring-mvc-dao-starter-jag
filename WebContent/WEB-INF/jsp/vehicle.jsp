<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<form method="post" action="vehicle">
					Id: <input type=number class="form-control" name="id" value="${vehicle.id }" /> Name: <input
						type=text class="form-control" name="name" value="${vehicle.name }" /> Type: <input
						type=text class="form-control" name="type" value="${vehicle.type }" /> Company: <input
						type=text class="form-control" name="company" value="${vehicle.company }" /> <input
						type=submit class="btn btn-success" name="btn" value="Add" />&nbsp;
						<input type=submit class="btn btn-info" name="btn" value="Modify" />&nbsp;
						<input type=submit class="btn btn-warning" name="btn" value="Delete" />
				</form>
				
				<br/>
				<table class="table table-bordered table-striped table-hover">
				<thead class="thead-dark"><th>Id</th><th>Name</th><th>Type</th><th>Company</th><th></th></thead>
				<c:forEach var="v" items="${vehicles}">
					<tr>
						<td>${v.id }</td>
						<td>${v.name }</td>
						<td>${v.type }</td>
						<td>${v.company }</td>
						<td><a href="select?id=${v.id}">Select</a></td>
					</tr>
				</c:forEach>
				</table>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>

</body>
</html>