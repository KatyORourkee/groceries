package com.katy.groceries.service;

import com.katy.groceries.model.GroceryItem;

import java.util.List;

public interface IGroceryItemService {
    List<GroceryItem> getAll();

    GroceryItem add(GroceryItem groceryItem);
}
