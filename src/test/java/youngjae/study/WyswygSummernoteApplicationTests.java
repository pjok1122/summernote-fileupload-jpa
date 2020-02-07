package youngjae.study;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@SpringBootTest
class WyswygSummernoteApplicationTests {

	@Autowired
	ResourceLoader resourceLoader;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void resourceLoad() throws IOException {
		Resource resource = resourceLoader.getResource("file:D:\\image\\2020\\01\\06\\3beb7c1d91b4403c97bad679cbe5db11.PNG");
		System.out.println(resource.exists());
		System.out.println(resource.getDescription());
		System.out.println(resource.getFile().isFile());
	}

}
