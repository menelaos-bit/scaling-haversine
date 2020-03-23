package HaverSine;

public class Methods {
    public static void main(String[] args) {
        // we will combine the getDistance method with this later.
        convertDistance(distanceBetweencities, scale);

        // temporary for now
        System.out.printf("The distance between" +  "city one and city two")


    }

    public static double convertDistance(long distanceBetweencities, String scale) {

        double distanceBetweenCoordinates = 0.0;
        switch (scale) {
            case "Miles":
            case "miles":
                distanceBetweenCoordinates = distanceBetweencities / 1.60934;
                return distanceBetweenCoordinates;

            case "Kilometers":
            case "kilometers":
                distanceBetweenCoordinates = distanceBetweencities;
                return distanceBetweenCoordinates;
            case "Meters":
            case "meters":
                distanceBetweenCoordinates = distanceBetweencities * 1000;
                return distanceBetweenCoordinates;
            case "Yards":
            case "yards":
                distanceBetweenCoordinates = distanceBetweencities * 1093.613;
                return distanceBetweenCoordinates;
            // if they enter an invalid scale we will default into 0.0
            default:
                return distanceBetweenCoordinates;


        }


}
