function loadUserActivities() {
	$.ajax( { url:'/Angellabs/UserActivity/getActivities.htm', 
		//dataType:'json',
		//contentType:'aplication/json',
		type:'POST',
		success:function(data) {
		var userActivities = $.parseJSON(data);
		var userActivityDiv = $('#activityfollowingbottom');
		$.each(userActivities,function(index,ua){

		
		userActivityDiv.append('<div class="activityfollowingimg">');
		userActivityDiv.append('<a href="#"><img src="../resources/images/profileimg.jpg" height="32px" width="32px"></a>');
		userActivityDiv.append('</div>');
		userActivityDiv.append('<div class="activityfollowingmiddle">');
		userActivityDiv.append('<div class="activityfollowingnotes">');
		userActivityDiv.append('<p>');
		userActivityDiv.append(ua.user.name+' '+ua.roles.rolename+' '+ua.company.companyName);
		userActivityDiv.append('</p>');
		userActivityDiv.append('</div>');
		userActivityDiv.append('<div class="activityfollowingnotes">');
		userActivityDiv.append('<p>');										
		userActivityDiv.append('<p>');
		userActivityDiv.append('<a href='+ua.company.website+'><img src="../resources/images/rjmetrics.png" width="50" height="20" /> </a><a href="#">'+ua.company.companyName+'</a>');
		userActivityDiv.append('</p>');
		userActivityDiv.append('<p>Hosted BI for Online SMBs</p>');
		userActivityDiv.append('</div>');
		userActivityDiv.append('</div>');
		userActivityDiv.append('<div class="activityfollowingtime">');
		userActivityDiv.append('<p>'+ua.days+' days </p>');
		userActivityDiv.append('</div>');
		userActivityDiv.append('<div class="clearfix"></div>');
		
		});

		}, 
		error:function(ex) { } 
		}); 
}