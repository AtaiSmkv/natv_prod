package kg.natvprod.natv_prod.entities.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kg.natvprod.natv_prod.entities.Channel;
import kg.natvprod.natv_prod.services.impl.DateUtil;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class DiscountDto {
    long id;
    double discount;
    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;
    @JsonProperty("discount_days")
    int discountDays;

    @JsonProperty("channel")
    ChannelDto channelDto;

}
