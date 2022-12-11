package lab4;

import lab4.MultiplyStarShip.StarShipColor;

public class MultiplyStarShipApp {
    public static void main(String[] args) {
        
        MultiplyStarShip multiplyStarShip=new MultiplyStarShip();
        System.out.println(multiplyStarShip.getStarShipName());
        System.out.println(multiplyStarShip.getStarShipColor());

        System.out.println(multiplyStarShip.checkEngineWear());
        System.out.println(multiplyStarShip.checkFuel());

        multiplyStarShip.refuel();
        multiplyStarShip.repair();

        System.out.println(multiplyStarShip.checkEngineWear());
        System.out.println(multiplyStarShip.checkFuel());
        
        MultiplyStarShip multiplyStarShip1=new MultiplyStarShip("MotherShip",StarShipColor.RED,-1,-1);
        System.out.println(multiplyStarShip1.getStarShipName());
        System.out.println(multiplyStarShip1.getStarShipColor());

        System.out.println(multiplyStarShip1.checkEngineWear());
        System.out.println(multiplyStarShip1.checkFuel());

        multiplyStarShip1.refuel();
        multiplyStarShip1.repair();
        
        System.out.println(multiplyStarShip1.checkEngineWear());
        System.out.println(multiplyStarShip1.checkFuel());
    
    }
}
