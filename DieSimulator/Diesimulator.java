import java.util.Random;

public class Diesimulator
{
    public static void main( String[] args )
    {
        //Option A
        Random generator = new Random();
        int dieValue = generator.nextInt(6);  //returns[0,1,2,3,4,5]
        dieValue += 1;                       //returns[1,2,3,4,5,6]
        System.out.println( dieValue);
        
        //Option B
        double dieValue2 = Math.random(); //return [0,1)
        dieValue *= 6;                   // [0,6)
        dieValue += 1;                  // [1,7)
        System.out.println((int) dieValue2);
    }
}
