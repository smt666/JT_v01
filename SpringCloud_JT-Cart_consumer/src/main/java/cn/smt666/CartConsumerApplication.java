package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class CartConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartConsumerApplication.class, args);
	}

}
