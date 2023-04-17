package edu.stevens.cpe552;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ReviewCollections {
    public static void main(String[] args) throws Exception {
        /*
            arrays
            ArrayList
            HashMap
            HashSet
            TreeMap
            TreeSet
         */
        int [] a = new int[] { 1, 2, 3};
        int[] b = {1,2,3};
        int [] c = new int[1000000];
        int d[] = {5,4,1}, e = 2; // with square bracket after variable name, e is scalar!
        double [][] X = {
                {1, 2, 3},
                {4,5,6, 9, 8, 12, 2, 41, 1},
                {7,8,9},
                {2}
        };
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++)
                System.out.print(X[i][j] + " ");
            System.out.println();
        }

        ArrayList<String> lines = new ArrayList<>(50);
        BufferedReader br = new BufferedReader(new FileReader("lines.txt"));
        String line;

        while ( (line = br.readLine()) != null ) {
            lines.add(line);
        }
        br.close();

        HashMap<String, Boolean> easy = new HashMap<>();

        easy.put("apple", true);
        easy.put("brobdignagian", false);


        Boolean b2 = easy.get("xray");
        // if the word is not there, b will be null

        HashSet<String> spelling = new HashSet<>();
        spelling.add("apple");
        spelling.add("bear");

        boolean b3 = spelling.contains("xray");

    }
}
