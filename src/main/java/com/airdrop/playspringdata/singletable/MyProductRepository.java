package com.airdrop.playspringdata.singletable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyProductRepository extends JpaRepository<MyProduct, Long> {
}
