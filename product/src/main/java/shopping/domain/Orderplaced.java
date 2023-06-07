package shopping.domain;

import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String productName;
    private String productId;
    private Integer qty;
    private String userId;
}
