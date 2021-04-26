// Generated from Malayalam.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MalayalamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MalayalamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MalayalamParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MalayalamParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MalayalamParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MalayalamParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MalayalamParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#aanenkilStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAanenkilStatement(MalayalamParser.AanenkilStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#aayirikkumbolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAayirikkumbolStatement(MalayalamParser.AayirikkumbolStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#pathikkukaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathikkukaStatement(MalayalamParser.PathikkukaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#sweekarikkukaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSweekarikkukaStatement(MalayalamParser.SweekarikkukaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MalayalamParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(MalayalamParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#conditionalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpr(MalayalamParser.ConditionalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#conditionalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpr(MalayalamParser.ConditionalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#inclusiveOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpr(MalayalamParser.InclusiveOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#exclusiveOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpr(MalayalamParser.ExclusiveOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MalayalamParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MalayalamParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MalayalamParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(MalayalamParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MalayalamParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(MalayalamParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MalayalamParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(MalayalamParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(MalayalamParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#unaryExprNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExprNotPlusMinus(MalayalamParser.UnaryExprNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(MalayalamParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(MalayalamParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(MalayalamParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(MalayalamParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(MalayalamParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MalayalamParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(MalayalamParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(MalayalamParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(MalayalamParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(MalayalamParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(MalayalamParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MalayalamParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(MalayalamParser.NilAtomContext ctx);
}