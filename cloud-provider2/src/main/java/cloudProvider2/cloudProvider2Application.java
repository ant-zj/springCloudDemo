package cloudProvider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class cloudProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(cloudProvider2Application.class,args);
    }
}
