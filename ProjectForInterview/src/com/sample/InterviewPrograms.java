package com.sample;
import java.util.HashMap;
import java.util.Random;

public class InterviewPrograms {

	/**
	 * @author Logesh This is method to check wheather the number variable is
	 *         present in the array (ar) or not, It is used to avoid repetability of
	 *         number in a array
	 * @param number
	 * @param ar
	 * @return
	 */
	
	public static boolean checkPresenceOfElementInArray(int number, int[] ar) {
		boolean check = false;
		if (ar.length != 0) {
			for (int i = 0; i < ar.length; i++) {
				if (number == ar[i]) {
					check = true;
				}
			}
		} else {
			check = true;
		}
		return check;
	}

	/**
	 * @author Logesh 
	 *         problem statement = to fill an integer array
	 *         without repeting elements and without using collection interface
	 */
	public static void toFillAnArrayofNumbersWithoutRepeatElements() {
		int[] ar = new int[25];

		Random rand = new Random();
		int i = 0;
		do {
			int nextInt = rand.nextInt(26);
			if (nextInt != 0 && !checkPresenceOfElementInArray(nextInt, ar)) {
				ar[i] = nextInt;
				i++;
			}
		} while (i < 25);

		for (int a : ar) {
			System.out.print(" " + a);
		}
		System.out.println();

	}

	/**
	 * @author Logesh 
	 *         problem statement1 = to find the number of words in a string
	 *         problem statement2 = to find the repetation numbers of words in a
	 *         string
	 * @param args
	 */
	public static void toCheckRepetationOfWords() {
		// 2nd program
		String s = "java is a program language, it is a platform independant language";
		s = s.replace(",", "");

		String s1 = s.replaceAll(" ", "");
		int length = s1.length();

		System.out.println("number of words in the sentence except space and comma" + length);

		String[] charArray = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String c : charArray) {
			if (hm.containsKey(c)) {
				Integer integer = hm.get(c);
				hm.put(c, integer + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

	/**
	 * @author Logesh 
	 *         problem statement = to create a scenario of playing hand
	 *         cricket and displaying winner
	 */
	public static void handCricket() {
		// 3 rd program

		int scoreOfA = 0;
		int scoreOfB = 0;

		Random a = new Random();
		Random b = new Random();

		int aBatting = 0;
		int bBowling = 0;
		// a batting

		do {
			aBatting = a.nextInt(7);
			bBowling = b.nextInt(7);
			scoreOfA = scoreOfA + aBatting;
		} while (aBatting != bBowling);

		// b batting
		int bBatting = 0;
		int aBowling = 0;
		do {
			bBatting = a.nextInt(7);
			aBowling = b.nextInt(7);
			scoreOfB = scoreOfB + bBatting;
		} while (bBatting != aBowling);

		if (scoreOfA > scoreOfB) {
			System.out.println("a is winner, " + "  score of a is :" + scoreOfA + " score of b is : " + scoreOfB);
		} else if (scoreOfB > scoreOfA) {
			System.out.println("b is winner," + "  score of a is :" + scoreOfA + " score of b is : " + scoreOfB);
		} else {
			System.out.println("match is draw," + "  score of a is :" + scoreOfA + " score of b is : " + scoreOfB);
		}
	}

	public static void main(String[] args) {
		toFillAnArrayofNumbersWithoutRepeatElements();
		toCheckRepetationOfWords();
		handCricket();
		}

}
