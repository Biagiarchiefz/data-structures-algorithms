package searching;

public class SearchingAlgorithms {

    public static void main(String[] args) {

        int[] nums = {2, 3, 8, 9 ,12};

        int[] test = new int[10];

        int target = 9;

        int result1 = linearSearch( nums, target );
        int result2 = binarySearch( nums, target, 0, nums.length -1 );

        if ( result2 != -1 ) {
            System.out.println("Element ditemukan di index ke = " + result2 );
        } else {
            System.out.println("Element tidak ditemukan");
        }

    }


    public static int linearSearch( int[] nums, int target ) {

        for ( int i = 0; i < nums.length; i++ ) {
            if (nums[i] == target) {
                return i;  // return indexnya
            }

        }
        return -1;
    }

    public static int binarySearch( int[] nums, int target, int left, int right ) {
        // 2, 3, 8, 9 ,12
//        int left = 0;
//        int right = nums.length - 1;

        // optimasi algorithms
        if ( left <= right ) {
            int mid = ( left + right ) / 2;

            if ( nums[mid] == target ){
                return mid;              // ujung iterasinya di return mid ini;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);   // recursi fungsing
            } else {
                return binarySearch(nums, target, left, mid -1 );
            }

        }


// CARA YANG MENGGUNAKAN 2 Parameter
//        while( left <= right ) {
//            int mid = ( left + right ) / 2;    // mid adalah index  // rumus
//
//            if ( nums[mid] == target ){
//                return mid;              // ujung iterasinya di return mid ini;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//
//        }

        return -1;
    }

}
