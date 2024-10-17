package SchoolFM.Controller;

import SchoolFM.Service.UserEventService;
import SchoolFM.entity.UserEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-events")
public class UserEventController {
    @Autowired
    private UserEventService userEventService;

    @GetMapping
    public List<UserEvent> getAllUserEvents() {
        return userEventService.getAllUserEvents();
    }

    @GetMapping("/{id}")
    public UserEvent getUserEventById(@PathVariable Long id) {
        return userEventService.getUserEventById(id);
    }

    @PostMapping
    public UserEvent createUserEvent(@RequestBody UserEvent userEvent) {
        return userEventService.saveUserEvent(userEvent);
    }

    @DeleteMapping("/{id}")
    public void deleteUserEvent(@PathVariable Long id) {
        userEventService.deleteUserEvent(id);
    }
}
