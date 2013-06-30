package com.kong.program.Innovation;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TMILikeFootball {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		SpaceCharacterHandler s = new SpaceCharacterHandler("  I like    football  ", " ");
		System.out.println(s.getOneSpaceResult());
	}
}
