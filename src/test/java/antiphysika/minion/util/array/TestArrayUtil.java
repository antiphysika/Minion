package antiphysika.minion.util.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtil
{
  @Test
  public void testReverseArray ()
  {
    final String[] array = new String[]{"a", "b", "c"};
    final String[] revArray = (String[]) ArrayUtil.reverseArray(array);

    assertEquals(array[0], revArray[2]);
    assertEquals(array[1], revArray[1]);
    assertEquals(array[2], revArray[0]);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :