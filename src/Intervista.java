@Entity
public class Intervista {
 
    @Id
    @GeneratedValue
    private Long intervisteId;
 
    @OneToOne
    private Aplikimi aplikimi;
 
    private LocalDate dataIntervistes;
    private String ora;
    private String vendi;
 
    @ManyToOne
    private Perdoruesi hrPergjegjes;
 
    private int vleresimHR;
 
    @Column(length = 2000)
    private String koment;
 
    private String rezultat;
}
