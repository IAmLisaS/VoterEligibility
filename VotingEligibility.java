import java.util.Scanner; 
class VotingEligibility
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        int age;
        System.out.print("Enter your age >> ");
        age = inputDevice.nextInt();
        determineEligibility(age);
        System.out.println("Age entered was " + age);
    }
    public static void determineEligibility(int years)
    {
        final int CUTOFF = 18;
        if(years >= CUTOFF)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not yet eligible to vote. ");
        
    }
}