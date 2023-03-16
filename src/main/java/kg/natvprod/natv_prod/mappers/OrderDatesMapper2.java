package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.dto.RequestDto3.OrderRequest3;
import kg.natvprod.natv_prod.models.entities.OrderDates;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderDatesMapper2 {
    OrderDates orderRequest3ToOrderDates(OrderRequest3 orderRequest3) {
        OrderDates orderDates = new OrderDates();
        orderDates.setDays((Date) orderRequest3.getChannelsList().stream()
                .map(x -> x.getDays())
                .collect(Collectors.toList()));
        return orderDates;
    }


}
