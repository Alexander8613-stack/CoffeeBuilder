package by.alex8613;

public class Director {
    public void doCoffeeWithMilk(Builder builder){
        builder.setCoffeeType(CoffeeType.MILK_COFFEE);
    }

    public void doCoffeeWithSugar(Builder builder){
        builder.setCoffeeType(CoffeeType.SUGAR_COFFEE);
    }

    public void doDoubleCoffee(Builder builder){
        builder.setCoffeeType(CoffeeType.DOUBLE_COFFEE);
    }

    public void doCreamCoffee(Builder builder){
        builder.setCoffeeType(CoffeeType.CREAM_COFFEE);
    }

    public void doCinnamonCoffee(Builder builder){
        builder.setCoffeeType(CoffeeType.CINNAMON_COFFEE);
    }

    public void doSurypCoffee(Builder builder){
        builder.setCoffeeType(CoffeeType.SYRUP_COFFEE);
    }
}
