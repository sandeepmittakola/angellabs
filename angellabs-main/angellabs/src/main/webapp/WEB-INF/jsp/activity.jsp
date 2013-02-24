 <!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<head>
<title>angel labs</title>
<link href="../resources/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../resources/js/jquery-1.9.0.js"></script>
<script type="text/javascript" src="../resources/js/useractivities.js"></script>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		loadUserActivities();
	});
</script>
<form:form action="post.htm" commandName="useractivitylist">
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
						<table>
							<tr>
								<td><a href="#"><img
										src="../resources/images/notifications.png" width="20px"
										height="20px" /></a></td>
								<td><a href="#"><img
										src="../resources/images/inbox.png" width="20px" height="20px" /></a></td>
								<td><p>Welcome</p></td>
								<td><a href="#">Sandeep Mittakola </a></td>
								<td class="space"></td>
								<td><a href="#"><img
										src="../resources/images/profileimg.jpg" width="20px"
										height="20px" /></a>
									<ul>
										<li><a href="#">Profile</a></li>
										<li><a href="#">Settings</a></li>
										<li><a href="#">Logout</a></li>
									</ul></td>
								<td><a href="#"></a></td>
								<td><a href="#"></a></td>
							</tr>
						</table>
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
					<ul>
						<li><a class="active" href="index.html">Home</a></li>
						<li><a href="entrepreneurs.html">Entrepreneurs</a></li>
						<li><a href="investors.html">Investors</a></li>
						<li><a href="companies.html">Companies</a></li>
					</ul>
					<!-- Nav Ends Here -->
				</div>
				<div class="clearfix"></div>
				<!-- Navigation Ends Here -->
			</div>

			<!-- bsdivblock Start Here -->
			<div id="bsblock">
				<!-- breadcrumb Start Here -->
				<div id="breadcrumb">
					<a href="index.html" class="breadlink"> Home </a>
					<!-- breadcrumb Ends Here -->
				</div>

				<!-- Search Start Here -->
				<div id="search">
					<form action="" method="post" id="searchform">
						<input type="text" id="searchinput" name="query" value='Search'
							onFocus="if(this.value=='Search'){this.value='';}"
							onBlur="if(this.value==''){this.value='Search';}" /> <input
							type="submit" id="searchsubmit" value="" />
					</form>
				</div>
				<!-- Search Ends Here -->
				<div class="clearfix"></div>

				<!-- bsblock Ends Here -->
			</div>

			<!-- Content Start Here -->
			<div id="content">

				<!-- activityleft Start Here -->
				<div id="activityleft">

					<div id="following">

						<ul>
							<li><a href="#"> Following </a></li>
							<li><a href="#"> Public </a></li>
						</ul>

					</div>


					<div id="peoplestofollow">

						<div id="peoplestofollowtitle">
							<a href="#"> Peoples to Follow </a>
						</div>
						<div class="followcontent">

							<div class="followimg">
								<a href="#"><img src="../resources/images/profileimg.jpg"
									width="32px" height="32px" /></a>
							</div>
							<div class="followright">

								<c:forEach items="${useractivitylist}" var="userInfo"
									varStatus="status">
									
											<div class="followtitle">
												<a href="#">${userInfo.user.name}</a>
											</div>
											<div class="followfollows">
												<a href="#">Follow</a>
											</div>
											<div class="clearfix"></div>
									
								</c:forEach>
							</div>
							<div class="clearfix"></div>

						</div>
						<div class="peoplestofollowfooter">
							<ahref"#">Find more on </a> <a href="#"><img
								src="../resources/images/facebook.png" width="16px"
								height="16px"></a> <a href="#"><img
								src="../resources/images/twitter.png" width="16px" height="16px"></a>
							<a href="#"><img src="../resources/images/plus.png"
								width="16px" height="16px"></a> <a href="#"><img
								src="../resources/images/linkedin.png" width="16px"
								height="16px"></a>
						</div>
					</div>
					<!-- activityleft Ends Here -->
				</div>

				<!-- Activity right Start here -->
				<div id="activityright">

					<div class="activityheader">
						<h1>Following</h1>
					</div>
					<div class="activityfollowing">

						<div class="activityfollowingtop">

							<div class="activityfollowingimg">
								<a href="#"><img src="../resources/images/default.jpg"
									height="32px" width="32px"></a>
							</div>

							<div class="activityfollowinginput">
								<form action="" method="get">
									<input name="activityinput" type="text"
										placeholder="Post to AngelLabs ...">
									<ul>
										<li><a href="#">Post</a></li>
									</ul>
								</form>
							</div>


							<div class="clearfix"></div>
						</div>

						<div class="activityfollowingbottom" id="activityfollowingbottom">
							<!--<c:if test="${fn:length(useractivitylist) > 0}">
								<c:forEach items="${useractivitylist}" var="userInfo"
									varStatus="status">
									<div class="activityfollowingimg">
										<a href="#"><img src="../resources/images/profileimg.jpg"
											height="32px" width="32px"></a>
									</div>

									<div class="activityfollowingmiddle">
										<div class="activityfollowingnotes">
											<p>
												${userInfo.user.name} ${userInfo.roles.rolename}ed <a
													href="#">${userInfo.company.companyName}</a>
											</p>
										</div>
										<div class="activityfollowingnotes">
											<p>
												<a href="#"></a><img src="../resources/images/rjmetrics.png"
													width="50" height="20" /> <a href="#">${userInfo.company.companyName}</a>
											</p>
											<p>Hosted BI for Online SMBs</p>
										</div>

									</div>
									<div class="activityfollowingtime">
										<p>${userInfo.days} days</p>
									</div>
								</c:forEach>
							</c:if>-->
							

						</div>

						<div class="activityfollowingend">
							<p>The End</p>
						</div>

					</div>

					<!-- Activity right ends here -->
				</div>
				<div class="clearfix"></div>



				<!-- Content Ends Here -->
			</div>


			<!-- Footer Start Here -->
			<div id="footer">
				<div class="footernav">
					<ul>
						<li><a href="#" class="footeralink">Terms</a></li>
						<li><a href="#" class="footeralink">API</a></li>
						<li><a href="#" class="footeralink">Twitter</a></li>
						<li><a href="#" class="footeralink">Help</a></li>
						<li><a href="#" class="footeralink">Blog</a></li>
						<li><a href="#" class="footeralink">Reviews</a></li>
						<li><a href="#" class="footeralink">Jobs</a></li>
						<li><a href="#" class="footeralink">About</a></li>
					</ul>
					<!-- Nav Ends Here -->
				</div>
				<div class="clearfix"></div>
				<!-- Footer Ends Here -->
			</div>


			<!-- Containr Ends Here -->
		</div>
	</body>
</form:form>
</html>
