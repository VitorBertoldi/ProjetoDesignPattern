import java.util.Scanner;

public class Login {
    private static Login instancia;
    private String senha = "1234";
    private String usuario = "Joao";
    Scanner sc = new Scanner(System.in);

    public static Login getInstance() {
        if (instancia == null) {
            instancia = new Login();
        }
        return instancia;
    }
    public boolean fazerLogin() {
        System.out.println("Digite o seu usuario: ");
        String usuarioDigitado = sc.next();

        System.out.println("Digite a sua senha: ");
        String senhaDigitada = sc.next();

        if (usuario.equals(usuarioDigitado)  && senha.equals(senhaDigitada)) {
            return true;
        } else {
            return false;
        }
    }

}
