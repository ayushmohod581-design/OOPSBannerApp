public class OOPSBannerApp {

    public static String[] getO() {
        return new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    public static String[] getP() {
        return new String[]{
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        };
    }

    public static String[] getS() {
        return new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }

    public static String[] getA() {
        return new String[]{
            " AAA ",
            "A   A",
            "AAAAA",
            "A   A",
            "A   A"
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();
        String[] A = getA();

        for (int i = 0; i < O.length; i++) {
            System.out.println(
                O[i] + "  " + 
                O[i] + "  " + 
                P[i] + "  " + 
                S[i] + "  " +
                A[i] + "  " +
                P[i] + "  " +
                P[i]
            );
        }
    }
}