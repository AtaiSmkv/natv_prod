package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.DiscountDto;
import kg.natvprod.natv_prod.models.entities.Discount;
import kg.natvprod.natv_prod.models.entities.Order;
import kg.natvprod.natv_prod.services.DiscountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/discount")
public class DiscountController {
    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }


    @PostMapping("/save")
    public DiscountDto save(@RequestBody DiscountDto discountDto) {
        return discountService.save(discountDto);
    }

    @GetMapping("/findAll")
    public List<Discount> findAll(){
        return discountService.findAll();
    }
}
