/*
// https://leetcode.com/problems/richest-customer-wealth/
You are given an m x n integer grid accounts where accounts[i][j] is
the amount of money the ith customer has in the jth bank. Return the wealth
that the richest customer has.
A customer's wealth is the amount of money they have in all their bank
accounts. The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth
of 6 each, so return 6.

*/
public class S7_leetcode2 {
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,2,1},{22,7,27}};
        int ans = richest_person_wealth(accounts);
        System.out.println(ans);
    }

    
    //function to find the maximum wealth of the custemers
    public static int richest_person_wealth(int[][] accounts){

        int maxNum = Integer.MIN_VALUE;// to find the maximum

        //outer for loop to traverse through arrray iinside the 2D arrays
        for (int person = 0; person < accounts.length; person++) { // person are rows
            int personwealth = 0;//

            //innner for loop to traverse through each element inside the arrays
            for (int account = 0; account< accounts[person].length; account++) {// here account are columns

                personwealth +=  accounts[person][account];
            }
            if(personwealth>maxNum){
                maxNum = personwealth;
            }
            
        }
        return maxNum;
    }

}
