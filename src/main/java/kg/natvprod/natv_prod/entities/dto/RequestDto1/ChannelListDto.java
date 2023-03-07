package kg.natvprod.natv_prod.entities.dto.RequestDto1;

import kg.natvprod.natv_prod.entities.Channel;
import kg.natvprod.natv_prod.entities.Discount;
import lombok.Data;

import java.util.List;
@Data
public class ChannelListDto {
    String channelName;
    String logo;
    double pricePerLetter;
    List<DiscountsDto> discounts;

}
