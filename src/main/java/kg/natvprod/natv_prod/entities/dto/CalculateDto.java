package kg.natvprod.natv_prod.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import kg.natvprod.natv_prod.entities.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class CalculateDto {
    String text;
    @JsonProperty("days_count")
    int daysCount;
    @JsonProperty("channel_id")
    int channelId;
    double price;
    @JsonProperty("price_with_discount")
    double priceWithDiscount;

}
