package antiphysika.minion.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class TestCompactUuid
{
  private final String TEST_UUID = "25e99fa3-a01a-4734-9a8f-2407912bf961";

  @Test
  public void testFromUUID ()
  {
    UUID uuid = UUID.fromString(TEST_UUID);
    CompactUUID compUuid = CompactUUID.fromUUID(uuid);
    assertEquals(TEST_UUID, compUuid.toUUID().toString());
  }

  @Test
  public void testHighLowBits ()
  {
    UUID uuid = UUID.fromString(TEST_UUID);
    CompactUUID compUuid = CompactUUID.fromUUID(uuid);
    assertEquals(compUuid.getLowBits(), uuid.getMostSignificantBits());
    assertEquals(compUuid.getHighBits(), uuid.getLeastSignificantBits());
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :