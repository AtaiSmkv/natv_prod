package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Channel;
import kg.natvprod.natv_prod.entities.dto.ChannelDto;
import kg.natvprod.natv_prod.mappers.ChannelMapper;
import kg.natvprod.natv_prod.repository.ChannelRepo;
import kg.natvprod.natv_prod.services.ChannelService;
import org.springframework.stereotype.Service;

@Service
public class ChannelServiceImpl implements ChannelService {
    private final ChannelRepo channelRepo;

    public ChannelServiceImpl(ChannelRepo channelRepo) {
        this.channelRepo = channelRepo;
    }

    @Override
    public ChannelDto save(ChannelDto channelDto) {
        Channel channel = ChannelMapper.INSTANCE.channelDtoToChannel(channelDto);
        channel = channelRepo.save(channel);
        channelDto.setId(channel.getId());
        return channelDto;
    }
}
