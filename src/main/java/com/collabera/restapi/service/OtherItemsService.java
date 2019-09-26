package com.collabera.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.restapi.Repository.CRUD;
import com.collabera.restapi.model.Item;

@Service
public class OtherItemsService implements CRUD<Item>{
	
	private static List<Item> OTHERITEMS  = new ArrayList<Item>();
	private static int idCounter = 1;
	
	
	@Override
	public Item addItem() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Item> getItemsInCategory(String Category) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Item> getItemsInzipCode(int zipCode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void deleteAllItems() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Item item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	
	
	


}
