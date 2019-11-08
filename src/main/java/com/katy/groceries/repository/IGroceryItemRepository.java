package com.katy.groceries.repository;

import com.katy.groceries.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
