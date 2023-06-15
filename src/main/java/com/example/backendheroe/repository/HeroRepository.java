package com.example.backendheroe.repository;

import com.example.backendheroe.model.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends CrudRepository<Hero,Long> {
}
