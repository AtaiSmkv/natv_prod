package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.PriceDto;
import kg.natvprod.natv_prod.models.entities.Price;
import kg.natvprod.natv_prod.models.entities.Text;
import kg.natvprod.natv_prod.services.PriceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/findAll")
    public List<Price> findAll(){
        return priceService.findAll();
    }


}
