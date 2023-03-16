package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.OrderDto;
import kg.natvprod.natv_prod.models.dto.RequestDto3.ChannelsList;
import kg.natvprod.natv_prod.models.dto.RequestDto3.OrderRequest3;
import kg.natvprod.natv_prod.models.entities.Order;

import java.util.List;

public interface OrderService {
    OrderDto save(OrderDto orderDto);
    OrderRequest3 saveOrder(OrderRequest3 orderrequest3);


    List<Order> findAll();
}
