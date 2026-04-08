package com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.h2;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import java.util.UUID;

public interface PessoaRepositoryPort {

    PessoaBO salvar(PessoaBO pessoaBO);

    boolean existePorId(UUID id);
}
