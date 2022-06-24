package com.bhagavan.interview.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhagavan.interview.Injections.AxisBank;
import com.bhagavan.interview.Injections.IciciBank;


@RestController
public class ControllerClass {
	@Autowired
	IciciBank classiciciBank;  // This is called field level injection.
	AxisBank axisbank;
	IciciBank constructorInjection; 
	IciciBank setterInjection;
	
	AtomicInteger ai = new AtomicInteger();
	
	
	ControllerClass(IciciBank icici, AxisBank axisbank)  // This is called ConstructorBasedinjection
	{
		constructorInjection=icici;
		this.axisbank=axisbank;
	}
	
	@Autowired
	public void setterBasedInjectionIciciBank (IciciBank icici ) // a setter method to inject the dependency.
	{
		setterInjection=icici;
	}
	
	public IciciBank getIcici()         // a getter method to return spellChecker
	{
		return setterInjection;
	}
	
	
	@RequestMapping("/classlevel")
	public String  getClassLevel()
	{
		
		return classiciciBank.deposit();
	}
	
	@RequestMapping("/constructor")
	public String  getConstructorInkection()
	{
		return constructorInjection.deposit();
	} 
	
	@RequestMapping("/setter")
	public String getSetterInjection()
	{
		return setterInjection.deposit();
	}
	
	
	@RequestMapping("/bank")
	public String getBank(@RequestParam(value="name", required=false) String bankName)
	{
		return "bank name is"+bankName;
		
		
	}
	
	
	

}
