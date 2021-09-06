<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<c:if  test= "${!empty empList }">

 <h2  align="center">List of Employees</h2>
 
   <table   align="center"  border="1">
   
     <tr>
        <th> Employee No </th>
        
        <th> Employee Name </th>
        
        <th> Employee Position </th>
        
        <th> Action on Row </th>
        
       
     
      </tr>
      
      <c:forEach  items="${empList}"   var="employee">
      
        <tr>
        
           <td>              
              <c:out value="${employee.empNo}">
              </c:out>           
           </td>
           
           <td>              
              <c:out value="${employee.empName}">
              </c:out>           
           </td>
           
           <td>              
              <c:out value="${employee.position}">
              </c:out>           
           </td>
           
           
           <td align="center"> 
             
              <a href="edit.html?empNo=${employee.empNo}" >Edit</a> | <a href="delete.html?empNo=${employee.empNo}" >Delete</a>              
           
           </td>
           
        
        
        </tr>
        
      
      
      </c:forEach>
  
  
  </table>



</c:if>



</body>
</html>