package sorting;

// Cari elemen terkecil dari array lalu tukar dengan posisi paling depan
public class SelectionSort {
    public static void main(String[] args) {

        int[] nums = {4, 2, 6, 5, 7, 9, 8};   // length = 7
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + ", ");
        }


        for (int i = 0; i < size - 1; i++) {

            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }

        System.out.println("\n");

        System.out.println("After sorting");

        for (int num : nums) {
            System.out.print(num + ", ");
        }


    }
}
