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
 * @version 2016/10/4 19:39
 * @description
 */
@RestController
public class ComputeController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/add")
	public String add(@RequestParam(value = "a") Integer a,
					  @RequestParam(value = "b") Integer b) {
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
		Integer r = a + b;
		log.info("/add,host:" + instance.getHost() + ",serviceId:" + instance.getServiceId() + ",result:" + r);
		return "From Service-B,Result is :" + r;

	}
}
