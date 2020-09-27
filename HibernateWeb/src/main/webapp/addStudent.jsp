<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
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

	<div class="container text-center">
		
		<div class="card mt-5 " >
			<div class="card-header "><h2>Student Details</h2></div>

			<form class="form-horizontal" action="savestudent" method="post">
				<div class="card-body">
					<div class="form-group row">
						<label class="control-label col-sm-2" >name:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="stdname"
								placeholder="Enter name">
						</div>
					</div>
					<div class="form-group row">
						<label class="control-label col-sm-2" >marks:</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" name="stdmarks"
								placeholder="Enter marks">
						</div>
					</div>
				</div>
				<div class="card-footer ">
					<div class="form-group text-center ">
						
							<button type="submit" class="btn btn-primary ">Submit</button>
						
					</div>
				</div>
			</form>
		</div>

	</div>

</body>
</html>
