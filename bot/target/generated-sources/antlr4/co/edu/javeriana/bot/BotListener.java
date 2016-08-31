// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#norte}.
	 * @param ctx the parse tree
	 */
	void enterNorte(BotParser.NorteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#norte}.
	 * @param ctx the parse tree
	 */
	void exitNorte(BotParser.NorteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#sur}.
	 * @param ctx the parse tree
	 */
	void enterSur(BotParser.SurContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#sur}.
	 * @param ctx the parse tree
	 */
	void exitSur(BotParser.SurContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#este}.
	 * @param ctx the parse tree
	 */
	void enterEste(BotParser.EsteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#este}.
	 * @param ctx the parse tree
	 */
	void exitEste(BotParser.EsteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#oeste}.
	 * @param ctx the parse tree
	 */
	void enterOeste(BotParser.OesteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#oeste}.
	 * @param ctx the parse tree
	 */
	void exitOeste(BotParser.OesteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#recoger}.
	 * @param ctx the parse tree
	 */
	void enterRecoger(BotParser.RecogerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#recoger}.
	 * @param ctx the parse tree
	 */
	void exitRecoger(BotParser.RecogerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#soltar}.
	 * @param ctx the parse tree
	 */
	void enterSoltar(BotParser.SoltarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#soltar}.
	 * @param ctx the parse tree
	 */
	void exitSoltar(BotParser.SoltarContext ctx);
}