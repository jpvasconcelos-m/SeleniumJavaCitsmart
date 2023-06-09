package seleniumproject;

import com.google.common.hash.HashCode;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashMap;

public class Dados {


	static String[] setores = {"AGENCIA TRANSFUSIONAL", "AGENCIA TRANSFUSIONAL- BANCO DE SANGUE", "ALMOXARIFADO",
    		"ALMOXARIFADO ATENDIMENTO", "ALMOXARIFADO ATENDIMENTO (GERENCIADOR)", "ALMOXARIFADO GERÊNCIA", 
    		"AMBULATÓRIO ADMISSÃO ELETIVA", "AMBULATÓRIO CLINICA CIRÚRGICA PAINEL", "AMBULATÓRIO CLINICA MÉDICA PAINEL", 
    		"AMBULATÓRIO CLÍNICA CIRÚRGICA CITOSCOPIA", "AMBULATÓRIO CLÍNICA CIRÚRGICA CURATIVO", 
    		"AMBULATÓRIO CLÍNICA CIRÚRGICA GERÊNCIA", "AMBULATÓRIO CLÍNICA CIRÚRGICA RECEPÇÃO", 
    		"AMBULATÓRIO CLÍNICA CIRÚRGICA SALA 01", "AMBULATÓRIO CLÍNICA CIRÚRGICA SALA 02", 
    		"AMBULATÓRIO CLÍNICA CIRÚRGICA SALA 03", "AMBULATÓRIO CLÍNICA CIRÚRGICA SALA 04", 
    		"AMBULATÓRIO CLÍNICA CIRÚRGICA SALA 05", "AMBULATÓRIO CLÍNICA CIRÚRGICA SALA 06", 
    		"AMBULATÓRIO CLÍNICA CIRÚRGICA SALA SONDA", "AMBULATÓRIO CLÍNICA MÉDICA RECEPÇÃO", "AMBULATÓRIO CLÍNICA MÉDICA SALA 07", 
    		"AMBULATÓRIO CLÍNICA MÉDICA SALA 08", "AMBULATÓRIO CLÍNICA MÉDICA SALA 09", "AMBULATÓRIO CLÍNICA MÉDICA SALA 10", 
    		"AMBULATÓRIO CLÍNICA MÉDICA SALA 11", "AMBULATÓRIO CLÍNICA MÉDICA SALA 12", "AMBULATÓRIO CLÍNICA MÉDICA SALA 13", 
    		"AMBULATÓRIO CLÍNICA MÉDICA SALA 14", "AMBULATÓRIO CLÍNICA MÉDICA SALA 15", "AMBULATÓRIO COORDENAÇÃO MEDICA", 
    		"AMBULATÓRIO EXAMES ESPECIAIS", "AMBULATÓRIO ORTOPEDIA", "AMBULATÓRIO ORTOPEDIA PAINEL", "AMBULATÓRIO ORTOPEDIA TOTEM", 
    		"AMBULATÓRIO RECEPÇÃO", "AMBULATÓRIO SERVIÇO SOCIAL", "AMBULATÓRIO TOTEM", "AMBULATÓRIO TRAUMA ORTOPEDIA SALA 01", 
    		"AMBULATÓRIO TRAUMA ORTOPEDIA SALA 02", "AMBULATÓRIO TRAUMA ORTOPEDIA SALA 03", "AMBULATÓRIO TRAUMA ORTOPEDIA SALA 04", "AMBULATÓRIO TRAUMA ORTOPEDIA SALA 05", "AMBULATÓRIO TRAUMA ORTOPEDIA SALA 06", "AMBULATÓRIO TRAUMA ORTOPEDIA SALA 07", "ANESTESIA GERÊNCIA", "AUDITORIA MÉDICA", "AUDITÓRIO MARCELO COSTA LIMA", "AUDITÓRIO NILTON PEDROSA", "BIOPSIA", "BLOCO CIRÚRGICO", "BLOCO CIRÚRGICO EVOLUÇÃO MÉDICA", "BLOCO CIRÚRGICO FARMÁCIA", "BLOCO CIRÚRGICO GERÊNCIA", "BLOCO CIRÚRGICO RECEPÇÃO", "BLOQUINHO", "BLOQUINHO RECEPÇÃO", "BRONCOSCOPIA", "CCIH", "CCIH GERÊNCIA", "CEAP - CENTRO DE ESTUDOS BIBLIOTECA", "CEAP - COORDENAÇÃO RESIDENTES", "CEAP - COORDENAÇÃO RESIDENTES", "CEAP - RECEPÇÃO", "CENTRAL DE EQUIPAMENTOS", "CETRANS", "CIHDOTT", "CLASSIFICAÇÃO DE RISCO", "CLINICA CIRÚRGICA A POSTO DE ENFERMAGEM", "CLINICA CIRÚRGICA B POSTO DE ENFERMAGEM", "CLINICA CIRÚRGICA EVOLUÇÃO MÉDICA", "CLINICA CIRÚRGICA GERÊNCIA", "CLINICA MÉDICA A POSTO DE ENFERMAGEM", "CLINICA MÉDICA B POSTO DE ENFERMAGEM", "CLINICA MÉDICA EVOLUÇÃO", "CLINICA MÉDICA GERÊNCIA", "CLINICA NEURO ENFERMAGEM", "CLINICA VASCULAR EVOLUÇÃO MÉDICA", "CLÍNICA NEURO EVOLUÇÃO", "CLÍNICA ORTOPÉDICA POSTO DE ENFERMAGEM", "CLÍNICA TRAUMA POSTO DE ENFERMAGEM", "CLÍNICA UROLOGIA GERÊNCIA", "CLÍNICA UROLOGIA POSTO DE ENFERMAGEM", "CLÍNICA VASCULAR POSTO DE ENFERMAGEM", "CME ARSENAL", "CME EXPURGO", "CME GERÊNCIA", "COLETA EMERGÊNCIA", "COMISSÃO DE SINDICÂNCIA", "COMPRAS", "CONFIRMAÇÃO DE EXAMES IMAGENS", "CONTRATOS", "COORDENAÇÃO MÉDICA EMERGÊNCIA", "CRESAT", "CURATIVO LIMPO", "DIETOTERAPIA", "DIRETORIA", "DIRETORIA MÉDICA", "DIRETORIA SECRETÁRIA", "EEG", "EMERGÊNCIA BOX", "EMERGÊNCIA CONS. BUCO MAXILO", "EMERGÊNCIA CONS. CL .CIRURGICA", "EMERGÊNCIA CONS. CL .CIRÚRGICA", "EMERGÊNCIA CONS. CLINICA MEDICA", "EMERGÊNCIA CONS. CLINICA VASCULAR 01", "EMERGÊNCIA CONS. CLINICA VASCULAR 02", "EMERGÊNCIA CONS. TRAUMATOLOGIA", "EMERGÊNCIA EVOLUÇÃO MÉDICA", "EMERGÊNCIA FARMÁCIA", "EMERGÊNCIA NIR", "EMERGÊNCIA NIR (PAINEL)", "EMERGÊNCIA POSTO DE ENFERMAGEM", "EMERGÊNCIA REGISTRO", "EMERGÊNCIA SERVIÇO SOCIAL", "EMERGÊNCIA SUPERVISÃO COVID", "EMERGÊNCIA ÁREA AMARELA", "EMERGÊNCIA ÁREA VERMELHA", 
    		"EMERGÊNCIA ÁREA VERMELHA (TELECARDIO)", "ENDOSCOPIA", "ENGENHARIA CLÍNICA", "EVOLUÇÃO MÉDICA TRAUMA/ORTOPEDIA", "FARMÁCIA  CAF MED", "FARMÁCIA  DI", "FARMÁCIA  MMH", "FARMÁCIA  MMH                (GERENCIADOR)", "FARMÁCIA FRACIONAMENTO", "FARMÁCIA GERÊNCIA", "FATURAMENTO", "FINANCEIRO", "FISIOTERAPIA RECEPÇÃO", "FISIOTERAPIA SL TÉCNICO", "FONOAUDIOLOGIA", "GERIATRIA", "GERÊNCIA DE ENFERMAGEM EMERGÊNCIA", "GESTÃO DE PESSOAS", "GUARITA I", "HEMODIÁLISE", "HOSPITAL DIA", "INFORMÁTICA", "ISOLAMENTO COVID", "LABORATÓRIO BIOQUÍMICA", "LABORATÓRIO BIOQUÍMICA  INTERFACEAMENTO", "LABORATÓRIO DIGITAÇÃO", "LABORATÓRIO GERÊNCIA", "LABORATÓRIO HEMATOLOGIA", "LABORATÓRIO IMUNOLOGIA", "LICITAÇÃO", "MANUTENÇÃO", "MARCAÇÃO DE CONSULTAS", 
    		"MARCAÇÃO DE CONSULTAS PAINEL", "MARCAÇÃO DE CONSULTAS TOTEM", "MARCAÇÃO DE EXAMES", "MARCAÇÃO EXAMES ESPECIAIS INTERNAÇÃO", "NATA", "NECROTÉRIO", "NEP", "NES - NUCLEO DE ECONOMIA E SAÚDE", "NUTRIÇÃO GERÊNCIA", "NÚCLEO AMBIENTAL", "OPME", "OUVIDORIA", "PEDIATRIA EVOLUÇÃO MÉDICA", "PEDIATRIA POSTO DE ENFERMAGEM", "PLANEJAMENTO FARMÁCIA", "PORTARIA CENTRAL", "PORTARIA GERÊNCIA", "PSICOLOGIA", "RADIOLOGIA", "RECURSOS HUMANOS", "REFEITÓRIO", "REFEITÓRIO PRODUÇÃO", "REMOÇÃO", "RESIDENCIA BUCO MAXILO", "RESIDENCIA ENFERMAGEM", "RM TERCEIRIZAÇÃO", "ROUPARIA", "SALA DE ENDOSCOPIA", "SALA DE LAUDOS", "SALA DE RECUPERAÇÃO POSTO ENF", "SALA DE REUNIÃO", 
    		"SAME GERÊNCIA", 
    		"SAME SDC", 
    		"SERVIÇO SOCIAL ENFERMARIA", "SERVIÇO SOCIAL GERÊNCIA", "SUPERINTENDÊNCIA ADM FINANÇAS", "SUPERINTENDÊNCIA DE ENFERMAGEM", 
    		"SUPERINTENDÊNCIA DE SUPRIMENTOS", "SUPERVISÃO ENFERMAGEM", "TERAPIA OCUPACIONAL", "TRANSPORTE",
    		"TRAUMA / ORTOPEDIA GERÊNCIA", "ULTRASSOM / ECO SL 02", "ULTRASSOM SL 01", "ULTRASSONOGRAFIA",
    		"UTI 1", "UTI 2", "UTI 3 COVID ENFERMAGEM", "UTI 3 COVID GERENCIA ENFERMAGEM",
    		"UTI 3 COVID PRESCRIÇÃO MÉDICA", "UTI GERÊNCIA", "XEROX", "ÓRTESE E PRÓTESE"};
	

static String[] servicos = {"SES (HGV) > Arquivo/Pasta > Acesso", "SES (HGV) > Arquivo/Pasta > Backup e Recuperação",
		"SES (HGV) > Arquivo/Pasta > Mapeamento",
		"SES (HGV) > Ativos de Rede > Configuração Física",
		"SES (HGV) > CITSmart ITSM > Cadastro de Usuário",
		"SES (HGV) > CMCE/ApacNET/Regulador/RegMed > Bug/Erro/Falha",
		"SES (HGV) > CMCE/ApacNET/Regulador/RegMed > Dúvidas do Sistema",
		"SES (HGV) > Estação de Trabalho > Assistência Técnica",
		"SES (HGV) > Estação de Trabalho > Assistência Técnica (Troca de Peça)", 
		"SES (HGV) > Estação de Trabalho > Configuração",
		"SES (HGV) > Estação de Trabalho > Empréstimo de Equipamento (DPZ)", "SES (HGV) > Estação de Trabalho > Instalação",
		"SES (HGV) > Estação de Trabalho > Intervenção Técnica",
		"SES (HGV) > Estação de Trabalho > Intervenção Técnica (Troca de Peça)",
		"SES (HGV) > Estação de Trabalho > Manutenção Corretiva", "SES (HGV) > Estação de Trabalho > Manutenção Preventiva", 
		"SES (HGV) > Estação de Trabalho > Remanejamento", 
		"SES (HGV) > Estação de Trabalho > Substituição", 
		"SES (HGV) > FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Bug/Erro/Falha", 
		"SES (HGV) > FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Dúvidas e Orientações", 
		"SES (HGV) > Impressora e Digitalização > Aquisição de Suprimentos", 
		"SES (HGV) > Impressora e Digitalização > Assistência Técnica", 
		"SES (HGV) > Impressora e Digitalização > Assistência Técnica (Troca de Peça)", "SES (HGV) > Impressora e Digitalização > Configuração", "SES (HGV) > Impressora e Digitalização > Instalação", "SES (HGV) > Impressora e Digitalização > Intervenção Técnica", "SES (HGV) > Impressora e Digitalização > Intervenção Técnica (Troca de Peça)", "SES (HGV) > Impressora e Digitalização > Manutenção Corretiva", "SES (HGV) > Impressora e Digitalização > Manutenção Preventiva", "SES (HGV) > Impressora e Digitalização > Remanejamento", "SES (HGV) > Impressora e Digitalização > Reposição de Suprimentos", "SES (HGV) > Impressora e Digitalização > Substituição", "SES (HGV) > Indefinido > Dúvidas e Orientações", "SES (HGV) > Indefinido > Incidente", "SES (HGV) > Indefinido > Inventariar Equipamento", "SES (HGV) > Indefinido > Requisição", "SES (HGV) > Internet/Rede > Ativação", "SES (HGV) > Internet/Rede > Cabeamento", "SES (HGV) > Internet/Rede > Instalação de Ponto de Rede", "SES (HGV) > Internet/Rede > Manutenção Corretiva", "SES (HGV) > Mãe Coruja > Bug/Erro/Falha", "SES (HGV) > Mãe Coruja > Dúvidas e Orientações", "SES (HGV) > Outros Sistemas > Bug/Erro/Falha", "SES (HGV) > Outros Sistemas > Dúvidas e Orientações", "SES (HGV) > Papel de Parede > Alteração", "SES (HGV) > Projetor e Perifericos > Configuração", "SES (HGV) > Projetor e Perifericos > Instalação", "SES (HGV) > Projetor e Perifericos > Manutenção Corretiva", "SES (HGV) > Projetor e Perifericos > Remanejamento", "SES (HGV) > Projetor e Perifericos > Substituição", "SES (HGV) > SAPE > Bug/Erro/Falha", "SES (HGV) > SAPE > Dúvidas do Sistema", "SES (HGV) > SAPE > Novo Usuário", "SES (HGV) > SEI/SIGEPE > Acesso/Senha/Perfil do Usuário", "SES (HGV) > SEI/SIGEPE > Administração de Sistemas", "SES (HGV) > SEI/SIGEPE > Bug/Erro/Falha", "SES (HGV) > SEI/SIGEPE > Cadastro de Usuário SEI/SIGEPE - SES", "SES (HGV) > SEI/SIGEPE > Dúvidas do Sistema", "SES (HGV) > SEI/SIGEPE > Relatório de Processos do SEI (Informativo BI)", "SES (HGV) > SEI/SIGEPE > Treinamento", "SES (HGV) > SICREF/SISCONF/SCON > Bug/Erro/Falha", "SES (HGV) > SICREF/SISCONF/SCON > Dúvidas e Orientações", "SES (HGV) > SICREF/SISCONF/SCON > Instalação", "SES (HGV) > SIDDA/SIREX/SINATT/SVO/AMBER > Bug/Erro/Falha", "SES (HGV) > SIDDA/SIREX/SINATT/SVO/AMBER > Dúvidas e Orientações", "SES (HGV) > SIGAPE > Bug/Erro/Falha",
		"SES (HGV) > SIGAPE > Dúvidas e Orientações", "SES (HGV) > SIM/SINAN/SINASC/CIEVS > Dúvidas do Sistema", "SES (HGV) > SIM/SINAN/SINASC/CIEVS > Erro/Falha", "SES (HGV) > SIM/SINAN/SINASC/CIEVS > Novo Usuário", "SES (HGV) > Sistema MV/SoulMV > Administração de Sistema", "SES (HGV) > Sistema MV/SoulMV > Ajuda/Suporte/Orientação/Operação Assistida", "SES (HGV) > Sistema MV/SoulMV > Bug/Erro/Falha", "SES (HGV) > Sistema MV/SoulMV > Capacitação/treinamento", "SES (HGV) > Sistema MV/SoulMV > Configuração/Parametrização", "SES (HGV) > Sistema MV/SoulMV > Liberação de Acesso/Redefinição de Senha", "SES (HGV) > Sistema MV/SoulMV > Simulação/Testes", "SES (HGV) > Sistemas - Gerenciador de impressão > Administração de Sistema", "SES (HGV) > Sistemas - Gerenciador de impressão > Auditoria de Impressoras", "SES (HGV) > Sistemas - Gerenciador de impressão > Configuração/Parametrização", "SES (HGV) > Sistemas Ministério da Saúde > Bug/Erro/Falha", "SES (HGV) > Sistemas Ministério da Saúde > Dúvidas do Sistema", "SES (HGV) > Sistemas Ministério da Saúde > Instalação", "SES (HGV) > Sistemas Ministério da Saúde > Novo Usuário", "SES (HGV) > Sistemas Operacional > Ativação de Licença", "SES (HGV) > Sistemas Operacional > Atualização", "SES (HGV) > Sistemas Operacional > Configuração", "SES (HGV) > Sistemas Operacional > Erro/Falha", "SES (HGV) > Sistemas Operacional > Instalação", "SES (HGV) > Sistemas Operacional > Manutenção Preventiva", "SES (HGV) > Sistemas de BI > Bug/Erro/Falha", "SES (HGV) > Sistemas de BI > Dúvidas e Orientações", "SES (HGV) > Sistemas de BI > Indisponibilidade", "SES (HGV) > Sistemas de BI > Liberação de Acesso", "SES (HGV) > Softwares e Aplicativos > Ativação de Licença", "SES (HGV) > Softwares e Aplicativos > Configuração", "SES (HGV) > Softwares e Aplicativos > Erro/Falha", "SES (HGV) > Softwares e Aplicativos > Instalação/Desinstalação/Atualização", "SES (HGV) > Telefonia > Ativação / Desativação", "SES (HGV) > Telefonia > Cabeamento", "SES (HGV) > Telefonia > Categorização", "SES (HGV) > Telefonia > Configuração", "SES (HGV) > Telefonia > Manutenção Corretiva", "SES (HGV) > Telefonia > Remanejamento", "SES (HGV) > Telefonia > Substituição", "SES (HGV) > Usuário de E-mail > Bloqueio/Desbloqueio", "SES (HGV) > Usuário de E-mail > Criação", "SES (HGV) > Usuário de E-mail > Erro/Falha", "SES (HGV) > Usuário de E-mail > Migração", "SES (HGV) > Usuário de E-mail > Senha",
		"SES (HGV) > Usuário de Rede/Internet > Bloqueio/Desbloqueio", "SES (HGV) > Usuário de Rede/Internet > Configuração", "SES (HGV) > Usuário de Rede/Internet > Criação", "SES (HGV) > Usuário de Rede/Internet > Erro/Falha", "SES (HGV) > Usuário de Rede/Internet > Liberação de Acesso Proxy", "SES (HGV) > Usuário de Rede/Internet > Liberação de Acesso WI - FI", "SES (HGV) > Usuário de Rede/Internet > Senha", "SES (HGV) > Vistoria/Diagnóstico > Infraestrutura", 
		"SES (HGV) > Vistoria/Diagnóstico > Vistoria Técnica"

};

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}