public class easySolution {

    public static void main(String[] args) {

        //Runner code for testing
        System.out.println(calculateDesks(100, 100));

    }

    public static int calculateDesks(int width, int length) {

        int numberOfDesks = 0;

        for (int savedLength = length; savedLength >= 20; savedLength = savedLength - 26) {
            numberOfDesks++;
        }

        return (numberOfDesks * numberOfDesks);
    }

}