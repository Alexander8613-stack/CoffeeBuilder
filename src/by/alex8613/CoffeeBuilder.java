package by.alex8613;

public class CoffeeBuilder implements Builder{
    private CoffeeType type;

    @Override
    public void setCoffeeType(CoffeeType type) {
        this.type = type;
    }

    public Coffee getResult(){
        return new Coffee(type);
    }
}
