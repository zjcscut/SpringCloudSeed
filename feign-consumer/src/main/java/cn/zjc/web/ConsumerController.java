package cn.zjc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @version 2016/9/29 0:41
 * @description
 */
@RestController
public class ConsumerController {

	@Autowired
	private ConsumerClient consumerClient;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add() {
		return consumerClient.add(10, 20);
	}
}
