package com.w2.Pojo;

public class GlossEntry {
	
	private String id;
	private String sortas;
	private String GlossTerm;
	private String Acronym;
	private String Abbrev;
	private  GlossDef glossdef;
	
	public GlossEntry(String id, String sortas, String glossTerm, String acronym, String abbrev) {
		this.id = id;
		this.sortas = sortas;
		this.GlossTerm = glossTerm;
		this.Acronym = acronym;
		this.Abbrev = abbrev;
	}
	

	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSortas() {
		return sortas;
	}
	public void setSortas(String sortas) {
		this.sortas = sortas;
	}
	public String getGlossTerm() {
		return GlossTerm;
	}
	public void setGlossTerm(String glossTerm) {
		GlossTerm = glossTerm;
	}
	public String getAcronym() {
		return Acronym;
	}
	public void setAcronym(String acronym) {
		Acronym = acronym;
	}
	public String getAbbrev() {
		return Abbrev;
	}
	public void setAbbrev(String abbrev) {
		Abbrev = abbrev;
	}
	
	public GlossDef getGlossdef() {
		return glossdef;
	}

	public void setGlossdef(GlossDef glossdef) {
		this.glossdef = glossdef;
	}
}
