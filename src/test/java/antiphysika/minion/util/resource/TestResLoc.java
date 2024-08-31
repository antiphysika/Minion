package antiphysika.minion.util.resource;

import net.minecraft.resources.ResourceLocation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestResLoc
{
  private static final String VALID_RESLOC = "foo:bar";
  private static final String INVALID_RESLOC = "foo:bar@baz";

  @Test
  public void testValidResLoc ()
  {
    assertTrue(ResLoc.isValid(VALID_RESLOC));
  }

  @Test
  public void testInvalidResLoc ()
  {
    assertFalse(ResLoc.isValid(INVALID_RESLOC));
  }

  @Test
  public void testDefault ()
  {
    ResourceLocation loc = ResLoc.withDefault("foo");
    assertEquals(loc.getNamespace(), "minecraft");
    assertEquals(loc.getPath(), "foo");
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :