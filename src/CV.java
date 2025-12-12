@Entity
public class CV {

    @Id
    @GeneratedValue
    private Long cvId;

    @ManyToOne
    @JoinColumn(name = "kandidat_id")
    private Kandidati kandidati;

    private String emerSkedari;
    private String format;
    private double madhesia;
    private LocalDate dataNgarkimit;
    private String version;
    private float pikePerputhje;
}
