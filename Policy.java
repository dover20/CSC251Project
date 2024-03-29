// Create Policy class with public access specifier
public class Policy {
    // Initialize variables
    String providerName;
    String firstName;
    String lastName;
    String smokerStatus;
    int policyNumber;
    int age;
    int height;
    int weight;
    
    // Static field to keep track of the number of Policy objects created
    public static int numberOfPoliciesCreated = 0;

    // No-arg constructor for Policy class
    public Policy() {
        // Increment the static field when a new Policy object is created
        numberOfPoliciesCreated++;
        
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.smokerStatus = "";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    // Constructor with arguments
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  String smokerStatus, int age, int height, int weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.smokerStatus = smokerStatus;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    // toString method for Policy class
    @Override
    public String toString() {
        return String.format("Policy Number: %d%nProvider Name: %s%nFirst Name: %s%nLast Name: %s%n" +
                             "Smoker Status: %s%nAge: %d%nHeight: %d%nWeight: %d%n",
                             policyNumber, providerName, firstName, lastName, smokerStatus, age, height, weight);
    }


    /**
     * Method for calculating Policyholder's BMI
     */
    public double calcBMI() {
        return ((weight * 703) / (height * height));
    }

    /**
     * Method for calculating policy price
     *
     * @param BMI Policyholder's BMI as input
     */
    public double calcPolicyPrice(double BMI) {
        double insPrice = 0.00;

        // base insurance fee
        insPrice += 600.00;

        // if policyholder is over 50, there is an additional fee
        if (age > 50) {
            insPrice += 75.00;
        }

        // if policyholder is a smoker, add an additional $100 fee
        if (smokerStatus.equalsIgnoreCase("smoker")) {
            insPrice += 100.00;
        }

        // if BMI is over 35 add an additional fee
        if (BMI > 35) {
            insPrice += (BMI - 35) * 20;
        }

        // return the final insurance policy price
        return insPrice;
    }
}