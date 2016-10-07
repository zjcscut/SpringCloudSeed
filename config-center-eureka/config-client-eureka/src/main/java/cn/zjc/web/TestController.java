package cn.zjc.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @version 2016/10/3 20:43
 * @description
 */
@RefreshScope
@RestController
public class TestController {

	@Value("${from}")
	private String from;

	@RequestMapping(value = "/from")
	public String test() {
		return this.from;
	}
}
