// Generated from be\u005Cunamur\info\b314\compiler\PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#programmemonde}.
	 * @param ctx the parse tree
	 */
	void enterProgrammemonde(PlayPlusParser.ProgrammemondeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programmemonde}.
	 * @param ctx the parse tree
	 */
	void exitProgrammemonde(PlayPlusParser.ProgrammemondeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#programmestrat}.
	 * @param ctx the parse tree
	 */
	void enterProgrammestrat(PlayPlusParser.ProgrammestratContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programmestrat}.
	 * @param ctx the parse tree
	 */
	void exitProgrammestrat(PlayPlusParser.ProgrammestratContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideClauseWHEN}
	 * labeled alternative in {@link PlayPlusParser#clausewhen}.
	 * @param ctx the parse tree
	 */
	void enterInsideClauseWHEN(PlayPlusParser.InsideClauseWHENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideClauseWHEN}
	 * labeled alternative in {@link PlayPlusParser#clausewhen}.
	 * @param ctx the parse tree
	 */
	void exitInsideClauseWHEN(PlayPlusParser.InsideClauseWHENContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideClauseWHENCond}
	 * labeled alternative in {@link PlayPlusParser#clausewhencond}.
	 * @param ctx the parse tree
	 */
	void enterInsideClauseWHENCond(PlayPlusParser.InsideClauseWHENCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideClauseWHENCond}
	 * labeled alternative in {@link PlayPlusParser#clausewhencond}.
	 * @param ctx the parse tree
	 */
	void exitInsideClauseWHENCond(PlayPlusParser.InsideClauseWHENCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideClauseWHENIns}
	 * labeled alternative in {@link PlayPlusParser#clausewhenins}.
	 * @param ctx the parse tree
	 */
	void enterInsideClauseWHENIns(PlayPlusParser.InsideClauseWHENInsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideClauseWHENIns}
	 * labeled alternative in {@link PlayPlusParser#clausewhenins}.
	 * @param ctx the parse tree
	 */
	void exitInsideClauseWHENIns(PlayPlusParser.InsideClauseWHENInsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideClauseDefault}
	 * labeled alternative in {@link PlayPlusParser#clausedefault}.
	 * @param ctx the parse tree
	 */
	void enterInsideClauseDefault(PlayPlusParser.InsideClauseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideClauseDefault}
	 * labeled alternative in {@link PlayPlusParser#clausedefault}.
	 * @param ctx the parse tree
	 */
	void exitInsideClauseDefault(PlayPlusParser.InsideClauseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideEndProg}
	 * labeled alternative in {@link PlayPlusParser#endprog}.
	 * @param ctx the parse tree
	 */
	void enterInsideEndProg(PlayPlusParser.InsideEndProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideEndProg}
	 * labeled alternative in {@link PlayPlusParser#endprog}.
	 * @param ctx the parse tree
	 */
	void exitInsideEndProg(PlayPlusParser.InsideEndProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identification}
	 * labeled alternative in {@link PlayPlusParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterIdentification(PlayPlusParser.IdentificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identification}
	 * labeled alternative in {@link PlayPlusParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitIdentification(PlayPlusParser.IdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PlayPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PlayPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(PlayPlusParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(PlayPlusParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDEntiere}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDEntiere(PlayPlusParser.ExprDEntiereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDEntiere}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDEntiere(PlayPlusParser.ExprDEntiereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDGraalIs}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDGraalIs(PlayPlusParser.ExprDGraalIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDGraalIs}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDGraalIs(PlayPlusParser.ExprDGraalIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlusMinus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprPlusMinus(PlayPlusParser.ExprPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlusMinus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprPlusMinus(PlayPlusParser.ExprPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDNot}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDNot(PlayPlusParser.ExprDNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDNot}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDNot(PlayPlusParser.ExprDNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDVarDeclCro}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDVarDeclCro(PlayPlusParser.ExprDVarDeclCroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDVarDeclCro}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDVarDeclCro(PlayPlusParser.ExprDVarDeclCroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDTimes}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDTimes(PlayPlusParser.ExprDTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDTimes}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDTimes(PlayPlusParser.ExprDTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDExprG}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDExprG(PlayPlusParser.ExprDExprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDExprG}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDExprG(PlayPlusParser.ExprDExprGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDDivide}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDDivide(PlayPlusParser.ExprDDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDDivide}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDDivide(PlayPlusParser.ExprDDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDEqual}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDEqual(PlayPlusParser.ExprDEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDEqual}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDEqual(PlayPlusParser.ExprDEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDTrue}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDTrue(PlayPlusParser.ExprDTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDTrue}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDTrue(PlayPlusParser.ExprDTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDOr}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDOr(PlayPlusParser.ExprDOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDOr}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDOr(PlayPlusParser.ExprDOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDMinus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDMinus(PlayPlusParser.ExprDMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDMinus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDMinus(PlayPlusParser.ExprDMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDAnd}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDAnd(PlayPlusParser.ExprDAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDAnd}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDAnd(PlayPlusParser.ExprDAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDLPARPAR}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDLPARPAR(PlayPlusParser.ExprDLPARPARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDLPARPAR}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDLPARPAR(PlayPlusParser.ExprDLPARPARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDModulo}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDModulo(PlayPlusParser.ExprDModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDModulo}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDModulo(PlayPlusParser.ExprDModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDInf}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDInf(PlayPlusParser.ExprDInfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDInf}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDInf(PlayPlusParser.ExprDInfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDSup}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDSup(PlayPlusParser.ExprDSupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDSup}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDSup(PlayPlusParser.ExprDSupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDexprCase}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDexprCase(PlayPlusParser.ExprDexprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDexprCase}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDexprCase(PlayPlusParser.ExprDexprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDPlus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDPlus(PlayPlusParser.ExprDPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDPlus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDPlus(PlayPlusParser.ExprDPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDVarDecl}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDVarDecl(PlayPlusParser.ExprDVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDVarDecl}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDVarDecl(PlayPlusParser.ExprDVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDFalse}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDFalse(PlayPlusParser.ExprDFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDFalse}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDFalse(PlayPlusParser.ExprDFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDEnnemIs}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDEnnemIs(PlayPlusParser.ExprDEnnemIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDEnnemIs}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDEnnemIs(PlayPlusParser.ExprDEnnemIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDLPARExprDRPAR}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprDLPARExprDRPAR(PlayPlusParser.ExprDLPARExprDRPARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDLPARExprDRPAR}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprDLPARExprDRPAR(PlayPlusParser.ExprDLPARExprDRPARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGID}
	 * labeled alternative in {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprGID(PlayPlusParser.ExprGIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGID}
	 * labeled alternative in {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprGID(PlayPlusParser.ExprGIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGArray}
	 * labeled alternative in {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprGArray(PlayPlusParser.ExprGArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGArray}
	 * labeled alternative in {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprGArray(PlayPlusParser.ExprGArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntNumber}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntNumber(PlayPlusParser.ExprEntNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntNumber}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntNumber(PlayPlusParser.ExprEntNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntLatitude}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntLatitude(PlayPlusParser.ExprEntLatitudeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntLatitude}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntLatitude(PlayPlusParser.ExprEntLatitudeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntLongitude}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntLongitude(PlayPlusParser.ExprEntLongitudeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntLongitude}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntLongitude(PlayPlusParser.ExprEntLongitudeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntGridSize}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntGridSize(PlayPlusParser.ExprEntGridSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntGridSize}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntGridSize(PlayPlusParser.ExprEntGridSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntCount}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntCount(PlayPlusParser.ExprEntCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntCount}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntCount(PlayPlusParser.ExprEntCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEntLife}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEntLife(PlayPlusParser.ExprEntLifeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEntLife}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEntLife(PlayPlusParser.ExprEntLifeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseDirt}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseDirt(PlayPlusParser.ExprCaseDirtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseDirt}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseDirt(PlayPlusParser.ExprCaseDirtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseRock}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseRock(PlayPlusParser.ExprCaseRockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseRock}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseRock(PlayPlusParser.ExprCaseRockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseVines}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseVines(PlayPlusParser.ExprCaseVinesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseVines}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseVines(PlayPlusParser.ExprCaseVinesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseZombie}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseZombie(PlayPlusParser.ExprCaseZombieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseZombie}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseZombie(PlayPlusParser.ExprCaseZombieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCasePlayer}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCasePlayer(PlayPlusParser.ExprCasePlayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCasePlayer}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCasePlayer(PlayPlusParser.ExprCasePlayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseEnnemi}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseEnnemi(PlayPlusParser.ExprCaseEnnemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseEnnemi}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseEnnemi(PlayPlusParser.ExprCaseEnnemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseMap}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseMap(PlayPlusParser.ExprCaseMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseMap}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseMap(PlayPlusParser.ExprCaseMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseRadio}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseRadio(PlayPlusParser.ExprCaseRadioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseRadio}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseRadio(PlayPlusParser.ExprCaseRadioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseRadar}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseRadar(PlayPlusParser.ExprCaseRadarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseRadar}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseRadar(PlayPlusParser.ExprCaseRadarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseAmmo}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseAmmo(PlayPlusParser.ExprCaseAmmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseAmmo}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseAmmo(PlayPlusParser.ExprCaseAmmoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseFruits}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseFruits(PlayPlusParser.ExprCaseFruitsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseFruits}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseFruits(PlayPlusParser.ExprCaseFruitsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseSoda}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseSoda(PlayPlusParser.ExprCaseSodaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseSoda}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseSoda(PlayPlusParser.ExprCaseSodaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseGraal}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseGraal(PlayPlusParser.ExprCaseGraalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseGraal}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseGraal(PlayPlusParser.ExprCaseGraalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCaseNearby}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseNearby(PlayPlusParser.ExprCaseNearbyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCaseNearby}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseNearby(PlayPlusParser.ExprCaseNearbyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSkipInstr(PlayPlusParser.SkipInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSkipInstr(PlayPlusParser.SkipInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfThenInstr(PlayPlusParser.IfThenInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfThenInstr(PlayPlusParser.IfThenInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElseInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseInstr(PlayPlusParser.IfThenElseInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElseInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseInstr(PlayPlusParser.IfThenElseInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhileInstr(PlayPlusParser.WhileInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhileInstr(PlayPlusParser.WhileInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code computeInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterComputeInstr(PlayPlusParser.ComputeInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code computeInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitComputeInstr(PlayPlusParser.ComputeInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNextInstr(PlayPlusParser.NextInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNextInstr(PlayPlusParser.NextInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insideDoneWhile}
	 * labeled alternative in {@link PlayPlusParser#donewhile}.
	 * @param ctx the parse tree
	 */
	void enterInsideDoneWhile(PlayPlusParser.InsideDoneWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insideDoneWhile}
	 * labeled alternative in {@link PlayPlusParser#donewhile}.
	 * @param ctx the parse tree
	 */
	void exitInsideDoneWhile(PlayPlusParser.InsideDoneWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifcondblock}
	 * labeled alternative in {@link PlayPlusParser#condblock}.
	 * @param ctx the parse tree
	 */
	void enterIfcondblock(PlayPlusParser.IfcondblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifcondblock}
	 * labeled alternative in {@link PlayPlusParser#condblock}.
	 * @param ctx the parse tree
	 */
	void exitIfcondblock(PlayPlusParser.IfcondblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iftruecondblock}
	 * labeled alternative in {@link PlayPlusParser#truecondblock}.
	 * @param ctx the parse tree
	 */
	void enterIftruecondblock(PlayPlusParser.IftruecondblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iftruecondblock}
	 * labeled alternative in {@link PlayPlusParser#truecondblock}.
	 * @param ctx the parse tree
	 */
	void exitIftruecondblock(PlayPlusParser.IftruecondblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelsecondblock}
	 * labeled alternative in {@link PlayPlusParser#elsecondblock}.
	 * @param ctx the parse tree
	 */
	void enterIfelsecondblock(PlayPlusParser.IfelsecondblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelsecondblock}
	 * labeled alternative in {@link PlayPlusParser#elsecondblock}.
	 * @param ctx the parse tree
	 */
	void exitIfelsecondblock(PlayPlusParser.IfelsecondblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionMove}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionMove(PlayPlusParser.ActionMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionMove}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionMove(PlayPlusParser.ActionMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionShoot}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionShoot(PlayPlusParser.ActionShootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionShoot}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionShoot(PlayPlusParser.ActionShootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionUse}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionUse(PlayPlusParser.ActionUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionUse}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionUse(PlayPlusParser.ActionUseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionDoNothing}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionDoNothing(PlayPlusParser.ActionDoNothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionDoNothing}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionDoNothing(PlayPlusParser.ActionDoNothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fctdeclInstr}
	 * labeled alternative in {@link PlayPlusParser#fctdecl}.
	 * @param ctx the parse tree
	 */
	void enterFctdeclInstr(PlayPlusParser.FctdeclInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fctdeclInstr}
	 * labeled alternative in {@link PlayPlusParser#fctdecl}.
	 * @param ctx the parse tree
	 */
	void exitFctdeclInstr(PlayPlusParser.FctdeclInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fctdeclreturn}
	 * labeled alternative in {@link PlayPlusParser#fdeclreturn}.
	 * @param ctx the parse tree
	 */
	void enterFctdeclreturn(PlayPlusParser.FctdeclreturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fctdeclreturn}
	 * labeled alternative in {@link PlayPlusParser#fdeclreturn}.
	 * @param ctx the parse tree
	 */
	void exitFctdeclreturn(PlayPlusParser.FctdeclreturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importInstr}
	 * labeled alternative in {@link PlayPlusParser#impdecl}.
	 * @param ctx the parse tree
	 */
	void enterImportInstr(PlayPlusParser.ImportInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importInstr}
	 * labeled alternative in {@link PlayPlusParser#impdecl}.
	 * @param ctx the parse tree
	 */
	void exitImportInstr(PlayPlusParser.ImportInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#filedecl}.
	 * @param ctx the parse tree
	 */
	void enterFiledecl(PlayPlusParser.FiledeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#filedecl}.
	 * @param ctx the parse tree
	 */
	void exitFiledecl(PlayPlusParser.FiledeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(PlayPlusParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(PlayPlusParser.FilenameContext ctx);
}