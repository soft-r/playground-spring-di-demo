package hu.atsoft.playground.springdidemo;

import hu.atsoft.playground.springdidemo.controllers.ConstructorInjectedController;
import hu.atsoft.playground.springdidemo.controllers.MyController;
import hu.atsoft.playground.springdidemo.controllers.PropertyInjectedController;
import hu.atsoft.playground.springdidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
//		myController.hello();

		System.out.println(myController.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
