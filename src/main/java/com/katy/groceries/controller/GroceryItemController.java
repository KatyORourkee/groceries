package com.katy.groceries.controller;

import com.katy.groceries.model.GroceryItem;
import com.katy.groceries.service.IGroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryItemController {

    @Autowired
    private IGroceryItemService groceryItemService;

    @GetMapping(value="/groceryItem")
    public List<GroceryItem> getGroceryItems() {
        List<GroceryItem> groceryItems = groceryItemService.getAll();
        return groceryItems;
    }

    @PostMapping(value="/groceryItem")
    public GroceryItem createGroceryItem(@RequestBody GroceryItem groceryItem) {
        return groceryItemService.add(groceryItem);
    }
}
