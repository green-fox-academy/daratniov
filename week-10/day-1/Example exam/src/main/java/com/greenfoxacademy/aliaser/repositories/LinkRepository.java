package com.greenfoxacademy.aliaser.repositories;

import com.greenfoxacademy.aliaser.models.Link;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
  Optional<Link> findByAlias(String alias);

  boolean existsBySecretCode(String secretCode);
}
