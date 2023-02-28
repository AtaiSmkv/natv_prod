package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.Text;
import kg.natvprod.natv_prod.entities.dto.TextDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TextMapper {
    TextMapper INSTANCE = Mappers.getMapper(TextMapper.class);
    TextDto textToTextDto(Text text);
    @InheritInverseConfiguration
    Text textDtoToText(TextDto textDto);
}
