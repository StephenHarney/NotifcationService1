package ie.atu.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationController {

    @PostMapping("/notification")//endpoint confirm
    public String confirmDetails(@RequestBody NotificationController notificationController){
        String confirmationMessage = String.format("Sending notification",notificationController);
        return confirmationMessage;
    }





}
