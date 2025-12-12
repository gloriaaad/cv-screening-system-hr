@Entity

 //Klasa mbi entitetin e njoftimit
public class Njoftimi {
 
    @Id
    @GeneratedValue
    private Long njoftimId;
 
    @ManyToOne
    private Perdoruesi perdoruesi;
 
    private String lloji; // Email, Panel
 
    @Column(length = 2000)
    private String permbajtja;
 
    private LocalDate dataDergimit;
    private String statusLeximi;
}
