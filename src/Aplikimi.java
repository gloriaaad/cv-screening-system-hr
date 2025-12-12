@Entity
public class Aplikimi {
 
    @Id
    @GeneratedValue
    private Long aplikimId;
 
    @ManyToOne
    private Kandidati kandidati;
 
    @ManyToOne
    private PozicioniPunes pozicioni;
 
    @ManyToOne
    private CV cv;
 
    private LocalDate dataAplikimit;
    private float pikeTotale;
 
    @Enumerated(EnumType.STRING)
    private StatusAplikimi status;
 
    @Column(length = 2000)
    private String komenteHR;
}
