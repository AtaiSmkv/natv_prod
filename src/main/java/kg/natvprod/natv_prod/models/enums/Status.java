package kg.natvprod.natv_prod.models.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum Status {
    CREATED,
    NOT_CREATED
}
