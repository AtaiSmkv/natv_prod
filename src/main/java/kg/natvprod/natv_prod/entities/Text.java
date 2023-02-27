package kg.natvprod.natv_prod.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_text_ad")
@Getter
@Setter
@RequiredArgsConstructor
public class Text {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    String text;
    @JsonProperty("symbol_count")
    int symbolCount;
}
