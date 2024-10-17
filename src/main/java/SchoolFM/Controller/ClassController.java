package SchoolFM.Controller;

import SchoolFM.Service.ClassService;
import SchoolFM.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public Class getClassById(@PathVariable Long id) {
        return classService.getClassById(id);
    }

    @PostMapping
    public Class createClass(@RequestBody Class classEntity) {
        return classService.saveClass(classEntity);
    }

    @PutMapping("/{id}")
    public Class updateClass(@PathVariable Long id, @RequestBody Class classEntity) {
        classEntity.setId(id);
        return classService.saveClass(classEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
    }
}
