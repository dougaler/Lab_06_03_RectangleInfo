import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        if(in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();
            System.out.println("Enter width of rectangle");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();

                area = length * width;
                perimeter = length + length + width + width;
                diagonal = Math.sqrt((length*length) + (width*width));

                System.out.printf("The area of the rectangle %.2f%n", area);
                System.out.printf("The perimeter of the rectangle %.2f%n", perimeter);
                System.out.printf("The diagonal of the rectangle %.2f%n", diagonal);

            }else{
                trash = in.nextLine();
                System.out.println("Invalid width entered: " +trash);
            }

        }else{
            trash = in.nextLine();
            System.out.println("Invalid length entered: "+trash);
        }


    }
}