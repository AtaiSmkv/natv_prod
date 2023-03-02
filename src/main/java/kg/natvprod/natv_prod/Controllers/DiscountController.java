package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.dto.DiscountDto;
import kg.natvprod.natv_prod.services.DiscountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
