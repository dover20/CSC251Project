public class Policy
{
    private String policyNumber; 
    private String providerName;
    private String firstName;
    private String lastName;
    private String smokerStatus;
    private int age;
    private double height, weight;
    
    // No-arg constructor
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
    public Policy(String policyNumber, String providerName, String firstName, String lastName, String smokerStatus, int age, double height, double weight)
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
        
        return insPrice;
    }
    
    public static void main(String[] args)
    {
        Policy myPolicy = new Policy("1234","State Farm", "John", "Doe", "non-smoker", 24, 62, 250.5);
        
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
        
        //System.out.println(myPolicy.calcBMI());
        //System.out.println( myPolicy.calcPolicyPrice(myPolicy.calcBMI()) );
    }
}