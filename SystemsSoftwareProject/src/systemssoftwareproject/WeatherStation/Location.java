package systemssoftwareproject.WeatherStation;

import java.util.Random;

public class Location {
    
    // Generate and return a Latitiude value
    public static double getGpsLat(double x0, double y0, int radius){
        Random random = new Random();

        // Convert radius from meters to degrees
        double radiusInDegrees = radius / 111000f;

        double u = random.nextDouble();
        double v = random.nextDouble();
        double w = radiusInDegrees * Math.sqrt(u);
        double t = 2 * Math.PI * v;
        double x = w * Math.cos(t);
        double y = w * Math.sin(t);

        // Adjust the x-coordinate for the shrinking of the east-west distances
        double new_x = x / Math.cos(Math.toRadians(y0));

        double foundLongitude = new_x + x0;
        double foundLatitude = y + y0;
        
        return foundLatitude;
    }
    
    // Generate and return a Longitude value
    public static double getGpsLong(double x0, double y0, int radius){
        Random random = new Random();

        // Convert radius from meters to degrees
        double radiusInDegrees = radius / 111000f;

        double u = random.nextDouble();
        double v = random.nextDouble();
        double w = radiusInDegrees * Math.sqrt(u);
        double t = 2 * Math.PI * v;
        double x = w * Math.cos(t);
        double y = w * Math.sin(t);

        // Adjust the x-coordinate for the shrinking of the east-west distances
        double new_x = x / Math.cos(Math.toRadians(y0));

        double foundLongitude = new_x + x0;
        double foundLatitude = y + y0;
 
        return foundLongitude;
    }
    
    // Generate and return an Altitude value
    public static double getGpsAltitude(){
        double start = 10;
        double end = 50;
        double random = new Random().nextDouble();
        double result = start + (random * (end - start));
        return result;
    }
    
}
