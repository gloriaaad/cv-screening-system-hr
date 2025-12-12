@Entity
public class Perdoruesi {

    @Id
    @GeneratedValue
    private Long perdoruesId;

    private String emer;
    private String mbiemer;

    @Column(unique = true)
    private String email;

    private String fjalekalim;

    @Enumerated(EnumType.STRING)
    private Role roli;

    private LocalDate dataRegjistrimit;

    @Enumerated(EnumType.STRING)
    private StatusPerdoruesi status;

    // getters & setters
}
