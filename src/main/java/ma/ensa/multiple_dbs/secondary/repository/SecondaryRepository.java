package ma.ensa.multiple_dbs.secondary.repository;

import ma.ensa.multiple_dbs.secondary.entity.SecondaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryRepository extends JpaRepository<SecondaryEntity, Long> {
}

