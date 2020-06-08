package com.spiderohara.coding.interviewbit.level2.array;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		int i = 0;
		int count = A.size();
		int steps = 0;
		for (i = 0; i < count - 1; i++) {
			int xStep = A.get(i) - A.get(i + 1);
			if (xStep < 0) {
				xStep = xStep * -1;
			}

			int yStep = B.get(i) - B.get(i + 1);
			if (yStep < 0) {
				yStep = yStep * -1;
			}

			if (xStep >= yStep) {
				steps += xStep;
			} else {
				steps += yStep;
			}

		}

		return steps;
	}
}
