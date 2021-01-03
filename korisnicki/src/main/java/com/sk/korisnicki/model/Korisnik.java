package com.sk.korisnicki.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(indexes = {@Index(columnList = "brPasosa", unique = true), @Index(columnList = "email", unique = true)})
public class Korisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String ime;
    @Column
    private String prezime;
    @Column
    private String email;
    @Column
    private String sifra;
    @Column
    private String brPasosa;
    @Column
    private int milje;
    @Column
    private String rank;
    @ManyToOne(optional = false)
    private Role role;
    @ManyToOne
    private Kartica kartica;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getBrPasosa() {
		return brPasosa;
	}
	public void setBrPasosa(String brPasosa) {
		this.brPasosa = brPasosa;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Kartica getKartica() {
		return kartica;
	}
	public void setKartica(Kartica kartica) {
		this.kartica = kartica;
	}
	public int getMilje() {
		return milje;
	}
	public void setMilje(int milje) {
		this.milje = milje;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
    
    
	
}