package decorator;

import component.Component;

public class ConcreteDecorator3 extends Decorator{

    public ConcreteDecorator3(Component componentToDecorate){
	super(componentToDecorate);
	this.price = 1.0;
    }
}
