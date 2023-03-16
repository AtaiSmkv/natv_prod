package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.entities.Channel;
import kg.natvprod.natv_prod.models.dto.ChannelDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ChannelMapper {
   ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);
    ChannelDto channelToChannelDto(Channel channel);
    @InheritInverseConfiguration
    Channel channelDtoToChannel(ChannelDto channelDto);

}
