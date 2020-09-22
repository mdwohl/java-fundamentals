package basiclibrary;

public class Averages{
    public double calculateAvg(int[] inputVal){
        double avgVal;
        int arrayLength = inputVal.length;
        int valueSum = 0;

        for(int i = 0; i < inputVal.length; i++){
            valueSum = inputVal[i] + valueSum;
        }
        avgVal = (double)valueSum / inputVal.length;

        return avgVal;
    }
}
