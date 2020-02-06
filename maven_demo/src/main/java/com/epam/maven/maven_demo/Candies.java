package com.epam.maven.maven_demo;


public class Candies extends Sweets {

	Candies(String name, int weight, int cost) {
		super(name, weight, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "candy";
	}

}