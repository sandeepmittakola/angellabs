/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.angellabs.mailservices.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.ui.velocity.VelocityEngineUtils;
import co.angellabs.entities.dto.User;
import co.angellabs.framework.services.BaseMailService;

public class MailManager  implements BaseMailService{

	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private VelocityEngine velocityEngine;
	
	
	

 /* private JavaMailSender mailSender =new JavaMailSenderImpl() ;
 
 

    public JavaMailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
*/



	public void sendConfirmMail(final User user) {

     
  MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {
            	 MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                 message.setTo(user.getEmail());
                 message.setSubject("welcome to angellabs");
                 message.setFrom("sameeksha.angellabs@gmail.com"); // could be parameterized...
                 Map model = new HashMap();
                 model.put("name", user.getName());
                 model.put("email", user.getEmail());
                 model.put("userid",user.getUserId());
                 String text = VelocityEngineUtils.mergeTemplateIntoString(
                    velocityEngine, "registration-confirmation.vm", model);
                 message.setText(text, true);
               }
        };

        try {
        	mailSender.send(preparator);
        } catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
		
			// TODO Auto-generated method stub
			
		}
	
	
public void sendNewPassword(final String email , final String password) {
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {
            	 MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                 message.setTo(email);
                 message.setFrom("sameeksha.angellabs@gmail.com"); // could be parameterized...
                 Map model = new HashMap();
                 model.put("email", email);
                 model.put("password", password);
                 String text = VelocityEngineUtils.mergeTemplateIntoString(
                    velocityEngine, "change-password.vm", model);
                 message.setText(text, true);
               }
        };

        try {
            mailSender.send(preparator);
        } catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
		
		
		}
	
	
    }


