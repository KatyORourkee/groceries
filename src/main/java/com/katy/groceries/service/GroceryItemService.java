package com.katy.groceries.service;

import com.katy.groceries.model.GroceryItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroceryItemService implements IGroceryItemService{

    @Override
    public List<GroceryItem> getAll() {
        List<GroceryItem> groceryItems = new ArrayList<GroceryItem>();

        groceryItems.add(new GroceryItem("Paper Towels"));

        return groceryItems;
    }
}
