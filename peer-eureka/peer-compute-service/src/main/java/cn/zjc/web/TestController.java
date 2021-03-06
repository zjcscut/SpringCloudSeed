package cn.zjc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @version 2016/10/5 1:43
 * @description
 */
@RestController
public class TestController {

	private Logger log = LoggerFactory.getLogger(getClass());


	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/add")
	public Integer add(@RequestParam("a") Integer a,
					   @RequestParam("b") Integer b) {
		ServiceInstance instance = client.getLocalServiceInstance();
		Integer r = a + b;
		log.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
		return r;
	}
}
