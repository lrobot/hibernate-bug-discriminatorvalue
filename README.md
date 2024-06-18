
# run: mvn clean package
* sql log is:
```
  Hibernate:
    select
        thp1_0."product_id",
        thp1_0."product_type",
        thp1_0."name",
        thp1_0."author",
        thp1_0."color"
    from
        "products" thp1_0
    where
        thp1_0."product_type" is null
        or thp1_0."product_type" in ('1', '2')
```

thp1_0."product_type" is null 
typeHaveProductRepository.findAll().forEach(System.out::println);

@DiscriminatorValue("not null")
public class TypeHaveProduct extends MyProduct {
}

notice that TypeHaveProduct has *subclass*: Book and Pen 
