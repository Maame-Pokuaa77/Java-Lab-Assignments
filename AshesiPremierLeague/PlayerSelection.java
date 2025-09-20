
import java.util.Scanner;

public class PlayerSelection {
     public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name= input.nextLine(); 

        System.out.print("Enter your age: ");
        int age= input.nextInt();

        System.out.print("Enter your height(in meters): ");
        double height= input.nextDouble();

        System.out.print("Enter your weight(in pounds): ");
        double weight= input.nextDouble();

        System.out.print("Enter your jersey number: ");
        int jerseyNumber= input.nextInt();

        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInKgs = weight  * POUND;
        double heightInCms = height * METER ;

        String position;
        switch (jerseyNumber) {
            

            case 1 -> position= "Goalkeeper";
            case 3 -> position= "Left Back";
            case 4 -> position= "Centre Back";
            case 9 -> position= "Striker";

            case 2,5-> position="Defender";
            case 6,8 -> position = "Midfielder";
            case 7,11 -> position="Winger";
            default -> position="Player position not known";
        }
        /* Demo of fallthrough
        switch (jerseyNumber) {

           case 2,5:position ="Defender";
           case 6,8:position ="Midfielder";
           case 7,11 : position="Winger";

        
           default: position="Player position not known";
        }
        */

        String attackerJersey;
        
        switch (jerseyNumber) {
            case 7,9,10,11 -> attackerJersey = "Yes";
            default -> attackerJersey ="No";
        

        }


        String eligibility;
        if (age >= 18 && age < 35 && weight < 90) {
            eligibility="Eligible";
        }
        else {
            eligibility="Not Eligible";
        }

        
        String lineupDecision;

        if (age >= 20 && age < 30) {
            if (weight < 80) {
                lineupDecision = "You're selected for starting line-up";
            } else {
                lineupDecision = "Bench";   
            }
        } else {
            lineupDecision = "Bench";       
        }

        String category ;
        if (age >=30 ) category ="Veteran";
        else if (age >=20) category = "Prime player";
        else category = "Rising Star";
        

        String finalDecision ;

        finalDecision = (age >= 18 && age < 35 && weight < 90) ? "Play" : "Rest" ;



        System.out.println("Player Name :" + " " + name);
        System.out.println("Age :" + " " + age + "(" + category + ")");
        System.out.println("Height :"  +" " + (int)weightInKgs+ "kg");
        System.out.println("Weight :" +" " + (int)heightInCms + "cm");
        System.out.println("Jersey :" + " " + jerseyNumber);
        System.out.println("Position :" + " " + position);
        System.out.println("Attacker jersey :" + " " + attackerJersey);
        System.out.println("Eligibility :" + " " + eligibility);
        System.out.println("Lineup Decision :" + " " + lineupDecision);
        System.out.println("Final Decision :" + " " + finalDecision);



     }
        

}
   

        

        
        


