// find the Smallest letter  greater than target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class S11_leetcode {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'f';
        char ans  = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }
     static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length - 1 ;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(letters[mid] > target){
                end =  mid - 1;
            }
            else{
                start = mid + 1;
            }
        }return letters[start % letters.length];
    }
}
