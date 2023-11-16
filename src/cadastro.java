import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class cadastro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****ESCOLHA A OPÇÃO DESEJADA*****");
        System.out.println("1 - Cadastrar usuario");
        System.out.println("2 - Listar Tabela");
        System.out.println("Escolha a opção desejada");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                cadastrarusuario();
                break;

            case 2:
                listarusuario();
                break;

            default:
                System.out.println("Opção invalida");
        }

        scanner.close();
    }



    private static void cadastrarusuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** CADASTRAR USUARIO *****");
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a sua cidade ");
        String cidade = scanner.nextLine();

        scanner.close();

        Pessoa pessoa = new Pessoa(nome, idade, cidade);

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/usuariodb", "root",
                    "root");

            String sql = "INSERT INTO user (nome, idade, cidade) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setInt(2, pessoa.getIdade());
            preparedStatement.setString(3, pessoa.getCidade());

            preparedStatement.executeUpdate();

            System.out.println("Cadastro efetuado com sucesso!");

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }



    private static void listarusuario() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/usuariodb", "root",
                    "root");

            String selectSql = "SELECT * FROM user";
            PreparedStatement selectStatement = connection.prepareStatement(selectSql);
            ResultSet resultSet = selectStatement.executeQuery();

            System.out.println("*****LISTA DE USUÁRIOS CADASTRADOS*****");
            while (resultSet.next()) {
                String nomeUsuario = resultSet.getString("nome");
                int idadeUsuario = resultSet.getInt("idade");
                String cidadeUsuario = resultSet.getString("cidade");

                System.out.println("Nome: " + nomeUsuario + ", Idade: " + idadeUsuario + ", Cidade: " + cidadeUsuario);
            }

            resultSet.close();
            selectStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}