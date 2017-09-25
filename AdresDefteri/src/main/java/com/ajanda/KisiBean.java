package com.ajanda;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;

@ManagedBean//Beanlerin yonetimini saglar
@SessionScoped//Kullanici oturum actigi an bean create edilir
public class KisiBean {

	private Kisi kisi = new Kisi();

	//Veri kaydetme metodu olusturuldu
	public void kaydet() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(kisi.getKisiTelefon());
		em.persist(kisi);
		em.getTransaction().commit();

		kisi = new Kisi();
	}
	
	//Veri silme metodu olusturuldu
	public void sil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(kisi.getKisiTelefon());
		em.remove(kisi);
		em.getTransaction().commit();

		kisi = new Kisi();
	}

	//Veri duzenleme metodu olusturuldu
	public void duzenle() {

		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(kisi.getKisiTelefon());
		em.merge(kisi);
		em.getTransaction().commit();

		kisi = new Kisi();

	}
	
	//List olarak ad arama metodu olusturuldu
	public List<Object[]> getKisiAra() {
		EntityManager em = EntityUtil.getEntityManager();
		return em
				.createQuery(
						"select k, ka from Kisi k join k.kisiTelefon ka where k.ad like :degerAl")
				.setParameter("degerAl", kisi.getAd() + "%").getResultList();
	}

	//Verileri listeleme metodu olusturuldu
	public List<Kisi> getKisiListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from Kisi").getResultList();
	}

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

	
	
}
