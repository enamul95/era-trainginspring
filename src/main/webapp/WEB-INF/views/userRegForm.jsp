
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
	max-width: 700px;
	max-height: 1300px;
	padding: 50px 38px 66px;
	margin: 0 auto;
	background-color: #cce;
	border: 3px dotted rgba(0, 0, 0, 0);
	border-radius: 5px;
}
</style>


<script type="text/javascript">


 


function departmentChange(e) {

	//alert(e.value);
	
	 
	
	dept =e.value;
	
	var o = {
			deptName : dept
		};
	
	 $('#designation').find('option').remove();
	
	 $('#designation')
	.append("<option value='' selected readonly>Select Designation</option>"); 
	
	$
	.ajax({
		url : "selectDesignationList",
		data : JSON.stringify(o),
		contentType : "application/json",
		success : function(data) {
			var s = jQuery.parseJSON(data);

			for ( var z in s) {

			//	 alert(s[z]);

				 var optn = "<option data-desig='"+ s[z] +"'   value='"+ s[ z ] +"'>"
						+ s[z] + "</option>";

				$('#designation').append(optn);
 
			}

		},
		error : function(data) {
			alert("Server Error");
		},
		type : 'POST'
	});

	

}


</script>





<div class="container">
	<div class="wrapper">


		<form class="form-signin" method="POST" action="employeeDataSave" >


			<div class="row"></div>

			<div class="row"></div>









			<div class="row" align="center" style="color: blue; font-size: 24px;">User
				Information</div>

			<table class="table table-bordered" align="center" border="4" >



				<tbody>
					<tr>

						<td>User Name</td>
						<td><input type="text" name="empID"></td>
					</tr>
					<tr>

						<td>First Name</td>
						<td><input type="text" name="empFirstName"></td>
					</tr>
					<tr>

						<td>Last name</td>
						<td><input type="text" name="empLastName"></td>
					</tr>

					<tr>

						<td>Password</td>
						<td><input type="password" name="empPassword"></td>
					</tr>

					<tr>
						<td>Department</td>
						<td><select name="employeeDept" onchange="departmentChange(this);">
								<option value="" selected>Select Depatment</option>

								<c:if test="${!empty deptList}">

									<c:forEach items="${deptList}" var="dept">

										<option value="${dept}" data-dept="${dept}">${dept}</option>

									</c:forEach>
								</c:if>
						</select></td>
					</tr>

					<tr>
						<td>Designation</td>
						<td><select  id="designation" name="employeeDesig">
								  	<option value="">Select Designation</option>  
							</select></td>
					</tr>

					<tr>
						<td>Joining Date</td>
						<td><input type="text" name="empJoiningDate"
							value="12/12/2020"></td>
					</tr>

					<tr>
						<td>Birth Date</td>
						<td><input type="text" name="empBirthDate" value="01/01/1982"></td>
					</tr>
					
					<tr>
						<td>Role</td>
						<td><select id="role" name="role" >
								<option value="USER" selected>USER</option>	
								<option value="ADMIN" >ADMIN</option>
								<option value="GUEST" >GUEST</option>									 
						</select></td>
					</tr>


					<tr>

						<td colspan="2" align="center"  style="color: green; font-size: 22px;"><input type="Submit" name="Submit" value="Submit"></td>
					</tr>




				</tbody>
			</table>









		</form>




	</div>
</div>