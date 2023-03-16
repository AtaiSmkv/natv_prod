package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.TextDto;
import kg.natvprod.natv_prod.models.entities.Text;
import kg.natvprod.natv_prod.services.TextService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/findAll")
    public List<Text> findAll(){
        return textService.findAll();
    }
}
