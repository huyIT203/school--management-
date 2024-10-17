package SchoolFM.Controller;

import SchoolFM.Service.SchoolService;
import SchoolFM.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Long id) {
        return schoolService.getSchoolById(id);
    }

    @PostMapping
    public School createSchool(@RequestBody School school) {
        return schoolService.saveSchool(school);
    }

    @DeleteMapping("/{id}")
    public void deleteSchool(@PathVariable Long id) {
        schoolService.deleteSchool(id);
    }
}
