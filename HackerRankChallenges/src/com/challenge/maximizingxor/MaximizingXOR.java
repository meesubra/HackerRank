package com.challenge.maximizingxor;

import java.util.Scanner;

public class MaximizingXOR {
	
	/**
	 * Order of N Square
	 * @param l
	 * @param r
	 * @return
	 */
	static int maximizingXor(int l, int r) {
        int value = 0;
		for(int i = l; i <= r; i++)
		{
			for (int j = l; j <= r; j++)
			{
				value = (i ^ j) > value ? i ^ j : value;
			}
		}
		return value;
		
    }
	
	/**
	 * Find the highest order of one bit
	 * @param l
	 * @param r
	 * @return
	 */
	static int maximizingXor1(int l, int r) {
        return Integer.highestOneBit(l ^ r)* 2 - 1;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        int result1 = maximizingXor1(l, r);
        
        System.out.println(result1);
        in.close();
    }

}
