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

import java.util.ArrayList;

/**
 * Represents a wiki template in the AST.
 * 
 * @author <a href="mailto:sztakipedia@sztaki.hu">Tibor Olah</a>, <a
 *         href="http://sztaki.hu">MTA SZTAKI</a>
 * @since 2011
 */
public class TemplateTag extends AbstractTag {
	/**
	 * Resolved template content without parameter substitution.
	 */
	private String content = "";

	/**
	 * Template name.
	 */
	private String name = "";

	/**
	 * True if the original wikitext of the template has newline characters.
	 */
	private boolean multiline = false;

	private int id = 0;

	/**
	 * Template parameters.
	 */
	private ArrayList<TemplateParam> parameters = new ArrayList<TemplateParam>();

	public TemplateTag() {
		super();
	}

	public TemplateTag(AbstractTag parent) {
		super(parent);
	}

	public TemplateTag(AbstractTag parent, boolean multiline) {
		super(parent);
		this.multiline = multiline;
	}

	@Override
	public void render(StringBuilder b) {
		// addBeginEndAttr();
		openTag(b);
		b.append("<div class=\"wiki-template-params\">");
		for (TemplateParam param : parameters) {
			param.render(b);
		}
		b.append("</div>");
		closeTag(b);
	}

	@Override
	protected void openTag(StringBuilder b) {
		b.append("<div onclick=\"edit_wiki_template(this)\" "
				+ "onmouseover=\"show_wiki_template(this)\"");
		renderAttributes(b);
		renderCssClasses(b);
		b.append(">");
		b.append("<span class=\"wiki-template-title\">" + name + "</span>");
	}

	@Override
	protected void closeTag(StringBuilder b) {
		b.append("</div>");
	}

	/**
	 * Adds a template parameter.
	 * 
	 * @param name
	 *            Name of the parameter.
	 * @param value
	 *            Value of the parameter.
	 */
	public void addParameter(String name, String value, boolean implicit) {
		if (name != null && !name.isEmpty() && value != null
				&& !value.isEmpty()) {
			TemplateParam param = new TemplateParam(squeeze(name),
					squeeze(value), implicit);
			parameters.add(param);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = squeeze(name);
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		if (content != null) {
			this.content = content;
		}
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	private String squeeze(String str) {
		return str.replaceAll("( |\\t)+", " ").trim();
	}
}
