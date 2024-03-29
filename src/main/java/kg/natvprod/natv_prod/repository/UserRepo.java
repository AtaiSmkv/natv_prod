package kg.natvprod.natv_prod.repository;

import kg.natvprod.natv_prod.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query(value = "select * from tb_user where id =:id",
            nativeQuery = true)
    User findById(long id);
}
