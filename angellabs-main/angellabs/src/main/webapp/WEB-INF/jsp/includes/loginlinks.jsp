<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
   
        <script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/loginvalidation.js"/>"></script>
        
    
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">        
    </head>
<body>



<div id="content">
     <!-- Contentleft Start Here -->
     
     <div id="lpageleftcontent">
     
     	<div class="lpageloginform">
     
     	  <table class="lpagelogintable">
    			<th class="lpagetabletitle"> <div align="left">Login</div></th>
  				<tr>
    				<td style="border-top:1px solid #e8e8e8"></td>
  				</tr>
  			<c:url value="/login" var="loginUrl"/>
   			<form name='loginform' id="loginform" method='POST' action="${loginUrl}" >
   				<tr class="userinput">
    				<td><p  class="pblack">Email</p></td>
  				</tr>
  				<tr class="userinput">
    				<td><label>
      						<input type="text" name="email" id="email"  placeholder="user@domain.com" class="forminput">
    				</label></td>
  				</tr>
  				<tr><td><span id="email_error" style="color:red"></span></td>
  				</tr>
  				<tr class="userinput">
    				<td><p  class="pblack">Password</p></td>
  				</tr>
  				<tr class="userinput">
    			<td><label>
      						<input type="password" name="password" id="password" placeholder="Enter password" class="forminput">
    			</label></td>
  				</tr>
  				<tr class="userinput">
    				<td><label>
							<input type="submit" name="login" id="loginbutton" value="Login">
    				</label></td>
  				</tr>
  				 <c:if test="${param.error != null}">
					  <tr>
					  <td><p style="color:red">The username or password you entered is incorrect.</p>
					  </td>
					  </tr>
				 </c:if>
  		</form>
  				<tr class="userinput">
    				<td><a href="<c:url value="/User/forgotPassword.htm"/>" class="allink">Forgot Password? </a></td>
  				</tr>
  				<tr class="userinput">
                                                    <td><p  class="pblack">or</p></td>
                                    </tr>
  				<tr>
    				<td>
    					 <form  action="<c:url value="/signin/facebook"/>" method="POST" class="socialform"><input type="submit" class="socialbutton" value=""></form>
      					 <form method="post" action="#" class="socialform"><input type="submit" class="socialbutton2" value=""></form>
      					 <form method="post" action="#" class="socialform"><input type="button" class="socialbutton3" value=""></form>
      					 <form method="post" action="#" class="socialform"><input type="button" class="socialbutton4" value=""></form>
    				</td>
    						<div class="clearfix"></div>
  				</tr> 
  						<tr class="userinput">
   						 <td><p class="pblack">Need An Account? <a href="<c:url value="/User/register.htm"/>" class="allink">Sign up.</a> </p></td>
 				 </tr>
       </table>
      </div>
   <!-- Contentleft Ends Here -->
 </div>
                                        
    <!-- Contentleft Start Here -->
    <div id="lpagerightcontent">
    
 <!--   <div class="lcontent">
                  <!-- Contentleft Ends Here -->
 <!--       <div class="encontenttitle"><h2>Entrepreneurs in AngelLabs </h2></div>
       <marquee direction="up" behavior="scroll" height="200px" scrollamount="2" onMouseOver="this.stop();" onMouseOut="this.start();">
                  <img src="../resources/images/entrepreneurs.png" alt="enterpreneurs" width="330px" height="1850px"></marquee></div>
                 
    <div class="lcontent">
                  <!-- Contentleft Ends Here -->
     <!--   <div class="icontenttitle"><h2> Investers in AngelLabs </h2></div>
       <marquee direction="up" behavior="scroll" height="200px" scrollamount="2" onMouseOver="this.stop();" onMouseOut="this.start();">
                  <img src="../resources/images/investors.png" alt="enterpreneurs" width="330px" height="2400px"></marquee> </div>
      
      -->
      </div>
    <div class="clearfix"></div>
            <!-- Content Ends Here -->
  </div>

</body>
</html>