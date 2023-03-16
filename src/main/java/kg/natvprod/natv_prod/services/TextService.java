package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.dto.TextDto;
import kg.natvprod.natv_prod.models.entities.Text;

import java.util.List;

public interface TextService {
    TextDto save(TextDto textDto);
    List<Text> findAll();
}
