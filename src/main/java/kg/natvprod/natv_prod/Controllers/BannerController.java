package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.BannerDto;
import kg.natvprod.natv_prod.models.entities.Banner;
import kg.natvprod.natv_prod.models.entities.Order;
import kg.natvprod.natv_prod.services.BannerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/banner")
public class BannerController {
    private final BannerService bannerService;

    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }
    @PostMapping("/save")
    BannerDto save(@RequestBody BannerDto bannerDto) {
        return bannerService.save(bannerDto);

    }
    @GetMapping("/findAll")
    public List<Banner> findAll(){
        return bannerService.findAll();
    }
}
