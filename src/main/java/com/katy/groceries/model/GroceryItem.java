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

    public GroceryItem(long id, String name)
    {
        this.setId(id);
        this.setName(name);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    // If the ID is generated, do we want to
    // make this private and remove it from
    // the ctx?
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(id).append(",");
        sb.append("\"name\":\"").append(name).append("\"");
        sb.append("}");

        return sb.toString();
    }
}
