package cn.homjie.dubbo.hsf;

import cn.homjie.dubbo.hsf.api.PrintService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiehong.jh
 * @date 2018/3/28
 */
@ImportResource("classpath:dubbo.xml")
@SpringBootApplication
public class Consumer {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Consumer.class, args);
        // 纯dubbo的订阅不到hsf的地址
        PrintService printService = (PrintService)context.getBean("printService");
        System.out.println(printService.send("Hello"));
    }
}
