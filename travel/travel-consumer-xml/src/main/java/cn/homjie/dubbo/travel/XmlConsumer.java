package cn.homjie.dubbo.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiehong.jh
 * @date 2018/3/17
 */
@ImportResource("classpath:dubbo.xml")
@SpringBootApplication
public class XmlConsumer {

    public static void main(String[] args) {
        SpringApplication.run(XmlConsumer.class, args);
    }

}
