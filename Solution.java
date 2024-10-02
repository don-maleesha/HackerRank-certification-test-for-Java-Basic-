import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        if (input[0].matches("\\d+")) {
            Integer[] integers = new Integer[input.length];
            for (int i = 0; i < input.length; i++) {
                integers[i] = Integer.parseInt(input[i]);
            }
            System.out.println(sum(integers));
        } else {
            System.out.println(sum(input));
        }
    }
    
    public static Integer sum(Integer[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
    
    public static String sum(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}