package dio.aulaspring.repository;

import dio.aulaspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {

}
