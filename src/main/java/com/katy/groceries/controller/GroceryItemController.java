package com.katy.groceries.controller;

import com.katy.groceries.model.GroceryItem;
import com.katy.groceries.service.IGroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryItemController {

    @Autowired
    private IGroceryItemService groceryItemService;

    @GetMapping(value="/groceryItem", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GroceryItem> list() {
        List<GroceryItem> groceryItems = groceryItemService.getAll();
        return groceryItems;
    }

    @PostMapping(value="/groceryItem", produces = MediaType.APPLICATION_JSON_VALUE)
    public GroceryItem create(@RequestBody GroceryItem groceryItem) {
        return groceryItemService.add(groceryItem);
    }
}
