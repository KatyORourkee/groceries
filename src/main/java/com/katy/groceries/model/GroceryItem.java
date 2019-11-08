package com.katy.groceries.model;

import javax.persistence.*;
import java.util.Objects;

/*
* Add @Data annotation from Lombok to handle
* getters, setters, toString, hash, and equals
* methods
*/
@Entity
@Table(name = "groceryItems")
public class GroceryItem {

    private long id;
    private String name;

    public GroceryItem() {
    }

    public GroceryItem(String name) {
        this.setName(name);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
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
