package com.airdrop.playspringdata.singletable;

import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity(name="products")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type", 
  discriminatorType = DiscriminatorType.STRING)
@Data
public class MyProduct {
    @Id @GeneratedValue
    private long productId;
    private String name;
    // constructor, getters, setters
}

