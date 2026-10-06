public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        boolean senhaAprovada = false;

        while (!senhaAprovada) {

            System.out.print("Digite uma senha fictícia: ");

            String senha = scanner.nextLine();

            String resultado = avaliarSenha(senha);

            System.out.println(resultado);

            if (resultado.equals("SUCESSO: Sua senha passou nos critérios básicos!")) {

                senhaAprovada = true;

            }

        }

        scanner.close();

    }

    public static String avaliarSenha(String senha) {

     if (senha.length() < 8) {

            return "DICA: A senha deve ter no mínimo 8 caracteres.";

        }
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {

            char caractere = senha.charAt(i);

            if (Character.isDigit(caractere)) {

                temNumero = true;

                break;

            }

        }

        if (!temNumero) {

            return "DICA: Adicione pelo menos um número à sua senha.";

        }
        String[] senhasObvias = {

            "12345678",

            "senha123",

            "admin123"

        };
        for (int i = 0; i < senhasObvias.length; i++) {

            if (senha.equals(senhasObvias[i])) {

                return "ALERTA: Esta senha é muito comum ou óbvia.";

            }

        }

        return "SUCESSO: Sua senha passou nos critérios básicos!";
    }
}
