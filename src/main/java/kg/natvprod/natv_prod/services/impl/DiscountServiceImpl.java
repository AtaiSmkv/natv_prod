package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Discount;
import kg.natvprod.natv_prod.entities.dto.DiscountDto;
import kg.natvprod.natv_prod.mappers.DiscountMapper;
import kg.natvprod.natv_prod.repository.ChannelRepo;
import kg.natvprod.natv_prod.repository.DiscountRepo;
import kg.natvprod.natv_prod.services.ChannelService;
import kg.natvprod.natv_prod.services.DiscountService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepo discountRepo;
    private final ChannelService channelService;
    private final ChannelRepo channelRepo;

    public DiscountServiceImpl(DiscountRepo discountRepo, ChannelService channelService, ChannelRepo channelRepo) {
        this.discountRepo = discountRepo;
        this.channelService = channelService;
        this.channelRepo = channelRepo;
    }

    @Override
    public DiscountDto save(DiscountDto discountDto) {
        Discount discount = DiscountMapper.INSTANCE.discountDtoToDiscount(discountDto);
        discount = discountRepo.save(discount);
        discountDto.setStartDate(discount.getStartDate());
        discountDto.setEndDate(discount.getEndDate());

        return discountDto;
    }
}
