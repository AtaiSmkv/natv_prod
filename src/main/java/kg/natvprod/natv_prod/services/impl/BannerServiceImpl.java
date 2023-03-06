package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Banner;
import kg.natvprod.natv_prod.entities.dto.BannerDto;
import kg.natvprod.natv_prod.mappers.BannerMapper;
import kg.natvprod.natv_prod.repository.BannerRepo;
import kg.natvprod.natv_prod.services.BannerService;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {
    private final BannerRepo bannerRepo;

    public BannerServiceImpl(BannerRepo bannerRepo) {
        this.bannerRepo = bannerRepo;
    }

    @Override
    public BannerDto save(BannerDto bannerDto) {
        Banner banner = BannerMapper.INSTANCE.bannerDtoToBanner(bannerDto);
        banner = bannerRepo.save(banner);
        bannerDto.setId(banner.getId());
        return bannerDto;

    }
}
