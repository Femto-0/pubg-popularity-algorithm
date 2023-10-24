public class AlgorithmBreakDown {

    private double currentPopularityPercentageOfThePLayer;
    private double percentageChangeAfterGettingPopularity;
    private double totalPopularity;
    private double popularityAboutToBeDonated;


    public double calculateTotal(double currentPopularityPercentageOfThePLayer, double percentageChangeAfterGettingPopularity, double popularityAboutToBeDonated){
totalPopularity=(100*popularityAboutToBeDonated-((currentPopularityPercentageOfThePLayer+100*percentageChangeAfterGettingPopularity)*popularityAboutToBeDonated))/(currentPopularityPercentageOfThePLayer*100);
        return totalPopularity;
    }

    public static void main(String[] args) {
        AlgorithmBreakDown ab= new AlgorithmBreakDown();
        System.out.println("Total popularity after donation: "+(ab.calculateTotal(26,1,100)+ ab.popularityAboutToBeDonated));
    }

}
