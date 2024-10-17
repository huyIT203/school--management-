package SchoolFM.Service;

import SchoolFM.Repository.UserEventRepository;
import SchoolFM.entity.UserEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEventService {
    @Autowired
    private UserEventRepository userEventRepository;

    public List<UserEvent> getAllUserEvents() {
        return userEventRepository.findAll();
    }

    public UserEvent getUserEventById(Long id) {
        return userEventRepository.findById(id).orElse(null);
    }

    public UserEvent saveUserEvent(UserEvent userEvent) {
        return userEventRepository.save(userEvent);
    }

    public void deleteUserEvent(Long id) {
        userEventRepository.deleteById(id);
    }
}
