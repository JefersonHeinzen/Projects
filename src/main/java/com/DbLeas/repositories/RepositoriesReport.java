package com.DbLeas.repositories;

import com.DbLeas.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoriesReport extends JpaRepository<Report, Long> {
}
