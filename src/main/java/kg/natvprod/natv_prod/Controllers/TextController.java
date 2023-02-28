package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.dto.TextDto;
import kg.natvprod.natv_prod.services.TextService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/text")
public class TextController {
    private final TextService textService;

    public TextController(TextService textService) {
        this.textService = textService;
    }
    @PostMapping("/save")
    public TextDto save(@RequestBody TextDto textDto) {
        return textService.save(textDto);
    }
}
