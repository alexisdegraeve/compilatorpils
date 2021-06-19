// Generated from be\u005Cunamur\info\b314\compiler\PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#programmemonde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrammemonde(PlayPlusParser.ProgrammemondeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#programmestrat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrammestrat(PlayPlusParser.ProgrammestratContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideClauseWHEN}
	 * labeled alternative in {@link PlayPlusParser#clausewhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideClauseWHEN(PlayPlusParser.InsideClauseWHENContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideClauseWHENCond}
	 * labeled alternative in {@link PlayPlusParser#clausewhencond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideClauseWHENCond(PlayPlusParser.InsideClauseWHENCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideClauseWHENIns}
	 * labeled alternative in {@link PlayPlusParser#clausewhenins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideClauseWHENIns(PlayPlusParser.InsideClauseWHENInsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideClauseDefault}
	 * labeled alternative in {@link PlayPlusParser#clausedefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideClauseDefault(PlayPlusParser.InsideClauseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideEndProg}
	 * labeled alternative in {@link PlayPlusParser#endprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideEndProg(PlayPlusParser.InsideEndProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identification}
	 * labeled alternative in {@link PlayPlusParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentification(PlayPlusParser.IdentificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PlayPlusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(PlayPlusParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDEntiere}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDEntiere(PlayPlusParser.ExprDEntiereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDGraalIs}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDGraalIs(PlayPlusParser.ExprDGraalIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlusMinus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusMinus(PlayPlusParser.ExprPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDNot}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDNot(PlayPlusParser.ExprDNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDVarDeclCro}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDVarDeclCro(PlayPlusParser.ExprDVarDeclCroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDTimes}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDTimes(PlayPlusParser.ExprDTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDExprG}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDExprG(PlayPlusParser.ExprDExprGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDDivide}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDDivide(PlayPlusParser.ExprDDivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDEqual}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDEqual(PlayPlusParser.ExprDEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDTrue}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDTrue(PlayPlusParser.ExprDTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDOr}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDOr(PlayPlusParser.ExprDOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDMinus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDMinus(PlayPlusParser.ExprDMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDAnd}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDAnd(PlayPlusParser.ExprDAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDLPARPAR}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDLPARPAR(PlayPlusParser.ExprDLPARPARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDModulo}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDModulo(PlayPlusParser.ExprDModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDInf}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDInf(PlayPlusParser.ExprDInfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDSup}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDSup(PlayPlusParser.ExprDSupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDexprCase}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDexprCase(PlayPlusParser.ExprDexprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDPlus}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDPlus(PlayPlusParser.ExprDPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDVarDecl}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDVarDecl(PlayPlusParser.ExprDVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDFalse}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDFalse(PlayPlusParser.ExprDFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDEnnemIs}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDEnnemIs(PlayPlusParser.ExprDEnnemIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDLPARExprDRPAR}
	 * labeled alternative in {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDLPARExprDRPAR(PlayPlusParser.ExprDLPARExprDRPARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGID}
	 * labeled alternative in {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGID(PlayPlusParser.ExprGIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGArray}
	 * labeled alternative in {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGArray(PlayPlusParser.ExprGArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntNumber}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntNumber(PlayPlusParser.ExprEntNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntLatitude}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntLatitude(PlayPlusParser.ExprEntLatitudeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntLongitude}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntLongitude(PlayPlusParser.ExprEntLongitudeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntGridSize}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntGridSize(PlayPlusParser.ExprEntGridSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntCount}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntCount(PlayPlusParser.ExprEntCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEntLife}
	 * labeled alternative in {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEntLife(PlayPlusParser.ExprEntLifeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseDirt}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseDirt(PlayPlusParser.ExprCaseDirtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseRock}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseRock(PlayPlusParser.ExprCaseRockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseVines}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseVines(PlayPlusParser.ExprCaseVinesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseZombie}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseZombie(PlayPlusParser.ExprCaseZombieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCasePlayer}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCasePlayer(PlayPlusParser.ExprCasePlayerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseEnnemi}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseEnnemi(PlayPlusParser.ExprCaseEnnemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseMap}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseMap(PlayPlusParser.ExprCaseMapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseRadio}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseRadio(PlayPlusParser.ExprCaseRadioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseRadar}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseRadar(PlayPlusParser.ExprCaseRadarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseAmmo}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseAmmo(PlayPlusParser.ExprCaseAmmoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseFruits}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseFruits(PlayPlusParser.ExprCaseFruitsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseSoda}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseSoda(PlayPlusParser.ExprCaseSodaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseGraal}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseGraal(PlayPlusParser.ExprCaseGraalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCaseNearby}
	 * labeled alternative in {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseNearby(PlayPlusParser.ExprCaseNearbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipInstr(PlayPlusParser.SkipInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenInstr(PlayPlusParser.IfThenInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElseInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseInstr(PlayPlusParser.IfThenElseInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInstr(PlayPlusParser.WhileInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code computeInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeInstr(PlayPlusParser.ComputeInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextInstr(PlayPlusParser.NextInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insideDoneWhile}
	 * labeled alternative in {@link PlayPlusParser#donewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideDoneWhile(PlayPlusParser.InsideDoneWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifcondblock}
	 * labeled alternative in {@link PlayPlusParser#condblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcondblock(PlayPlusParser.IfcondblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iftruecondblock}
	 * labeled alternative in {@link PlayPlusParser#truecondblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIftruecondblock(PlayPlusParser.IftruecondblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelsecondblock}
	 * labeled alternative in {@link PlayPlusParser#elsecondblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelsecondblock(PlayPlusParser.IfelsecondblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionMove}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionMove(PlayPlusParser.ActionMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionShoot}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionShoot(PlayPlusParser.ActionShootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionUse}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionUse(PlayPlusParser.ActionUseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionDoNothing}
	 * labeled alternative in {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDoNothing(PlayPlusParser.ActionDoNothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fctdeclInstr}
	 * labeled alternative in {@link PlayPlusParser#fctdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctdeclInstr(PlayPlusParser.FctdeclInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fctdeclreturn}
	 * labeled alternative in {@link PlayPlusParser#fdeclreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctdeclreturn(PlayPlusParser.FctdeclreturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importInstr}
	 * labeled alternative in {@link PlayPlusParser#impdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportInstr(PlayPlusParser.ImportInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#filedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiledecl(PlayPlusParser.FiledeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(PlayPlusParser.FilenameContext ctx);
}