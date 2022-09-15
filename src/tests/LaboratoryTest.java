import org.junit.Assert;
import org.junit.Test;

public class LaboratoryTest {

    @Test
    public void testCalculateValueOfAllUnits() {
        LabEquipmentUnit chair = new LabEquipmentUnit("Chair", "pcs.", 10, 15, "EUR", "Wooden chair");
        double expected = 150;
        double actual = chair.calculateValueOfAllUnits();
        Assert.assertEquals(expected, actual, 0.1);
    }
}
