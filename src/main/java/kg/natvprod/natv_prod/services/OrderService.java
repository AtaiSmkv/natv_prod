package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.entities.dto.OrderDatesDto;
import kg.natvprod.natv_prod.entities.dto.OrderDto;
import kg.natvprod.natv_prod.entities.dto.PriceDto;

public interface OrderService {
    OrderDto save(OrderDto orderDto);
}
