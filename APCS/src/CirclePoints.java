package module7;
/**
 * @author Nikhil Mishra
 * 10/11/19
 * Description: This program uses Math class functions to list out the points on a circle
 */
public class CirclePoints {

	public static void main(String[] args) {

		double radius = 1.0;
        double increment = 0.01;
        double x1 = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;

        //table heading
        System.out.println("Points on a Circle of Radius = " + radius);
        System.out.printf("%6s%8s%8s%8s%n", "x1", "y1", "x1", "y2");
        System.out.println(" -------------------------------------");

        //processing loop to find and print coordinates
        for (x1 = 1.00; x1 >= -1.00; x1 -= increment) {
            y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(x1, 2));
            y2 = 0 - Math.abs(y1);
            System.out.printf("%7.2f%8.2f%8.2f%8.2f%n", x1, y1, x1, y2);
		
        }
        }

}
