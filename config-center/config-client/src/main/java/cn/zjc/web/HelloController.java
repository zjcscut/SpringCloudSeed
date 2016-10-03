package cn.zjc.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @version 2016/10/3 4:51
 * @description
 */
@RefreshScope
@RestController
public class HelloController {

	@Value("${from}")
	private String from;

	@RequestMapping(value = "/from")
	public String from() {
		return this.from;
	}
}
