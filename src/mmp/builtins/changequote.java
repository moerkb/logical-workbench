/** --------------------------------------------------------------------------
 * Implementation of builtin 'changequote'
 * 
 * Copyright (c) 2008
 * by Fachhochschule Gießen-Friedberg University of Applied Sciences.
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
 * $Id: changequote.java 359 2008-07-11 02:25:14Z brenz $
 * --------------------------------------------------------------------------
 */
package mmp.builtins;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import mmp.engine.EngineContext;
import mmp.engine.Macro;
import mmp.engine.SyntaxErrorException;
import mmp.util.CharType;

/**
 * <h3>
 * changequote( [start] [, end] )
 * </h3>
 * <h5>
 * Change quote delimiters.
 * </h5>
 * <br/>Implemented by changequote().
 * 
 * @author Burkhardt Renz
 */
public class changequote extends Macro {
	
	private static Logger logger =  Logger.getLogger( changequote.class.getName() );
	
	public changequote() {
		super( Style.DOES_NOT_NEED_PARENTHESIS );
	}
	
	@Override
  public String call( List<String> macArgs, EngineContext engineContext )
      throws IOException, SyntaxErrorException {
  	
		int size = macArgs.size(); 
		String macroName = macArgs.get( 0 );
		
  	logger.fine( String.format( MMPTRACE_CALL, 
  			macroName, engineContext.getRecursionLevel(), macArgs.toString()) );
  	
  	// if changequote has no arguments, the default quotes are set
		if ( size == 1 ) {
			engineContext.getSettings().setDefaultQuote();
			return "";
		}
		
		String newBegQuote = macArgs.get( 1 );
		String newEndQuote = (size > 2) ? macArgs.get(2) : "'";
		if ( newEndQuote.isEmpty() ) {
			newEndQuote = "'";
		}
		
		// check precondition on delimiters
		if ( !CharType.isDelimiter(newBegQuote) || !CharType.isDelimiter(newEndQuote) ) {
			throw new SyntaxErrorException( 1003,
					String.format("delimiter of '%s' must not begin with a letter, a digit, " +
							"'_', '(', ',', ')'" , macroName) );
		}
		engineContext.getSettings().changeQuote( newBegQuote, newEndQuote );
		
		return "";
  }

}
