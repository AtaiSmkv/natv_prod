package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.dto.BannerDto;
import kg.natvprod.natv_prod.services.BannerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
