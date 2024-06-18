package com.airdrop.playspringdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.airdrop.playspringdata.singletable.Book;
import com.airdrop.playspringdata.singletable.MyProduct;
import com.airdrop.playspringdata.singletable.MyProductRepository;
import com.airdrop.playspringdata.singletable.Pen;
import com.airdrop.playspringdata.singletable.TypeHaveProductRepository;
import com.airdrop.playspringdata.singletable.TypeNullProduct;
import com.airdrop.playspringdata.singletable.TypeNullProductRepository;

@DataJpaTest
public class ReportBugSingleTable {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    MyProductRepository myProductRepository;

    @Autowired
    TypeHaveProductRepository typeHaveProductRepository;
    @Autowired
    TypeNullProductRepository typeNullProductRepository;

    @Test
    public void testRunIt() {
        Book book = new Book();
        book.setName("book1");
        book.setAuthor("author1");
        entityManager.persist(book);

        Pen pen = new Pen();
        pen.setName("pen1");
        pen.setColor("red");
        entityManager.persist(pen);

        {
            TypeNullProduct myProduct = new TypeNullProduct();
            myProduct.setName("typeNull Prodcut");
            entityManager.persist(myProduct);
        }

        {
            TypeNullProduct myProduct = new TypeNullProduct();
            myProduct.setName("typeNull Prodcut");
            entityManager.persist(myProduct);
        }

        {
            MyProduct myProduct = new MyProduct();
            myProduct.setName("myProdcut");
            entityManager.persist(myProduct);
        }

        // System.out.println("qqq myProductRepository");
        // myProductRepository.findAll().forEach(System.out::println);
        System.out.println("qqq typeHaveProductRepository");
        typeHaveProductRepository.findAll().forEach(System.out::println);
        // System.out.println("qqq typeNullProductRepository");
        // typeNullProductRepository.findAll().forEach(System.out::println);
        System.out.println("qqq allDone");

    }

}
