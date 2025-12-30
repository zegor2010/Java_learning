package Projects.Math;

public class Stock {
    private char symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(char newSymbol, String newName){
        name = newName;
        symbol = newSymbol;
    }

    public double getChangePercent(){
        return previousClosingPrice/currentPrice * 100;
    }
}
