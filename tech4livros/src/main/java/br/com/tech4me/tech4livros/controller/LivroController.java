package br.com.tech4me.tech4livros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4livros.model.Livro;
import br.com.tech4me.tech4livros.service.LivroService;

@RestController
@RequestMapping("/api/tech4livros")
public class LivroController {
    @Autowired
    private LivroService servico;

    @GetMapping
    public ResponseEntity<List<Livro>> obterlivros() {
        return new ResponseEntity<>(servico.obterLivros(), HttpStatus.FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> obterLivroPorId(@PathVariable String id) {
        return new ResponseEntity<>(servico.obterLivroPorId(id), HttpStatus.FOUND );
    }

    @PostMapping
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(servico.cadastrarLivro(livro), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirLivro(@PathVariable String id) {
        ((LivroController) servico).excluirLivro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable String id, @RequestBody Livro novoLi) {
     Livro novoLivro;
    return new ResponseEntity<>(servico.atualizarLivro(id, novoLivro), HttpStatus.ACCEPTED);
    }  
}
