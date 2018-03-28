package cn.homjie.dubbo.hsf;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiehong.jh
 * @date 2018/3/28
 */
@ImportResource("classpath:dubbo.xml")
@SpringBootApplication
public class MixProvider {
    public static void main(String[] args) throws Exception {
        PandoraBootstrap.run(args);
        // 只需要加上pandora，便支持双注册中心
        SpringApplication.run(MixProvider.class, args);
        PandoraBootstrap.markStartupAndWait();
    }
}
