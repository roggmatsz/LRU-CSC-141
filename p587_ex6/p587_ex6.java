//********************************
//NAME: Rogger Matamoros
//DATE: 11/22/10
//ASSIGNMENT: Page 587 Exercise 6
//********************************

import java.util.*;
import java.io.*;

public class p587_ex6
{
	public static void main(String[] args) throws FileNotFoundException
	{

		//Declare Necessary Variables/Objects
		Scanner inFile = new Scanner(new FileReader("grade.txt"));
		String str, id, keyS;
		double l = 0;
		//Routine to input the answer key into an array and get student ID
		str = inFile.next();
		keyS = str;
		char[] key = str.toCharArray();
		id = inFile.next();
		//Routine to input the student answer into an array
		str = inFile.next();
		str = str + " " + inFile.next();
		char[] studentAnswers = str.toCharArray();
		//Routine for comparing student's to key's answers and getting th # correct.
		for (int i = 0; i < key.length; i++)
		{
			if (studentAnswers[i] == key[i])
				l += 2;
			else if (studentAnswers[i] != key[i] && studentAnswers[i] != ' ')
				l--;
		}
		System.out.println("" + l);
		//Routine for determining the testscore and testgrade
		char grade = ' ';
		double score = (l / key.length) * 100;
		if (score > 89)
			grade = 'A';
		else if (score < 90 && score > 79)
			grade = 'B';
		else if (score < 80 && score > 69)
			grade = 'C';
		else if (score < 70 && score > 59)
			grade = 'D';
		else if (score < 60)
			grade = 'F';
		//Routine for Outputting All This Mess
		System.out.printf("\t\tTest Results" +
						   "\n\nStudent ID: " + id + "\nStudent Key: " + str +
						   "\nTest Key:    " + keyS +
						   "\nStudent Test Score:  %.2f " + "\tGrade: " + grade + "\n", score);
	}
}
