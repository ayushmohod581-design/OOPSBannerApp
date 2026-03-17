public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("  ", " OOO ", " OOO ", "PPPP ", " SSS ", " AAA ", "PPPP ", "PPPP "),
            String.join("  ", "O   O", "O   O", "P   P", "S    ", "A   A", "P   P", "P   P"),
            String.join("  ", "O   O", "O   O", "PPPP ", " SSS ", "AAAAA", "PPPP ", "PPPP "),
            String.join("  ", "O   O", "O   O", "P    ", "    S", "A   A", "P    ", "P    "),
            String.join("  ", " OOO ", " OOO ", "P    ", " SSS ", "A   A", "P    ", "P    ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}