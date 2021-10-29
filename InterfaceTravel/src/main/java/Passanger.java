import java.util.Scanner;

public class Passanger implements TravelRequirements {

    private int fee;
    private boolean politicalStatus;
    private boolean visaStatus;

    public Passanger(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much tax did you pay? ");
        this.fee = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do you have any political obligation? ");
        String answer = scanner.nextLine();

        if (answer.equals("yes")){
            this.politicalStatus = true;
        }
        else{
            this.politicalStatus = false;
        }

        System.out.print("Do you have visa? ");
        String answer2 = scanner.nextLine();

        if (answer2.equals("yes")){
            this.visaStatus = true;
        }
        else{
            this.visaStatus = false;
        }
    }

    @Override
    public boolean tax() {
        if (this.fee < 15){
            System.out.println("Not enough fee value, please compansate");
            return false;
        }
        else{
            System.out.println("Fee is processed");
            return true;
        }
    }

    @Override
    public boolean visa() {
        if (this.visaStatus == true){
            System.out.println("Visa ok");
            return true;
        }
        else{
            System.out.println("You dont have visa requirements");
            return false;
        }
    }

    @Override
    public boolean politicalObligation() {
        if (this.politicalStatus == true) {
            System.out.println("You can not travel abroad");
            return false;
        }
        else{
            System.out.println("You can travel abroad, you dont have any political obligation");
            return true;
        }
    }
}
