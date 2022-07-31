public class Par {

    static int hole_par;

    public static int calculatePar(int i) {

        int[] par = new int[18];
        par[0] = 5;
        par[1] = 4;
        par[2] = 4;
        par[3] = 4;
        par[4] = 5;
        par[5] = 3;
        par[6] = 4;
        par[7] = 3;
        par[8] = 4;
        par[9] = 4;
        par[10] = 4;
        par[11] = 3;
        par[12] = 5;
        par[13] = 3;
        par[14] = 4;
        par[15] = 4;
        par[16] = 5;
        par[17] = 4;

        for (int j = i; i <= 17; i++) {

            hole_par = par[j];
        }
        return hole_par;
    }
}
