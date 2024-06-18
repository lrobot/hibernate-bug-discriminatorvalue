package com.airdrop.playspringdata.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("1")
@Data
public class Book extends TypeHaveProduct {
    private String author;
}