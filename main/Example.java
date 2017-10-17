package main;

import component.*;
import decorator.*;

public class Example {

    public static void main(String[] args) {
    	
	//Let's start with a component
	Component component = new ConcreteComponent1();
	System.out.println("Concrete Component 1 : " + component.getPrice());
		
	//Now we add some cheese
	ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2(component);
	System.out.println("Concrete Component 1 with Concrete Decorator 2: " + concreteDecorator2.getPrice());
	
	//And now we want some tune
	ConcreteDecorator3 concreteDecorator3 = new ConcreteDecorator3(concreteDecorator2);
	System.out.println("Concrete Component 1 with Concrete Decorator 2 and Concrete Decorator 3: " + concreteDecorator3.getPrice());
	
    }
}
