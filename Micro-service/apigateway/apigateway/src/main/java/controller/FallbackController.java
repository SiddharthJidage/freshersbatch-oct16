package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback(){
		
		return ("<h1>user service is down..!! </h1>");
	}
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback(){
		
		return ("<h1>contact service is down..!! </h1>");
	}

}
