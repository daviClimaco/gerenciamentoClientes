package daviClimaco.gerenciamentoClientes.controller;

import daviClimaco.gerenciamentoClientes.entity.Cliente;
import daviClimaco.gerenciamentoClientes.services.ClienteServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    private ClienteServices clienteServices;

    public ClienteController(ClienteServices clienteServices) {
        this.clienteServices = clienteServices;
    }

    @PostMapping
    public void salvar(@RequestBody Cliente cliente){
        clienteServices.salvar(cliente);
    }

    @DeleteMapping ("{id}")
    public void deletar(@PathVariable Long id) {
        clienteServices.deletar(id);
    }

    @GetMapping
    public List<Cliente> buscarTodos(){
        return clienteServices.buscarTodos();
    }

    @GetMapping("{id}")
    public Cliente buscarPorId(@PathVariable Long id){
        return clienteServices.buscarClientePorId(id);
    }

}