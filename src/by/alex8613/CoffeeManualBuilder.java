package by.alex8613;

public class CoffeeManualBuilder implements Builder{
    private CoffeeType type;

    @Override
    public void setCoffeeType(CoffeeType type) {
        this.type = type;
    }

    public Manual getResult(){
        return new Manual(type);
    }
}
