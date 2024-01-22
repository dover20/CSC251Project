
public class Project_dylan_overlin {
    public static void main(String[] args)
    {
        // Policy Number, Provider Name, First Name, Last Name, Smoking Status, Age, Height (inches), Weight (lbs)
        Policy myPolicy = new Policy("1234","State Farm", "John", "Doe", "non-smoker", 24, 62, 250.5);
        
        // Output Policyholder's Information with formatting
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
}