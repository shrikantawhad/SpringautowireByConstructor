package com.ncs.beans;

public class TextEditor {
	   private SpellChecker spellChecker;
	   private String name;


	   public TextEditor( SpellChecker spellChecker, String name ) {
		   System.out.println("Inside two arg constructor");
	      this.spellChecker = spellChecker;
	      this.name = name;
	    
	   }
	   
	   public TextEditor( SpellChecker spellChecker) {
		   System.out.println("Inside one args constructor");
		      this.spellChecker = spellChecker;
		  
		    
		   }
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public String getName() {
	      return name;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}