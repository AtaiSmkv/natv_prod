package kg.natvprod.natv_prod.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_discount")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    double discount;
    @JsonProperty("start_date")
    Date startDate;
    @JsonProperty("end_date")
    Date endDate;
    @JsonProperty("discount_days")
    int discountDays;
    @ManyToOne
    @JoinColumn(name = "channel")
    Channel channel;


}
