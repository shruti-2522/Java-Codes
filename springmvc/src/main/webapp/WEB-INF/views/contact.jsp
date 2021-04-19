<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<title>Contact Page</title>
</head>
<body>
	<div class="container mt-5">

		<h3 class="text-center">Registration Form</h3>
		<form action="processform" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label"><b>Email
						address:</b></label><input type="email" name="txtemail" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">

			</div>

			<div class="mb-3">
				<label for="userName" class="form-label"><b>User Name :</b></label>
				<input type="text" class="form-control" name="txtname" id="userName"
					aria-describedby="user">

			</div>

			<div class="mb-3">
				<label for="password" class="form-label"><b>Password:</b></label> <input
					type="password" class="form-control" name="txtpass" id="password"
					aria-describedby="pass">

			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success btn-lg">SIGN
					UP</button>
			</div>
		</form>

	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>


</body>
</html>