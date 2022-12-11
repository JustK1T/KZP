package lab4;

interface EngineWearConrolInterface{
    double checkEngineWear();
}

interface FuelControlInterface{
    double checkFuel();
}

public class MultiplyStarShip implements EngineWearConrolInterface, FuelControlInterface{
    //Data fields
    private String starShipName;
    private double engineWear;
    private double fuel;
    private StarShipColor starShipColor;
    private static int StarShipNumber = 0;

    //Constructors
    public MultiplyStarShip(){
        starShipName = "MultiplyStarShip";
        starShipColor = StarShipColor.RED;
        fuel = 234.0;
        engineWear= 145.0;
        ++StarShipNumber;
    }

    public MultiplyStarShip(String starShipName){
        this.starShipName = starShipName;
        starShipColor = StarShipColor.RED;
        fuel = 1000.0;
        engineWear= 1000.0;
        ++StarShipNumber;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor){
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        fuel = 1000.0;
        engineWear= 1000.0;
        ++StarShipNumber;
    }

    public MultiplyStarShip(String starShipName, StarShipColor starShipColor, double fuel){
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.fuel = fuel;
        engineWear= 1000.0;
        ++StarShipNumber;
    }
    public MultiplyStarShip(String starShipName, StarShipColor starShipColor, double fuel, double engineWear){
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.fuel = fuel;
        this.engineWear= engineWear;
        ++StarShipNumber;
    }

    //enum
    public enum StarShipColor{
        WHITE, BLACK, RED, PINK, YELLOW, GREEN, BLUE
    }

    //Getter methods
    public String getStarShipName() {
        return "#"+StarShipNumber+" "+starShipName;
    }
    public double getFuel() {
        return fuel;
    }
    public double getEngineWear() {
        return engineWear;
    }
    public StarShipColor getStarShipColor() {
        return starShipColor;
    }

    //Overridden methods
    @Override
    public double checkFuel() {
        fuel -= 0.100;
        if(fuel - 0.100 < 0) {
            System.out.println("the starship has no fuel");
            return 0;
        }
        System.out.println("Engine wear: ");
        
        return fuel;
    }

    @Override
    public double checkEngineWear() {
        engineWear -= 0.100;
        if(engineWear - 0.100 < 0) {
            System.out.println("the starship has no fuel");
            return 0;
        }
        System.out.println("Fuel wear: ");
        
        return engineWear;
    }

    //refuel method
    public void refuel(){
        if(fuel == 1000.0)
            System.out.println("Is already full.");
        else
        {
            System.out.println("Fuel was reload ");
            fuel = 1000.0;
        }
    }

    public void repair(){
        if(engineWear == 1000.0)
            System.out.println("Is already full.");
        else
        {
            System.out.println("Engine was repair ");

            engineWear = 1000.0;
        }
    }
}
