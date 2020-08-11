public class solution {
    public static void main(String[] args) {

        //Runner code for testing
        System.out.println(calculateDesks(13, 13));

    }

    public static int calculateDesks(int width, int length) {

        int numberOfDesks = 0;

        for (int savedLength = length; savedLength >= 3;) {

            for (int savedWidth = width; savedWidth >= 3;) {

                System.out.println(savedWidth);
                numberOfDesks++;
                savedWidth = savedWidth - 3 - 6;


            }

            savedLength = savedLength - 3 - 6;


        }

        if (width == 3 && length == 3) {
            return (1);
        }

        return (numberOfDesks);
    }
}