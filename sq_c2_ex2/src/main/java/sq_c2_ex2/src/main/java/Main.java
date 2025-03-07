package sq_c2_ex2.src.main.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sq_c2_ex2.src.main.config.ProjectConfig;
import test.Parrot;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

	Parrot p = context.getBean( Parrot.class);
	System.out.println(p.getName());

	String s = context.getBean(String.class);
	System.out.println(s);

	Integer n = context.getBean(Integer.class);
	System.out.println(n);
    }

}
