@Entity
public class Kandidati {
 // Identifikues unik i kandidatit, gjenerohet automatikisht nga sistemi
    @Id
    @GeneratedValue
    private Long kandidatId;
// Marrëdhënie One-to-One:
// Çdo kandidat lidhet me një përdorues të sistemit (account login)
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

// Aftësitë kryesore të kandidatit, deri në 2000 karaktere
    @Column(length = 2000)
    private String aftesiKyce;
}
