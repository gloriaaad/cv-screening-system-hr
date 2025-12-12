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

    public Long getPerdoruesId() {
        return perdoruesId;
    }
    
    public void setPerdoruesId(Long perdoruesId) {
        this.perdoruesId = perdoruesId;
    }
    
    public String getEmer() {
        return emer;
    }
    
    public void setEmer(String emer) {
        this.emer = emer;
    }
    
    public String getMbiemer() {
        return mbiemer;
    }
    
    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFjalekalim() {
        return fjalekalim;
    }
    
    public void setFjalekalim(String fjalekalim) {
        this.fjalekalim = fjalekalim;
    }
    
    public Role getRoli() {
        return roli;
    }
    
    public void setRoli(Role roli) {
        this.roli = roli;
    }
    
    public LocalDate getDataRegjistrimit() {
        return dataRegjistrimit;
    }
    
    public void setDataRegjistrimit(LocalDate dataRegjistrimit) {
        this.dataRegjistrimit = dataRegjistrimit;
    }
    
    public StatusPerdoruesi getStatus() {
        return status;
    }
    
    public void setStatus(StatusPerdoruesi status) {
        this.status = status;
    }
}
