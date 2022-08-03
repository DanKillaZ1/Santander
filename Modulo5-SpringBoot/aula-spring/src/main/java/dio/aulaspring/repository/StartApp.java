package dio.aulaspring.repository;

import dio.aulaspring.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Daniel");
        user.setName("Dan");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }



    }
}
