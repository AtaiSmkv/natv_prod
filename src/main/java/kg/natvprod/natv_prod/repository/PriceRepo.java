package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price, Long> {
}
