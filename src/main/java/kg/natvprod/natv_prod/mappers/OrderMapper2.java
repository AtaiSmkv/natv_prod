package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.dto.RequestDto3.ChannelsList;
import kg.natvprod.natv_prod.models.dto.RequestDto3.OrderRequest3;
import kg.natvprod.natv_prod.models.entities.Channel;
import kg.natvprod.natv_prod.models.entities.Order;
import kg.natvprod.natv_prod.models.entities.Text;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper2 {
    Order orderReques3ToOrder(OrderRequest3 orderRequest3) {
        Order order = new Order();
        Text text = new Text();
        text.setText(orderRequest3.getText());
        text.setSymbolCount(orderRequest3.getText().replaceAll(" ", "").length());
        order.setText(text);
        order.setClientEmail(orderRequest3.getClientEmail());
        order.setClientFio(orderRequest3.getClientFio());
        order.setClientPhone(orderRequest3.getClientPhone());

        List<ChannelsList> channelsLists = new ArrayList<>();
        for (int i = 0; i < channelsLists.size(); i++) {


        }

    return null;
    }
}
