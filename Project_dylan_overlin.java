import java.util.Scanner;

public class Project_dylan_overlin {
    public static void main(String[] args)
    {
        // initialize variables for user input
        String usersPolicyNumber = "";
        String usersProvidersName = "";
        String usersFirstName = "";
        String usersLastName = "";
        String usersSmokingStatus = "";
        int usersAge;
        double usersHeight, usersWeight;
        
        // open a scanner named "keyboard" for user input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for their policy information
        System.out.print("What is your policy number? ");
        usersPolicyNumber = keyboard.nextLine();
        
        System.out.print("What is your Policy Providers Name? ");
        usersProvidersName = keyboard.nextLine();
        
        System.out.print("What is your First Name? ");
        usersFirstName = keyboard.nextLine();     
        
        System.out.print("What is your Last Name? ");
        usersLastName = keyboard.nextLine();
        
        System.out.print("What is your Age? ");
        usersAge = keyboard.nextInt();
        
        // move scanner to next line to prevent empty scanner input after reading integer
        keyboard.nextLine();
        
        System.out.print("What is your Smoking Status? (smoker/non-smoker) ");
        usersSmokingStatus = keyboard.nextLine();  
        
        System.out.print("What is your Height? (in inches) ");
        usersHeight = keyboard.nextDouble();
        
        System.out.print("What is your Weight? (in pounds) ");
        usersWeight = keyboard.nextDouble();
            
        // policy constructor that accepts the above variables as arguments
        Policy myPolicy = new Policy(usersPolicyNumber, usersProvidersName, usersFirstName, usersLastName, 
                                    usersSmokingStatus, usersAge, usersHeight, usersWeight);
        
        // output policyholder's information with formatting
        System.out.println("");
        System.out.println("Policy Number: " + myPolicy.policyNumber);
        System.out.println("Provider Name: " + myPolicy.providerName);
        System.out.println("Policyholder's First Name: " + myPolicy.firstName);
        System.out.println("Policyholder's Last Name: " + myPolicy.lastName);
        System.out.println("Policyholder's Age: " + myPolicy.age);
        System.out.println("Policyholder's Smoking Status: " + myPolicy.smokerStatus);
        System.out.println("Policyholder's Height: " + myPolicy.height);
        System.out.println("Policyholder's Weight: " + myPolicy.weight);
        System.out.printf("Policyholder's BMI: %.2f", myPolicy.calcBMI() );
        System.out.printf("\nPolicy Price: $%.2f", myPolicy.calcPolicyPrice(myPolicy.calcBMI()) );
        
        // close the scanner
        keyboard.close();
    }
}