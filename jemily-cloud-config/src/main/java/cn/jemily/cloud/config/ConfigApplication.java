package cn.jemily.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAutoConfiguration
@RestController
public class ConfigApplication {

    @RequestMapping("/")

    public String home() {

        return "Hello World!";

    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }


}
