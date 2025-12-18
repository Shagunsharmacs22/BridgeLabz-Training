package level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
      int r = 6378;
      double volume = (4.0/3) * Math.PI * Math.pow(r, 3);
      System.out.println("The volume of the Earth is: " + volume + " cubic kilometers");
      //in miles
        double radiusMiles = r * 0.6;
        double volumeMiles = (4.0/3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of the Earth is: " + volumeMiles + " cubic miles");
    }
}