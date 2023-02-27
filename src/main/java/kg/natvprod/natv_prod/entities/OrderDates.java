package kg.natvprod.natv_prod.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_order_dates")
@Getter
@Setter
@RequiredArgsConstructor
public class OrderDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Date date;
    @ManyToOne
    @JoinColumn(name = "tb_order")
    Order order;
}
