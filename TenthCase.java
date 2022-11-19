import java.util.Random;

public class TenthCase {
    public static void main(String[] args){
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt();
        }
        arrSort(arr);
        arrPrint(arr);
    }

    private static void arrPrint(int[] nums) {
        for (int num : nums) System.out.print(num + " ");
    }

    private static void arrSort(int[] nums) {
        arrSort(nums, 0, nums.length - 1);
    }

    private static void arrSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int pivot = nums[end];
        int cursor1 = start, cursor2 = end;
        while (cursor1 != cursor2){
            while (nums[cursor1] < pivot && cursor1 < cursor2){
                cursor1++;
            }
            while (nums[cursor2] >= pivot && cursor1 < cursor2){
                cursor2--;
            }
            if (cursor1 != cursor2) {
                int temp = nums[cursor1];
                nums[cursor1] = nums[cursor2];
                nums[cursor2] = temp;
            } else if (cursor1 != end) {
                int temp = nums[cursor1];
                nums[cursor1] = pivot;
                nums[end] = temp;
            }
        }
        arrSort(nums, start, cursor1 - 1);
        arrSort(nums, cursor1, end);
    }

}