package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.Price;
import kg.natvprod.natv_prod.entities.dto.PriceDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    @Mapping(source = "price.channel", target = "channelDto")
    PriceDto priceToPriceDto(Price price);
    @InheritInverseConfiguration
    Price priceDtoToPrice(PriceDto priceDto);
}
