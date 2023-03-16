package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.OrderDto;
import kg.natvprod.natv_prod.models.dto.RequestDto3.OrderRequest3;
import kg.natvprod.natv_prod.models.entities.Order;
import kg.natvprod.natv_prod.models.entities.Price;
import kg.natvprod.natv_prod.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/save")
    public OrderRequest3 save(@RequestBody OrderRequest3 orderRequest3) {
        return orderService.saveOrder(orderRequest3);
    }
    @GetMapping("/findAll")
    public List<Order> findAll(){
        return orderService.findAll();
    }
}
