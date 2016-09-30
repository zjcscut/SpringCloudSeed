package cn.zjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zhangjinci
 * @version 2016/9/30 11:02
 * @function
 */
@SpringBootApplication
@EnableConfigServer   //配置中心
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}