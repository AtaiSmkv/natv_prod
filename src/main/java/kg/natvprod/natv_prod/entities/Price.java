package kg.natvprod.natv_prod.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_price")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @ManyToOne
    @JoinColumn(name = "channel")
    Channel channel;
}
