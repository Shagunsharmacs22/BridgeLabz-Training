package string;
import java.util.*;
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
//        generateNullPointerException(); 
        handleNullPointerException();   
    }
    public static void generateNullPointerException() {
        String text = null;
        //throw NullPointerException
        System.out.println(text.length());
    }
    public static void handleNullPointerException() {
        String text = null;
        try {
            // throw NullPointerException
            System.out.println(text.length());
        }  catch (NullPointerException e) {
        System.out.println("Caught a NullPointerException");
    }
    }
}
