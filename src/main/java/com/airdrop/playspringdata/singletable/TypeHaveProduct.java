package com.airdrop.playspringdata.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("not null") // mean all not null entity(product), so it should include pen & book
public class TypeHaveProduct extends MyProduct {
}
