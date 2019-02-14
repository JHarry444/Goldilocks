package main;

public class Place {
	private Porridge porridge;
	private Chair chair;
	private int placeNumber;

	public Place(Porridge porridge, Chair chair, int placeNumber) {
		super();
		this.porridge = porridge;
		this.chair = chair;
		this.placeNumber = placeNumber;
	}

	public Porridge getPorridge() {
		return porridge;
	}

	public void setPorridge(Porridge porridge) {
		this.porridge = porridge;
	}

	public Chair getChair() {
		return chair;
	}

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	public int getPlaceNumber() {
		return placeNumber;
	}

	public void setPlaceNumber(int placeNumber) {
		this.placeNumber = placeNumber;
	}

	public boolean isOK(Goldilocks g) {
		return chair.getMaxWeight() > g.getWeight() && porridge.getTemp() < g.getMaxTemp();
	}

}
