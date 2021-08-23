package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendEmail(String[] listTo, String body, String topic){
        System.out.println("sending email");
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("amirkenesbay@gmail.com");
        simpleMailMessage.setTo(listTo);
        simpleMailMessage.setSubject(topic);
        simpleMailMessage.setText(body);
        javaMailSender.send(simpleMailMessage);
        System.out.println("sent email...");
    }
}
