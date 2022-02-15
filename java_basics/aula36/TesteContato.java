package java_basics.aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Manuel");
        // contato.setEndereco("Rua Gaivota");
//        contato.setTelefone("43 11111-1111");


        // Relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Fixo");
        telefone.setDdd("11");
        telefone.setNumero("3025-3199");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Celular");
        telefone2.setDdd("12");
        telefone2.setNumero("98100-9850");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);


        // criar objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Gaiovota");
        end.setNumero("121");
        end.setComplemento("Bloco C, Ap 135");
        end.setCep("008820-000");
        end.setCidade("Verdânia");
        end.setEstado("Verdunutti");

        contato.setEndereco(end);

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null){
            for(Telefone t: contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

        System.out.println(contato.getNome());

    }
}
