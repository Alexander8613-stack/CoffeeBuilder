import by.alex8613.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CoffeeBuilder builder = new CoffeeBuilder();
        director.doCoffeeWithMilk(builder);
        Coffee coffee = builder.getResult();
        System.out.println("Coffee built:\n" + coffee.getType());

        director.doCoffeeWithSugar(builder);
        coffee = builder.getResult();
        System.out.println(coffee.getType());

        CoffeeManualBuilder manualBuilder = new CoffeeManualBuilder();
        director.doCreamCoffee(manualBuilder);
        Manual coffeeManual = manualBuilder.getResult();
        System.out.println("Coffee manual built: "+ coffeeManual.print());
    }
}