package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private Outfit myOutfit;
	
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
