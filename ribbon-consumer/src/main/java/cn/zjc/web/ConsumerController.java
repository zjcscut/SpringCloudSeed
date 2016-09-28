package cn.zjc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjc
 * @version 2016/9/29 0:22
 * @description
 */
@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String add() {
		return restTemplate
				.getForEntity("http://APPLICATION-SERVICE/add?a=10&b=100", String.class)
				.getBody();
	}
}
