package cn.zjc.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zjc
 * @version 2016/9/29 0:38
 * @description
 */
@FeignClient(value = "application-service",fallback = ConsumerClientHystrix.class)  //指定服务的id以及失败回调类
public interface ConsumerClient {

	@RequestMapping(value = "/add",method = RequestMethod.GET)
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
