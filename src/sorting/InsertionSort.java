package sorting;

// Bayangin lagi main kartu 🃏. Kamu ambil kartu satu per satu, lalu menyisipkan (insert) kartu itu ke posisi yang benar di tanganmu yang sudah terurut.
// insertion sort lebih praktis dibandingkan bubble sort dan selection sort
// Contoh [5, 3, 4, 1]
// - Mulai dengan [5] (anggap sudah terurut).
// - Ambil 3, sisipkan sebelum 5 → [3, 5, 4, 1]
// - Ambil 4, bandingkan dengan 5 → geser → [3, 4, 5, 1]
// - Ambil 1, geser 5, geser 4, geser 3 → [1, 3, 4, 5]

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {7, 5, 2, 3, 1, 9,};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

        }

        for(int num : arr) {
            System.out.print(num + " ");
        }


    }
}
