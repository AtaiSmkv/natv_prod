package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepo extends JpaRepository<Text, Long> {
}
