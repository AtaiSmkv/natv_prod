package kg.natvprod.natv_prod.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    Date days;
    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

}
