package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.dto.OrderDatesDto;
import kg.natvprod.natv_prod.services.OrderDatesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orderDates")
public class OrderDatesController {
    private final OrderDatesService orderDatesService;

    public OrderDatesController(OrderDatesService orderDatesService) {
        this.orderDatesService = orderDatesService;
    }
    @GetMapping("/save")
    public OrderDatesDto save(@RequestBody OrderDatesDto orderDatesDto) {
        return orderDatesService.save(orderDatesDto);

    }
}
