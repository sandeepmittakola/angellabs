<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.3.2.min.js"></script>
		<script language="JavaScript" type="text/JavaScript" src="<c:url value="/resources/js/regvalidation.js" />"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Angellabs-Forget_Password</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">        
    </head>
<body>
<!-- Container Start Here -->
<div id="container">
                <!-- topblock Start Here -->
                <div id="topblock">
                			<!-- Logo Start Here -->
                            <div id="logo">
                              <a href="../Home/index.htm"><img src="../resources/images/logo.png"></a>
                            <!-- Logo Ends Here -->
                            </div>
							<!-- Topnavigation Start Here -->
                            <div id="topnavigation">
                            
                            			<div id="socialnavigation">
                                        
                                        <!-- Social Ends Here -->
                                        </div>
                            <!-- Topnavigation Ends Here -->
                            </div>
                  <div class="clearfix"></div>
                <!-- Topblock Ends Here -->
                </div>
           
            
            <!-- Navigation Start Here -->
            <div id="navigation">
            							<!-- Nav Start Here -->
                                        <div class="nav">
                                        
                                        <!-- Nav Ends Here -->
                                        </div>
                                        <div class="clearfix"></div>
            <!-- Navigation Ends Here -->
            </div>
             
            <!-- bsdivblock Start Here -->
          
<!-- Content Start Here -->
<div id="content">
<!-- Afterjoin Start Here -->            							
<div id="afterjoin">
<c:choose>
                          <c:when test="${send}">
                          <div id="afterjoincontent">
                         <p> New Password has been sent to your eamil </p>
                         </div>
                          
                          </c:when>
                          <c:otherwise>
			<div id="afterjointitle"><h1> Enter existing email </h1></div>
            <div id="afterjoincontent">
            
            <form class="change" id="change" action="<c:url value="../User/newPassword.htm"/>" commandName="change" >
            <table>
            <tr>
            <td>
            <input type="text" name="email" id="email"  class="forminput" ><span id="email_error" style="color:red">
            </span>
            
            <input type="submit" name="submit" id="submit" value="send">
            </td>
            
            <td><p>New Password will be sent to your email </p>
            </td>
             </tr>
            
            </table>
            </form>
            </div>
           </c:otherwise>
 </c:choose>
<!-- Afterjoin Ends Here -->  
</div>

<!-- Content Ends Here -->
</div>
            
           
            

<!-- Containr Ends Here -->
</div>
</body>
</html>