/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.testsuite;

import antiphysika.minion.util.ResourceUtil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestResourceUtil
{
  private static final String INVALID_RESLOC = "foo:bar/baz@qux";

  @Test
  public void testValidResLoc ()
  {
    assertTrue(ResourceUtil.isValid("minecraft:overworld"));
  }

  @Test
  public void testInvalidResLoc ()
  {
    assertFalse(ResourceUtil.isValid(INVALID_RESLOC));
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :