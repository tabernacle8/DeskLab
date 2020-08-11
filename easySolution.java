public class easySolution {

    public static void main(String[] args) {

        //Runner code for testing
        System.out.println(calculateDesks(13, 13));

    }

    public static int calculateDesks(int width, int length) {

        int numberOfDesks = 0;

        for (int savedLength = length; savedLength >= 3; savedLength = savedLength - 9) {
            numberOfDesks++;
        }

        return (numberOfDesks * numberOfDesks);
    }

}