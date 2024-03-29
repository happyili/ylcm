package com.external.common.flags;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.external.common.flags.FlagException;
import com.external.common.flags.Flags;
import com.external.common.flags.UnknownFlagNameException;

/**
 * Tests for {@link UnknownFlagNameException}
 *
 * @author kennyyu (Kenny Yu)
 */
public class UnknownFlagNameExceptionTest {

  @Test
  public void testUnknownFlagTypeExceptionTest() {
    String[] args = {"--unknownflag"};
    try {
      Flags.parseWithExceptions(args, "testing");
      fail("did not throw UnknownFlagNameException");
    } catch (UnknownFlagNameException e) {
      assertTrue(true);
    } catch (FlagException e) {
      fail("threw unexpected exception: " + e);
    }
  }

}
