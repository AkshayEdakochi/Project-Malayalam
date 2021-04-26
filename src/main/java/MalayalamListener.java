// Generated from Malayalam.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MalayalamParser}.
 */
public interface MalayalamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MalayalamParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MalayalamParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MalayalamParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MalayalamParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MalayalamParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MalayalamParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MalayalamParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MalayalamParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MalayalamParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MalayalamParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#aanenkilStatement}.
	 * @param ctx the parse tree
	 */
	void enterAanenkilStatement(MalayalamParser.AanenkilStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#aanenkilStatement}.
	 * @param ctx the parse tree
	 */
	void exitAanenkilStatement(MalayalamParser.AanenkilStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#aayirikkumbolStatement}.
	 * @param ctx the parse tree
	 */
	void enterAayirikkumbolStatement(MalayalamParser.AayirikkumbolStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#aayirikkumbolStatement}.
	 * @param ctx the parse tree
	 */
	void exitAayirikkumbolStatement(MalayalamParser.AayirikkumbolStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#pathikkukaStatement}.
	 * @param ctx the parse tree
	 */
	void enterPathikkukaStatement(MalayalamParser.PathikkukaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#pathikkukaStatement}.
	 * @param ctx the parse tree
	 */
	void exitPathikkukaStatement(MalayalamParser.PathikkukaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#sweekarikkukaStatement}.
	 * @param ctx the parse tree
	 */
	void enterSweekarikkukaStatement(MalayalamParser.SweekarikkukaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#sweekarikkukaStatement}.
	 * @param ctx the parse tree
	 */
	void exitSweekarikkukaStatement(MalayalamParser.SweekarikkukaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MalayalamParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MalayalamParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(MalayalamParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(MalayalamParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#conditionalOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpr(MalayalamParser.ConditionalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#conditionalOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpr(MalayalamParser.ConditionalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#conditionalAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpr(MalayalamParser.ConditionalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#conditionalAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpr(MalayalamParser.ConditionalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#inclusiveOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpr(MalayalamParser.InclusiveOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#inclusiveOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpr(MalayalamParser.InclusiveOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#exclusiveOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpr(MalayalamParser.ExclusiveOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#exclusiveOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpr(MalayalamParser.ExclusiveOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MalayalamParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MalayalamParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MalayalamParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MalayalamParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MalayalamParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MalayalamParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(MalayalamParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(MalayalamParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(MalayalamParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(MalayalamParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(MalayalamParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(MalayalamParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MalayalamParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MalayalamParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(MalayalamParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(MalayalamParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(MalayalamParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(MalayalamParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#unaryExprNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExprNotPlusMinus(MalayalamParser.UnaryExprNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#unaryExprNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExprNotPlusMinus(MalayalamParser.UnaryExprNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(MalayalamParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(MalayalamParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(MalayalamParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(MalayalamParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(MalayalamParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(MalayalamParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(MalayalamParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(MalayalamParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(MalayalamParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(MalayalamParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MalayalamParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(MalayalamParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MalayalamParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(MalayalamParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(MalayalamParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(MalayalamParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(MalayalamParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(MalayalamParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(MalayalamParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(MalayalamParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(MalayalamParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(MalayalamParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(MalayalamParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(MalayalamParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(MalayalamParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MalayalamParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(MalayalamParser.NilAtomContext ctx);
}