package chishikoji.MySQLAPI;

import org.springframework.data.repository.CrudRepository;
import chishikoji.MySQLAPI.Sample;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SampleRepository extends CrudRepository<Sample, Long> {

}