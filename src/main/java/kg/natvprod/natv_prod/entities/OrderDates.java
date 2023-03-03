package kg.natvprod.natv_prod.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.natvprod.natv_prod.services.impl.DateUtil;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_order_dates")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date days;
    @ManyToOne
    @JoinColumn(name = "tb_order")
    Order order;

}
