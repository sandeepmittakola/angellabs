<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<head>
<title>angel labs </title>
<link href="../resources/css/style.css" rel="stylesheet" type="text/css" />

</head>

<body>
<!-- Container Start Here -->
<div id="container">
                <!-- topblock Start Here -->
                <div id="topblock">
                			<!-- Logo Start Here -->
                            <div id="logo">
                              <a href="index.html"><img src="../resources/images/logo.png"></a>
                            <!-- Logo Ends Here -->
                            </div>
							<!-- Topnavigation Start Here -->
                            <div id="topnavigation">
                            
                            			<div id="socialnavigation">
                                        <table><tr><td><a href="#"><img src="../resources/images/profileimg.jpg" width="20px" height="20px"/></a></td>
                                        <td><a href="#">Sandeep</a></td><td class="space"></td>
                                        <td><a href="#"></a></td>
                                        <td><a href="#"></a></td><td class="space"></td>
                                        <td><a href="#"><img src="../resources/images/share.png"></a></td>
                                        <td><a href="#">Logout</a></td></tr></table>
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
                                        <ul><li><a  class="active" href="../Home/index.htm">Home</a></li>
                                        <li><a href="entrepreneurs.htm">Entrepreneurs</a></li>
                                        <li><a href="investors.htm">Investors</a></li>
                                        <li><a href="companies.htm">Companies</a></li>
                                        </ul>
                                        <!-- Nav Ends Here -->
                                        </div>
                                        <div class="clearfix"></div>
            <!-- Navigation Ends Here -->
            </div>
             
            <!-- bsdivblock Start Here -->
            <div id="bsblock">
                                        <!-- breadcrumb Start Here -->
                                        <div id="breadcrumb"> <a href="index.html" class="breadlink"> Home </a>
                                        <!-- breadcrumb Ends Here -->
                                        </div>
                                        
<!-- Search Start Here -->
                                        <div id="search">                                      
                                     <form action="" method="post" id="searchform">    
	<input type="text" id="searchinput" name="query" value='Search' onFocus="if(this.value=='Search'){this.value='';}" onBlur="if(this.value==''){this.value='Search';}" /> 
    <input type="submit" id="searchsubmit" value="" /> 
</form>
										</div>
                                        <!-- Search Ends Here -->
                                        <div class="clearfix"></div>
            
            <!-- bsblock Ends Here -->
            </div>
            
  <!-- Content Start Here -->
  <div id="content">
                             
                   <!-- messages Start Here -->
                 <div id="messages">
                 
                                     <div id="inbox">
                                     
                                     <ul>
                                     <li><a href="#">Inbox </a></li>
                                     <li><a href="#">Sent </a></li>
                                     </ul>
                                     
                   </div>
                   
                   
                   					<div id="notifications">
                                     
                                     <ul>
                                     <li><a href="#"> Notifications </a></li>
                                     </ul>
                                     
                   </div>
                 					
                                    
    <!-- messages Ends Here -->
    </div>
                 <!-- messages right Start here -->
    <div id="inboxright">
                 
      <div class="inboxheader"><h1>Inbox</h1></div>
        
                <c:if test="${fn:length(messages) == 0}">
                <p>no messages to display</p>
                </c:if>
                <c:if test="${fn:length(messages) > 0}">
                
                 <c:forEach items="${messages}" var="message" varStatus="status">
                                                                                   <p>${message.user.name} </p>
                                                                                      <p>${message.subject}</p>
                                                                                      <p>${message.content}</p>
                                                                                      
                                                                               
                                                                                </c:forEach>
                 </c:if>
                </div>
                
        
<!-- messages right ends here -->    
                 </div>
                 <div class="clearfix"></div>
                  
                  
                     
  <!-- Content Ends Here -->
  </div>
            
            
            <!-- Footer Start Here -->
            <div id="footer">
            							<div class="footernav">
                                        <ul><li><a href="#" class="footeralink">Terms</a></li><li><a href="#"class="footeralink">API</a></li><li><a href="#"class="footeralink">Twitter</a></li><li><a href="#"class="footeralink">Help</a></li><li><a href="#"class="footeralink">Blog</a></li><li><a href="#"class="footeralink">Reviews</a></li><li><a href="#"class="footeralink">Jobs</a></li><li><a href="#"class="footeralink">About</a></li></ul>
                                        <!-- Nav Ends Here -->
                                        </div>
            <div class="clearfix"></div> 
            <!-- Footer Ends Here -->
            </div>
            

<!-- Containr Ends Here -->
</div>
</body>
</html>
