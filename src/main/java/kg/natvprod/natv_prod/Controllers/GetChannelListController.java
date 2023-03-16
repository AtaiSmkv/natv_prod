package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.Calculate.CalculateDto;
import kg.natvprod.natv_prod.models.dto.RequestDto1.ChannelListDto;
import kg.natvprod.natv_prod.services.ChannelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channel")
public class GetChannelListController {
    private final ChannelService channelService;

    public GetChannelListController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @GetMapping("/list")
    public List<ChannelListDto> findAll(){
        return channelService.findAll();
    }
    @GetMapping("/calculate")
    public ResponseEntity<?> calculate(@RequestBody CalculateDto calculateDto) {
        return ResponseEntity.ok(channelService. calculate(calculateDto));
    }


}
