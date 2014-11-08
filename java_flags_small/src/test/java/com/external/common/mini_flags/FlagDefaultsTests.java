package com.external.common.mini_flags;

import com.external.common.mini_flags.FlagDefaults;
import com.external.common.mini_flags.sample.Argv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlagDefaultsTests {
	@Test
	public void shouldSaveAndRestoreDefaultValues() throws Exception {

		String initialValue = Argv.stringFlag;

		FlagDefaults saved = new FlagDefaults("com.ajitgeorge.flags.sample").save();

		Argv.stringFlag += "purple toupee";

		saved.restore();
		assertEquals(initialValue, Argv.stringFlag);
	}
}
