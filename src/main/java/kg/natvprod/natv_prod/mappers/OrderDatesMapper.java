package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.OrderDates;
import kg.natvprod.natv_prod.entities.dto.OrderDatesDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDatesMapper {
    OrderDatesMapper INSTANCE = Mappers.getMapper(OrderDatesMapper.class);
    OrderDatesDto orderDatesToOrderDatesDto(OrderDates orderDates);
    @InheritInverseConfiguration
    OrderDates orderDatesDtoToOrderDates(OrderDatesDto orderDatesDto);
    List<OrderDatesDto> orderDatesToORderDatesDtos(List<OrderDates> orderDates);
    @InheritInverseConfiguration
    List<OrderDates> orderDatesDtosToOrderDates(List<OrderDatesDto> orderDatesDto);
}
