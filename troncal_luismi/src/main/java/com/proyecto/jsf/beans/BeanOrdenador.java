package com.proyecto.jsf.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.RequestScoped;

import com.proyecto.jpa.data.Ordenadores;
import com.proyecto.spring.service.EmpresaService;

@ManagedBean
@SessionScoped
public class BeanOrdenador {
	
	private List<Ordenadores> lstOrdenadores;
	
	@ManagedProperty("#{empresaService}")
	private EmpresaService empresaService;

	public EmpresaService getEmpresaService() {
		return empresaService;
	}

	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	public List<Ordenadores> getLstOrdenadores() {
		listarordes();
		return lstOrdenadores;
	}

	public void setLstpcs(List<Ordenadores> lstOrdenadores) {
		
		this.lstOrdenadores = lstOrdenadores;
	}

	public void listarordes() {

		lstOrdenadores = empresaService.listarordes();
	}
	
	public String salirPcsauto() {
		
		return "home?faces-redirect=true";
		
		
	}
	
}
