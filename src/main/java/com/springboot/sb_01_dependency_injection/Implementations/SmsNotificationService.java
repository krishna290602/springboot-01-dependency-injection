package com.springboot.sb_01_dependency_injection.Implementations;

import com.springboot.sb_01_dependency_injection.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification with Message: " + message);
    }
}
