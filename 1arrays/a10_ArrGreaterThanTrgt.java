import java.util.ArrayList;
public class a10_ArrGreaterThanTrgt {


        public static int[] getElementsGreaterThanTarget(int[] arr, int target) {
            // Use ArrayList to dynamically store elements greater than the target
            ArrayList<Integer> resultList = new ArrayList<>();

            // Iterate through the array and check for elements greater than the target
            for (int num : arr) {
                if (num > target) {
                    resultList.add(num);
                }
            }

            // Convert the ArrayList to an array and return it
            int[] resultArray = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultArray[i] = resultList.get(i);
            }
            return resultArray;
        }

        public static void main(String[] args) {
            int[] numbers = {2, 8, 3, 10, 15, 6};
            int target = 5;

            // Get the array of elements greater than the target
            int[] result = getElementsGreaterThanTarget(numbers, target);

            // Print the result
            System.out.print("Elements greater than " + target + ": ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }


}
