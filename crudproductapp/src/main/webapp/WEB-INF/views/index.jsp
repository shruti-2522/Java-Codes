<html>
<head>
<%@include file="./head.jsp"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome To Product App</h1>
				<table class="table">
					<thead class="table-Dark">
						<th scope="col">Product Id</th>
						<th scope="col">Product Name</th>
						<th scope="col">Product Description</th>
						<th scope="col">Product Price</th>
						<th scope="col">Action</th>
						
						
					</thead>
					<tbody>
					<c:forEach items="${p1 }" var="p">
						<tr>

							<th scope="row">${p.pid}</th>
							<td>${p.pname}</td>
							<td>${p.pdesc}</td>
							<td class="font-weight-bold">&#x20B9; ${p.pprice}</td>
							<td><a href="delete/${p.pid}"><i class="fas fa-trash text-danger" style="font-size:30px;"></i></a>
							<a href="edit/${p.pid}"><i class="fas fa-pen-nib text-success" style="font-size:30px;"></i></a>
							</td>
							
						</tr>
						</c:forEach>
						
					</tbody>
				</table>


<div class="container text-center">
<a href="add_prod" class="btn btn-outline-success">Add Product</a>
</div>
			</div>
		</div>


	</div>

</body>
</html>
