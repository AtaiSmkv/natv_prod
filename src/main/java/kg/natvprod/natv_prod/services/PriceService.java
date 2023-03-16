package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.PriceDto;
import kg.natvprod.natv_prod.models.entities.Price;

import java.util.List;

public interface PriceService {
    PriceDto save(PriceDto priceDto);
    List<Price> findAll();
}
