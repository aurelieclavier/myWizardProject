package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("Gandalf")
public class Gandalf implements WizardInterface {
	
	private Outfit myOutfit;
	
	public Gandalf(Outfit myOutfit) {
		this.myOutfit = myOutfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Give advice Gandalf";
	}

	@Override
	public String changeDress() {
		return this.myOutfit.change();
	}

}
