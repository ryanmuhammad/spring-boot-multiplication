package microservices.book.multiplication.repository;

import microservices.book.multiplication.domain.Multiplication;
import org.springframework.data.repository.CrudRepository;

/**
 * @author by iriyantoperkasa on 7/18/18.
 */
public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {
}
