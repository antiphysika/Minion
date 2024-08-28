/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.testsuite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import antiphysika.minion.data.CompactUuid;
import java.util.UUID;

public class TestCompactUuid
{
  private final String TEST_UUID = "25e99fa3-a01a-4734-9a8f-2407912bf961";
  @Test
  public void testFromUUID ()
  {
    UUID uuid = UUID.fromString(TEST_UUID);
    CompactUuid compUuid = CompactUuid.fromUUID(uuid);
    assertTrue(TEST_UUID.equals(compUuid.toUUID().toString()));
  }

  @Test
  public void testHighLowBits ()
  {
    UUID uuid = UUID.fromString(TEST_UUID);
    CompactUuid compUuid = CompactUuid.fromUUID(uuid);
    assertTrue(compUuid.getLowBits() == uuid.getMostSignificantBits());
    assertTrue(compUuid.getHighBits() == uuid.getLeastSignificantBits());
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :