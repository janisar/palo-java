package ee.ardel.paloserver.dao;

import ee.ardel.paloserver.model.Name;
import org.springframework.data.repository.CrudRepository;

public interface NameRepository extends CrudRepository<Name, Long> {
}
