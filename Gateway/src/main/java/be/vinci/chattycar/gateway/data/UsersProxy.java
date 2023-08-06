package be.vinci.chattycar.gateway.data;

import be.vinci.chattycar.gateway.models.NewUser;
import be.vinci.chattycar.gateway.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@FeignClient(name = "users")
public interface UsersProxy {
    @PostMapping("/users")
    ResponseEntity<User> createOne(@RequestBody NewUser newUser);

    @GetMapping("/users")
    User getOneByEmail(@RequestParam String email);

    @GetMapping("/users/{id}")
    User getOneById(@PathVariable int id);

    @PutMapping("/users/{id}")
    void updateOne(@PathVariable int id, @RequestBody User user);

    @DeleteMapping("/users/{id}")
    void deleteOne(@PathVariable int id);
}
