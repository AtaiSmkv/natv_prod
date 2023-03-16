package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.DiscountDto;
import kg.natvprod.natv_prod.models.entities.Discount;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DiscountService {
    DiscountDto save(DiscountDto discountDto);

    List<Discount> findAll();


}
