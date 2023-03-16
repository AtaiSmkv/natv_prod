package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.dto.ChannelDto;
import kg.natvprod.natv_prod.models.dto.RequestDto1.ChannelListDto;
import kg.natvprod.natv_prod.models.entities.Channel;
import kg.natvprod.natv_prod.models.entities.Order;
import kg.natvprod.natv_prod.services.ChannelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {
    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @PostMapping("/save")
    ChannelDto save(@RequestBody ChannelDto channelDto) {
        return channelService.save(channelDto);
    }

    @GetMapping("/find")
    public List<ChannelListDto> findAll() {
       return channelService.findAll();
    }


}
