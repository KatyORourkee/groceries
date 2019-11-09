package com.katy.groceries;

import com.katy.groceries.model.GroceryItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroceryItemTests {

    @Test
    public void defaultCtx_DoesNotSetIdOrName() {
        GroceryItem sut = new GroceryItem();

        assertNull(sut.getName(),
                "When a GroceryItem is instantiated with default ctx, name should be null");
        assertEquals(0, sut.getId(),
                "When a GroceryItem is instantiated with default ctx, id should be 0");
    }

    @Test
    public void argsCtx_SetsIdAndName() {
        long expectedId = 10;
        String expectedName = "Cat food";

        GroceryItem sut = new GroceryItem(expectedId, expectedName);

        assertEquals(expectedId, sut.getId(),
                "When passing ID into the ctx, the new GroceryItem instance should return that value as the ID");
        assertEquals(expectedName, sut.getName(),
                "When passing name into the ctx, the new GroceryItem instance should return that value as the name");
    }

    @Test
    public void equals_IsSymmetric() {
        long id = 1;
        String name = "Cat food";
        GroceryItem item1 = new GroceryItem(id, name);
        GroceryItem item2 = new GroceryItem(id, name);

        assertTrue(item1.equals(item2) && item2.equals(item1),
                "GroceryItem equals method is not properly symmetric. It considers the following two items not equal:\nItem 1: " +
                        item1.toString() + "\nItem 2: " +
                        item2.toString());
    }

    @Test
    public void equals_IsReflexive() {
        GroceryItem sut = new GroceryItem(1, "name");

        assertTrue(sut.equals(sut),
                "GroceryItem equals method is not properly reflexive because it does not consider itself equal to itself\n Object: " +
                        sut.toString());
    }

    @Test
    public void equals_IsTransitive() {
        long id = 1;
        String name = "Cat food";

        GroceryItem a = new GroceryItem(id, name);
        GroceryItem b = new GroceryItem(id, name);
        GroceryItem c = new GroceryItem(id, name);

        assertTrue(a.equals(b) && b.equals(c) && a.equals(c),
                "GroceryItem equals method is not properly transitive because a=b, b=c, a=c fails\n a: " +
                        a.toString() + "\nb: " +
                        b.toString() + "\nc: " +
                        c.toString());
    }

    @Test
    public void hashCode_IsSymmetric() {
        long id = 1;
        String name = "Cat food";
        GroceryItem item1 = new GroceryItem(id, name);
        GroceryItem item2 = new GroceryItem(id, name);

        assertEquals(item1.hashCode(), item2.hashCode(),
                "GroceryItem hashCode method is not properly symmetric. The hashcode for the following to items are not equal:\nItem 1: " +
                        item1.toString() + "Hash Code: " + item1.hashCode() + "\nItem 2: " +
                        item2.toString() + "Hash Code: " + item2.hashCode());
    }

    @Test
    public void hashCode_IsReflexive() {
        GroceryItem sut = new GroceryItem(1, "name");
        int hashCode1 = sut.hashCode();
        int hashCode2 = sut.hashCode();

        assertEquals(hashCode1, hashCode2,
                "GroceryItem hashCode method is not properly reflexive because it does not produce the same hash twice for one object. Object: " +
                        sut.toString() + "Hash Code 1: " + hashCode1 + ", Hash Code 2: " + hashCode2);
    }

    @Test
    public void hashCode_IsTransitive() {
        long id = 1;
        String name = "Cat food";

        GroceryItem a = new GroceryItem(id, name);
        GroceryItem b = new GroceryItem(id, name);
        GroceryItem c = new GroceryItem(id, name);

        assertTrue(a.hashCode() == b.hashCode() && b.hashCode() == c.hashCode() && a.hashCode() == c.hashCode(),
                "GroceryItem hashCode method is not properly transitive because a=b, b=c, a=c fails\n a: " +
                        a.toString()  + "Hash Code: " + a.hashCode() + "\nb: " +
                        b.toString() + "Hash Code: " + b.hashCode() +  "\nc: " +
                        c.toString() + "Hash Code: " + c.hashCode());
    }

    @Test
    public void toString_PrintsInJsonFormat() {
        String expected = "GroceryItem(id=1, name=toothpaste)";
        GroceryItem sut = new GroceryItem(1, "toothpaste");

        assertTrue(expected.equals(sut.toString()),
                "GroceryItem toString method should have printed the id and name in JSON format\nExpected: " +
                        expected + "\nActual: " +
                        sut.toString());
    }

    @Test
    public void toString_DefaultProperties() {
        String expected = "GroceryItem(id=0, name=null)";
        GroceryItem sut = new GroceryItem();

        assertTrue(expected.equals(sut.toString()),
                "GroceryItem toString method should have still printed JSON format with id of 0 and name as null in JSON format\nExpected: " +
                        expected + "\nActual: " +
                        sut.toString());
    }
}
