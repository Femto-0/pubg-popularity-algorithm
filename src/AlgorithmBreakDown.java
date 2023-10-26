import java.util.Scanner;

public class AlgorithmBreakDown {
    static Scanner sc = new Scanner(System.in);
    private double currentPopularityPercentageOfThePLayer;
    private double totalPopularity;
    private double popularityAboutToBeDonated;


    public void calculateTotal(double currentPopularityPercentageOfThePLayer, double percentageChangeAfterGettingPopularity, double popularityAboutToBeDonated) {
        totalPopularity = (popularityAboutToBeDonated * (100 - currentPopularityPercentageOfThePLayer - percentageChangeAfterGettingPopularity)) / percentageChangeAfterGettingPopularity;
    }

    public double whatPercentageAfterDonation(double popularityPercentageOfThePLayerBeforeDonation, double popularityAboutToBeDonated) {
        return (popularityAboutToBeDonated * (100 - popularityPercentageOfThePLayerBeforeDonation)) / (totalPopularity + popularityAboutToBeDonated) + currentPopularityPercentageOfThePLayer;
    }

    public void findingThePopularityIfTotalIsKnown() {
        System.out.println("What's the total popularity?");
        totalPopularity = sc.nextDouble();
        System.out.println("Current Percentage?");
        currentPopularityPercentageOfThePLayer = sc.nextDouble();
        System.out.println("How much popularity are you thinking of donating?");
        popularityAboutToBeDonated = sc.nextDouble();
        System.out.println("Popularity % after donation will be: " +Math.round( whatPercentageAfterDonation(currentPopularityPercentageOfThePLayer, popularityAboutToBeDonated))+"%");
        System.out.println("Total Popularity after donation: "+ (totalPopularity+popularityAboutToBeDonated));
        System.out.println("NOTE: The predicted % is a rounded off value so it might vary by +-1 sometimes");
    }

    public void findingThePopularityIfTotalIsNotKnown() {
        System.out.println("Here is the list of all the details this algorithm requires to function:");
        System.out.println("First, donate some popularity to find change in percentage and note down the popularity % before and after donation");
        System.out.println("How much popularity did you donate to find the required details?");
        popularityAboutToBeDonated = sc.nextDouble();
        System.out.println("What's the current popularity percentage?");
        currentPopularityPercentageOfThePLayer = sc.nextDouble();
        System.out.println("What was the percentage change after you donated the popularity?");
        double percentageChange = sc.nextDouble();
        double percentageBeforeDonation = currentPopularityPercentageOfThePLayer - percentageChange;

        calculateTotal(percentageBeforeDonation, percentageChange, popularityAboutToBeDonated); //in this method we find some number that matches how the given data behaves.
        //Note: The number here might not match the actual popularity total, but it behaves exactly like total popularity
        /*
        now we predict the popularity % if they were to donate some popularity
         */
        System.out.println("Now that we have all the data required, how much popularity are you actually thinking of donating");
        System.out.println("How much popularity are you thinking of donating?");
        popularityAboutToBeDonated = sc.nextDouble();
        System.out.println("Popularity % after donation will be: " + Math.round(whatPercentageAfterDonation(currentPopularityPercentageOfThePLayer, popularityAboutToBeDonated))+"%");
        System.out.println("NOTE: The predicted % is a rounded off value so it might vary by +-1 sometimes");
    }


    public static void main(String[] args) {
        AlgorithmBreakDown ab = new AlgorithmBreakDown();
        System.out.println("Do you know the total popularity? 1--> yes, 2--> No, -1--> Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: //user knows the total popularity
                ab.findingThePopularityIfTotalIsKnown();
                break;
            case 2: //user doesn't know the total popularity
                ab.findingThePopularityIfTotalIsNotKnown();
                break;
            case -1: //User wants to Exit
                System.exit(0);
                break;
            default:
                System.out.println("Unexpected value: " + choice);
                System.out.println("Choose from given options");
        }
    }

}
