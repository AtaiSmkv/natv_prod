package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
