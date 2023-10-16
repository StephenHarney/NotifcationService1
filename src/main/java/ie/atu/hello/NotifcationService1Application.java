package ie.atu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NotifcationService1Application {

	public static void main(String[] args) {
		SpringApplication.run(NotifcationService1Application.class, args);
	}

}
