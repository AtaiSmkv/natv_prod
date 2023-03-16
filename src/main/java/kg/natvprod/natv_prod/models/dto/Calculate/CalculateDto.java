package kg.natvprod.natv_prod.models.dto.Calculate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@RequiredArgsConstructor
public class CalculateDto {
    String text;
    @JsonProperty("days_count")
    int daysCount;
    @JsonProperty("channel_id")
    long channelId;
    double price;

    double priceWithDiscount;

}
