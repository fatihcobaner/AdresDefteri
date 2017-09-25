package com.ajanda;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity//veritabani ile yazilim arasinda iliþki kurmayý saglayan nesnelerdir.
public class Kisi implements Serializable {
	@Id //Hibernate mutlaka primary key alani istediginden id olusturuldu
	@GeneratedValue //her Entity icin otomatik primary key verilir.
	private Long id; //Primary key alanimiz
	private String ad;//Verileri dis ortamda olan aksakliklardan koruma amaci ile encapsulation yapildi.
	private String soyad;
	private String adres;
	private String email;
	
	//OneToMany kullanimi esnasinda hata olustugundan dolayi OneToOne iliskisi kullandim.
	@OneToOne
	private KisiTelefon kisiTelefon = new KisiTelefon();
	
	
	//baska classta tanimlanan private degiskenlerin kullanilmasini saglayan getter/setter metodlar olusturuldu.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public KisiTelefon getKisiTelefon() {
		return kisiTelefon;
	}

	public void setKisiTelefon(KisiTelefon kisiTelefon) {
		this.kisiTelefon = kisiTelefon;
	}
	

}
