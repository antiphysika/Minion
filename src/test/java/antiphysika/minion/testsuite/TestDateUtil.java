/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.testsuite;

import antiphysika.minion.util.DateTimeUtil;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

public class TestDateUtil
{
  private static final long TEST_UNIX_TIME = 1723695025L;
  private static final String TEST_INSTANT = "2024-08-15T04:10:25Z";

  @Test
  public void testUnixToInstant ()
  {
    final String instantStr = DateTimeUtil.unixTimeToInstant(TEST_UNIX_TIME).toString();
    assertEquals(TEST_INSTANT, instantStr);
  }

  @Test
  public void testInstantToUnix ()
  {
    final long unixTime = DateTimeUtil.instantToUnixTime(Instant.parse(TEST_INSTANT));
    assertEquals(TEST_UNIX_TIME, unixTime);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :