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
<!------------------------------------------------------------------------ Container Start Here -->
<div id="container">
            <!---------- Headerlinks Start Here -->
            <div id="headerlinks">
            	<%@include file="./includes/headerlinks.jsp" %>
            <!------------------------------------------------------------ Header Links Call Here --->
            
            <!---------- Headerlinks End Here -->
            </div>
            <div class="clearfix"></div>
            <!-- bsdivblock Start Here -->
          
            <!-- Contentlinks Start Here -->
            <div id="contentlinks">
                        
                        
                         <%@include file="messagecontent.jsp" %>
                        <!------------------------------------------------ Contentlinks Call Here -->
                        
             <!-- Contentlinks Ends Here -->
            </div>
            <div class="clearfix"></div>
            <!-- Footerlinks Start Here -->
            <div id="footerlinks">
            <!-- Footerlinks Call Here -->
             <%@include file="./includes/footerlinks.jsp" %>
            <!-- Footerlinks Ends Here -->
            </div>
            
            <div class="clearfix"></div> 
<!-- Container Ends Here -->
</div>
</body>
</html>