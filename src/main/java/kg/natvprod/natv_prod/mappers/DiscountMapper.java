package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.entities.Discount;
import kg.natvprod.natv_prod.models.dto.DiscountDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
    @Mapping(source = "channel", target = "channelDto")
//    @Mapping(source = "discount", target = "discounts")
    DiscountDto discountToDiscountDto(Discount discount);

    @InheritInverseConfiguration
    Discount discountDtoToDiscount(DiscountDto discountDto);

}
