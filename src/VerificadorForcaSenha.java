import java.util.Scanner;

public class VerificadorForcaSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pegar a senha do usuário
        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        // Verificar a força
        int forca = verificarForcaSenha(senha);

        // Passar a mensagem para o usuário, dependendo da força
        if (forca <= 2) {
            System.out.println("A sua senha é fraca.");
        } else if (forca == 3) {
            System.out.println("A sua senha é média.");
        } else if (forca == 4) {
            System.out.println("A sua senha é segura.");
        } else {
            System.out.println("A sua senha é muito forte.");
        }

        scanner.close();

    }

    public static int verificarForcaSenha(String senha) {
        
        int forca = 0;

        // Lógica para ver se a senha é forte
        if (senha.length() > 8) {
            forca++;
        }

        // letras maiúsculas de a a z
        if (senha.matches(".*[A-Z].*")) {
            forca++;
        }

        // letras minúsculas de a a z
        if (senha.matches(".*[a-z].*")) {
            forca++;
        }

        // verificar se tem números
        if (senha.matches(".*\\d.*")) {
            forca++;
        }

        // - > traço
        // - > intervalo entre 2 caracteres
        if (senha.matches(".*[!@#$%&*()\\-_?<>].*")) {
            forca++;
        }

        return forca;

    }

}