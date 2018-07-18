package microservices.book.multiplication.repository;

import microservices.book.multiplication.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author by iriyantoperkasa on 7/18/18.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByAlias(final String alias);

}
