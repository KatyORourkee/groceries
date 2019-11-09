package com.katy.groceries.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "groceryItems")
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    public GroceryItem() {
    }

    public GroceryItem(String name)
    {
        this.name = name;
    }
}
