package com.digitalstore.imperium.library.repository;

import com.digitalstore.imperium.library.model.Complain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplainRepository extends JpaRepository<Complain, Long> {
    Complain findById(long id);
}
