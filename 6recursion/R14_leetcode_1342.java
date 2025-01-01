/*1342. Number of Steps to Reduce a Number to Zero
EASY
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.*/

public class R14_leetcode_1342 {
    public static void main(String[] args) {
        int steps = numberOfSteps(14);
        System.out.println(steps);

    }
    public static int numberOfSteps(int num) {
        int steps=0;
       return helper(num,steps);
}

    private static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
           num= num/2;
           return helper(num,steps+1);
        } else {
            num=num-1;
            return helper(num,steps+1);
        }

    }

}
