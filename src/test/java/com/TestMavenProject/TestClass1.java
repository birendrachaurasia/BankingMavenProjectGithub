package com.TestMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 extends TestClass2 {

	@Test(groups = "sanity")
	public void test1()

	{
		System.out.println("test1");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = "sanity")
	public void test3() {
		System.out.println("test3");
	}

	@Test(groups = "smoke")
	public void test4() {
		String a = "Biren";
		String b = "biren";
		if (a.equals(b)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

	@Test
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test6() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test7() {
		System.out.println("test7");
	}
	
}
