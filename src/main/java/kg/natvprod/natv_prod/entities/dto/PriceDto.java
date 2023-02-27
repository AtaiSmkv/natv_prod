package kg.natvprod.natv_prod.entities.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kg.natvprod.natv_prod.entities.Channel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class PriceDto {
    long id;
    @JsonProperty("price_per_symbol")
    double pricePerSymbol;
    @JsonProperty("banner_price")
    double bannerPrice;
    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;

    ChannelDto channelDto;
}
