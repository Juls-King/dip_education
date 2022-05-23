package uniongraphix.baemin.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uniongraphix.baemin.user.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
}
