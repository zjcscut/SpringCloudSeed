package cn.zjc.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjc
 * @version 2016/9/30 0:09
 * @description
 */
@Service
public class ComputeService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addServiceFallCallback")
	public String addService() {
		return restTemplate.getForEntity("http://APPLICATION-SERVICE/add?a=10&b=100", String.class).getBody();
	}

	public String addServiceFallCallback() {
		return "error";
	}
}
