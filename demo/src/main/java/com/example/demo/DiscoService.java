package main.java.com.example.demo;

@Service
public class DiscoService {
    @Autowired
    private DiscoRepository discoRepository;
    
    public List<Disco> getAllDiscos() {
        return discoRepository.findAll();
    }
    
    public Disco getDiscoById(Long id) {
        return discoRepository.findById(id).orElseThrow();
    }
    
    public Disco saveDisco(Disco disco) {
        return discoRepository.save(disco);
    }
    
    public void deleteDisco(Long id) {
        discoRepository.deleteById(id);
    }
}