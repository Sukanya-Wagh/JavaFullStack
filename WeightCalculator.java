package Tyif;
public class PlanetWeightCalculator {

    public static void main(String[] args) {
        double earthWeight = 70.0; 
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] gravityFactors = {0.38, 0.91, 1.00, 0.38, 2.34, 1.06, 0.92, 1.19, 0.06};
        System.out.println("Weight on different planets for 70 kg on Earth:\n");
        for (int i = 0; i < planets.length; i++) {
            double planetWeight = earthWeight * gravityFactors[i];
            System.out.printf("%s: %.2f kg%n", planets[i], planetWeight);
        }
    }
}
