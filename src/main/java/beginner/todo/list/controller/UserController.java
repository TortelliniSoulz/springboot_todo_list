package beginner.todo.list.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import beginner.todo.list.model.User;
import beginner.todo.list.repository.UserRepository;



@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    @PostMapping
    public User addUser(@RequestBody User newUser) {
        if (newUser.getHabits().size() > 0)
            newUser.getHabits().forEach(habit -> habit.setUser(newUser));

        return userRepository.save(newUser);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestBody User user) {
        User usrDel = null;

        if (user.getId() != null)
            usrDel = userRepository.findById(user.getId()).get();
        else if (user.getUsername() != null)
            usrDel = userRepository.findByUsername(user.getUsername());
        else if (user.getEmail() != null)
            usrDel = userRepository.findByEmail(user.getEmail());

        if (usrDel == null)
            return ResponseEntity.notFound().build();

        userRepository.delete(usrDel);
        return ResponseEntity.noContent().build();
    }
    
}
