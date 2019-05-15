package com.serversocket;

import com.serversocket.server.Server;
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

        //启动server等待客户端连接
        new Server("DAGE",8888,10,new byte[]{127,1,1,0}).socket();

        while(true){
            String str = new Scanner(System.in).nextLine();
            if(str.equalsIgnoreCase("q")){
                break;
            }
        }
        SpringApplication.exit(context);
    }

}
