package com.leitorcsv.repositories;

import com.leitorcsv.entity.TableClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RepositoriesClient extends JpaRepository<TableClient, UUID> {
}
