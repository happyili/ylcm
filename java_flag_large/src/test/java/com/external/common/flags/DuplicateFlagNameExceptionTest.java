package com.external.common.flags;

import static org.junit.Assert.*;

import org.junit.Test;

import com.external.common.flags.DuplicateFlagNameException;
import com.external.common.flags.Flag;
import com.external.common.flags.FlagException;
import com.external.common.flags.FlagInfo;
import com.external.common.flags.Flags;

/**
 * Tests for {@link DuplicateFlagNameException}
 *
 * @author kennyyu (Kenny Yu)
 */
public class DuplicateFlagNameExceptionTest {

  @SuppressWarnings("unused")
  @FlagInfo(
      help = "duplicate exception",
      altName = "dup",
      environment = "duplicate")
  private static Flag<String> duplicate = Flags.valueOf("");

  @SuppressWarnings("unused")
  @FlagInfo(
      help = "duplicate exception",
      altName = "duplicate",
      environment = "duplicate")
  private static Flag<String> dup = Flags.valueOf("");

  @Test
  public void testDuplicateFlagnameException() {
    String[] args = {"--duplicate=foo"};
    try {
      Flags.parseWithExceptions(args, "duplicate");
    } catch (DuplicateFlagNameException e) {
      assertTrue(true);
    } catch (FlagException e) {
      fail("threw unexpected exception: " + e);
    }
  }

}
