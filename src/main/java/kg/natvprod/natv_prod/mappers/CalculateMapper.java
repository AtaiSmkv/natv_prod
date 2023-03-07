package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.Discount;
import kg.natvprod.natv_prod.entities.OrderDates;
import kg.natvprod.natv_prod.entities.Price;
import kg.natvprod.natv_prod.entities.dto.CalculateDto;
import kg.natvprod.natv_prod.repository.DiscountRepo;
import kg.natvprod.natv_prod.repository.OrderDatesRepo;
import kg.natvprod.natv_prod.repository.PriceRepo;

public class CalculateMapper {
    private final OrderDatesRepo orderDatesRepo;
    private final DiscountRepo discountRepo;
    private final PriceRepo priceRepo;

    public CalculateMapper(OrderDatesRepo orderDatesRepo, DiscountRepo discountRepo, PriceRepo priceRepo) {
        this.orderDatesRepo = orderDatesRepo;
        this.discountRepo = discountRepo;
        this.priceRepo = priceRepo;
    }

    public CalculateDto toCalculateDto (OrderDates orderDates, Discount discount, Price price) {
        CalculateDto calculateDto = new CalculateDto();
        calculateDto.setText(orderDates.getOrder().getText().getText());
        return null;
    }
}
