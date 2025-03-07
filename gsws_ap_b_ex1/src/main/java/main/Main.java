package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Parrot {
    private String name;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
	var context = new AnnotationConfigApplicationContext();
	Parrot p = new Parrot();
    }

}