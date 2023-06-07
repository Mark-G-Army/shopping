package shopping.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shopping.ProductApplication;

@Entity
@Table(name = "Stock_table")
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Integer stock;

    public static StockRepository repository() {
        StockRepository stockRepository = ProductApplication.applicationContext.getBean(
            StockRepository.class
        );
        return stockRepository;
    }

    public static void stockDecrease(Orderplaced orderplaced) {
        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderplaced.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

    }
}
