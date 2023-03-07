package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price, Long> {
    @Query(value = "select * from tb_price where channel = :id", nativeQuery = true)
    Price getPrice(Long id);
}
