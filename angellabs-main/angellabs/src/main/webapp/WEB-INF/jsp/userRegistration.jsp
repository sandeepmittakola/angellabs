<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Angellabs_Join</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">   
            
    </head>
<body >
<!------------------------------------------------------------------------ Container Start Here -->
<div id="container">
            <!---------------------------------------------- Headerlinks Start Here -->
            <div id="headerlinks">
	            <!--Header Links Call Here --->
	             	<%@include file="./includes/headerlinks.jsp" %>
	            <!-------------------------------------------- Headerlinks End Here -->
            </div>
            
            <div class="clearfix"></div>
            <!-- Contentlinks Start Here -->
            <div id="contentlinks">
                        <!-- -----------------------------leftlinks Start Here -->
                        <div id="leftlinks">
	                       
	                        	<%@include file="./includes/joinleftlinks.jsp" %>
	                        <!-- --------------------------leftlinks Ends Here -->
                        </div>
                        
                        
                        <!-- -------------------------------rightlinks Start Here -->
                        <div id="rightlinks">
	                         	<%-- <%@include file="loginrightlinks.jsp" %> --%>
	                        <!-- --------------------------rightlinks Ends Here -->
                        </div>
                <div class="clearfix"></div>
             <!-- Contentlinks Ends Here -->
            </div>
            <!-- Footerlinks Start Here -->
            <div id="footerlinks">
	            <!-- Footerlinks Call Here -->
	             	<%@include file="./includes/footerlinks.jsp" %>
	            <!-- Footerlinks Ends Here -->
            </div>
            <div class="clearfix"></div> 
<!-- --------------------------------------------------------Container Ends Here -->
</div>
</body>
</html>
