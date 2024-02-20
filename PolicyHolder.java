import java.util.ArrayList;

public class PolicyHolder {
    // Fields directly associated with a policy holder
    private String firstName;
    private String lastName;
    private String smokingStatus;
    private int age;
    private int height;
    private int weight;
    private ArrayList<Policy> policyList;

    // Constructor for PolicyHolder class
    public PolicyHolder(String firstName, String lastName, String smokingStatus, int age, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.smokingStatus = smokingStatus;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.policyList = new ArrayList<>();
    }

    // Method to add a policy to the policy holder
    public void addPolicy(Policy policy) {
        policyList.add(policy);
    }

   // Method to display information for each policy associated with the policy holder
   public void displayPolicies() {
       // Display personal information for the policy holder
       System.out.println("\nPolicyholder's First Name: " + firstName);
       System.out.println("Policyholder's Last Name: " + lastName);
       System.out.println("Policyholder's Age: " + age);
       System.out.println("Policyholder's Smoking Status: " + smokingStatus);
       System.out.println("Policyholder's Height: " + height);
       System.out.println("Policyholder's Weight: " + weight);

       // Loop through policies and display information for each policy
       for (Policy policy : policyList) {
           System.out.println("Policy Number: " + policy.policyNumber);
           System.out.println("Provider Name: " + policy.providerName);
           System.out.printf("Policyholder's BMI: %.2f", policy.calcBMI());
           System.out.printf("\nPolicy Price: $%.2f", policy.calcPolicyPrice(policy.calcBMI()));
           System.out.println("");
      }
   }
}
