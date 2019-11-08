package com.katy.groceries;

import com.katy.groceries.model.GroceryItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroceryItemTests {

    @Test
    public void defaultCtx_DoesNotSetIdOrName() {
        GroceryItem sut = new GroceryItem();

        assertNull(sut.getName(), "When a GroceryItem is instantiated with default ctx, name should be null");
        assertEquals(0, sut.getId(), "When a GroceryItem is instantiated with default ctx, id should be 0");
    }

    @Test
    public void argsCtx_SetsIdAndName() {
        long expectedId = 10;
        String expectedName = "Cat food";

        GroceryItem sut = new GroceryItem(expectedId, expectedName);

        assertEquals(expectedId, sut.getId(), "When passing ID into the ctx, the new GroceryItem instance should return that value as the ID");
        assertEquals(expectedName, sut.getName(), "When passing name into the ctx, the new GroceryItem instance should return that value as the name");
    }

    @Test
    public void equals_ComparesObjectsAsExpected() {
        long id = 1;
        String name = "Cat food";
        GroceryItem item1 = new GroceryItem(id, name);
        GroceryItem item2 = new GroceryItem(id, name);

        assertTrue(item1.equals(item2), "GroceryItem Equals method considers these two items not equal:\nItem 1: " + item1.toString() + "\nItem 2: " + item2.toString());
    }
}
