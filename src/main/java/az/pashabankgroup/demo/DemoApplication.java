package az.pashabankgroup.demo;

import az.pashabankgroup.demo.interfaces.Notebook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Notebook notebook1 = (Notebook) context.getBean("model1");
		notebook1.specification();


		Notebook notebook2 = (Notebook) context.getBean("model2");
		notebook2.specification();
	}

}
