package daviClimaco.gerenciamentoClientes.services;

import daviClimaco.gerenciamentoClientes.entity.Cliente;
import daviClimaco.gerenciamentoClientes.repository.ClienteRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity(name = "Clientes")
@Table(name = "tb_cliente")
public class ClienteServices {
    private ClienteRepository clienteRepository;

    public ClienteServices(ClienteServices clienteServices) {
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
