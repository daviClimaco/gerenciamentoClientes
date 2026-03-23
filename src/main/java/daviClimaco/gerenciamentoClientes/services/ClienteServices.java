package daviClimaco.gerenciamentoClientes.services;

import daviClimaco.gerenciamentoClientes.entity.Cliente;
import daviClimaco.gerenciamentoClientes.repository.ClienteRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {
    private ClienteRepository clienteRepository;

    public ClienteServices(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvar(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente buscarClientePorId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

}
