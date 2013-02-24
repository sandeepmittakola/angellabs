
               
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
    
    <jsp:useBean id="now" class="java.util.Date"/>
                 
      <div class="inboxheader"><h1>Inbox</h1></div>
 
           <%--         <c:if test="${fn:length(messages) == 0}">
                   <p>no messages to display</p>
                 </c:if>
                <c:if test="${fn:length(messages) > 0}">
                
                 <c:forEach items="${messages}" var="message" varStatus="status">                                               

         <div class="activityfollowingbottom">
                                            
                     <div class="activityfollowingimg"><a href="#"><img src="../resources/images/default.jpg" height="32px" width="32px"></a></div>
                                
                         <div class="activityfollowingmiddle">
                           <div class="activityfollowingnotes">
                            <p>${message.subject} </p>
                                </div>
                                </div>
                   
                                <div class="activityfollowingtime"><p>${message.date}</p></div>
                        
                        <div class="clearfix"></div>
                                                
                        </div>
                       
                        <div class="messagecontent">
                        
                        <p>${message.user.name}</p>
                         </div>
                <p>${message.content}</p>
                
                <!-- messages right ends here -->    
    </div>
                                                                               
     </c:forEach>
      </c:if> --%>
              
                <c:if test="${fn:length(messages) == 0}">
                   <p>no messages to display</p>
                 </c:if>
                <c:if test="${fn:length(messages) > 0}">
                
                 <c:forEach items="${messages}" var="message" varStatus="status">         
              
              
               <div class="activityfollowingbottom">
                        
                                                
                   		  <div class="activityfollowingimg"><a href="#"><img src="../resources/images/default.jpg" height="32px" width="32px"></a></div>
                                
                                <div class="activityfollowingmiddle">
                                  <div class="activityfollowingnotes"><p>${message.user.name}</p>
                                  <p>${message.subject}</p>
                                </div>
                                </div>
                                <div class="activityfollowingtime"><p> ${message.date}</p></div>
                        
                        <div class="clearfix"></div>
                                                
                        </div>
                        
                        
                        
                        
                        <div class="messagecontent">

                        <p>${message.content}</p>

                   		                                                  
                        </div>
                
                </c:forEach>
      </c:if> 
  
              
    <div class="clearfix"></div>
                  
                  
                     
  <!-- Content Ends Here -->
  </div>

