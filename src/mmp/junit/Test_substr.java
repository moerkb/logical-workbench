/** --------------------------------------------------------------------------
 * Test define
 * 
 * Copyright (c) 2008
 * by Fachhochschule Gie�en-Friedberg University of Applied Sciences.
 * 
 * mmp is free software; you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free 
 * Software Foundation; either version 2 of the License, or (at your option) 
 * any later version.
 *  
 * mmp is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for 
 * more details. 
 * 
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 * --------------------------------------------------------------------------
 * $Id: Test_substr.java 322 2008-06-30 10:41:57Z brenz $
 * --------------------------------------------------------------------------
 */
package mmp.junit;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import mmp.engine.Engine;
import mmp.engine.RuntimeErrorException;
import mmp.engine.SyntaxErrorException;

import org.junit.Test;

/**
 * @author Burkhardt Renz
 *
 */
public class Test_substr {

	@Test
	public final void test147substr() throws IOException, SyntaxErrorException, RuntimeErrorException {
		String input = new String(
				"substr(`gnus, gnats, and armadillos', `6')\n" +
				"substr(`gnus, gnats, and armadillos', `6', `5')\n" 
		);	
	
		String expectedOutput = new String(
				"gnats, and armadillos\n" +
				"gnats\n" 
		);		
		StringWriter output = new StringWriter();
		
		// run 
		Engine engine = new Engine( new StringReader(input), new PrintWriter(output) );
		engine.run();	
		
		System.out.println( output.getBuffer().toString() );
		// compare result
		assertTrue( "expected output", output.getBuffer().toString().equals(expectedOutput) );
	}

	
	@Test (expected=SyntaxErrorException.class)
	public final void test148substr1() throws IOException, SyntaxErrorException, RuntimeErrorException {
		String input = new String(
				"substr(`abc')\n"
		);	
	
		String expectedOutput = new String(
				"\n"
		);		
		StringWriter output = new StringWriter();
		
		// run 
		Engine engine = new Engine( new StringReader(input), new PrintWriter(output) );
		engine.run();	
		
		System.out.println( output.getBuffer().toString() );
		// compare result
		assertTrue( "expected output", output.getBuffer().toString().equals(expectedOutput) );
	}

	@Test (expected=SyntaxErrorException.class)
	public final void test148substr2() throws IOException, SyntaxErrorException, RuntimeErrorException {
		String input = new String(
				"substr(`abc',)\n"
		);	
	
		String expectedOutput = new String(
				"abc\n"
		);		
		StringWriter output = new StringWriter();
		
		// run 
		Engine engine = new Engine( new StringReader(input), new PrintWriter(output) );
		engine.run();	
		
		System.out.println( output.getBuffer().toString() );
		// compare result
		assertTrue( "expected output", output.getBuffer().toString().equals(expectedOutput) );
	}

}