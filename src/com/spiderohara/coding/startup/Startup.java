package com.spiderohara.coding.startup;

import java.util.ArrayList;

import com.spiderohara.coding.interviewbit.level2.array.MinStepsInInfiniteGrid;

public class Startup {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(1);

		ArrayList<Integer> B = new ArrayList<>();
		B.add(0);
		B.add(1);
		B.add(2);

		MinStepsInInfiniteGrid minStepsInInfiniteGrid = new MinStepsInInfiniteGrid();
		int coverPoints = minStepsInInfiniteGrid.coverPoints(A, B);
		System.out.println(coverPoints);
	}
}
