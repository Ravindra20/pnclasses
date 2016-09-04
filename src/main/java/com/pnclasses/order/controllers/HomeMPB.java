package com.pnclasses.order.controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.stereotype.Controller;

@ManagedBean(name = "homebean")


public class HomeMPB implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";

	public String doContinue() {
		return ("personaldetailsbean");
	}

	public String doHome() {

		return ("home");
	}

}
