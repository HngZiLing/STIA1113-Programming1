public class Blue {

    static int blue_yardage;

    public static int calculateBlue(int i){

        int [] blue = new int[18];
        blue[0] = 521;
        blue[1] = 329;
        blue[2] = 376;
        blue[3] = 366;
        blue[4] = 480;
        blue[5] = 209;
        blue[6] = 380;
        blue[7] = 179;
        blue[8] = 384;
        blue[9] = 297;
        blue[10] = 387;
        blue[11] = 132;
        blue[12] = 471;
        blue[13] = 187;
        blue[14] = 359;
        blue[15] = 338;
        blue[16] = 481;
        blue[17] = 352;

        for (int j = i; i <= 17; i++) {

            blue_yardage = blue[j];
        }

        return blue_yardage;
    }

}