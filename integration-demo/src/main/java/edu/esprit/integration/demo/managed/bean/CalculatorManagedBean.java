package edu.esprit.integration.demo.managed.bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Name;


import edu.esprit.integration.demo.services.*;
@ManagedBean( value = "CalculatorBean")
@SessionScoped
public class CalculatorManagedBean {
	@javax.ejb.EJB
	private CalculatorService CalculatorService;

	public int clickoperation(int val1, String operation,  int val2) {
		if (operation == "+")
		{
		return CalculatorService.Add(val1, val2);
		}
		if (operation == "-")
		{
		return CalculatorService.Soustrct(val1, val2);
		}
		if (operation == "/")
		{
		return CalculatorService.div(val1, val2);
		}
		if (operation == "*")
		{
		return CalculatorService.multiplie(val1, val2);
		}
		else
		return 0 ;
	}

}
