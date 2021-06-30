package com.lankin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Class {@code RestNumberTwoApplication} in package {@code com.lankin.rest}
 *
 * Main SPRING class
 *
 * @author Nikita Lankin
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableSwagger2
public class RestNumberTwoApplication {

    /**
     * Start
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(RestNumberTwoApplication.class, args);
    }

}
