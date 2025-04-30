public class test {
    public static void main(String[] args) {
        int arr[] = { 3456, 12, 14, 7, 9865};
        int nums = findNUmbers(arr);
        System.out.println(nums);
    }
    public static int findNUmbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }

        }
        return count;
    }
    public static boolean  even(int num){
        if(digits(num)%2==0){
            return true;
        }else{
            return false;
        }


    }
    public static int digits(int num){
        int count = 0;
        if(num<0){
            num = 0-(-234);
        }
        while(num>0){

            count++;
            num = num/10;
        }
        return count;
    }
}



