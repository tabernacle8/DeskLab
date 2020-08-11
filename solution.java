public class solution {
    public static void main(String[] args) {

        //Runner code for testing
        System.out.println(calculateDesks(100, 100));

    }

    public static int calculateDesks(int width, int length) {

        int numberOfDesks = 0;

        for (int savedLength = length; savedLength >= 20;) {

            for (int savedWidth = width; savedWidth >= 20;) {

                System.out.println(savedWidth);
                numberOfDesks++;
                savedWidth = savedWidth - 20 - 6;

                
            }

            savedLength = savedLength - 20 - 6;
            System.out.println(savedLength + ":" + numberOfDesks);


        }

        if (width == 20 && length == 20) {
            return (1);
        }

        return (numberOfDesks);
    }
}