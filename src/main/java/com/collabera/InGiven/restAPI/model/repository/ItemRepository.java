package com.collabera.InGiven.restAPI.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.InGiven.restAPI.model.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
//	
//	// Create
//	public T addItem();
//	
//	
//	// Read
//	public List<T> getAllItems();
//	
//	public List<T> getItemsInCategory(String Category);
//	public List<T> getItemsInzipCode(int zipCode);
//	
//	//Update
//	public void update(T item);
//	
//	//Delete
//	public  void deleteItem(T item);
//	public  void deleteAllItems();
//	
	

}
