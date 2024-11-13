import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    // 1. Вывести всех пользователей, отсортированных по lastName
    public void printUsersSortedByLastName(List<User> users) {
        System.out.println("Пользователи, отсортированные по фамилии:");
        users.stream()
                .sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .forEach(System.out::println);
    }

    // 2. Вывести всех пользователей, отсортированных по age
    public void printUsersSortedByAge(List<User> users) {
        System.out.println("Пользователи, отсортированные по возрасту:");
        users.stream()
                .sorted((u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()))
                .forEach(System.out::println);
    }

    // 3. Проверить, что для всех пользователей age > 7
    public boolean allUsersAgeGreaterThanSeven(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 7);
    }

    // 4. Вычислить средний возраст всех пользователей
    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }

    // 5. Вывести количество разных стран проживания (country) среди заданных пользователей
    public long countDistinctCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }
}