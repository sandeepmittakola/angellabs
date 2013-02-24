<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
       <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
   	   <script type="text/javascript" 	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js"></script>
    
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Angellabs_Home</title>
     
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">        
    </head>
<body>
		
		
		                <!-- topblock Start Here -->
                <div id="topblock">
                			<!-- Logo Start Here -->
                            <div id="logo">
                              <a href="<c:url value="/Home/index.htm" />"><img src="<c:url value="/resources/images/logo.png"/>"></a>
                            <!-- Logo Ends Here -->
                            </div>
							<!-- Topnavigation Start Here -->
                            <div id="topnavigation">
                            
                            			<div id="socialnavigation">
                            			
                            					
                       						 <c:choose>
                         							 <c:when test="${user.userId!=null}">
						                                        	<table><tr>
							                                        <td><a href="#"><img src="<c:url value="/resources/images/notifications.png"/>" width="20px" height="20px"/></a></td>                                        
							                                        <td><a href="../Message/messages.htm"><img src="<c:url value="/resources/images/inbox.png"/>" width="20px" height="20px"/></a></td>
							                                        <td><p>Welcome </p></td>
							                                        <td><a href="#">${user.name} </a></td><td class="space"></td>
							                                        <td><a href="#"><img src="<c:url value="/resources/images/profileimg.jpg"/>" width="20px" height="20px"/></a>
							                                        <ul>
							                                        <li><a href="#">Profile</a></li>
							                                        <li><a href="#">Settings</a></li><c:url var="logoutUrl" value="/logout"/>
							                                        <li><a href="${logoutUrl}">Logout</a></li>
							                                        </ul>                                        </td>
							                                        <td><a href="#"></a></td>
							                                        <td><a href="#"></a></td>
							                                        </tr></table>
						                                        
						                               </c:when>
						                               <c:otherwise>
						                               
						                               			<table>
						                               			<c:url var="loginUrl" value="/User/login.htm"/>
						                               			
						                               			<tr>
						                               			<td><a href="${loginUrl}"><img src="<c:url value="/resources/images/login.png"/>"></a></td>
						                                       
						                                        <td><a href="${loginUrl}">Login</a></td><td class="space"></td>
						                                        <td><a href="<c:url value="/User/register.htm"/>"><img src="<c:url value="/resources/images/join.png"/>"></a></td>
						                                        <td><a href="<c:url value="/User/register.htm"/>">Join</a></td><td class="space"></td>
						                                        <td><a href="#"><img src="<c:url value="/resources/images/share.png"/>"></a></td>
						                                        <td><a href="#">Share</a></td></tr></table>
						                               
						                               </c:otherwise>
						                        </c:choose>
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
                                        <ul><li><a class="active" href="<c:url value="/Home/index.htm" />">Home</a></li>
                                        <li><a href="#">Entrepreneurs</a></li>
                                        <li><a href="#">Investors</a></li>
                                        <li><a href="#">Companies</a></li>
                                        </ul>
                                        <!-- Nav Ends Here -->
                                        </div>
                                        <div class="clearfix"></div>
                                        
                                        <!-- Search Start Here -->
                                        <div id="search">                                      
                                     <form action="" method="post" id="searchform">    
	<input type="text" id="searchinput" name="query" value='Search' onFocus="if(this.value=='Search'){this.value='';}" onBlur="if(this.value==''){this.value='Search';}" /> 
    <input type="submit" id="searchsubmit" value="" /> 
</form>
										</div>
                                        <!-- Search Ends Here -->
                                        
            <!-- Navigation Ends Here -->
            </div>
		
		
		
</body>
</html>