@Entity
public class Aplikimi {
 // Identifikues unik i aplikimit, gjenerohet automatikisht
    @Id
    @GeneratedValue
    private Long aplikimId;
 // Kandidati që ka bërë aplikimin (shumë aplikime mund të bëhen nga i njëjti kandidat)
    @ManyToOne
    private Kandidati kandidati;
  // Pozicioni i punës për të cilin kandidati aplikon
    @ManyToOne
    private PozicioniPunes pozicioni;
 // CV-ja që kandidati ka përdorur për këtë aplikim
    @ManyToOne
    private CV cv;
  // Data kur është bërë aplikimi
  // Pikët totale që kandidati ka marrë nga vlerësimi i HR/rekrutuesve
    private LocalDate dataAplikimit;
    private float pikeTotale;
 // Statusi aktual i aplikimit
    @Enumerated(EnumType.STRING)
    private StatusAplikimi status;
 // Komente nga HR ose rekrutuesit (deri në 2000 karaktere)
    @Column(length = 2000)
    private String komenteHR;
}
