package cn.zjc.web;

import cn.zjc.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @version 2016/9/29 0:22
 * @description
 */
@RestController
public class ConsumerController {

	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return this.computeService.addService();
	}
}
