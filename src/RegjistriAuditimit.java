@Entity
public class RegjistriAuditimit {
 
    @Id
    @GeneratedValue
    private Long logId;
 
    @ManyToOne
    private Perdoruesi perdoruesi;
 
    private String entiteti;
    private String veprimi;
    private LocalDate dataVeprimit;
    private String oraVeprimit;
 
    @Column(length = 3000)
    private String pershkrimDetajuar;
}
