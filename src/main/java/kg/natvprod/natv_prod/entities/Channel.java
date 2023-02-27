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
@Table(name = "tb_channel")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Channel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @JsonProperty("channel_name")
    String channelName;
    @JsonProperty("created_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date createdDate;
    @JsonProperty("channel_status")
    boolean channelStatus;
    @JsonProperty("logo_path")
    String logoPath;

}
