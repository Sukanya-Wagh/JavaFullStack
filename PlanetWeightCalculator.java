package Tyif;
public class PlanetWeightCalculator 
{
    public static void main(String[] args) 
    {
        double earthWeight = 70.0;
        double earthGravity = 9.8;

        Runnable mercury = () -> {
            double gravity = 3.7;
            double weight = earthWeight * gravity / earthGravity;
            System.out.println("Weight on Mercury: " + weight + " kg");
        };

        Runnable venus = () -> {
            double gravity = 8.87;
            double weight = earthWeight * gravity / earthGravity;
            System.out.println("Weight on Venus: " + weight + " kg");
        };

        Runnable mars = () -> {
            double gravity = 3.71;
            double weight = earthWeight * gravity / earthGravity;
            System.out.println("Weight on Mars: " + weight + " kg");
        };

        Runnable jupiter = () -> {
            double gravity = 24.79;
            double weight = earthWeight * gravity / earthGravity;
            System.out.println("Weight on Jupiter: " + weight + " kg");
        };

        Runnable saturn = () -> {
            double gravity = 10.44;
            double weight = earthWeight * gravity / earthGravity;
            System.out.println("Weight on Saturn: " + weight + " kg");
        };
        mercury.run();
        venus.run();
        mars.run();
        jupiter.run();
        saturn.run();
    }
}
