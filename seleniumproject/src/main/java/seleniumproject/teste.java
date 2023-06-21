package seleniumproject;

public class teste {

    public String encontrar(String string1,String string2){
        if(string1.contains(string2)){
            return string1;
        }
        else return null;
    }

    public static boolean  condicaoPadrao1(String servico){

        return servico.contains("SES (HGV) > Arquivo/Pasta > Acesso")
         || servico.contains("Usuário de Rede/Internet > Criação");
    }
    public static boolean  condicaoPadrao2(String servico){

        return servico.contains("Arquivo/Pasta > Backup e Recuperação.")
                || servico.contains("Arquivo/Pasta > Mapeamento")
                || servico.contains("Estação de trabalho > Configuração")
                || servico.contains("Estação de trabalho > Instalação")
                || servico.contains("Projetor e Perifericos > Configuração")
                || servico.contains("Projetor e Perifericos > Remanejamento")
                || servico.contains("Sistemas Operacional > Atualização")
                || servico.contains("Sistemas Operacional > Ativação de Licença")
                || servico.contains("Softwares e Aplicativos > Ativação de Licença")
                || servico.contains("Softwares e Aplicativos > Configuração")
                || servico.contains("Softwares e Aplicativos > Instalação/Desinstalação/Atualização")
                || servico.contains("Usuário de Rede/Internet > Bloqueio/Desbloqueio")
                || servico.contains("Usuário de Rede/Internet > Configuração")
                || servico.contains("Usuário de Rede/Internet > Liberação de Acesso Proxy")
                || servico.contains("Usuário de Rede/Internet > Liberação de Acesso Wi-Fi")
                || servico.contains("Usuário de Rede/Internet > Senha");
    }

    public static boolean condicaoPadrao3(String servico) {
        return servico.contains("Ativos de Rede > Config. Física")
                || servico.contains("Dúvidas do Sistema, Regmed")
                || servico.contains("Estação de Trabalho > Empréstimo de Equipamento (DPZ)")
                || servico.contains("Sistemas Operacional > Ativação de Licença")
                || servico.contains("Sistemas Operacional > Atualização")
                || servico.contains("Sistemas Operacional > Configuração")
                || servico.contains("Estação de Trabalho > Intervenção Técnica")
                || servico.contains("Estação de Trabalho > Intervenção Técnica ( Troca de peça)")
                || servico.contains("Estação de Trabalho > Manutenção preventiva")
                || servico.contains("Estação de Trabalho > Remanejamento")
                || servico.contains("Estação de Trabalho > Substituição")
                || servico.contains("FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Bug/Erro/Falha")
                || servico.contains("FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Dúvidas e Orientações")
                || servico.contains("Impressora e Digitalização > Intervenção Técnica")
                || servico.contains("Impressora e Digitalização > Intervenção técnica(troca de peça)")
                || servico.contains("Impressora e Digitalização > Manutenção Preventiva")
                || servico.contains("Impressora e Digitalização > Substituição")
                || servico.contains("Indefinido >")
                || servico.contains("Internet/Rede > Ativação")
                || servico.contains("Internet/Rede > Instalação de Ponto de Rede")
                || servico.contains("Mãe Coruja > Dúvidas e Orientações")
                || servico.contains("Outros Sistemas > Dúvidas e Orientações")
                || servico.contains("Papel de Parede > Alteração")
                || servico.contains("Projetor e Perifericos > Instalação")
                || servico.contains("Projetor e Perifericos > Substituição")
                || servico.contains("SAPE >")
                || servico.contains("SEI/SIGEPE >")
                || servico.contains("SICREF/SISCONF/SCON >")
                || servico.contains("SIGAPE >")
                || servico.contains("SIM/SINAN/SINASC/CIEVS >")
                || servico.contains("Sistemas - Gerenciador de impressão >")
                || servico.contains("Sistemas Ministério da Saúde >")
                || servico.contains("Sistemas Operacional > Instalação")
                || servico.contains("Sistemas Operacional > Manutenção Preventiva")
                || servico.contains("Sistemas de BI >")
                || servico.contains("Telefonia >")
                || servico.contains("Usuário de E-mail >")
                || servico.contains("Vistoria/Diagnóstico >");
    }


    public static boolean condicaoPadrao4(String servico) {
     return servico.contains("CITSmart ITSM > Cadastro de Usuário");
    }

    public static boolean condicaoPadrao5(String servico) {
        return servico.contains("Impressora e Digitalização > Aquisição de Suprimentos")
                || servico.contains("Impressora e Digitalização > Configuração")
                || servico.contains("Impressora e Digitalização > Instalação")
                || servico.contains("Impressora e Digitalização > Remanejamento")
                || servico.contains("Impressora e Digitalização > Reposição");
    }

    public static boolean condicaoPadrao6(String servico) {
        return servico.contains("Sistema MV/SoulMV >");
    }

    public static void main(String[] args) {
        String teste = "Impressora e Digitalização > Reposição";
        for(String servico: Dados.servicos){
            if(condicaoPadrao6(servico))
                System.out.println(servico);
        }
    }
}
