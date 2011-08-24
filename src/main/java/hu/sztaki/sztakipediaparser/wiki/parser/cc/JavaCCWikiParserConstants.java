/* Generated By:JavaCC: Do not edit this line. JavaCCWikiParserConstants.java */
package hu.sztaki.sztakipediaparser.wiki.parser.cc;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface JavaCCWikiParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int TOC = 1;
  /** RegularExpression Id. */
  int NOTOC = 2;
  /** RegularExpression Id. */
  int FORCETOC = 3;
  /** RegularExpression Id. */
  int REFOPEN = 4;
  /** RegularExpression Id. */
  int REFCLOSE = 5;
  /** RegularExpression Id. */
  int TABLE_START = 6;
  /** RegularExpression Id. */
  int TABLE_END = 7;
  /** RegularExpression Id. */
  int TABLE_CAPTION = 8;
  /** RegularExpression Id. */
  int TABLE_ROW = 9;
  /** RegularExpression Id. */
  int TABLE_COL_HEADING = 10;
  /** RegularExpression Id. */
  int TABLE_ROW_HEADING = 11;
  /** RegularExpression Id. */
  int DOCURL = 12;
  /** RegularExpression Id. */
  int DCCURL = 13;
  /** RegularExpression Id. */
  int OBRACKET = 14;
  /** RegularExpression Id. */
  int DOBRACKET = 15;
  /** RegularExpression Id. */
  int CBRACKET = 16;
  /** RegularExpression Id. */
  int DCBRACKET = 17;
  /** RegularExpression Id. */
  int ITALIC = 18;
  /** RegularExpression Id. */
  int BOLD = 19;
  /** RegularExpression Id. */
  int BOLDITALIC = 20;
  /** RegularExpression Id. */
  int SECTION_HEADING = 21;
  /** RegularExpression Id. */
  int SUBSECTION_HEADING = 22;
  /** RegularExpression Id. */
  int SUB_SUBSECTION_HEADING = 23;
  /** RegularExpression Id. */
  int LIST = 24;
  /** RegularExpression Id. */
  int INDENT = 25;
  /** RegularExpression Id. */
  int HR = 26;
  /** RegularExpression Id. */
  int NEWLINE = 27;
  /** RegularExpression Id. */
  int PIPE = 28;
  /** RegularExpression Id. */
  int SPACE = 29;
  /** RegularExpression Id. */
  int NOTSPACE = 30;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"__TOC__\"",
    "\"__NOTOC__\"",
    "\"__FORCETOC__\"",
    "<REFOPEN>",
    "\"</ref>\"",
    "<TABLE_START>",
    "\"|}\"",
    "<TABLE_CAPTION>",
    "<TABLE_ROW>",
    "<TABLE_COL_HEADING>",
    "<TABLE_ROW_HEADING>",
    "\"{{\"",
    "\"}}\"",
    "\"[\"",
    "\"[[\"",
    "\"]\"",
    "\"]]\"",
    "\"\\\'\\\'\"",
    "\"\\\'\\\'\\\'\"",
    "\"\\\'\\\'\\\'\\\'\\\'\"",
    "\"==\"",
    "\"===\"",
    "\"====\"",
    "\"*\"",
    "\":\"",
    "\"----\"",
    "<NEWLINE>",
    "\"|\"",
    "\" \"",
    "<NOTSPACE>",
  };

}
