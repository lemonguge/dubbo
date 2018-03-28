package cn.homjie.dubbo.hsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiehong.jh
 * @date 2018/3/28
 */
@ImportResource("classpath:dubbo.xml")
@SpringBootApplication
public class DubboProvider {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DubboProvider.class, args);
    }
}
