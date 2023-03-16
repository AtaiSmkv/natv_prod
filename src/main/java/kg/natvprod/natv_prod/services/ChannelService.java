package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.Calculate.CalculateDto;
import kg.natvprod.natv_prod.models.dto.ChannelDto;
import kg.natvprod.natv_prod.models.dto.RequestDto1.ChannelListDto;
import kg.natvprod.natv_prod.models.entities.Channel;

import java.util.List;
import java.util.Optional;

public interface ChannelService {
    ChannelDto save(ChannelDto channelDto);

    List<ChannelListDto> findAll();
    CalculateDto calculate(CalculateDto calculateDto);

    Optional<Channel> findById(Long id);
}
