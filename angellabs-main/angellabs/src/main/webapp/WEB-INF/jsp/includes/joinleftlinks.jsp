<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.3.2.min.js"></script>
		<script language="JavaScript" type="text/JavaScript" src="<c:url value="/resources/js/regvalidation.js" />"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
 		
</head>
<body >



<!-- Content Start Here -->

 <div id="content">
            							<!-- Contentleft Start Here -->
                              <div id="jpageleftcontent">
                              			<div class="joinform">
                                  <table class="jointable">
                                        		  <th class="jointabletitle"><div align="left" class="style1">Create an Account</div></th>
                                               <tr>
    <td style="border-top:1px solid #e8e8e8"></td>
  </tr>
                                                 <form class="regform" id="regform" action="<c:url value="/User/adduser.htm"/>" commandName="register">
                                                 <tr class="userinput">
                                                    <td><p  class="pblack">Name</p></td>
                                    </tr>
                                                <tr class="userinput">
                                                    <td><label>
                                                      <input type="text" name="name" id="name" placeholder="Enter Your Name " class="forminput"   value="${profile.username }">
                                                    </label></td>
                                                </tr>
                                                <tr><td><span id="name_error" style="color:red"></span></td>
  				</tr>
                                                <tr class="userinput"> 
                                                	<td><p  class="pblack">Email</p></td>
                                    </tr>
                                                <tr>
                                                   <td><label>
                                                     <input type="text" name="email" id="email" placeholder="user@domain.com" class="forminput" value="${profile.email}">
                                                   </label></td>
                                                </tr><tr><td><span id="email_error" style="color:red"></span></td>
  				</tr>
                                                <tr class="userinput">
                                                    <td><p  class="pblack">Password</p></td>
                                                
                                                <tr class="userinput">
                                                    <td><label>
                                                      <input type="password" name="password" id="password" placeholder="Enter at least 5 characters" class="forminput">
                                                    </label></td>
                                                </tr></tr><tr><td><span id="password_error" style="color:red"></span></td>
  				</tr>
                                                <tr class="userinput">
                                                    <td height="30px"><label>
                                                      <input type="submit" name="join" id="join" value="Create Your Account">
                                                    </label></td>
                                                </tr></form>
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
    <td><p class="pblack">Already have an account? <a href="../User/login.htm" class="allink"> Login. </a> </p></td>
  </tr>                                        
                                        </table>
                                        </div>
                              <!-- Contentleft Ends Here -->
                              </div>
                                        
    <!-- Contentleft Start Here -->
    <div id="lpagerightcontent">
 

      
      </div>
    <div class="clearfix"></div>
            <!-- Content Ends Here -->
  </div>

</body>
</html>