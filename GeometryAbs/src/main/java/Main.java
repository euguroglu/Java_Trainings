import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String operations = "Operations...\n"
                          + "1. Square Area Calculator\n"
                          + "2. Triangle Area Calculator\n"
                          + "3. Circle Area Calculator\n"
                          + "Exit: q";

        while (true){
            System.out.println(operations);
            System.out.println("Which area do you want to calculate? ");
            String shape = scanner.nextLine();
            Geometry geometry = null;
            if (shape.equals("q")){
                System.out.println("Exiting...");
                break;
            }
            else if (shape.equals("1")){
                System.out.println("Enter the edge of square");
                int edge = scanner.nextInt();
                scanner.nextLine();

                geometry = new Square("Square 1", edge);
                geometry.calculateArea();
                }
            else if (shape.equals("2")){
                System.out.println("Edge 1: ");
                int edge1 = scanner.nextInt();
                System.out.println("Edge 2: ");
                int edge2 = scanner.nextInt();
                System.out.println("Edge 3: ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();

                geometry = new Triangle("Triangle 1", edge1, edge2, edge3);

                geometry.calculateArea();
                }
            else if (shape.equals("3")){
                System.out.println("Enter radius: ");
                int radius = scanner.nextInt();
                scanner.nextLine();
                geometry = new Circle("Circle 1", radius);

                geometry.calculateArea();
            }
            else {
                System.out.println("Unknown operation");
            }

        }
    }
}
