/*
 * 
 */
package edu.towson.cis.cosc603.project2.monopoly;

import edu.towson.cis.cosc603.project2.monopoly.gui.GoCellInfoFormatter;
import edu.towson.cis.cosc603.project2.monopoly.gui.InfoFormatter;
import junit.framework.TestCase;

// TODO: Auto-generated Javadoc
/**
 * The Class CellInfoFormatterTest.
 */
public class CellInfoFormatterTest extends TestCase {
    
    /**
     * Test go cell test.
     */
    public void testGoCellTest() {
        GoCell cell = new GoCell();
        String goLabel = GoCellInfoFormatter.GO_CELL_LABEL;
        assertEquals(goLabel, InfoFormatter.cellInfo(cell));
    }
    
    /**
     * Test property cell text.
     */
    public void testPropertyCellText() {
        String propertyName = "Blue 1";
        String propertyColor = "blue";
        String ownerName = "Owner1";
        int numHouses = 2;
        int propertyValue = 120;
        String propertyLabel = "<html><b><font color='" +
				propertyColor +"'>" + propertyName + "</font></b><br>" +
				"$" + propertyValue +
				"<br>Owner: " + ownerName +
				"<br>* " + numHouses +
				"</html>";
        PropertyCell cell = new PropertyCell();
        cell.setName(propertyName);
        cell.setPrice(propertyValue);
        cell.setColorGroup(propertyColor);
        Player p = new Player();
        p.setName(ownerName);
        cell.setTheOwner(p);
        cell.setNumHouses(numHouses);
        assertEquals(propertyLabel, InfoFormatter.cellInfo(cell));
    }
}
