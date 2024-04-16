package by.alex8613;

public class Manual {
    private final CoffeeType type;

    public Manual(CoffeeType type) {
        this.type = type;
    }

    public String print(){
        String info = "";
        info += "Type of coffee: "+type +"\n";
        return info;
    }
}
