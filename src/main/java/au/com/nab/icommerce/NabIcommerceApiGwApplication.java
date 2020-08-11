package au.com.nab.icommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class NabIcommerceApiGwApplication {

	public static void main(String[] args) {
		SpringApplication.run(NabIcommerceApiGwApplication.class, args);
	}

}
