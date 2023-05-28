package com.example.myapplication;
// import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController // Spring MVC annotation - Stereotype annotation
@SpringBootApplication // Combines @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan
public class MyApplication {
    
    @RequestMapping("/") // Spring MVC annotation
    String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        // SpringApplication application = new SpringApplication(MyApplication.class);
        // application.setBannerMode(Banner.Mode.OFF);
        // application.run(args);
        SpringApplication.run(MyApplication.class, args);
    }
}
