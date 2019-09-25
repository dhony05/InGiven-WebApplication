package com.collabera.restapi.Repository;

import java.util.List;

import com.collabera.restapi.model.Item;



public interface CRUD<T> {
	
	// Create
	public T addItem();
	
	
	// Read
	public List<T> getAllItems();
	
	public List<T> getItemsInCategory(String Category);
	public List<T> getItemsInzipCode(int zipCode);
	
	//Update
	public void update(T item);
	
	//Delete
	public  void deleteItem(T item);
	public  void deleteAllItems();
	
	

}
