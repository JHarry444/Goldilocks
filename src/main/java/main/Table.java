package main;

import java.util.ArrayList;
import java.util.List;

public class Table {
	
	private List<Place> places = new ArrayList<>();
	
	public boolean addPlace(Place place) {
		return this.places.add(place);
	}
	
	public List<Place> getPlaces() {
		return new ArrayList<>(places);
	}

	public List<Integer> getOK(Goldilocks goldilocks) {
		List<Integer> ok = new ArrayList<>();
			for (Place place : this.places) {
				if (place.isOK(goldilocks)) {
					ok.add(place.getPlaceNumber());
				}
			}
		return ok;
	}

}
