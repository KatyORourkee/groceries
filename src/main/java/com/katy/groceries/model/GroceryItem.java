package com.katy.groceries.model;

import java.util.Objects;

public class GroceryItem {

    private String name;

    public GroceryItem() {
    }

    public GroceryItem(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // name validation here
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryItem groceryItem = (GroceryItem) o;
        return name == groceryItem.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Grocery Item: ");
        sb.append(", name='").append(name);
        return sb.toString();
    }
}
