package com.thiago.bookstore.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {

	private Integer id;
	private String name;
	private String description;
	
	private List<Books> books = new ArrayList<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
