grammar PlayPlus;

import PlayPlusWords;

root: programmemonde | programmestrat;

programmemonde: DECLARE AND RETAIN
           (vardecl POINTVIRGULE| fctdecl)*
           (instruction)*
           clausedefault;

programmestrat: DECLARE AND RETAIN
           impdecl? (vardecl POINTVIRGULE| fctdecl | impdecl)*
           WHEN YOUR TURN
           (clausewhen)*
           clausedefault;


clausewhen:
        WHEN clausewhencond
         ( DECLARE LOCAL (vardecl POINTVIRGULE)+)?
         DO clausewhenins DONE #insideClauseWHEN;

clausewhencond:
        exprD #insideClauseWHENCond;

clausewhenins:
        (instruction)+ #insideClauseWHENIns;

clausedefault: BY DEFAULT
                ( DECLARE LOCAL (vardecl POINTVIRGULE)+ )?
                DO ( instruction)+ endprog #insideClauseDefault;

endprog:
      DONE #insideEndProg;

vardecl: ID AS type #identification;
type:   SCALAR | array;
array: SCALAR LCRO ( NUMBER)+ ( COMMA (NUMBER)+ )? RCRO #arrayDeclaration;

exprD:
     exprEnt #exprDEntiere
    |(PLUS | MINUS) exprD #exprPlusMinus
    |NOT exprD #exprDNot
    |TRUE #exprDTrue
    |FALSE #exprDFalse
    |ENNEMI IS (NORTH | SOUTH | EAST | WEST) #exprDEnnemIs
    |GRAAL IS (NORTH | SOUTH | EAST | WEST) #exprDGraalIs
    |exprCase #exprDexprCase
    |ID #exprDVarDecl
    |ID LCRO exprD (COMMA exprD)? RCRO #exprDVarDeclCro
    |exprG #exprDExprG
    | ID LPAR (exprD (COMMA exprD)*)? RPAR #exprDLPARExprDRPAR
    | LPAR exprD RPAR #exprDLPARPAR
    |exprD TIMES exprD #exprDTimes
    |exprD DIVIDE exprD #exprDDivide
    |exprD MODULO exprD #exprDModulo
    |exprD PLUS exprD #exprDPlus
    |exprD MINUS exprD #exprDMinus
    |exprD EQUAL exprD #exprDEqual
    |exprD INF exprD #exprDInf
    |exprD SUP exprD #exprDSup
    |exprD AND exprD #exprDAnd
    |exprD OR exprD #exprDOr;

exprG : ID #exprGID
        | (ID LCRO exprD (COMMA exprD)? RCRO) #exprGArray;


exprEnt: NUMBER #exprEntNumber
        |LATITUDE #exprEntLatitude
        |LONGITUDE #exprEntLongitude
        |GRIDSIZE #exprEntGridSize
        |(MAP|RADIO|RADAR|AMMO|FRUITS|SODA) COUNT #exprEntCount
        |LIFE #exprEntLife;


exprCase: DIRT #exprCaseDirt
        |ROCK #exprCaseRock
        |VINES #exprCaseVines
        |ZOMBIE #exprCaseZombie
        |PLAYER #exprCasePlayer
        |ENNEMI #exprCaseEnnemi
        |MAP #exprCaseMap
        |RADIO #exprCaseRadio
        |RADAR #exprCaseRadar
        |AMMO #exprCaseAmmo
        |FRUITS #exprCaseFruits
        |SODA #exprCaseSoda
        |GRAAL #exprCaseGraal
        |NEARBY LCRO exprD COMMA exprD RCRO #exprCaseNearby;


instruction:
        SKIPCODE #skipInstr
        | IF condblock THEN truecondblock DONE #ifThenInstr
        | IF condblock THEN truecondblock ELSE elsecondblock DONE #ifThenElseInstr
        | WHILE exprD DO instruction+ donewhile #whileInstr
        | SET exprG TO exprD #affectInstr
        | COMPUTE exprD  #computeInstr
        | NEXT action #nextInstr;

donewhile:
        DONE #insideDoneWhile;

condblock:
        exprD #ifcondblock;

truecondblock:

        instruction+ #iftruecondblock;

elsecondblock:
        instruction+ #ifelsecondblock;


action:
       MOVE (NORTH | SOUTH | EAST | WEST) #actionMove
       | SHOOT (NORTH | SOUTH | EAST | WEST) #actionShoot
       | USE (MAP|RADIO| RADAR|FRUITS|SODA) #actionUse
       | DO NOTHING #actionDoNothing;

fctdecl: ID AS FUNCTION LPAR  (vardecl( COMMA vardecl)*)? RPAR DOUBLEPOINT (SCALAR|VOID)
    (DECLARE LOCAL (vardecl POINTVIRGULE)+)?
    DO(instruction)+ fdeclreturn DONE #fctdeclInstr;

fdeclreturn:
    RETURN(exprD|VOID)  #fctdeclreturn;

impdecl: IMPORT filedecl #importInstr;

filedecl: filename EXTWLD;
filename: ID;