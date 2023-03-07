package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Channel;
import kg.natvprod.natv_prod.entities.Discount;
import kg.natvprod.natv_prod.entities.dto.ChannelDto;
import kg.natvprod.natv_prod.entities.dto.RequestDto1.ChannelListDto;
import kg.natvprod.natv_prod.entities.dto.RequestDto1.DiscountsDto;
import kg.natvprod.natv_prod.mappers.ChannelMapper;
import kg.natvprod.natv_prod.repository.ChannelRepo;
import kg.natvprod.natv_prod.repository.DiscountRepo;
import kg.natvprod.natv_prod.repository.PriceRepo;
import kg.natvprod.natv_prod.services.ChannelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    private final ChannelRepo channelRepo;
    private final PriceRepo priceRepo;
    private final DiscountRepo discountRepo;

    public ChannelServiceImpl(ChannelRepo channelRepo, PriceRepo priceRepo, DiscountRepo discountRepo) {
        this.channelRepo = channelRepo;
        this.priceRepo = priceRepo;
        this.discountRepo = discountRepo;
    }

    @Override
    public ChannelDto save(ChannelDto channelDto) {
        Channel channel = ChannelMapper.INSTANCE.channelDtoToChannel(channelDto);
        channel = channelRepo.save(channel);
        channelDto.setId(channel.getId());
        return channelDto;
    }

    @Override
    public List<ChannelListDto> findAll() {
        List<ChannelListDto> channelListDtos = new ArrayList<>();
        List<Channel> channelList = channelRepo.findAllByActive();
        for (Channel item: channelList) {
            ChannelListDto channelListDto = new ChannelListDto();
            channelListDto.setChannelName(item.getChannelName());
            channelListDto.setLogo(item.getLogoPath());
            if (priceRepo.getPrice(item.getId()) != null) {
                if (getDiscount(item.getId()) != null) {
                    channelListDto.setPricePerLetter(priceRepo.getPrice(item.getId()).getPricePerSymbol());
                    channelListDto.setDiscounts(getDiscount(item.getId()));
                }
            }
        channelListDtos.add(channelListDto);

        }

        return channelListDtos;
    }
    private List<DiscountsDto> getDiscount (Long id) {
        List<Discount> discounts = discountRepo.getDiscounts(id);
        List<DiscountsDto> newDiscountsDto = new ArrayList<>();
        for (Discount item: discounts) {
            if (item.getStartDate().before(new Date()) &&
                         item.getEndDate().after(new Date())) {
                DiscountsDto discountsDto = new DiscountsDto();
                discountsDto.setDiscount(item.getDiscount());
                discountsDto.setFromDayCount(item.getDiscountDays());
                newDiscountsDto.add(discountsDto);
            }

        }
        return newDiscountsDto;

    }
}
