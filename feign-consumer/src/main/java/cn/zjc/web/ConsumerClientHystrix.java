package cn.zjc.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangjinci
 * @version 2016/9/30 10:31
 * @function
 */
@Component    //创建回调类ComputeClientHystrix，实现@FeignClient的接口，此时实现的方法就是对应@FeignClient接口中映射的fallback函数
public class ConsumerClientHystrix implements ConsumerClient{

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
