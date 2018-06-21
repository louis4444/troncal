package com.proyecto.jsf.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.RequestScoped;

import com.proyecto.jpa.data.Clientes;
import com.proyecto.jpa.data.Administradores;
import com.proyecto.spring.service.EmpresaService;

@ManagedBean
@SessionScoped
public class BeanEmpresa {

	private List<Clientes> lstclientes;

	public List<Clientes> getLstclientes() {
		return lstclientes;
	}

	public void setLstclientes(List<Clientes> lstclientes) {
		this.lstclientes = lstclientes;
	}

	private List<Administradores> lstAdmin;

	public List<Administradores> getLstAdmin() {
		listar();
		return lstAdmin;
	}

	public void setLstAdmin(List<Administradores> lstAdmin) {
		this.lstAdmin = lstAdmin;
	}

	@ManagedProperty("#{empresaService}")
	private EmpresaService empresaService;

	private Clientes Clientes = new Clientes();

	public Clientes getClientes() {
		return Clientes;
	}

	public void setClientes(Clientes clientes) {
		Clientes = clientes;
	}

	private Administradores Administradores = new Administradores();

	public EmpresaService getEmpresaService() {
		return empresaService;
	}

	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	public Administradores getAdministradores() {
		return Administradores;
	}

	public void setAdministradores(Administradores administradores) {
		Administradores = administradores;
	}

	public void listarcli() {

		lstclientes = empresaService.listarcli();
	}

	public void listar() {

		lstAdmin = empresaService.listar();
	}

	public String iniciar() {
		try {
			String conIntroduc = Administradores.getContraseña();
			String nomIntroduc = Administradores.getNombre();
			String Valida = empresaService.verificarsession(nomIntroduc, conIntroduc);
			System.out.println(Valida);
			if (Valida == "true") {
				return "Correcto";
			} else {

				return "Error";
			}
		} catch (Exception e) {

		}
		return "Error";
	}

	public String register() {

		empresaService.register(Clientes);
		Clientes = new Clientes();

		return "";
	}

	public String leer(Clientes cli) {
		this.Clientes = cli;
		return "Editar";
	}

	public String cerrarSesion() {
			Clientes = new Clientes();
			return "index?faces-redirect=true";
		}

	public String modificar() {
		try {
			empresaService.modificar(Clientes);
			listarcli();
			Clientes = new Clientes();
			return "home?faces-redirect=true";

		} catch (Exception e) {
			Clientes = new Clientes();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error al modificar"));
			return "index";
		}
	}

	public boolean sesiontrue() {
		return true;
	}

	public String cancelar() {
		Administradores = new Administradores();
		return "home?faces-redirect=true";
	}
	public void eliminar( Clientes cli) {
		try {
			empresaService.eliminar(cli);
			listarcli();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage("Error al eliminar"));
		}
	}	

	public String iraPcsauto() {
		
		return "pcsauto?faces-redirect=true";
		
		
	}


}
