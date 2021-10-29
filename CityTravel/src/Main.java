import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void write_operations(){
        System.out.println("0 - Check Operations...");
        System.out.println("1 - Go to next city...");
        System.out.println("2 - Go to previous city...");
        System.out.println("3 - Exit from application...");
    }

    public static void travel_cities(LinkedList<String> cities){
        ListIterator<String> iterator = cities.listIterator();

        int operations;

        write_operations();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("There is not city");
        }

        boolean exit = false;
        boolean forward = true;

        while (!exit){
            System.out.println("Choose your operation");

            operations = scanner.nextInt();

            switch (operations){
                case 0:
                    write_operations();
                    break;
                case 1:
                    if(!forward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Going to next city " + iterator.next());
                    }
                    else {
                        System.out.println("There is not city left");
                        forward = true;
                    }
                    break;
                case 2:
                    if (forward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Going to previous city " + iterator.previous());
                    }
                    else{
                        System.out.println("City tour started...");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting from application");
                    break;
            }
        }
    }

    public static void main(String[] args){

        LinkedList<String> cities = new LinkedList<String>();

        cities.add("Paris");
        cities.add("London");
        cities.add("Helsinki");

        travel_cities(cities);
    }
}
