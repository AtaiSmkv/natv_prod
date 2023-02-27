package kg.natvprod.natv_prod.entities.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.natvprod.natv_prod.entities.Order;
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
public class OrderDatesDto {
    long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date date;

    OrderDto orderDto;
}
