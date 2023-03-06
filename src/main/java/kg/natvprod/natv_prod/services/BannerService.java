package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.entities.dto.BannerDto;
import org.springframework.stereotype.Service;


public interface BannerService {
    BannerDto save(BannerDto bannerDto);
}
