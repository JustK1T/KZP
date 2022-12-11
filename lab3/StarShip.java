import java.io.*;

/**
 * StarShip class
 * */
public class StarShip {
    //Data fields
    private String starShipName;
    private StarShipColor starShipColor;
    private EngineStatus engineStatus;
    private static int starShipNumber = 1;
    private PrintWriter outputStream = new PrintWriter(new File(String.format("StarShipLogger%s.txt", starShipNumber)));

    //Constructors
    public StarShip() throws FileNotFoundException {
        starShipName = String.format("#%s StarShip", starShipNumber);
        starShipColor = StarShipColor.RED;
        engineStatus = EngineStatus.TURNED_OFF;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    public StarShip(String starShipName) throws FileNotFoundException {
        this.starShipName = starShipName;
        starShipColor = StarShipColor.RED;
        engineStatus = EngineStatus.TURNED_OFF;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    public StarShip(String starShipName, StarShipColor starShipColor) throws FileNotFoundException {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        engineStatus = EngineStatus.TURNED_OFF;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }
    public StarShip(String starShipName, StarShipColor starShipColor, EngineStatus engineStatus) throws FileNotFoundException {
        this.starShipName = starShipName;
        this.starShipColor = starShipColor;
        this.engineStatus = engineStatus;
        outputStream.println("Creating a StarShip");
        ++starShipNumber;
    }

    //Enum
    private enum EngineStatus{
        TURNED_OFF, LOW, MEDIUM, HIGH
    }

    public enum StarShipColor{
        WHITE, BLACK, RED, PINK, YELLOW, GREEN, BLUE
    }

    //Getter methods
    public String getStarShipName() {
        outputStream.println("getStarShipName: " + starShipName);
        return starShipName;
    }

    public EngineStatus getEngineStatus() {
        outputStream.println("getEngineStatus: " + engineStatus);
        return engineStatus;
    }

    public StarShipColor getStarShipColor() {
        outputStream.println("getStarShipColor: " + starShipColor);
        return starShipColor;
    }

    //Set methods

    public void turnOffEngine(){
        if(engineStatus == EngineStatus.TURNED_OFF) {
            System.out.println("Engine is already turned off.");
            outputStream.println("Engine is already turned off.");
        } else {
            System.out.println("Engine is turned off.");
            outputStream.println("Engine is turned off.");
            engineStatus = EngineStatus.TURNED_OFF;
        }
    }

    public void setLowEngine(){
        if(engineStatus == EngineStatus.LOW) {
            System.out.println("Engine is already in low mode.");
            outputStream.println("Engine is already in low mode.");
        } else {
            System.out.println("Engine is set in low mode.");
            outputStream.println("Engine is set in low mode.");
            engineStatus = EngineStatus.LOW;
        }
    }

    public void setMediumEngine(){
        if(engineStatus == EngineStatus.MEDIUM) {
            System.out.println("Engine is already in medium mode.");
            outputStream.println("Engine is already in medium mode.");
        } else {
            System.out.println("Engine is set in medium mode.");
            outputStream.println("Engine is set in medium mode.");
            engineStatus = EngineStatus.MEDIUM;
        }
    }

    public void setHighEngine(){
        if(engineStatus == EngineStatus.HIGH) {
            System.out.println("Engine is already in high mode.");
            outputStream.println("Engine is already in high mode.");
        } else {
            System.out.println("Engine is set in high mode.");
            outputStream.println("Engine is set in high mode.");
            engineStatus = EngineStatus.HIGH;
        }
    }

    public void closeLoggerFile(){
        outputStream.println("Close logger file.");
        outputStream.close();
    }
