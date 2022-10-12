package liga.consumer.consumermodule.listener;

import liga.consumer.consumermodule.model.NamesForQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMessageListener {

    @RabbitListener(queues = NamesForQueue.ROUTER_QUEUE_DAILY)
    public void getMessageFromDailyListener(String message) {
        log.info("Сообщение " + message + " принято");
    }

    @RabbitListener(queues = NamesForQueue.ROUTER_QUEUE_ALERT)
    public void getMessageFromAlertListener(String message) {
        log.info("Сообщение " + message + " принято");
    }

    @RabbitListener(queues = NamesForQueue.ROUTER_QUEUE_ERROR)
    public void getMessageFromErrorListener(String message){
        log.info("Сообщение " + message + " принято");
    }
}
