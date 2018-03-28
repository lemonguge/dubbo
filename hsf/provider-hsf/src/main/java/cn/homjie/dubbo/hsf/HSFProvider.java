package cn.homjie.dubbo.hsf;

import cn.homjie.dubbo.hsf.api.PrintService;
import cn.homjie.dubbo.hsf.api.impl.PrintServiceImpl;
import com.taobao.hsf.app.spring.util.HSFSpringProviderBean;
import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author jiehong.jh
 * @date 2018/3/28
 */
@SpringBootApplication
public class HSFProvider {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(HSFProvider.class, args);
        PandoraBootstrap.markStartupAndWait();
    }

    @Bean
    public PrintService printService() {
        return new PrintServiceImpl("hsf");
    }

    @Bean(initMethod = "init")
    public HSFSpringProviderBean printServiceProvider() {
        // hsf的api没法识别dubbo的注册中心，不会往上面注册地址
        HSFSpringProviderBean provider = new HSFSpringProviderBean();
        provider.setServiceInterfaceClass(PrintService.class);
        provider.setTarget(printService());
        provider.setServiceVersion("1.0.0");
        provider.setServiceGroup("HSF");
        return provider;
    }
}
