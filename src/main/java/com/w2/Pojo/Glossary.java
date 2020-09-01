package com.w2.Pojo;

public class Glossary {
	
	public String  title;
	
	public Glossdiv gloss;
	
	
	public Glossary(String  title){
		this.title=title;
	}

	
	public Glossdiv getGloss() {
		return gloss;
	}

	public void setGloss(Glossdiv gloss) {
		this.gloss = gloss;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	


}
