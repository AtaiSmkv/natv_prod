package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.Price;
import kg.natvprod.natv_prod.entities.dto.PriceDto;
import kg.natvprod.natv_prod.services.PriceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }
    @PostMapping("/save")
    public PriceDto save(@RequestBody PriceDto priceDto) {
        return priceService.save(priceDto);
    }
}
