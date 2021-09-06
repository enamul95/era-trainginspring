
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
.wrapper {
	margin-top: 30px;
	margin-bottom: 30px;
}

.form-signin {
	max-width: 300px;
	max-height: 300px;
	padding: 100px 38px 66px;
	margin: 0 auto;
	background-color: #eee;
	border: 3px dotted rgba(0, 0, 0, 0);
	border-radius: 5px;
}
</style>







<div class="container">
	<div class="wrapper">


		<c:if test="${not empty errorMessge}">
			<div style="color: red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div>
		</c:if>


		<form name='f' action="callSecurityOption" method='POST'>
			<div class="row"></div>

			<div class="row"></div>

			<div class="row" align="center" style="color: blue; font-size: 24px;">User
				Login Information</div>

			<table class="table table-bordered" align="center" border="2"
				width="10">

				<tbody>
					<tr>

						<td>UserName</td>
						<td><input type="text" name="username"></td>
					</tr>

					<tr>

						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>

					<tr>

						<td colspan="2" align="center"
							style="color: green; font-size: 22px;"><input type="Submit"
							name="Submit" value="Submit"></td>
					</tr>
				</tbody>
			</table>
		</form>




	</div>
</div>