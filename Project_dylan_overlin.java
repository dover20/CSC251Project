import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_dylan_overlin {
    public static void main(String[] args) throws IOException
    {
        // initialize variables
        String usersProvidersName = "";
        String usersFirstName = "";
        String usersLastName = "";
        String usersSmokingStatus = "";
        String usersAge, usersHeight, usersWeight, usersPolicyNumber;
        int smokers = 0;
        int nonsmokers = 0;
        
        // open a scanner named "fileInput" for input from a file
        File file = new File("PolicyInformation.txt");
        Scanner fileInput = new Scanner(file);
        
        // Create ArrayList for Policy Objects
        ArrayList<Policy> policyList = new ArrayList<>();
        
        // Create ArrayList for PolicyHolder Objects
        ArrayList<PolicyHolder> policyHolderList = new ArrayList<>();
        
        // loop until file ends
        while(fileInput.hasNext()) {
        
          // retrieve policy information from file
           usersPolicyNumber =  fileInput.nextLine();
                      
           usersProvidersName = fileInput.nextLine();
           
           usersFirstName = fileInput.nextLine();     
        
           usersLastName = fileInput.nextLine();
           
           usersAge = fileInput.nextLine();
           
           usersSmokingStatus = fileInput.nextLine();  
           
           usersHeight = fileInput.nextLine();
           
           usersWeight = fileInput.nextLine();
           
           // Convert Strings to Integers           
           int newPolicyNum = Integer.parseInt(usersPolicyNumber);
           int newUsersHeight = Integer.parseInt(usersHeight);
           int newUsersWeight = Integer.parseInt(usersWeight);
           int newUsersAge = Integer.parseInt(usersAge);
           
           if(usersSmokingStatus.equals("smoker"))
           {
               smokers = smokers + 1;
           } else {
               nonsmokers = nonsmokers + 1;
           }

        while (fileInput.hasNext()) {
            // retrieve policy information from file
            usersPolicyNumber = fileInput.nextLine();
            usersProvidersName = fileInput.nextLine();
            usersFirstName = fileInput.nextLine();
            usersLastName = fileInput.nextLine();
            usersAge = fileInput.nextLine();
            usersSmokingStatus = fileInput.nextLine();
            usersHeight = fileInput.nextLine();
            usersWeight = fileInput.nextLine();

            // Convert Strings to Integers
            int newPolicyNum = Integer.parseInt(usersPolicyNumber);
            int newUsersHeight = Integer.parseInt(usersHeight);
            int newUsersWeight = Integer.parseInt(usersWeight);
            int newUsersAge = Integer.parseInt(usersAge);

            // Create a new PolicyHolder
            PolicyHolder policyHolder = new PolicyHolder(usersFirstName, usersLastName, usersSmokingStatus,
                    newUsersAge, newUsersHeight, newUsersWeight);

            // policy constructor that accepts the above variables as arguments
            Policy myPolicy = new Policy(newPolicyNum, usersProvidersName, usersFirstName, usersLastName,
                    usersSmokingStatus, newUsersAge, newUsersHeight, newUsersWeight);

            // Add current policy object to the policy holder
            policyHolder.addPolicy(myPolicy);

            // Add current policy holder to the ArrayList
            policyHolderList.add(policyHolder);
        }

        // Loop through ArrayList of PolicyHolder Objects
        for (PolicyHolder policyHolder : policyHolderList) {
            // output policyholder's information with formatting
            policyHolder.displayPolicies();
        }
        
        // Loop through ArrayList of Policy Objects
        for(Policy myPolicy : policyList)
        {
           // output policyholder's information with formatting
           System.out.println("\n");
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
        } 
        
        // Print smoking data
        System.out.println("\n");
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonsmokers);

        // close the scanner
        fileInput.close();
    }
}