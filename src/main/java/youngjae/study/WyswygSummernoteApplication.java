package youngjae.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WyswygSummernoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WyswygSummernoteApplication.class, args);
	}
	
	@Bean(name = "uploadPath")
	public String uploadPath() {
		return "d:/image/";
	}
}
