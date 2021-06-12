
public class Area_Arguments_20190421 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area = 0.0;
        double pi = 3.14;

        if (args.length == 0) {
            System.out.println("Using default square side length is: 4");
            area = 4 * 4;
            System.out.println("Area of square = side * side = " + area);

            System.out.println("");

            System.out.println("Using default circle radius length is: 4");
            area = pi * 4 * 4;
            System.out.println("Area of circle = 3.14*radius*radius = " + area);

            System.out.println("");

            System.out.println("Using default rectangle side length = 4 and width = 6");
            area = 4 * 6;
            System.out.println("Area of square = length*width = " + area);

            System.out.println("");

        } else if (args.length == 2 || args.length == 3) {
            String shape = args[0];

            if (shape.compareToIgnoreCase("square") == 0) {
                System.out.println("Square side length is: " + args[1]);
                double side = Double.parseDouble(args[1]);
                area = side * side;
                System.out.println("Area of square = side * side =" + area);

            } else if (shape.compareToIgnoreCase("rectangle") == 0) {
                if (args.length == 3) {
                    System.out.println("rectangle side length is: " + args[1]);
                    double length = Double.parseDouble(args[1]);

                    System.out.println("rectangle side width is: " + args[2]);
                    double width = Double.parseDouble(args[2]);
                    area = length * width;
                    System.out.println("Area of rectangle = length*width = " + area);
                } else {
                    System.out.println("Error!, Wrong number of arguments!");
                }

            } else if (shape.compareToIgnoreCase("circle") == 0) {
                System.out.println("Circle radius length =  " + args[1]);
                double radius = Double.parseDouble(args[1]);
                area = pi * radius * radius;
                System.out.println("Area of circle = 3.14*radius*radius = " + area);
            } else {
                System.out.println("undefined shape!");
            }
        } else {
            System.out.println("Error!, Wrong number of arguments!");
        }

    }

}
