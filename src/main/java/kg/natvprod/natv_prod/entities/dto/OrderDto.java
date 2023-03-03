package kg.natvprod.natv_prod.entities.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kg.natvprod.natv_prod.entities.Banner;
import kg.natvprod.natv_prod.entities.Channel;
import kg.natvprod.natv_prod.entities.Text;
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
public class OrderDto {
    long id;
    @JsonProperty("created_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("client_fio")
    String clientFio;
    @JsonProperty("cleint_phone")
    String clientPhone;
    @JsonProperty("order_status")
    boolean orderStatus;
    @JsonProperty("order_sum")
    double orderSum;

    ChannelDto channelDto;

    TextDto textDto;

    BannerDto bannerDto;
}
