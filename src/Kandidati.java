@Entity
public class Kandidati {

    @Id
    @GeneratedValue
    private Long kandidatId;

    @OneToOne
    @JoinColumn(name = "perdorues_id")
    private Perdoruesi perdoruesi;

    private LocalDate dataLindjes;
    private String gjinia;
    private String vendndodhja;
    private String numerTelefoni;
    private String arsimi;
    private String fushaStudimi;
    private int pervoja;
    private String gjuheHuaj;

    @Column(length = 2000)
    private String aftesiKyce;
}
