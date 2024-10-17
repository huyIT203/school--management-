package SchoolFM.Service;

import SchoolFM.Repository.ClassRepository;
import SchoolFM.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public Class saveClass(Class classEntity) {
        return classRepository.save(classEntity);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
