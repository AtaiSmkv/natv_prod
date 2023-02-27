package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepo extends JpaRepository<Banner, Long> {
}
