package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.dto.ChannelDto;
import kg.natvprod.natv_prod.services.ChannelService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {
    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @RequestMapping("/save")
    ChannelDto save(@RequestBody ChannelDto channelDto) {
        return channelService.save(channelDto);
    }
}
