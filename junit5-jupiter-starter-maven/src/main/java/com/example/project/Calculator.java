/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public static void addString(final String numbers) {
		String[] numbersArray = numbers.split(",");
		if (numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		} else {
			for (String number : numbersArray) {
				Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
			}
		}
	}

}
