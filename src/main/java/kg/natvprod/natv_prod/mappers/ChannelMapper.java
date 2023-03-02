package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.Channel;
import kg.natvprod.natv_prod.entities.dto.ChannelDto;
import kg.natvprod.natv_prod.entities.dto.DiscountDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;


@Mapper
public interface ChannelMapper {
   ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);
    ChannelDto channelToChannelDto(Channel channel);
    @InheritInverseConfiguration
    Channel channelDtoToChannel(ChannelDto channelDto);

}
