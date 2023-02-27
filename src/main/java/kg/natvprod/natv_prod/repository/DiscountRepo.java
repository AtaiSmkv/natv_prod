package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Long> {
}
