package org.example;

public class Kandidati {
    private String emri;
    private String email;
    private double pike;
    private String statusi;

    public Kandidati(String emri, String email) {
        this.emri = emri;
        this.email = email;
        this.pike = 0;
        this.statusi = "Ne shqyrtim";
    }

    public void llogaritPike(double pike) { this.pike = pike; }
    public void ndryshoStatus(String statusi) { this.statusi = statusi; }
    public double getPike() { return pike; }
    public String getStatusi() { return statusi; }
    public String getEmri() { return emri; }
    public String getEmail() { return email; }
}
