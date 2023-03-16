package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.BannerDto;
import kg.natvprod.natv_prod.models.entities.Banner;

import java.util.List;


public interface BannerService {
    BannerDto save(BannerDto bannerDto);

    List<Banner> findAll();
}
