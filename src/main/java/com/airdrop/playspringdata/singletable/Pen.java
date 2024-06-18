package com.airdrop.playspringdata.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("2")
@Data
public class Pen extends TypeHaveProduct {
    private String color;
}
