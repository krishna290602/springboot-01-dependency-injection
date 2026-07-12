package com.springboot.sb_01_dependency_injection.Implementations;

import com.springboot.sb_01_dependency_injection.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notification with Message: " + message);
    }
}
