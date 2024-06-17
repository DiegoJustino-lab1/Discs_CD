@RestController
@RequestMapping("/api/discos")
public class DiscoController {
    @Autowired
    private DiscoService discoService;
    
    @GetMapping
    public List<Disco> getAllDiscos() {
        return discoService.getAllDiscos();
    }
    
    @GetMapping("/{id}")
    public Disco getDiscoById(@PathVariable Long id) {
        return discoService.getDiscoById(id);
    }
    
    @PostMapping
    public Disco saveDisco(@RequestBody Disco disco) {
        return discoService.saveDisco(disco);
    }
    
    @PutMapping("/{id}")
    public Disco updateDisco(@PathVariable Long id, @RequestBody Disco disco) {
        Disco existingDisco = discoService.getDiscoById(id);
        existingDisco.setTitulo(disco.getTitulo());
        existingDisco.setArtista(disco.getArtista());
        existingDisco.setAnoLancamento(disco.getAnoLancamento());
        existingDisco.setPreco(disco.getPreco());
        return discoService.saveDisco(existingDisco);
    }
    
    @DeleteMapping("/{id}")
    public void deleteDisco(@PathVariable Long id) {
        discoService.deleteDisco(id);
    }
}