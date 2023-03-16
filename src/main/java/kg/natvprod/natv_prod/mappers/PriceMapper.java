package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.entities.Price;
import kg.natvprod.natv_prod.models.dto.PriceDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    @Mapping(source = "channel.id", target = "channel")
    PriceDto priceToPriceDto(Price price);
    @InheritInverseConfiguration
    Price priceDtoToPrice(PriceDto priceDto);
}
