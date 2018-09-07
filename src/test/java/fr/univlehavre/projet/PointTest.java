package fr.univlehavre.projet;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PointTest {

    @Test
	@DisplayName("Default constructor sets (0,0) coordinates")
	void defaultConstructor() {
		Point p = new Point();
		assertEquals(0, p.getX(), "x should be 0");
		assertEquals(0, p.getY(), "y should be 0");
	}

	@ParameterizedTest(name = "Parametrized constructor should accept point ({0},{1})")
	@CsvSource({
        "0.0,	0.0",
        "-1.0,	2.3",
        "-49.1,	51.1",
	})	
	void parametrizedConstructor(double x, double y) {
			Point p = new Point(x, y);
			assertEquals(x, p.getX(), "x should be "+x);
			assertEquals(y, p.getY(), "y should be "+y);
    }

	@Test
	void setterFail() {
    	Point p = new Point();
		assertThrows(NumberFormatException.class, () -> p.setX(1.0/0.0),"x can't be NaN");
		assertThrows(NumberFormatException.class, () -> p.setY(1.0/0.0),"y can't be NaN");
		assertThrows(NumberFormatException.class, () -> p.setX(Double.POSITIVE_INFINITY),"x can't be infinity");
		assertThrows(NumberFormatException.class, () -> p.setY(Double.NEGATIVE_INFINITY),"y can't be infinity");

	}

	@ParameterizedTest(name = "euclidean distance between  ({0},{1})  and  ({2},{3}) should be {4}")
	@CsvSource({
			"0.0,	0.0,	3.0,	4.0,	5.0",
			"-1.0,	-4.0,	2.0,	0.0,	5.0",
			"0.0,	0.0,	5.0,	12.0,	13.0",
			"0.0,	0.0,	15.0,	112.0,	113.0",
	})
	void distance(double x1, double y1, double x2, double y2, double result) {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		assertEquals(result, p1.euclideanDistance(p2), "distance bewtween "+p1+" and "+p2+" should be "+result);

	}


}