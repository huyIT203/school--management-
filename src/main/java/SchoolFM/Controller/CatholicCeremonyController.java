package SchoolFM.Controller;

import SchoolFM.Service.CatholicCeremonyService;
import SchoolFM.entity.CatholicCeremony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catholic-ceremonies")
public class CatholicCeremonyController {
    @Autowired
    private CatholicCeremonyService catholicCeremonyService;

    @GetMapping
    public List<CatholicCeremony> getAllCatholicCeremonies() {
        return catholicCeremonyService.getAllCatholicCeremonies();
    }

    @GetMapping("/{id}")
    public CatholicCeremony getCatholicCeremonyById(@PathVariable Long id) {
        return catholicCeremonyService.getCatholicCeremonyById(id);
    }

    @PostMapping
    public CatholicCeremony createCatholicCeremony(@RequestBody CatholicCeremony catholicCeremony) {
        return catholicCeremonyService.saveCatholicCeremony(catholicCeremony);
    }

    @DeleteMapping("/{id}")
    public void deleteCatholicCeremony(@PathVariable Long id) {
        catholicCeremonyService.deleteCatholicCeremony(id);
    }
}
