package daviClimaco.gerenciamentoClientes.repository;

import daviClimaco.gerenciamentoClientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
