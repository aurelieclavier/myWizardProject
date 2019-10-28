package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Dumbledore")
public class Dumbledore implements WizardInterface {
	
	private Outfit myOutfit;
	
	@Autowired
	public Dumbledore(Outfit myOutfit) {
		this.myOutfit = myOutfit;
	}

	@Override
	public String giveAdvice() {
		return "Give advice Dumbledore";
	}

	@Override
	public String changeDress() {
		return this.myOutfit.change();
	}

}
