package com.epam.geometry.repository.specification;

import com.epam.geometry.model.Figure;
import com.epam.geometry.model.Point2D;
import com.epam.geometry.model.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class FirstOrthantSpecificationTest {
    private static final Integer ID = 10;
    private static final Figure FIRST_QUADRANT_SQUARE = new Quadrilateral(
            ID,
            new Point2D(1, 2),
            new Point2D(3, 2),
            new Point2D(3, 1),
            new Point2D(1, 1));
    private static final Figure TEST_SQUARE = new Quadrilateral(
            ID,
            new Point2D(-2, 2),
            new Point2D(1, 2),
            new Point2D(1, -1),
            new Point2D(-2, -1));
    private final FigureSpecification specification = new FirstOrthantSpecification();

    @Test
    public void specifiedShouldReturnTrueWhenSquareInFirstQuadrant() {
        boolean result = specification.specified(FIRST_QUADRANT_SQUARE);
        Assert.assertTrue(result);
    }

    @Test
    public void specifiedShouldReturnFalseWhenSquareNotFullyInFirstQuadrant() {
        boolean result = specification.specified(TEST_SQUARE);
        Assert.assertFalse(result);
    }
}