package kg.natvprod.natv_prod.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DatabindException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_order")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @JsonProperty("created_date")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("client_fio")
    String clientFio;
    @JsonProperty("cleint_phone")
    String cleintPhone;
    @JsonProperty("order_status")
    boolean orderStatus;
    @JsonProperty("order_sum")
    double orderSum;
    @ManyToOne
    @JoinColumn(name = "channel")
    Channel channel;
    @ManyToOne
    @JoinColumn(name = "text_ad")
    Text text;
    @ManyToOne
    @JoinColumn(name = "banner_ad")
    Banner banner;

}
