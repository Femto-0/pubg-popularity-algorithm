import java.util.Currency;
import java.util.Scanner;

public class AlgorithmBreakDown {
    private double currentPopularityPercentageOfThePLayer;
    private double percentageChangeAfterGettingPopularity;
    private double totalPopularity;
    private double popularityAboutToBeDonated;


    public double calculateTotal(double currentPopularityPercentageOfThePLayer, double percentageChangeAfterGettingPopularity, double popularityAboutToBeDonated){
totalPopularity=(popularityAboutToBeDonated*(100 -currentPopularityPercentageOfThePLayer-percentageChangeAfterGettingPopularity))/percentageChangeAfterGettingPopularity;
        return totalPopularity;
    }
public  double whatPercentageAfterDonation(double popularityPercentageOfThePLayerBeforeDonation, double popularityAboutToBeDonated){
totalPopularity+=popularityAboutToBeDonated;
        return (popularityAboutToBeDonated*(100-popularityPercentageOfThePLayerBeforeDonation))/(totalPopularity+popularityAboutToBeDonated)+ currentPopularityPercentageOfThePLayer;
}
    public static void main(String[] args) {
        AlgorithmBreakDown ab= new AlgorithmBreakDown();
        Scanner sc= new Scanner(System.in);
        System.out.println("How much popularity did you donate to find the required details?");
        ab.popularityAboutToBeDonated = sc.nextDouble();
        System.out.println("What's the current popularity percentage?");
        ab.currentPopularityPercentageOfThePLayer= sc.nextDouble();
        System.out.println("What was the percentage change after you donated the popularity?");
        double percentageChange= sc.nextDouble();
        double percentageBeforeDonation= ab.currentPopularityPercentageOfThePLayer-percentageChange;
        
        System.out.println("Total popularity after donation: "+((ab.calculateTotal(percentageBeforeDonation,percentageChange, ab.popularityAboutToBeDonated))+ ab.popularityAboutToBeDonated));
        System.out.println("would you like to know what future holds? 1--yes, 2--> No");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Current Percentage?");
                ab.currentPopularityPercentageOfThePLayer= sc.nextDouble();
                System.out.println("How much popularity are you thinking of donating?");
                ab.popularityAboutToBeDonated=sc.nextDouble();
                System.out.println("Popularity % after donation will be: "+ab.whatPercentageAfterDonation(ab.currentPopularityPercentageOfThePLayer,ab.popularityAboutToBeDonated));
                System.out.println("Total Popularity after donation: "+ab.totalPopularity);
                break;
            case 2:
                System.exit(-1);
        }
    }

}
