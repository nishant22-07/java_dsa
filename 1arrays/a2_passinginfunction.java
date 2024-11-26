import java.util.Arrays;
public class a2_passinginfunction
{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        update(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void update(int[] arr){
        arr[0] = 1;
    }
}
