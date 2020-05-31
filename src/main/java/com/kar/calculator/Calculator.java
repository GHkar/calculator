package com.kar.calculator;
import org.springframework.stereotype.Service;

/**
  * This is JavaDoc comment
  */

@Service
public class Calculator{
	int sum(int a, int b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
}

