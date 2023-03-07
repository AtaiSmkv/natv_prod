package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.dto.RequestDto1.ChannelListDto;
import kg.natvprod.natv_prod.services.ChannelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API/V1/CHANNEL")
public class GetChannelListController {
    private final ChannelService channelService;

    public GetChannelListController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @GetMapping("/LIST")
    public List<ChannelListDto> findAll(){
        return channelService.findAll();
    }

}
