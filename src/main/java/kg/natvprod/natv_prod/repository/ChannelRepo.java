package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.models.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelRepo extends JpaRepository<Channel, Long> {
    @Query(value = "select * from tb_channel " +
            "where channel_status = true " +
            "order by channel_name asc",
             nativeQuery = true)
    List<Channel> findAllByActive();
    @Query (value = "select channel_status  from tb_channel " +
            "where  id = :id", nativeQuery = true)
    boolean findByActive(Long id);


}
