package cn.homjie.dubbo.travel.api.impl;

import cn.homjie.dubbo.travel.api.GreetService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author jiehong.jh
 * @date 2018/3/17
 */
@Service(version = "1.0.0")
public class GreetServiceImpl implements GreetService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
