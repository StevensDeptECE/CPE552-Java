package edu.stevens.draw2;

public class BitMath {
    public static void main(String[] args) {
        int a = 5; //  00101
        int b = 17; // 10001
        //  &   AND
        //  |   OR
        //  ^   XOR
        //  ~   NOT
        /*
           A  B   A AND B      A OR B       A XOR B      NOT A
           0  0   0            0            0            1
           0  1   0            1            1            1
           1  0   0            1            1            0
           1  1   1            1            0            0
         */
        int c = a & b; // 1
        int d = a | b; //  00101 | 10001  10101 = 21
        int e = a ^ b; //  00101 ^ 10001  10100 = 20

        int f = 3 << 2; // 01100    3 * (2*2)
        int g = 5 >> 1; // 0000000000000000101 ==>  00000000000000010
        int h = 55 << 3; // 55*8
        // Q: is there a way to count 1 bits 189257192857198 = 100110101011001010101001010101
        // C++ intrinsics, Intel and ARM instruction (1 clock) popcount()

        int k = 5;
        k = k ^ 17 ^ 17; // 5 again
        // 0000101
        //   10001
        //   10100
        //   10001
        //   00101
    }

}
