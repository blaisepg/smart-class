<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <title> List Students</title>
</head>
<body>
     <div id="wrapper">
         <div id="header">
              <h2>Smart Class</h2>
         </div>
     </div>
     
     <div id="container">
        <div id="content">
        
        <!-- add html table to hold list of students -->
         <table>
           <tr>
              <th>FirstName</th>
              <th>LastName</th>
              <th>Email</th>
           </tr>
           
           <!-- loop over the list and print the students -->
           <c:forEach var="tempStudent" items="${students}">
               <tr>
                  <td>${tempStudent.firstName}</td>
                  <td>${tempStudent.lastName}</td>
                  <td>${tempStudent.email}</td>
                  
           </c:forEach>
         </table>
        </div>
     </div>
     
     
</body>
</html>