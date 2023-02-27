package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepo extends JpaRepository<Channel, Long> {
}
