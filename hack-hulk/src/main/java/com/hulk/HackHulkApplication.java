package com.hulk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 曹磊(Hackx) on 12/8/2017.
 * Email: caolei@mobike.com
 */

@EnableScheduling
@SpringBootApplication
@ImportResource(locations = {"classpath:/application-context.xml"})
public class HackHulkApplication {
    public static void main(String[] args) {
        SpringApplication.run(HackHulkApplication.class, args);
    }

}
