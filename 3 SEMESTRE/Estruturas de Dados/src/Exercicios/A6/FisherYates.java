package Exercicios.A6;
import java.util.ArrayList;
import java.util.Collections;

public class FisherYates {

    public static void main(String[] args) {
        
        // Create an ArrayList to store the double values
        ArrayList<Double> doubles = new ArrayList<Double>();
        
        // Add the double values to the ArrayList
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        doubles.add(4.4);
        doubles.add(5.5);
        doubles.add(6.6);
        doubles.add(7.7);
        
        // Shuffle the ArrayList to randomize the order of the elements
        Collections.shuffle(doubles);
        
        // Print the randomized array
        System.out.println("Randomized array: " + doubles);
    }
}
