package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.Banner;
import kg.natvprod.natv_prod.entities.dto.BannerDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper

public interface BannerMapper {
    BannerMapper INSTANCE = Mappers.getMapper(BannerMapper.class);
    BannerDto bannerToBannerDto(Banner banner);
    @InheritInverseConfiguration
    Banner bannerDtoToBanner(BannerDto bannerDto);
}
