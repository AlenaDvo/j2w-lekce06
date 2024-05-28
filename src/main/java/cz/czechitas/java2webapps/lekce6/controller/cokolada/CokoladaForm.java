package cz.czechitas.java2webapps.lekce6.controller.cokolada;


import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CokoladaForm {
    @NotNull
    private CokoladaEnum druh;

    @NotEmpty(message="Prosím vyplň jméno.")
    private String jmeno;

    @NotEmpty
    private String prijmeni;

    @NotEmpty
    private String email;

    @AssertTrue
    private boolean souhlas;

    public CokoladaEnum getDruh() {
        return druh;
    }

    public void setDruh(CokoladaEnum druh) {
        this.druh = druh;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSouhlas() {
        return souhlas;
    }

    public void setSouhlas(boolean souhlas) {
        this.souhlas = souhlas;
    }
}
