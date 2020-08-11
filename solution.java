public class solution {
    public static void main(String []args) {

      //Runner code for testing
      System.out.println(calculateDesks(500,500));
       
    }

    public static int calculateDesks(int width, int length){

        int numberOfDesks = 0;

      for(int i =0;length>=20+6;i++){

        for(int j =0;width>=20+6;j++){
            numberOfDesks++;
            width = width - 20 - 6;


        }
        length = length-20 -6;


      }

      return(numberOfDesks);
    }
 }