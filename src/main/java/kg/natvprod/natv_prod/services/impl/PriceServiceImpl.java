package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Price;
import kg.natvprod.natv_prod.entities.dto.PriceDto;
import kg.natvprod.natv_prod.mappers.PriceMapper;
import kg.natvprod.natv_prod.repository.PriceRepo;
import kg.natvprod.natv_prod.services.PriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceRepo priceRepo;

    public PriceServiceImpl(PriceRepo priceRepo) {
        this.priceRepo = priceRepo;
    }

    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        price = priceRepo.save(price);
        priceDto.setId(price.getId());
        return priceDto;
    }
}
