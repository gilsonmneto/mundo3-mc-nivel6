package com.funcionarios.MissaoCertificacaoTeam4.service.funcionario;

import com.funcionarios.MissaoCertificacaoTeam4.dto.response.FuncionarioResponse;
import com.funcionarios.MissaoCertificacaoTeam4.entity.Funcionario;
import com.funcionarios.MissaoCertificacaoTeam4.repository.FuncionarioRepository;
import com.funcionarios.MissaoCertificacaoTeam4.service.funcionario.helper.FuncionarioHelper;
import org.springframework.stereotype.Service;

import static com.funcionarios.MissaoCertificacaoTeam4.mapper.FuncionarioMapper.criarFuncionarioResponse;

@Service
public class RemoverFuncionarioService {

    private final FuncionarioHelper funcionarioHelper;

    private final FuncionarioRepository funcionarioRepository;

    public RemoverFuncionarioService(FuncionarioHelper funcionarioHelper, FuncionarioRepository funcionarioRepository) {
        this.funcionarioHelper = funcionarioHelper;
        this.funcionarioRepository = funcionarioRepository;
    }

    public FuncionarioResponse remover(Long id) {

        Funcionario funcionario = funcionarioHelper.retornarFuncionarioValidoPorId(id);

        funcionarioRepository.deleteById(id);

        return criarFuncionarioResponse(funcionario);
    }
}
