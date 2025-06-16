/*CP - Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___*/


import java.util.*;
public class HarrysAge{
	public static void main(String[] args){
	long HarryBirthYear=2000;
        long CurrentYear=2024;
        int CurrentAge=CurrentYear-HarryBirthYear;
        System.out.println(CurrentAge);
	}
}
