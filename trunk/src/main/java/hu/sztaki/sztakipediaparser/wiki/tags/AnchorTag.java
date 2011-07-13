/*
 * Sztakipedia parser - http://http://code.google.com/p/sztakipedia-parser
 *
 * Copyright (C) 2011 MTA SZTAKI 
 * Copyright (C) 2011 Tibor Olah
 *
 * Sztakipedia parser is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * Sztakipedia parser is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Sztakipedia parser; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */
package hu.sztaki.sztakipediaparser.wiki.tags;

/**
 * Represents an anchor in the AST.
 * 
 * @author <a href="mailto:sztakipedia@sztaki.hu">Tibor Olah</a>, <a
 *         href="http://sztaki.hu">MTA SZTAKI</a>
 * @since 2011
 */
public class AnchorTag extends AbstractTag {
	/**************/
	/*** Fields ***/
	/**************/

	/**
	 * True for plainlinks:
	 * http://en.wikipedia.org/wiki/Help:Wiki_markup#Links_and_URLs (External
	 * links section) e.g. <span class="plainlinks">
	 * [http://www.sysinternals.com/ntw2k/freeware/winobj.shtml WinObj] </span>
	 */
	private boolean plainlink = false;

	/********************/
	/*** Constructors ***/
	/********************/

	public AnchorTag() {
		super();
	}

	public AnchorTag(AbstractTag parent) {
		super(parent);
	}

	/***************/
	/*** Methods ***/
	/***************/

	@Override
	public void render(StringBuilder b) {
		// Handle plainlinks
		if (plainlink) {
			b.append("<span class=\"plainlinks\">");
		}

		// addBeginEndAttr();

		// Start tag
		openTag(b);

		// Render children
		renderChildren(b);

		// End tag
		closeTag(b);

		// Handle plainlinks
		if (plainlink) {
			b.append("</span>");
		}
	}

	@Override
	protected void openTag(StringBuilder b) {
		b.append("<a");

		// Add attributes
		renderAttributes(b);

		// Add CSS classes
		renderCssClasses(b);

		b.append(">");
	}

	@Override
	protected void closeTag(StringBuilder b) {
		b.append("</a>");
	}

	/***************************/
	/*** Getters and Setters ***/
	/***************************/

	public boolean isPlainlink() {
		return plainlink;
	}

	public void setPlainlink(boolean plainlink) {
		this.plainlink = plainlink;
	}
}