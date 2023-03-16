package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.Calculate.CalculateDto;
import kg.natvprod.natv_prod.models.dto.ChannelDto;
import kg.natvprod.natv_prod.models.dto.RequestDto1.ChannelListDto;

import java.util.List;

public interface ChannelService {
    ChannelDto save(ChannelDto channelDto);

    List<ChannelListDto> findAll();
    CalculateDto calculate(CalculateDto calculateDto);
}
