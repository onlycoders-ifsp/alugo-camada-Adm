/* ########################## CONTROLLER API DE USUÁRIO ##########################
 * Data Criação: 14/06/2020
 * Programador: Dilan Lima
 * Decrição: Recebe as requisições, delega os processamentos e cuida dos retornos para api de usuários
 * #########################################################################
 */
package com.onlycoders.camadaadm.api.rest;

import com.onlycoders.camadaadm.model.entity.Usuario;
import com.onlycoders.camadaadm.model.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(value = "Usuarios")
@RequestMapping("/usuarios")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioRepository repository;

    @ApiOperation(value = "Cria novo usuário")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario salvar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

    @ApiOperation(value = "Deleta usuário")
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @ApiOperation(value = "Lista usuário")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> list(){
        return repository.findAll();
    }

    @ApiOperation(value = "Muda senha usuário")
    @PatchMapping("{id}/muda-senha")
    @ResponseStatus(HttpStatus.OK)
    public void mudaSenha( @PathVariable Integer id, @RequestBody String nome){
        Optional<Usuario> usuario = repository.findById(id);
        usuario.ifPresent( c -> {
            c.setNome(nome);
            repository.save(c);
        });
    }

    @ApiOperation(value = "Muda dados usuário")
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void mudaDado(@RequestBody Usuario usuario) {
        Optional<Usuario> usuarioBanco = repository.getByNomeAndEmail(usuario.getNome(), usuario.getEmail());
    }

    @ApiOperation(value = "Dados da api do google")
    @PostMapping("google")
    @ResponseStatus(HttpStatus.CREATED)
    public void logonGoogle(@RequestBody Usuario dados){
        repository.save(dados);
    }


}
