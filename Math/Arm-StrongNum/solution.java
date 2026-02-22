import java.util.*;

public class Main {
    public boolean isArmstrong(int num) {
        int originalValue = num;
        int tempForCount = num;
        int k = 0;
        if (num == 0) return true;
        
        while (tempForCount != 0) {
            tempForCount /= 10;
            k++;
        }
        long sum = 0;
        int tempForSum = num;
        
        while (tempForSum != 0) {
            int digit = tempForSum % 10;
            sum += (long) Math.pow(digit, k);
            tempForSum /= 10;
        }
        return sum == originalValue;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Is 153 Armstrong? " + obj.isArmstrong(153)); 
        System.out.println("Is 123 Armstrong? " + obj.isArmstrong(123)); 
    }
}
