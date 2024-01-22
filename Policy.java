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
    
    public static void main(String[] args)
    {
        Policy myPolicy = new Policy("ten","state farm", "dylan", "smith", "no", 32, 100, 50);
        System.out.println(myPolicy.lastName);
        System.out.println(myPolicy.calcBMI());
    }
}