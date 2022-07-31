public class White {

    static int white_yardage;

    public static int calculateWhite(int i){

        int [] white = new int[18];
        white[0] = 484;
        white[1] = 298;
        white[2] = 348;
        white[3] = 352;
        white[4] = 458;
        white[5] = 191;
        white[6] = 356;
        white[7] = 149;
        white[8] = 329;
        white[9] = 284;
        white[10] = 357;
        white[11] = 124;
        white[12] = 446;
        white[13] = 156;
        white[14] = 339;
        white[15] = 317;
        white[16] = 460;
        white[17] = 329;

        for (int j = i; i <= 17; i++) {

            white_yardage = white[j];
        }

        return white_yardage;
    }

}
