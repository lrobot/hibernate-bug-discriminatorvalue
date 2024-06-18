package com.airdrop.playspringdata.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
// @DiscriminatorValue("null") 
@Data
public class TypeNullProduct extends MyProduct {
}
