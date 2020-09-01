package com.w2.Pojo;

import java.util.ArrayList;
import java.util.List;

public class GlossDef {
	
	private String para;
	private String glossSee;
	private List<String> GlossSeeAlso;
	public GlossDef(String para,String glossSee) {
		
		this.para = para;
		this.glossSee = glossSee;
		GlossSeeAlso = new ArrayList<String>();
	}

	public String getGlossSee() {
		return glossSee;
	}

	public void setGlossSee(String glossSee) {
		this.glossSee = glossSee;
	}

	

	public List<String> getGlossSeeAlso() {
		return GlossSeeAlso;
	}

	public void setGlossSeeAlso(List<String> glossSeeAlso) {
		GlossSeeAlso = glossSeeAlso;
	}

	
	
	public void addGlossSeeAlso(String GlossSeeAlso)
	{
		this.GlossSeeAlso.add(GlossSeeAlso);
		
	}
	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}
	

}
