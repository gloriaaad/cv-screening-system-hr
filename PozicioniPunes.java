@Entity
public class PozicioniPunes {

    @Id
    @GeneratedValue
    private Long pozicionId;

    private String titullPozicioni;

    @Column(length = 3000)
    private String pershkrim;

    private String departament;

    private LocalDate dataHapjes;
    private LocalDate afatAplikimi;

    @Column(length = 2000)
    private String kerkesat;

    @Enumerated(EnumType.STRING)
    private StatusPozicioni status;

    @ManyToOne
    @JoinColumn(name = "krijuar_nga")
    private Perdoruesi krijuarNga;
}
