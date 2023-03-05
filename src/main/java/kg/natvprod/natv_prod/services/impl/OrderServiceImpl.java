package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Order;
import kg.natvprod.natv_prod.entities.dto.OrderDto;
import kg.natvprod.natv_prod.entities.dto.PriceDto;
import kg.natvprod.natv_prod.mappers.OrderMapper;
import kg.natvprod.natv_prod.repository.OrderRepo;
import kg.natvprod.natv_prod.services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepo.save(order);
        orderDto.setId(order.getId());

        return orderDto;
    }
}
