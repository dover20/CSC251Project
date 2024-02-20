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
        
        // open a scanner named "fileInput" for input from a file
        File file = new File("PolicyInformation.txt");
        Scanner fileInput = new Scanner(file);
        
        // Create ArrayList for Policy Objects
        ArrayList<Policy> policyList = new ArrayList<>();
        
        // Create ArrayList for PolicyHolder Objects
        ArrayList<PolicyHolder> policyHolderList = new ArrayList<>();
        
        // loop until file ends
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

        // close the scanner
        fileInput.close();
    }
}