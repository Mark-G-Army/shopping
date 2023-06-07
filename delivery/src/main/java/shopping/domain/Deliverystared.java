package shopping.domain;

import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

@Data
@ToString
public class Deliverystared extends AbstractEvent {

    private Long id;

    public Deliverystared(Delivery aggregate) {
        super(aggregate);
    }

    public Deliverystared() {
        super();
    }
}
