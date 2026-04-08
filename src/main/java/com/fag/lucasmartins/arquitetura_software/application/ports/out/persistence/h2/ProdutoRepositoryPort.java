package com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.h2;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.ProdutoBO;
import java.util.Optional;

public interface ProdutoRepositoryPort {

    ProdutoBO salvar(ProdutoBO produtoBO);

    boolean existePorId(Integer id);

    Optional<String> obterNomePorId(Integer id);
}
