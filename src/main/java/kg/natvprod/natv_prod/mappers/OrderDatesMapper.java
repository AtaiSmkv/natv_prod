package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.entities.OrderDates;
import kg.natvprod.natv_prod.models.dto.OrderDatesDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDatesMapper {
    OrderDatesMapper INSTANCE = Mappers.getMapper(OrderDatesMapper.class);
    @Mapping(source = "order.id", target= "orderId")
    OrderDatesDto orderDatesToOrderDatesDto(OrderDates orderDates);
    @InheritInverseConfiguration
    OrderDates orderDatesDtoToOrderDates(OrderDatesDto orderDatesDto);

















  /*  List<OrderDatesDto> orderDatesToORderDatesDtos(List<OrderDates> orderDates);
    @InheritInverseConfiguration
    List<OrderDates> orderDatesDtosToOrderDates(List<OrderDatesDto> orderDatesDto);*/
}
