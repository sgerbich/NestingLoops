public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for (int n=1; n <= 3; n++)
        {
            for (  char c='A'; c <= 'E'; c++  )
            {
                System.out.println( c + " " + n );
            }
        }
        System.out.println("\n");
        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println();
        }
        System.out.println("\n");
    }
}

// 1 n changes faster bcause it loops 3 times for every time a increments. Each variable is controlled by its own for loop but for the outputting it is controlled by n because it 
// can access the c variable outside the inner loop.
// 2 when you change the loop loctions the output changes as it lists the letters in order like A1 B1 C1 ... A2 B2 C2 ..  
// 3 it prints them on a new line if you use ln and prints them on the same line if you do not.
// 4 it prints them in sets of 3 because the new line command isnt run until the 3 times it goes throught the inner loop.