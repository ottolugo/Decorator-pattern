package decorator;

import component.Component;

public abstract class Decorator extends Component {

    protected Component componentToDecorate;
    
    public Decorator(Component componentToDecorate)
    {
        this.componentToDecorate = componentToDecorate;
    }

    @Override
    public double getPrice(){
        return (this.componentToDecorate.getPrice() + this.price);
    }
}
