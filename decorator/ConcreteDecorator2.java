package decorator;

import component.Component;

public class ConcreteDecorator2 extends Decorator{

    public ConcreteDecorator2(Component componentToDecorate) {
	super(componentToDecorate);
	this.price = 0.95;
    }

}
