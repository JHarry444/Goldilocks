package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import main.BearNecessities;
import main.Chair;
import main.Goldilocks;
import main.Place;
import main.Porridge;
import main.Table;

public class GoldilocksTest {

	private static BearNecessities bn = new BearNecessities();

	@Before
	public void init() {
		bn.setTable(new Table());
		bn.setGoldilocks(new Goldilocks(50, 60));
	}

	@Test
	public void numPlaceZero() {
		assertEquals("Places isn't empty", 0, bn.output().size());
	}

	@Test
	public void testNotNull() {
		assertNotNull("Results array is null", bn.output());
	}

	@Test
	public void testNotEmpty() {
		bn.getTable().addPlace(new Place(new Porridge(2), new Chair(100), 1));
		assertEquals("Results array is empty", false, bn.output().isEmpty());
	}

}
