package com.w2.Pojo;

public class Glossdiv {
	
	public String title;
	public GlossList glosslist;

	public Glossdiv(String title){
		this.title=title;
	}
	
	public GlossList getGlosslist() {
		return glosslist;
	}
	public void setGlosslist(GlossList glosslist) {
		this.glosslist = glosslist;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
