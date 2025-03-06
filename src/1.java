  import java.util.*;
public class SchoolScience{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        //generate random numbers between 1 and 10
        for(int i=0;i<10;i++){
            Random rand = new Random();
            int number = rand.nextInt(9)+1;
            numbers.add(number);
            System.out.println("Random Number "+number);
        }
    }
}