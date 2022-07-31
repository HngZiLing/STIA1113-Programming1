public class Index {

    static int hole_index;

    public static int calculateIndex(int i){

        int [] index = new int[18];
        index[0] = 3;
        index[1] = 15;
        index[2] = 9;
        index[3] = 13;
        index[4] = 5;
        index[5] = 11;
        index[6] = 1;
        index[7] = 17;
        index[8] = 7;
        index[9] = 12;
        index[10] = 2;
        index[11] = 18;
        index[12] = 6;
        index[13] = 16;
        index[14] = 10;
        index[15] = 14;
        index[16] = 8;
        index[17] = 4;

        for (int j = i; i <= 17; i++) {

            hole_index = index[j];
        }

        return hole_index;
    }

}