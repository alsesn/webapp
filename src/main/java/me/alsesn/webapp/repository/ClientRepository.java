package me.alsesn.webapp.repository;

import ch.qos.logback.core.net.server.Client;
import me.alsesn.webapp.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
    public Client findByEmail(String email);
}
