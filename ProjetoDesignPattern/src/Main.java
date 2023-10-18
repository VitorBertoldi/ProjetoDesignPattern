public class Main {
    public static void main(String[] args) {

        Login login = Login.getInstance();
        while(true) {
            if (login.fazerLogin()) {
                ClienteDoBanco cliente = new ClienteDoBanco("Maria Campos Rodrigues");
                ContaBancaria conta = new ContaBancaria("1365-9");

                Fachada facade = new Fachada();
                facade.fazerDeposito(150, cliente, conta);
                break;
            } else {
                System.out.println("Login invalido");
            }
        }
    }
}
