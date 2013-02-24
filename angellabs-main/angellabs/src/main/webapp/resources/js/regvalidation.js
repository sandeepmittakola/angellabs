$(document).ready(function(){
jQuery(function(){
	$("#name").blur(function() 
		    { 
		        var name_length= $("#name").val().length; 
		         
		 
		        $("#name_error").empty();
		        if (name_length ==0) {
		        	document.getElementById("name").className = "formerror";
		        $("#name_error").append("Please enter your name");
		        }else{
		        	document.getElementById("name").className = "forminput";
		        	$("name_error").empty;
		        }
		    }); 
	$("#email").blur(function() 
		    { 
		        var email_length= $("#email").val().length; 
		        var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
		        var emailaddressVal = $("#email").val();
		        $("#email_error").empty();
		        if (email_length ==0) {
		        	document.getElementById("email").className = "formerror";
		        $("#email_error").append("Please enter your email");
		        }else if(!emailReg.test(emailaddressVal)) {
		        	$("#email_error").append("Please enter a valid email address");
		            hasError = true;
		        }else{
		        	document.getElementById("email").className = "forminput";
		        	$("email_error").empty;
		        }
		        
		    });
	$("#password").blur(function() 
		    { 
		        var password_length= $("#password").val().length; 
		         
		 
		        $("#password_error").empty();
		        if (password_length==0) {
		        	document.getElementById("password").className = "formerror";
		        $("#password_error").append("Please enter your password");
		        }else if (password_length<5) {
		        	document.getElementById("password").className = "formerror";
			        $("#password_error").append("enter at least 5 characters");
			        }else{
		        	document.getElementById("password").className = "forminput";
		        	$("password_error").empty;
		        }
		        	
		    
		    });
	
	
	$("#regform").submit(function(){
		$("#name_error").empty();
        $("#email_error").empty();
        $("#password_error").empty();
        var hasError = false;
        var passwordVal = $("#password").val();
       
        if (passwordVal == '') {
        	document.getElementById("password").className = "formerror";
        	$("#password_error").append("Please enter your password");
            hasError = true;
        }else if(passwordVal.length()<5){
        	document.getElementById("password").className = "formerror";
        	$("#password_error").append("enter at least 5 characters");
            hasError = true;
        }
        var unameval=$("#name").val();
        if(unameval==''){
        	document.getElementById("name").className = "formerror";
        	$("#name_error").append("Please enter your name");
            hasError = true;
        }

        var emailaddressVal = $("#email").val();
        var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
        if(emailaddressVal == '') {
        	document.getElementById("email").className = "formerror";
        	$("#email_error").append("Please enter your email address");
            hasError = true;
        }else if(!emailReg.test(emailaddressVal)) {
        	document.getElementById("email").className = "formerror";
        	$("#email_error").append("Please enter a valid email address");
            hasError = true;
        }

        
        if(hasError == true) {return false;}
    });
  });

});
