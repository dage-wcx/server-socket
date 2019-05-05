package com.serversocket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
@MapperScan("com.serversocket.dao")
public class ServerSocketApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ServerSocketApplication.class, args);
        while(true){
            String str = new Scanner(System.in).nextLine();
            if(str.equalsIgnoreCase("q")){
                break;
            }
        }
        SpringApplication.exit(context);
    }

}
