	package SpringBootWithGoogleAPI.SpringBootREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRestApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext 
			= SpringApplication.run(SpringBootRestApplication.class, args);
		System.out.print(applicationContext);
	}

}
