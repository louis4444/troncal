package com.proyecto.spring.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.proyecto.jpa.data.Ordenadores;
import com.proyecto.jpa.data.Clientes;
import com.proyecto.jpa.data.Administradores;

@Component
public class EmpresaService {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Autowired
	private PlatformTransactionManager transactionManager;

	public Object listarpornombre(String nomIntroduc) {
		
		return em.createQuery("Select a.contraseña from Administradores a WHERE a.nombre='" + nomIntroduc + "'")
				// .setParameter("nomIntroduc", nomIntroduc)
				.getSingleResult();

	}

	@SuppressWarnings("unchecked")
	public List<Ordenadores> listarordes() {

		return em.createQuery("from Ordenadores o").getResultList();

	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Clientes> listarcli() {

		return em.createQuery("from Clientes c").getResultList();

	}
		
	
	@SuppressWarnings("unchecked")
	public List<Administradores> listar() {

		return em.createQuery("from Administradores a").getResultList();

	}

	@Transactional
	public String verificarsession(String nomIntroduc, String conIntroduc) {		
		Object contralike = listarpornombre(nomIntroduc);						
		String contralike2 = contralike.toString();
		int afirm = contralike2.compareTo(conIntroduc);
		
		if (afirm == 0) {
			String verdad = "true";
			return verdad;
		} else {
			String falso = "retornando falso";
			return falso;
		}

	}

	@Transactional
	public void register(Clientes cli) {
		
			this.em.persist(cli);
//			this.em.persist(null);
		

}
	@Transactional
	public void modificar(Clientes clientes) throws Exception {
		try {
			em.merge(clientes);
//			em.merge(null);
		} catch (Exception e) {
			throw new Exception("Error al modificar");
		}
	}

	@Transactional
	public void eliminar(Clientes cli) throws Exception {
		
		try {
			Clientes c = em.find(Clientes.class, cli.getId());
			em.remove(c);
//			em.remove(null);
		} catch (Exception e) {
			throw new Exception("Error al eliminar");
		}
	}

	
	
	

}