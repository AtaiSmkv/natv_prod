package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.entities.dto.ChannelDto;
import kg.natvprod.natv_prod.entities.dto.RequestDto1.ChannelListDto;

import java.util.List;

public interface ChannelService {
    ChannelDto save(ChannelDto channelDto);

    List<ChannelListDto> findAll();
}
