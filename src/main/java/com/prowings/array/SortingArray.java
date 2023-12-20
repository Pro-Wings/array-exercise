package com.prowings.array;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) {
		
		int[] nums = {10,40,20,60,37};
		char[] chars = {'z','f','h','a'};
		String[] words = {"aaa","zzz","rrr","yyy"};

		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(20, "Sham");
		Student s3 = new Student(30, "Sachin");
		Student s4 = new Student(40, "Raju");
		
		Student[] students = {s2,s4,s3,s1};

		Candidate c1 = new Candidate(10, "DDD");
		Candidate c2 = new Candidate(20, "AAA");
		Candidate c3 = new Candidate(30, "PPP");
		Candidate c4 = new Candidate(40, "XXX");

		Candidate[] candidates = {c2,c4,c3,c1};
		
		Arrays.sort(nums);
//		Arrays.sort(words);
		Arrays.sort(words, new StringDecendingComparator());
		Arrays.sort(chars);
		Arrays.sort(students);
//		Arrays.sort(candidates, new CandidateNameComparator());
		Arrays.sort(candidates, new CandidateRollNumberComparator());
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(chars));
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(candidates));
		
	}

}
