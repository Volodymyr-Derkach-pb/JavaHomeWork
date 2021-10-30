package com.pb.derkach.hw4;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("введите значение 1 : ");
        String first = in.nextLine().toUpperCase();


        System.out.print("введите значение 2  : ");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println(result);
    }

    public static String isAnagram(String first, String second) {

        // get rid of allowed characters and convert to upper case
        String st = first.replaceAll("[., ]","").toUpperCase();
        String nd = second.replaceAll("[., ]","").toUpperCase();

        // Now get rid of all alpha characters and compare to the empty string.
        // Only if both are equal are the strings potential anagrams.
        // Otherwise, the illegal characters would be present.
        if (st.replaceAll("[A-Z]","").equals("") &&
                nd.replaceAll("[A-Z]","").equals("")) {

            // this is your original code
            char[] arraySt = st.toCharArray();
            char[] arrayNd = nd.toCharArray();
            Arrays.sort(arraySt);
            Arrays.sort(arrayNd);

            // don't set a value just return it's an
            // anagram
            if (Arrays.equals(arraySt, arrayNd)) {
                return "Anagram.";
            }
        }
        // Otherwise, it's not
        return "No Anagram.";
    }
}
