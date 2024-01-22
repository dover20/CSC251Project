// Create Policy class with public access specifier
public class Policy
{
    // Initialize variables
    String policyNumber; 
    String providerName;
    String firstName;
    String lastName;
    String smokerStatus;
    int age;
    double height, weight;
    
    // No-arg constructor for Policy class
    public Policy()
    {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.smokerStatus = "";
        this.age = 0;
        this.height = 0.0;
        this.weight = 0.0;
    }
    
    // Constructor with arguments
    public Policy(String policyNumber, String providerName, String firstName, String lastName, 
                  String smokerStatus, int age, double height, double weight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.smokerStatus = smokerStatus;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    // Method for calculating Policyholder's BMI
    public double calcBMI()
    {
        return ( (weight * 703) / (height * height) );
    }
    
    // Method for calculating policy price
    // Takes Policyholder's BMI as input
    public double calcPolicyPrice(double BMI)
    {
        double insPrice = 0.00;
        
        // base insurance fee
        insPrice += 600.00;
        
        // if policyholder is over 50, there is an additional fee
        if(age > 50)
        {
            insPrice += 75.00;
        }
        
        // if policyholder is a smoker, add an additional $100 fee
        if(smokerStatus.equals("smoker") || smokerStatus.equals("Smoker"))
        {
            insPrice += 100.00;
        }
        
        // if BMI is over 35 add additional fee
        if(BMI > 35)
        {
            insPrice += (BMI - 35) * 20;
        }
        
        // return the final insurance policy price
        return insPrice;
    }
}