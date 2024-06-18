package com.airdrop.playspringdata.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("not null") // mean others
public class TypeHaveProduct extends MyProduct {
}
