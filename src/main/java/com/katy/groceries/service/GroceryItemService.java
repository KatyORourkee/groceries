package com.katy.groceries.service;

import com.katy.groceries.model.GroceryItem;
import com.katy.groceries.repository.IGroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService implements IGroceryItemService{

    @Autowired
    IGroceryItemRepository repo;

    @Override
    public List<GroceryItem> getAll() {
        List<GroceryItem> groceryItems;
        groceryItems = repo.findAll();

        return groceryItems;
    }

    @Override
    public GroceryItem add(GroceryItem groceryItem) {
        GroceryItem savedItem = repo.save(groceryItem);
        return savedItem;
    }
}
