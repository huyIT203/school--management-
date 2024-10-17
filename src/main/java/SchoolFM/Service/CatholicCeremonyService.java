package SchoolFM.Service;

import SchoolFM.Repository.CatholicCeremonyRepository;
import SchoolFM.entity.CatholicCeremony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatholicCeremonyService {
    @Autowired
    private CatholicCeremonyRepository catholicCeremonyRepository;

    public List<CatholicCeremony> getAllCatholicCeremonies() {
        return catholicCeremonyRepository.findAll();
    }

    public CatholicCeremony getCatholicCeremonyById(Long id) {
        return catholicCeremonyRepository.findById(id).orElse(null);
    }

    public CatholicCeremony saveCatholicCeremony(CatholicCeremony catholicCeremony) {
        return catholicCeremonyRepository.save(catholicCeremony);
    }

    public void deleteCatholicCeremony(Long id) {
        catholicCeremonyRepository.deleteById(id);
    }
}
