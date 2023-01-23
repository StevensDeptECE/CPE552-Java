package edu.stevens.s11;

import java.util.*;

/**
 * @author DovKr
 */

class IntArray {

  private int a[];
  private int size;

  // if the array has to grow, double in size
  private void checkGrow() {
    if (size < a.length) {
      return;
    }

    // here, double the size of hte list, copy the old to the new
  }

  public IntArray(int capacity) {

  }

  public IntArray() {
    this(1);
  }
  
  public void add(int v) {
    checkGrow();
    // TODO: Make this work
  }
  public void set(int i, int val) {
  }
  
  public int get(int i) {
     return 0; // TODO: make this work 
  }
}

public class EfficientList {

  public static void testArrayList1(int n) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(i);
    }
  }

  public static void testArrayList2(int n) {
    ArrayList<Integer> a = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      a.add(i);
    }
  }

  public static void testArrayList3(int n) {
    ArrayList<Integer> a = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      a.add(i);
    }
    for (int i = 0; i < n; i++) {
      a.set(i, a.get(i) + 1);
    }
  }

  public static void testIntArray1(int n) {
    IntArray a = new IntArray(); // preallocate 1 element
    // every time there is no room, double the size of the array and copy
    // the old to the new
    for (int i = 0; i < n; i++) {
      a.add(i); // 
    }
  }

  public static void testIntArray2(int n) {
    IntArray a = new IntArray(n); // preallocate 1 element
    // every time there is no room, double the size of the array and copy
    // the old to the new
    for (int i = 0; i < n; i++) {
      a.add(i); // 
    }
  }

    public static void testIntArray3(int n) {
    IntArray a = new IntArray(n); // preallocate 1 element
    // every time there is no room, double the size of the array and copy
    // the old to the new
    for (int i = 0; i < n; i++) {
      a.add(i);
    }
    for (int i = 0; i < n; i++) {
      a.set(i, a.get(i) + 1);
  }

  public static void main(String args[]) {
    final int n = 100000000; //Integer.parseInt(args[0]);
    for (int test = 0; test < 3; test++) {
      final int trials = 5;
      for (int i = 0; i < trials; i++) {
        long t0 = System.nanoTime();
        switch(test) {
          case 0: testArrayList1(n); break;
          case 1: testArrayList2(n); break;
          case 2: testArrayList3(n); break
                  case 3: ;
                  case 4: ;
                  case 5: ;
          default: ;
        } 
        long t1 = System.nanoTime();
        System.out.print((t1 - t0) * 1e-9 + "\t");
      }
      System.out.println();
    }
  }
}
