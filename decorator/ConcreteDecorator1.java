package decorator;

import component.Component;

public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component componentToDecorate) {
	super(componentToDecorate);
	this.price = 1.20;
    }

}
