<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Search Engine</title>
</head>
<body class="" style="background-color: rgb(255, 130, 255);">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">

				<div class="card">
					<div class="card-body">
						<h3 class="text-center">
							<b>COMPLEX FORM</b>
						</h3>

						<div class="alert alert-success" role="alert">
							<form:errors path="student.*"></form:errors>

						</div>
						<form action="handlerForm" method="post">

							<div class="form-group">
								<label for="exampleInputName" class="form-label"><b>Name:</b></label>
								<input type="text" class="form-control" id="exampleInputName1"
									aria-describedby="emailHelp" name="txtname">
							</div>
							<br>


							<div class="form-group">
								<label for="exampleInputId" class="form-label"><b>Id:</b></label>
								<input type="text" class="form-control" id="exampleInputId1"
									aria-describedby="emailHelp" name="txtid">
							</div>
							<br>

							<div class="form-group">
								<label for="exampleInputDate" class="form-label"><b>DOB:</b></label>
								<input type="text" class="form-control" id="exampleInputDate1"
									aria-describedby="emailHelp" placeholder="dd/mm/yy"
									name="txtdate">
							</div>
							<br>

							<div class="form-group">
								<label for="exampleInputName" class="form-label"><b>Select
										Courseas :</b></label> <select name="txtcourse" class="form-control"
									multiple>
									<option value="c++">C++</option>
									<option value="java">Java</option>
									<option value="jsp">JSP</option>
									<option value="php">PHP</option>
									<option value="python">Python</option>
								</select>
							</div>
							<br>

							<div class="form-group">
								<span class="mr-3"><b>Select Gender:</b></span>
								<div class="form-check form-check-inline">
									<input type="radio" class="form-check-input"
										id="exampleInputMale" aria-describedby="emailHelp"
										name="txtradio"> <label for="exampleInputMale"
										class="form-label">Male</label>
								</div>

								<div class="form-check form-check-inline">
									<input type="radio" class="form-check-input"
										id="exampleInputfemale" aria-describedby="emailHelp"
										name="txtradio"> <label for="exampleInputMale"
										class="form-label">Female</label>
								</div>
								<br> <br>

								<div class="form-group">
									<label for="exampleInputName" class="form-label"><b>Select
											Type Of Student :</b></label> <select name="txttype" class="form-control">
										<option value="old_student">Old Student</option>
										<option value="normal_student">Normal Student</option>

									</select>
								</div>
								<br> <br>

								<div class="card">
									<div class="card-body">
										<p>
											<b>Your Address</b>
										</p>
										<div class="form-group">
											<input type="text" class="form-control" name="addr.street"
												placeholder="Enter Street" />
										</div>
										<br>
										<div class="form-group">
											<input type="text" class="form-control" name="addr.city"
												placeholder="Enter City" />
										</div>

									</div>
								</div>

								<br>
								<div class="form-group" align="center">
									<button type="submit" class="btn btn-primary">SUBMIT</button>
								</div>
							</div>
						</form>


					</div>
				</div>

			</div>

		</div>
		<br>


	</div>





	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>
</body>
</html>