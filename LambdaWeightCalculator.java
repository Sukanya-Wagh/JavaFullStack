package Tyif;
import java.util.Map;
import java.util.function.Function;

public class PlanetWeights 
{
    public static void main(String[] args) 
    {
        double earthWeight = 70.0; 
        double earthGravity = 9.81;
        Map<String, Double> gravityMap = Map.of(
            "Mercury", 3.7,
            "Venus", 8.87,
            "Earth", 9.81,
            "Mars", 3.71,
            "Jupiter", 24.79,
            "Saturn", 10.44,
            "Uranus", 8.69,
            "Neptune", 11.15
        );
        Function<Double, Double> calcWeight = planetGravity ->
            earthWeight * (planetGravity / earthGravity);
        gravityMap.forEach((planet, gravity) -> {
            double weight = calcWeight.apply(gravity);
            System.out.printf("Weight on %s: %.2f kg%n", planet, weight);
        });
    }
}
