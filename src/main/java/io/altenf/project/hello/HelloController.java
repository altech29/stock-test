package io.altenf.project.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Spring Controller, rest controller
@RestController
public class HelloController {
// Maps to Get method	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
}
	


