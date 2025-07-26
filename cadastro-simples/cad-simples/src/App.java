import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.dio.dao.UserDAO;
import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;
import br.com.dio.validator.verifyModel;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        final UserDAO dao = new UserDAO();
       
        Runnable runnable = () -> System.out.println("test");
        while(true)
        {
            System.out.println("Bem vindo ao cadastro de usuários, selecione a operação desejada: ");
            System.out.println("1 - Cadastrar -");
            System.out.println("2 - Atualizar -");
            System.out.println("3 - Excluir -");
            System.out.println("4 - Buscar por ID -");
            System.out.println("5 - Listar -");
            System.out.println("6 - Sair -");
            var userInput = scanner.nextInt();
            var selectedOption = MenuOption.values()[userInput - 1];
            switch (selectedOption) {
                case SAVE ->
                {var user = dao.save(requestToSave());
                System.out.printf("Usuário salvo! %s", user);
                }
                case UPDATE -> {
                    try{
                    var user = dao.update(requestToUpdate());
                    System.out.printf("Usuário atualizado! %s", user);
                    }
                    catch(UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                    finally{
                        System.out.println("================");
                    }
                }
                case DELETE -> { 
                    try{
                    dao.delete(requestId());
                    System.out.printf("Usuário deletado!");
                    }
                     catch(UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                    finally{
                        System.out.println("================");
                    }
                }
                case FIND_BY_ID -> {
                    var id = requestId();
                    try {
                        var user = dao.findById(id);
                        System.out.printf("Usuário com id %s%n", id);
                        System.out.println(user);
                    } catch (UserNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    finally
                    {
                        System.out.println("===============");
                    }
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados:");
                    System.out.println("------------------------");
                    users.forEach(user -> System.out.println(user));
                    System.out.println("------------------------");
                }
                case EXIT -> System.exit(0);
            }

        }
    }

        private static long requestId()
        {
            System.out.println("Informe o identificador do usuário: ");
            return scanner.nextLong();
        }
        private static UserModel requestToSave()
        {
            System.out.println("Informe o nome do usuário: ");
            var name = scanner.next();
             System.out.println("Informe o e-mail do usuário: ");
             var email = scanner.next();
              System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy) ");
              var birthdayString = scanner.next();
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              var birthday = LocalDate.parse(birthdayString, formatter);
              var user = new UserModel(0,name,email,birthday);
              return validateInputs(0, name, email , birthday);
              
        }
        private static UserModel validateInputs(final long id, final String name, final String email, LocalDate birthday)
        {
            var user = new UserModel(0,name,email,birthday);
            verifyModel(user);
            return user;
        }
        private static UserModel requestToUpdate()
        {
            System.out.println("Informe o nome do usuário: ");
            var name = scanner.next();
             System.out.println("Informe o e-mail do usuário: ");
             var email = scanner.next();
              System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy) ");
              var birthdayString = scanner.next();
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              var birthday = LocalDate.parse(birthdayString, formatter);
              return validateInputs(0, name, email , birthday);
        }
    


}
