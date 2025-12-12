@Entity
public class Raporti {
 
    @Id
    @GeneratedValue
    private Long raportId;
 
    @ManyToOne
    private Perdoruesi hr;
 
    private LocalDate dataGjenerimit;
    private String tipi;
 
    @Column(length = 3000)
    private String pershkrim;
 
    private String formati;
}
