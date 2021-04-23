<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file='./head.jsp'%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset md-3">
				<h1 class="text-center mb-3">Edit The Product Details</h1>
				
				

				<form action="${pageContext.request.contextPath}/handle-product" method="post">
				
				<input type="hidden" value="${product.pid }" name="pid">
					<div class="form-group">
						<label for="pname"><b>Product Name:</b></label> <input type="text"
							name="pname" class="form-control"
							placeholder="Enter product name.." 
							value="${product.pname }"
							
							/>
					</div>
					<br>
					<div class="form-group">
						<label for="pname"><b>Product Description:</b></label>
						<textarea rows="5" class="form-control" name="pdesc"
							placeholder="Enter product decription..">${product.pdesc}</textarea>
					</div>
					<br>
					<div class="form-group">
						<label for="pname"><b>Product Price:</b></label> <input
							type="text" name="pprice" class="form-control"
							placeholder="Enter product price.."  value="${product.pprice }"/>
					</div>
					<br>

					<div class="container text center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-primary">BACK</a>
						<button type="submit" class="btn btn-warning">UPDATE</button>

					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>