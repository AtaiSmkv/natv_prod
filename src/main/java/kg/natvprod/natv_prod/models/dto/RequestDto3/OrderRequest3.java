package kg.natvprod.natv_prod.models.dto.RequestDto3;

import com.fasterxml.jackson.annotation.JsonProperty;
import kg.natvprod.natv_prod.models.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest3 {

    String clientEmail;

    String clientFio;

    String clientPhone;
    String text;
    double totalPrice;
    @JsonProperty("status")
    Status status;
    List<ChannelsList> channelsList;

}
