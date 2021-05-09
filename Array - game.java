import java.util.Scanner;


public class game {
    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);

        System.out.println("====================================================================");

        int[] myNumb = { 1, 2, 3, 4, 5};
        System.out.println(myNumb[0]);
        System.out.println(myNumb[1]);
        System.out.println(myNumb[2]);
        System.out.println(myNumb[3]);
        System.out.println(myNumb[4]);

        System.out.println("\n\n====================================================================");


        String[] myName ={
            "Erik Cahya Pradana",
            "Aditya Bhaskara",
            "Widiatmika",
            "Surya",
            "Indah",
            "Ryan"
        };

            for(int z = 0; z < myName.length; z++  )
            {
                System.out.println(myName[z]);
            }

            System.out.println("\n\n====================================================================");


        for( int i=1; i<=20; i++)
        {
            if( i % 2 == 2)
            {
                System.out.println(i);
            }
        }


        System.out.println("\n\n====================================================================");

        System.out.print("\nMasukkan Bilangan Anda : ");
        int input = inputUser.nextInt();

        for( int x = 1; x<=input; x++)
        {
            if( x % 2 == 1)
            {
                System.out.println(x);
            }
        }


    };


}
