package br.com.barin.boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
	private HelloWorldService helloWorldService;
    
    @RequestMapping("/")
    public String greeting() {
       		return this.helloWorldService.getHelloMessage();

    }
}