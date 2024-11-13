import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "John", "Doe", 25, "USA"),
                new User(2, "Jane", "Smith", 30, "Canada"),
                new User(3, "Alice", "Johnson", 22, "USA"),
                new User(4, "Bob", "Brown", 35, "UK"),
                new User(5, "Charlie", "Davis", 40, "Canada")
        );

        UserService userService = new UserService();

        userService.printUsersSortedByLastName(users);

        System.out.println();

        userService.printUsersSortedByAge(users);

        System.out.println();

        System.out.println("Все пользователи старше 7 лет: " + userService.allUsersAgeGreaterThanSeven(users));

        System.out.println();

        System.out.println("Средний возраст: " + userService.calculateAverageAge(users));

        System.out.println();

        System.out.println("Количество разных стран: " + userService.countDistinctCountries(users));
    }
}