@Entity
public class PozicioniPunes {
// Identifikues unik i gjeneruar automatikisht për çdo pozicion pune
    @Id
    @GeneratedValue
    private Long pozicionId;
 // Titulli i pozicionit të punës
    private String titullPozicioni;
 // Përshkrimi i detajuar i pozicionit (deri në 3000 karaktere)
    @Column(length = 3000)
    private String pershkrim;
// Departamenti ku i përket ky pozicion 
    private String departament;

    private LocalDate dataHapjes;
    private LocalDate afatAplikimi;
 // Lista/teksti i kërkesave specifike të aplikimit (deri në 2000 karaktere)
    @Column(length = 2000)
    private String kerkesat;
 // Statusi aktual i pozicionit
    @Enumerated(EnumType.STRING)
    private StatusPozicioni status;
// Pozicioni i punës krijohet nga një përdorues specifik (HR ose Admin)
    @ManyToOne
    @JoinColumn(name = "krijuar_nga")
    private Perdoruesi krijuarNga;
}
