package hpe.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain.class, args);
    }
}

@RestController
class MessageRestController {

	@Autowired
	private GlobalConfig config;

    @RequestMapping("/get-parameter")
    String getMessage() {
        return "Parameter value: " + config.test_parameter;
    }
}