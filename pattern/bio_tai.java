package pattern;

public class bio_tai {
    public static void main(String[] args) {
        tai(5);

    }

    public static void tai(int number) {
        int count = 0;
        // while (count < 0 || count >number) {

        // }
        for (int i = 1; i < number * 2; i++) {
            System.out.println();
            for (int j = 1; j < number * 2; j++) {
                boolean op = (number * 2 == (i + j)) ? true : false;
                if (i == j || op) {
                    // System.out.print(" " + i + j + " ");
                    System.out.print(" " + "* " + " ");
                } else if ((i <= number) && ((j < i) || number * 2 <= (i + j))) {
                    System.out.print(" " + "* " + " ");
                    // System.out.print(" " + i + j + " ");
                } else if ((i > number) && (number * 2 >= (i + j) || (j > i))) {
                    System.out.print(" " + "* " + " ");
                    // System.out.print(" " + i + j + " ");
                } else {
                    System.out.print("    ");
                }

            }

        }
    }
}
