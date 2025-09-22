

// Add Comments

import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[]args) {
        //Task 1
        
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

        System.out.println("Player Name -" + " " + name);
        System.out.println("Age -" + " " + age);
        System.out.println("Height -"  +" " + height + "m");
        System.out.println("Weight -" +" " + weight + "lbs");
        System.out.println("Jersey Number -" + " " + jerseyNumber);


        //Task 2
        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInKgs = weight  * POUND;
        double heightInCms = height * METER ;

        System.out.println((int)weightInKgs);
        System.out.println((int)heightInCms);
        System.out.println("Player Name -" + " " + name);
        System.out.println("Age -" + " " + age);
        System.out.println("Height -"  +" " + (int)weightInKgs+ "kg");
        System.out.println("Weight -" +" " + (int)heightInCms + "cm");
        System.out.println("Jersey Number -" + " " + jerseyNumber);



        //Task 3 
        System.out.println("Updated age: " + ++age);
        System.out.println("Updated jerseyNumber:" + --jerseyNumber);

        //Task 4 
        
        
        if (age >= 18 && age <= 35 && weight < 90) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }

        if (age<18 || weight>=90) {
            System.out.println("Player has a problem (either too young or too heavy");
                               
        }

        
        if (!(age >= 18 && age < 35 && weight < 90)) {
            System.out.println("Not Eligible");
        }
        else {
            System.out.println(" Eligible");
        }
        
        
        //Task 5 
        if (age >=30) {
            System.out.println("You're in the Veteran category");
        }

        else if (age >=20 && age <30) {
            System.out.println("You're in the prime player category ");
        }

        else  {
            System.out.println("You're in the Rising star category ");
        }

        
        //Task 6 
         
        switch (jerseyNumber) {
            case 1: System.out.println("Goalkeeper");break;
            case 2: System.out.println("Defender");break;
            case 5: System.out.println("Defender");break;
            case 6: System.out.println("Midfielder");break;
            case 7: System.out.println("Winger");break;
            case 8: System.out.println("Midfielder");break;
            case 9: System.out.println("Striker");break;
            case 10: System.out.println("Playmaker");break;
            case 11: System.out.println("Winger");break;

            default: System.out.println("Player position not known");
                     System.exit(1);
            

        }
        

        //Task 7 
         
        //Part A 
           switch (jerseyNumber) {
            case 2: System.out.println("Defender");
        
            case 5: System.out.println("Defender");break;
            case 6: System.out.println("Midfielder");break;
            case 7: System.out.println("Winger");
            case 11: System.out.println("Winger"); break;
            
            default: System.out.println("Player position not known");
       
            }

    
        
       
        



        
        //Part B
        
        switch (jerseyNumber) {
            
            case 2,5-> System.out.println("Defender");
            case 6,8 -> System.out.println("Midfielder");
            case 7,11 -> System.out.println("Winger");
            default -> System.out.println("Player position not known");
        }
        
        

        //Task 8 
         
        if (age >=20 && age <30) {
            if (weight < 80) {
                System.out.println("You're selected for starting line-up ");
            }
        }

            else {
                System.out.println("Bench");
            }
        

        //Task 9 
        /* 
        System.out.println((age >= 18 && age < 35 && weight < 90) ? "Play" : "Rest" );

        */
    

    }
}