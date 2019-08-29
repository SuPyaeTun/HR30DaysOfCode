package day27_Testing;

import java.util.*;

public class Solution {

	/**
	 * For a given array of n integers, the function returns the index of the element
	 * with the minimum value in the array. If there is more than one element with the
	 * minimum value, the returned index should be the smallest one.
	 * If an empty array is passed to the function, it should raise an Exception.
	 * @param seq - integer array 
	 * @return - an int representing the index of min value in the array
	 */
    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
    	
    	/**
    	 * Testing with an empty array 
    	 * @return an empty array of integers
    	 */
        public static int[] get_array() {
        	return new int[] {};
        	
        }
    }

    static class TestDataUniqueValues {
    	
    	/**
    	 * Creating an array of size <= 2 with all  unique elements
    	 * @return an integer array of size at least 2 with all unique eleemnts
    	 */
        public static int[] get_array() {
            return new int[] {1, 2, 3, 5, 6, 7, 9};
        }
        

        /**
         * @return an integer representing the expected min value index for this array
         */
        public static int get_expected_result() {
        	return minimum_index(get_array());
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
    	
    	/**
    	 * Testing with an integer array which has 2 different minimum values
    	 * @return an Integer array where there are exactly 2 diff min values
    	 */
        public static int[] get_array() {
            return new int[] {1, 2, 4, 5, 6, 11, 1};
        }

        /**
         * Testing whether a smaller index of min value returns or not
         * @return an integer representing the expected minimum value index for this array
         */
        public static int get_expected_result() {
            return minimum_index(get_array());
        }
    }

    
	public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
