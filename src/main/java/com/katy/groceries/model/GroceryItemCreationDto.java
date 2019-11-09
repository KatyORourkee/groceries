package com.katy.groceries.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
public class GroceryItemCreationDto {
    private @NonNull String name;
}
