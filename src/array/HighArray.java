package array;

public class HighArray {

    // buat sebuah variabel dengan tipe array of integer yang namanya datas
    private int[] datas;

    private int nIndex = 0;

    // ini sebuah construction nama fungsinya mirip dengan nama class
    public HighArray(int size) {
        this.datas = new int[size];
    }

    public void insert(int value) {
        datas[nIndex++] = value;
    }

    public void show() {
       for (int i = 0; i < nIndex; i++ ){
           System.out.print( datas[i] + ", ");
       }

    }

    public boolean find (int value) {
        for (int data : datas) {

            if (data == value) {
                return true;
            }
        }
        return false;

    }


    public boolean detele (int value){
        int i;
        for ( i = 0; i < nIndex; i++ ) {

            if ( datas[i] == value ) {
                break;
            }

        }

        if ( i == nIndex ){
            return false;
        } else {
            for( int j = i; j < nIndex; j++ ){
                datas[j] = datas[ j + 1 ];
            }

            nIndex--;
            return true;
        }


    }


}
