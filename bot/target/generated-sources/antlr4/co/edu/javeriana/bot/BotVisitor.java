// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#norte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorte(BotParser.NorteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#sur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSur(BotParser.SurContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#este}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEste(BotParser.EsteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#oeste}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOeste(BotParser.OesteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#recoger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoger(BotParser.RecogerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#soltar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoltar(BotParser.SoltarContext ctx);
}