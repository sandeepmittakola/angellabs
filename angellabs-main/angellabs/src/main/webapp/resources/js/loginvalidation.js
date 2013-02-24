$(document).ready(function(){
jQuery(function(){
	$("#email").blur(function() 
		    { 
		        var email_length= $("#email").val().length; 
		        var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
		        var emailaddressVal = $("#email").val();
		        $("#email_error").empty();
		        if (email_length ==0) {
		        	document.getElementById("email").className = "formerror";
		        $("#email_error").append("Please enter your email address");
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
		        }else{
		        	document.getElementById("password").className = "forminput";
		        	$("password_error").empty;
		        }
		        	
		    
		    });
			$("#loginform").submit(function(){
                    $("#email_error").empty();
                    $("#password_error").empty();
                    var hasError = false;
                    var passwordVal = $("#password").val();
                   
                    if (passwordVal == '') {
                    	document.getElementById("password").className = "formerror";
                    	$("#password_error").append("Please enter your password");
                        hasError = true;
                    }
                    var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;

                    var emailaddressVal = $("#email").val();
                    if(emailaddressVal == '') {
                    	document.getElementById("email").className = "formerror";
                    	$("#email_error").append("Please enter your email address");
                        hasError = true;
                    }

                    else if(!emailReg.test(emailaddressVal)) {
                    	$("#email_error").append("Please enter a valid email address");
                        hasError = true;
                    }
                    if(hasError == true) {return false;}
                });
            });

});
