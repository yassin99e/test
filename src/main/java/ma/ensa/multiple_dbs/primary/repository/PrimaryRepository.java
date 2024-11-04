package ma.ensa.multiple_dbs.primary.repository;

import ma.ensa.multiple_dbs.primary.entity.PrimaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryRepository extends JpaRepository<PrimaryEntity, Long> {
}
