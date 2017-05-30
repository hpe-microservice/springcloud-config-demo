package hpe.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GlobalConfig {

	@Value("${hpe.demo.test_parameter:Hello}") // If parameter not exist，return "Hello"
	public String test_parameter; // Set with parameter hpe.demo.test_parameter

}
