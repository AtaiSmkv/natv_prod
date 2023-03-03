package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.OrderDates;
import kg.natvprod.natv_prod.entities.dto.OrderDatesDto;
import kg.natvprod.natv_prod.entities.dto.OrderDto;
import kg.natvprod.natv_prod.mappers.OrderDatesMapper;
import kg.natvprod.natv_prod.repository.OrderDatesRepo;
import kg.natvprod.natv_prod.services.OrderDatesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDatesServiceImpl implements OrderDatesService {
    private final OrderDatesRepo orderDatesRepo;

    public OrderDatesServiceImpl(OrderDatesRepo orderDatesRepo) {
        this.orderDatesRepo = orderDatesRepo;
    }

    @Override
    public OrderDatesDto save(OrderDatesDto orderDatesDto) {
        OrderDates orderDates = OrderDatesMapper.INSTANCE.orderDatesDtoToOrderDates(orderDatesDto);
        orderDates = orderDatesRepo.save(orderDates);
        orderDatesDto.setId(orderDates.getId());
        return orderDatesDto;
    }
}
