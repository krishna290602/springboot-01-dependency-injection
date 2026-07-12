package com.springboot.sb_01_dependency_injection.Implementations;

import com.springboot.sb_01_dependency_injection.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notification with Message: " + message);
    }
}
