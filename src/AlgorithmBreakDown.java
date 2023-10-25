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
public  double whatPercentageAfterDonation(double popularityPercentageOfThePLayerBeforeDonation, double totalPopularity, double popularityAboutToBeDonated){

        return (popularityAboutToBeDonated*(100-popularityPercentageOfThePLayerBeforeDonation))/(totalPopularity+popularityAboutToBeDonated)+ currentPopularityPercentageOfThePLayer;
}
    public static void main(String[] args) {
        AlgorithmBreakDown ab= new AlgorithmBreakDown();
        Scanner sc= new Scanner(System.in);
        System.out.println("How much popularity did you donate to find the required details?");
        double popularityDonatedToFindDetails= sc.nextDouble();
        System.out.println("What's the current popularity percentage?");
        double currentPercentage= sc.nextDouble();
        System.out.println("What was the percentage change after you donated the popularity?");
        double percentageChange= sc.nextDouble();
        double percentageBeforeDonation= currentPercentage-percentageChange;


        System.out.println("Total popularity after donation: "+((ab.calculateTotal(percentageBeforeDonation,percentageChange,popularityDonatedToFindDetails))+ popularityDonatedToFindDetails));
    }

}
