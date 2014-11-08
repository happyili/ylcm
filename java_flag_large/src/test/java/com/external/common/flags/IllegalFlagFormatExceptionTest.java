package com.external.common.flags;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Test;

import com.external.common.flags.Flag;
import com.external.common.flags.FlagException;
import com.external.common.flags.FlagInfo;
import com.external.common.flags.Flags;
import com.external.common.flags.IllegalFlagFormatException;
import com.google.common.collect.ImmutableMap;

/**
 * Tests for {@link IllegalFlagFormatException}
 *
 * @author kennyyu (Kenny Yu)
 */
public class IllegalFlagFormatExceptionTest {

  @SuppressWarnings("unused")
  @FlagInfo(help = "test illegal flag format", environment = "format")
  private static Flag<Map<String,Integer>> flagMap =
      Flags.valueOf(ImmutableMap.<String, Integer>of());

  @Test
  public void testIllegalFlagFormatException() {
    String[] args = {"--flagMap=true"};
    try {
      Flags.parseWithExceptions(args, "format");
      fail("did not throw IllegalFlagFormatException");
    } catch (IllegalFlagFormatException e) {
      assertTrue(true);
    } catch (FlagException e) {
      fail("threw unexpected exception: " + e);
    }
  }

}
