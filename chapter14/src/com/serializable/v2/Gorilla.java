package com.serializable.v2;

import java.io.Serializable;

class Gorilla implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private Boolean friendly;
	private transient String favoriteFood;
	private double weight = 10;

	public Gorilla(String name, int age, Boolean friendly, String favoriteFood) {
		this.name = name;
		this.age = age;
		this.friendly = friendly;
		this.favoriteFood = favoriteFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getFriendly() {
		return friendly;
	}

	public void setFriendly(Boolean friendly) {
		this.friendly = friendly;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	@Override
	public String toString() {
		return "Gorilla [name=" + name + ", age=" + age + ", friendly=" + friendly + ", favoriteFood=" + favoriteFood
				+ ", weight=" + weight + "]";
	}
	
	

	

}

