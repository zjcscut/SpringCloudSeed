package cn.zjc.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjinci
 * @version 2016/10/7 14:52
 * @function
 */
@RefreshScope
@RestController
public class TestController {

    @Value(value = "${from}")
    private String from;

    @RequestMapping(value = "/from")
    public String from(){
        return this.from;
    }
}
