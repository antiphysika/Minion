package antiphysika.minion.util.random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRandomUtil
{
  @Test
  public void testRandomInt ()
  {
    final int rand = RandomUtil.randomInt(1, 5);
    assertTrue(rand > 0 && rand < 6);
  }

  @Test
  public void testRandomLong ()
  {
    final long rand = RandomUtil.randomLong(1, 5);
    assertTrue(rand > 0 && rand < 6);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :