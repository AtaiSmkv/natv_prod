package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.entities.Banner;
import kg.natvprod.natv_prod.models.dto.BannerDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface BannerMapper {
    BannerMapper INSTANCE = Mappers.getMapper(BannerMapper.class);
    BannerDto bannerToBannerDto(Banner banner);
    @InheritInverseConfiguration
    Banner bannerDtoToBanner(BannerDto bannerDto);
}
