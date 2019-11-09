package com.katy.groceries;

import com.katy.groceries.model.GroceryItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroceryItemTests {

    @Test
    public void defaultCtx_DoesNotSetIdOrName() {
        GroceryItem sut = new GroceryItem();

        assertNull(sut.getName(),
                "When a GroceryItem is instantiated with default ctx, name should be null");
        assertEquals(0, sut.getId(),
                "When a GroceryItem is instantiated with default ctx, id should be 0");
    }

    @Test
    public void argsCtx_SetsName() {
        String expectedName = "Cat food";
        GroceryItem sut = new GroceryItem(expectedName);

        assertEquals(expectedName, sut.getName(),
                "When passing name into the ctx, the new GroceryItem instance should return that value as the name");
    }
}
