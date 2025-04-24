package sq_c2_ex2.src.main.java;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sq_c2_ex2.src.main.config.ProjectConfig;
import test.Parrot;
import test.Person;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//	Parrot x = new Parrot();
//	x.setName("Kiki");
//	Supplier<Parrot> parrotSupplier = () -> x;
//	context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));
//
//	Parrot p = context.getBean(Parrot.class);
//	System.out.println(p);
//	System.out.println(p.getName());
//
//	String s = context.getBean(String.class);
//	System.out.println(s);
//
//	Integer n = context.getBean(Integer.class);
//	System.out.println(n);

	Person person = context.getBean(Person.class);
//	Parrot parrot = context.getBean(Parrot.class);
	System.out.println("Person's name: " + person.getName());
//	System.out.println("Parrot's name: " + parrot.getName());
	System.out.println("Person's parrot: " + person.getParrot());
    }

}
