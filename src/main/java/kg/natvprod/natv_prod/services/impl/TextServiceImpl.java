package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.Text;
import kg.natvprod.natv_prod.entities.dto.TextDto;
import kg.natvprod.natv_prod.mappers.TextMapper;
import kg.natvprod.natv_prod.repository.TextRepo;
import kg.natvprod.natv_prod.services.TextService;
import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService {
    private final TextRepo textRepo;

    public TextServiceImpl(TextRepo textRepo) {
        this.textRepo = textRepo;
    }

    @Override
    public TextDto save(TextDto textDto) {
        Text text = TextMapper.INSTANCE.textDtoToText(textDto);
        text.setSymbolCount(textDto.getText().replaceAll(" ", "").length());
        text = textRepo.save(text);
        textDto.setId(text.getId());
        textDto.setSymbolCount(text.getSymbolCount());
        return textDto;
    }
}
