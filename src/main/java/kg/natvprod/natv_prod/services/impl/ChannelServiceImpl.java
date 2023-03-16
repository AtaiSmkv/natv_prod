package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.models.entities.Channel;
import kg.natvprod.natv_prod.models.entities.Discount;
import kg.natvprod.natv_prod.models.dto.Calculate.CalculateDto;
import kg.natvprod.natv_prod.models.dto.ChannelDto;
import kg.natvprod.natv_prod.models.dto.RequestDto1.ChannelListDto;
import kg.natvprod.natv_prod.models.dto.RequestDto1.DiscountsDto;
import kg.natvprod.natv_prod.mappers.ChannelMapper;
import kg.natvprod.natv_prod.repository.*;
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
    private final OrderRepo orderRepo;


    public ChannelServiceImpl(ChannelRepo channelRepo, PriceRepo priceRepo, DiscountRepo discountRepo, OrderRepo orderRepo) {
        this.channelRepo = channelRepo;
        this.priceRepo = priceRepo;
        this.discountRepo = discountRepo;
        this.orderRepo = orderRepo;

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
        for (Channel item : channelList) {
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

    @Override
    public CalculateDto calculate(CalculateDto calculateDto) {
        calculateDto.setText(calculateDto.getText());
        calculateDto.setDaysCount(calculateDto.getDaysCount());
        calculateDto.setChannelId(calculateDto.getChannelId());

        boolean active = channelRepo.findByActive(calculateDto.getChannelId());


            if (active == false) {
            throw new RuntimeException("The channel is not active!");
        }
        getPriceAndDiscount(calculateDto);
        return calculateDto;
    }

    private void getPriceAndDiscount(CalculateDto calculateDto) {
        if (calculateDto.getText().replaceAll(" ", "").length() < 20) {
            throw new RuntimeException("The qunatity of symbols should be from 20");
        }
        calculateDto.setPrice(calculateDto.getText().replaceAll(" ", "").length() *
                priceRepo.getPricePerSymbol(calculateDto.getChannelId()) * calculateDto.getDaysCount());
        if (calculateDto.getDaysCount() >= 3 && calculateDto.getDaysCount() < 7) {
            calculateDto.setPriceWithDiscount(calculateDto.getPrice() - calculateDto.getPrice() * 0.05);
        }
        if (calculateDto.getDaysCount() >= 7 && calculateDto.getDaysCount() < 10) {
            calculateDto.setPriceWithDiscount(calculateDto.getPrice() - calculateDto.getPrice() * 0.1);
        }
        if (calculateDto.getDaysCount() >= 10) {
            calculateDto.setPriceWithDiscount(calculateDto.getPrice() - calculateDto.getPrice() * 0.15);
        }
    }


    private List<DiscountsDto> getDiscount(Long id) {
        List<Discount> discounts = discountRepo.getDiscounts(id);
        List<DiscountsDto> newDiscountsDto = new ArrayList<>();
        for (Discount item : discounts) {
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
