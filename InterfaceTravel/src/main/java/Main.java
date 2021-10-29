public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to airport");
        String requirements = "Requirements...\n"
                            + "You must not have any political obligation"
                            + "You need to pay your travel fee"
                            + "You must have visa";
        String message = "You need to have all requirements";

        while (true){
            System.out.println("****************************************");
            System.out.println(message);
            System.out.println("****************************************");
            System.out.println(requirements);

            Passanger passanger = new Passanger();

            System.out.println("Tax fee checking");
            Thread.sleep(3000);
            if (passanger.tax() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Political obligation checking");
            Thread.sleep(3000);
            if (passanger.politicalObligation() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Visa checking");
            Thread.sleep(3000);
            if (passanger.visa() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Requirements are ok, you can travel abroad");
            break;
        }
    }
}
