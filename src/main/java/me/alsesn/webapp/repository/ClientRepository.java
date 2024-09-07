package me.alsesn.webapp.repository;

import me.alsesn.webapp.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
}
