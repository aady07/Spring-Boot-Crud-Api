package com.trials.menu.item;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.*;
public class Item {
    private final Long id;
    @NotNull(message = "price is required")
    @Positive(message = "price must be positive")
    private final Long price;
    @NotNull(message = "description is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "description must be a string")
    private final String description;
    @NotNull(message = "image is required")
    @URL(message = "image must be a URL")
    private final String image;
    @NotNull(message = "name is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
    private final String name;


    public Item(Long id, String name, Long price, String description, String image) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.image = image;
        this.name = name;
    }

    @Id
    public Long getId(){
        return id;
    }
    public Long getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getImage(){
        return image;
    }
    public Item updateWith(Item item) {
        return new Item(
                this.id,
                item.name,
                item.price,
                item.description,
                item.image
        );
    }
}
