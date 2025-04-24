package test;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private String name;
    private final Parrot parrot;

//    @Autowired
//    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
	this.parrot = parrot;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Parrot getParrot() {
	return parrot;
    }

//    public void setParot(Parrot parrot) {
//	this.parrot = parrot;
//    }

}
