package basiclibrary;

public class RollingDice {
    public static void main(String[] args) {
        roll(4);
    }
    public static int[] roll(int times){
        int rollCount = 0;
        int [] rollValues = new int[times];

        while (rollCount < times){
            rollValues[rollCount] = (int) (Math.random()*6) + 1;
            rollCount++;
        }
//        System.out.println(rollValues.toString());
        return rollValues;
    }

    public class ContainsDuplicates {
        public boolean containsDuplicates(int[] thingToCheck){
            for(int slow = 0; slow < thingToCheck.length; slow++){
                for(int fast = slow + 1; fast < thingToCheck.length; fast++){
                    if(thingToCheck[fast] == thingToCheck[slow]) return true;
                }
            }

            return false;
        }
    }

}
