package SchoolFM.Controller;


import SchoolFM.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("title", "Dashboard");
        return "dashboard";
    }

    @GetMapping("/class")
    public String showClassPage(Model model) {
        model.addAttribute("title", "Class Management");
        return "class";
    }

}
