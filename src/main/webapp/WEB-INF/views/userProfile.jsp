
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/common.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/jquery.2.1.1.min.js"></script>


<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/jquery.query-2.1.7.js"></script>


<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/common.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/font-awesome.min.css">

<style>
<!--
body, html {
	height: 110%;
	background-repeat: no-repeat;
	background-image: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));
}

.wrapper {
	margin-top: 30px;
	margin-bottom: 30px;
}

.form-signin {
	max-width: 500px;
	padding: 10px 38px 66px;
	margin: 0 auto;
	background-color: #eee;
	border: 3px dotted rgba(0, 0, 0, 0.1);
	border-radius: 5px;
}

.form-signin-heading {
	text-align: center;
	margin-bottom: 20px;
}

.form-control {
	position: relative;
	font-size: 16px;
	height: auto;
	padding: 10px;
}

input[type="text"] {
	margin-bottom: 0px;
	border-bottom-left-radius: 0;
	border-bottom-right-radius: 0;
}

input[type="password"] {
	margin-bottom: 20px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
</style>





<div class="container">
	<div class="wrapper">


		<form class="form-signin">


			<div class="row"></div>

			<div class="row"></div>


			<div class="row">

				<div class="col-sm-2"></div>

				<div class="col-sm-8">
					<label
						style="color: green; text-align: right; font-size: 25px; text-decoration: underline">User
						Information</label>
				</div>


				<div class="col-sm-2"></div>


			</div>









			<table class="table table-bordered">

				<tbody>
					<tr>

						<td>User ID</td>
						<td>${userSession.empID}</td>
					</tr>
					<tr>

						<td>First Name</td>
						<td>${userSession.empFirstName}</td>
					</tr>
					<tr>

						<td>Last Name</td>
						<td>${userSession.empLastName}</td>
					</tr>

					<tr>

						<td>Department</td>
						<td>${userSession.employeeDept}</td>
					</tr>

					<tr>

						<td>Designation</td>
						<td>${userSession.employeeDesig}</td>
					</tr>
					
					<tr>

						<td>Joining Date</td>
						<td>${userSession.empJoiningDate}</td>
					</tr>


				</tbody>
			</table>




			 




		</form>




	</div>
</div>

