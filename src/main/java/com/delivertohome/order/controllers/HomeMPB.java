package com.delivertohome.order.controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "homebean")
@RequestScoped
public class HomeMPB implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";

	public String doContinue() {
		return ("success");
	}

	public String doHome() {

		return ("home");
	}

}
