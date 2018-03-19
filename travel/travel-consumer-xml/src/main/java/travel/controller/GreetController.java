package travel.controller;

import cn.homjie.dubbo.travel.api.ErrorCode;
import cn.homjie.dubbo.travel.api.ErrorCode.StandardErrorCode;
import cn.homjie.dubbo.travel.api.ErrorCodeBuilder;
import cn.homjie.dubbo.travel.api.GreetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiehong.jh
 * @date 2018/3/17
 */
@Slf4j
@RestController
public class GreetController {
    @Autowired
    private GreetService greetService;

    @RequestMapping("greet/{name}")
    public String home(@PathVariable String name) {
        log.info("request: " + name);
        return greetService.sayHello(name);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorCode> handleException(Exception ex) {
        return ResponseEntity.ok(
            new ErrorCodeBuilder()
                .setCode(StandardErrorCode.INTERNAL_SERVER_ERROR.getCode())
                .setMessage(ex.getMessage())
                .create());
    }
}
