package shopping.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shopping.config.kafka.KafkaProcessor;
import shopping.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    StockRepository stockRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Orderplaced'"
    )
    public void wheneverOrderplaced_StockDecrease(
        @Payload Orderplaced orderplaced
    ) {
        Orderplaced event = orderplaced;
        System.out.println(
            "\n\n##### listener StockDecrease : " + orderplaced + "\n\n"
        );

        // Sample Logic //
        Stock.stockDecrease(event);
    }
}
