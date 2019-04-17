/*********************************
definition of ttcn-3 grammer.
Author: 	Johnson Chen
Created: 	2/24/2018
Email: 		johnsonloveyuki@163.com
*********************************/

grammar t3parser;
import t3lex;

// 1 ttcn3 module
ttcn3module 
	: MODULE moduleId LEFT_BRACE 
	moduleDefinitionsList? moduleControlPart? 
	RIGHT_BRACE withStatement? SEMICOLON?
	;

// 2
moduleId
	: IDENTIFIER languageSpec?
	;

// 3 FreeText to freetext by zhb
languageSpec
	: LANGUAGE freeText (COMMA freeText)*
	;

// 4 module definitions
moduleDefinitionsList
	: (moduleDefinition SEMICOLON?)+
	;

// 5
moduleDefinition
	: visibility? commonDef withStatement?
	| PUBLIC? groupDef withStatement?
	| PRIVATE? friendModuleDef withStatement?
	;

// 6 added by juncheng
commonDef
	: typeDef 
	| constDef 
	| templateDef 
	| moduleParDef 
	| functionDef 
	| signatureDef 
	| testcaseDef 
	| altstepDef 
	| importDef 
	| extFunctionDef 
	| extConstDef
	;

// 7
visibility
	: PUBLIC
	| FRIEND
	| PRIVATE
	;

// 8 typedef definition
typeDef 
	: TYPE typeDefBody 
	;

// 9
typeDefBody
	: structuredTypeDef
	| subTypeDef
	;

// 10
structuredTypeDef
	: recordDef
	| unionDef
	| setDef
	| recordOfDef
	| setOfDef
	| enumDef
	| portDef
	| componentDef
	;

// 11
recordDef 
	: RECORD structDefBody 
	;

// 12
structDefBody
	: IDENTIFIER LEFT_BRACE (structFieldDef (COMMA structFieldDef)*)? RIGHT_BRACE
	| ADDRESS LEFT_BRACE (structFieldDef (COMMA structFieldDef)*)? RIGHT_BRACE
	;

// 13
structFieldDef
	: type IDENTIFIER arrayDef? subTypeSpec? OPTIONAL?
	| nestedTypeDef IDENTIFIER arrayDef? subTypeSpec? OPTIONAL?
	;

// 14
nestedTypeDef
	: nestedRecordDef
	| nestedUnionDef
	| nestedSetDef
	| nestedRecordOfDef
	| nestedSetOfDef
	| nestedEnumDef
	;

// 15
nestedRecordDef
	: RECORD LEFT_BRACE (structFieldDef (COMMA structFieldDef)*)? RIGHT_BRACE
	;

// 16
nestedUnionDef
	: UNION LEFT_BRACE unionFieldDef (COMMA unionFieldDef)* RIGHT_BRACE
	;

// 17
nestedSetDef
	: SET LEFT_BRACE (structFieldDef (COMMA structFieldDef)*)? RIGHT_BRACE
	;

// 18
nestedRecordOfDef
	: RECORD stringLength? OF (type | nestedTypeDef)
	;

// 19
nestedSetOfDef
	: SET stringLength? OF (type | nestedTypeDef)
	;

// 20
nestedEnumDef 
	: ENUMERATED LEFT_BRACE enumerationList RIGHT_BRACE
	;

// 21
unionDef
	: UNION unionDefBody
	;

// 22
unionDefBody
	: IDENTIFIER LEFT_BRACE unionFieldDef (COMMA unionFieldDef)*
	| ADDRESS LEFT_BRACE unionFieldDef (COMMA unionFieldDef)*
	;

// 23
unionFieldDef
	: AT_DEFAULT? type IDENTIFIER arrayDef? subTypeSpec?
	| AT_DEFAULT? nestedTypeDef IDENTIFIER arrayDef? subTypeSpec?
	;

// 24
setDef
	: SET structDefBody
	;

// 25
recordOfDef
	: RECORD stringLength? OF structOfDefBody
	;

// 26
structOfDefBody
	: type (IDENTIFIER | ADDRESS) subTypeSpec?
	| nestedTypeDef (IDENTIFIER | ADDRESS) subTypeSpec?
	;

// 27
setOfDef
	: SET stringLength? OF structOfDefBody
	;

// 28
enumDef
	: ENUMERATED (IDENTIFIER | ADDRESS) LEFT_BRACE enumerationList RIGHT_BRACE
	;

// 29
enumerationList
	: enumeration (COMMA enumeration)*
	;

// 30
enumeration
	: IDENTIFIER (LEFT_PARENT integerValueOrRange (COMMA integerValueOrRange)* RIGHT_PARENT)?
	;

// 31
integerValueOrRange
	: INTEGERVALUE (TWODOT INTEGERVALUE)?
	;

// 32
subTypeDef
	: type (IDENTIFIER | ADDRESS) arrayDef? subTypeSpec?
	;

// 33
subTypeSpec 
	: allowedValuesSpec stringLength?
	| stringLength
	;

// 34
allowedValuesSpec
	: LEFT_PARENT templateOrRange (COMMA templateOrRange)* RIGHT_PARENT
	| LEFT_PARENT charStringMatch RIGHT_PARENT
	;

// 35
templateOrRange
	: bound TWODOT bound
	| templateBody
	| type
	;

// 36
stringLength 
	: LENGTH LEFT_PARENT singleExpression (TWODOT (singleExpression | INFINITY))? RIGHT_PARENT
	;

// 37
portDef 
	: PORT IDENTIFIER portDefAttribs  
	;

// 38
//portDefBody 
//	: IDENTIFIER portDefAttribs 
//	;

// 39
portDefAttribs
	: messageAttribs
	| procedureAttribs
	| mixedAttribs
	;

// 40
messageAttribs
	: MESSAGE LEFT_BRACE ((addressDecl | messageList | configParamDef) SEMICOLON?)+ RIGHT_BRACE
	;

// 41
configParamDef
	: MAP PARAM LEFT_PARENT formalValuePar (COMMA formalValuePar)* RIGHT_PARENT
	| UNMAP PARAM LEFT_PARENT formalValuePar (COMMA formalValuePar)* RIGHT_PARENT
	;

// 42
//mapParamDef
//	: MAP PARAM LEFT_PARENT formalValuePar (COMMA formalValuePar)* RIGHT_PARENT
//	;

// 43
//unmapParamDef
//	: UNMAP PARAM LEFT_PARENT formalValuePar (COMMA formalValuePar)* RIGHT_PARENT
//	;

// 44
addressDecl : ADDRESS type ;

// 45
messageList 
	: (IN | OUT | INOUT) allOrTypeList
	;

// 46
allOrTypeList
	: ALL
	| typeList
	;

// 47
typeList 
	: type (COMMA type)* 
	;

// 48
procedureAttribs
	: PROCEDURE LEFT_BRACE ((addressDecl | procedureList | configParamDef) SEMICOLON?)+ RIGHT_BRACE
	;

// 49
procedureList 
	: (IN | OUT | INOUT) allOrSignatureList
	;

// 50
allOrSignatureList
	: ALL
	| signatureList
	;

// 51
signatureList 
	: signature (COMMA signature)* 
	;

// 52
mixedAttribs
	: MIXED LEFT_BRACE ((addressDecl | mixedList | configParamDef) SEMICOLON?)+ RIGHT_BRACE
	;

// 53
mixedList
	: (IN | OUT | INOUT) procOrTypeList
	;

// 54
procOrTypeList 
	: ALL
	| procOrType (COMMA procOrType)*
	;

// 55
procOrType
	: signature
	| type
	;

// 56
componentDef
	: COMPONENT IDENTIFIER (EXTENDS componentType (COMMA componentType)*)? 
	  LEFT_BRACE componentDefList? RIGHT_BRACE
	;

// 57
componentType
	: (IDENTIFIER DOT)? IDENTIFIER
	;

// 58
componentDefList
	: (componentElementDef withStatement? SEMICOLON?)*
	;

// 59
componentElementDef
	: portInstance
	| varInstance
	| timerInstance
	| constDef
	| templateDef
	;

// 60
portInstance
	: PORT (IDENTIFIER DOT)? IDENTIFIER portElement (COMMA portElement)*
	;

// 61
portElement 
	: IDENTIFIER arrayDef? 
	;

// 62 constant definition
constDef :
	CONST type constList
	;

// 63
constList 
	: singleConstDef (COMMA singleConstDef)* 
	;

// 64
singleConstDef 
	: IDENTIFIER arrayDef? ASSIGNMENTCHAR constantExpression 
	;

// 65 template definitions
templateDef 
	: TEMPLATE templateRestriction? AT_FUZZY? baseTemplate (MODIFIES (IDENTIFIER DOT)? IDENTIFIER)? ASSIGNMENTCHAR templateBody
	;

// 66 此条文法已修改
// 当type为自定义类型时，无法分清到底是type还是signature
// 如果是type为内置类型，直接确定，无需再确定，当为extendedIdentifier时，需要第二次遍历确认
// 解决方案：在语法分析第二遍遍历时根据符号表进行判断到底是type还是signature
// 第一遍遍历时，templateDef同时保存type和signature，第二遍遍历时确定正确引用
baseTemplate
	: predefinedType IDENTIFIER (LEFT_PARENT templateOrValueFormalParList RIGHT_PARENT)?
	| extendedIdentifier extendedFieldReference? IDENTIFIER (LEFT_PARENT templateOrValueFormalParList RIGHT_PARENT)?
	;

// 67
templateOrValueFormalParList
	: templateOrValueFormalPar (COMMA templateOrValueFormalPar)*
	;

// 68
templateOrValueFormalPar
	: formalValuePar
	| formalTemplatePar
	;

// 69
templateBody
	: simpleSpec extraMatchingAttributes?
	| fieldSpecList  extraMatchingAttributes?
	| arrayValueOrAttrib extraMatchingAttributes?
	;

// 70
simpleSpec
	: singleExpression (AND_SYM simpleTemplateSpec)?
	| simpleTemplateSpec
	;

// 71
simpleTemplateSpec
	: singleTemplateExpression (AND_SYM simpleSpec)?
	;

// 72 this formal is right???
singleTemplateExpression
	: matchingSymbol
	| templateRefWithParList extendedFieldReference?
	| (IDENTIFIER DOT)? IDENTIFIER enumTemplateExtension
	;

// 73
enumTemplateExtension 
	: LEFT_PARENT templateBody (COMMA templateBody)* RIGHT_PARENT 
	;

// 74
fieldSpecList 
	: LEFT_BRACE fieldSpec (COMMA fieldSpec)* RIGHT_BRACE 
	;

// 75
fieldSpec 
	: fieldReference ASSIGNMENTCHAR (templateBody | MINUS)
	;

// 76 -- 对应BNF：99
// 当其为predefinedType或arrayOrBitRef时，是可分辨的
// 当其为IDENTIFIER DOT IDENTIFIER时，是typeReference
// 当其为IDENTIFIER时，无法确定到底是ParRef还是typeReference，需要第二遍扫描时根据符号表进一步确认
fieldReference 
	: predefinedType
	| arrayOrBitRef
	| (IDENTIFIER DOT)? IDENTIFIER
	;

// 77
//structFieldRef
//	: IDENTIFIER
//	| predefinedType
//	| typeReference
//	;

// 78
arrayOrBitRef 
	: LEFT_BRACKET singleExpression RIGHT_BRACKET 
	;

// 79
arrayValueOrAttrib 
	: LEFT_BRACE (arrayElementSpec (COMMA arrayElementSpec)*)? RIGHT_BRACE
	;

// 80
arrayElementSpec
	: MINUS
	| PERMUTATION listOfTemplates
	| templateBody
	;

// 81
matchingSymbol
	: complement
	| QUESTION wildcardLengthMatch?
	| STAR wildcardLengthMatch?
	| listOfTemplates
	| LEFT_PARENT bound TWODOT bound RIGHT_PARENT
	| bitStringMatch
	| hexStringMatch
	| octStringMatch
	| charStringMatch
	| subsetMatch
	| supersetMatch
	| decodedContentMatch
	;

// 82
decodedContentMatch 
	: DECMATCH (LEFT_PARENT expression RIGHT_PARENT)? templateInstance 
	;

// 82
extraMatchingAttributes
	: stringLength
	| IFPRESENT
	| stringLength IFPRESENT
	;

// 83
charStringMatch
	: PATTERN AT_NOCASE? patternParticle (AND_SYM patternParticle)*
	;

// 84
patternParticle 
	: pattern
	| referencedValue
	;

// 85
pattern 
	: QUOTATION patternElement* QUOTATION 
	;

// 86
escPattern
	: ESC_QESTION
	| ESC_STAR
	| ESC_ESC
	| ESC_LEFT_BRACE
	| ESC_RIGHT_BRACE
	| ESC_LEFT_BRACKET
	| ESC_RIGHT_BRACKET
	| ESC_QUAT
	| ESC_OR
	| ESC_LEFT_PARENT
	| ESC_RIGHT_PARENT
	| ESC_SHARP
	| ESC_ADD
	| ESC_D
	| ESC_W
	| ESC_T
	| ESC_N
	| ESC_R
	| ESC_B
	;

// 87
concate 
	: QUESTION
	| STAR
	| BACKSLASH
	| OR_SYM
	| ADD_SYM
	;

// 88
patternElement 
	: (escPattern
		| concate
		| LEFT_BRACKET NOT_IN_PATTERN? ((patternClassChar (MINUS patternClassChar)?)*)? RIGHT_BRACKET
		| LEFT_BRACE BACKSLASH? referencedValue RIGHT_BRACE
		| ESC_N LEFT_BRACE (referencedValue | type) RIGHT_BRACE 
		| QUOTATION QUOTATION
		| LEFT_PARENT patternElement RIGHT_PARENT
		| SHARP (NUMBER 
				| (LEFT_PARENT NUMBER COMMA NUMBER? RIGHT_PARENT) 
				| LEFT_PARENT COMMA NUMBER RIGHT_PARENT
				)
		)
	| patternChar
	;

// 89
patternChar
	: Char
	| ESC_QUADRUPLE LEFT_PARENT NUMBER COMMA NUMBER COMMA NUMBER COMMA NUMBER RIGHT_PARENT
	;

// 90
patternClassChar
	: Char
	| ESC_QUADRUPLE LEFT_PARENT NUMBER COMMA NUMBER COMMA NUMBER COMMA NUMBER RIGHT_PARENT
	| ESC_LEFT_BRACKET
	| ESC_LINK
	| ESC_NOT
	| ESC_RIGHT_BRACKET
	;

// 91
complement 
	: COMPLEMENT listOfTemplates 
	;

// 92
listOfTemplates
	: LEFT_PARENT templateListItem (COMMA templateListItem)* RIGHT_PARENT
	;

// 93
templateListItem 
	: templateBody
	| ALL FROM templateBody
	;

// 94
subsetMatch 
	: SUBSET listOfTemplates 
	;

// 95
supersetMatch 
	: SUPERSET listOfTemplates 
	;

// 96
permutationMatch 
	: PERMUTATION listOfTemplates 
	;

// 97
wildcardLengthMatch 
	: LENGTH LEFT_PARENT singleExpression RIGHT_PARENT 
	;

// 98
bound
	: EXLAMATION? singleExpression
	| MINUS? INFINITY
	;

// 99
actualParAssignment 
	: IDENTIFIER ASSIGNMENTCHAR templateInstance
	;

// 100
templateRefWithParList
	: extendedIdentifier actualParList?
	;

// 101 BNF:149
// 当type为自定义类型时，无法分清到底是type还是signature
// 如果是type为内置类型，直接确定，无需再确定，当为extendedIdentifier时，需要第二次遍历确认
// 解决方案：在语法分析第二遍遍历时根据符号表进行判断到底是type还是signature
// 第一遍遍历时，templateDef同时保存type和signature，第二遍遍历时确定正确引用
templateInstance
	: (predefinedType COLON)? (MODIFIES templateRefWithParList ASSIGNMENTCHAR)? templateBody
	| (extendedIdentifier COLON)? (MODIFIES templateRefWithParList ASSIGNMENTCHAR)? templateBody
	;

// 102
actualParList
	: 
	  (actualPar (COMMA actualPar)* (COMMA actualParAssignment)*
	  	| actualParAssignment (COMMA actualParAssignment)*)?
	  
	;

// 103
actualPar : templateInstance | MINUS ;

// 104
templateOps
	: MATCH LEFT_PARENT expression COMMA templateInstance RIGHT_PARENT
	| VALUEOF LEFT_PARENT templateInstance RIGHT_PARENT
	;

// 105
functionDef
	: FUNCTION AT_DETERMINISTIC? IDENTIFIER LEFT_PARENT functionFormalParList? RIGHT_PARENT
	  runsOnSpec? mtcSpec? systemSpec? returnType? statementBlock
	;

// 106
functionFormalParList 
	: functionFormalPar (COMMA functionFormalPar)* 
	;

// 107
functionFormalPar
	: formalValuePar
	| formalTimerPar
	| formalPortPar
	| formalTemplatePar
	;

// 108
returnType 
	: RETURN (TEMPLATE | restrictedTemplate)? type 
	;

// 109
runsOnSpec 
	: RUNS ON componentType 
	;

// 110
mtcSpec 
	: MTC componentType 
	;

// 111
//zhb 修改
statementBlock
//	: LEFT_BRACE functionDefList? functionStatementList? RIGHT_BRACE 
	: LEFT_BRACE (functionDefList| functionStatementList)+ RIGHT_BRACE 
	;

// 112
functionDefList 
	: (
		(functionLocalDef | functionLocalInst) withStatement? SEMICOLON?
	)+
	;

// 113
functionStatementList 
	: (functionStatement SEMICOLON?)+ 
	;

// 114
functionLocalInst 
	: varInstance 
	| timerInstance 
	;

// 114
functionLocalDef 
	: constDef 
	| templateDef 
	;

// 115
functionStatement 
	: configurationStatements
	| timerStatements
	| communicationStatements
	| basicStatements
	| behaviourStatements
	| setLocalVerdict
	| sutStatements
	| testcaseOperation
	;

// 116 
// 在语法分析时需要根据语义进行检查
functionInstance
	: (IDENTIFIER DOT)? (IDENTIFIER | IDENTIFIER AT_NOCASE?) LEFT_PARENT actualParList? RIGHT_PARENT
	;

// 117
signatureDef
	: SIGNATURE IDENTIFIER LEFT_PARENT 
	signatureFormalParList?
	RIGHT_PARENT 
	(returnType | NOBLOCK)?
	(EXCEPTION LEFT_PARENT typeList RIGHT_PARENT)?
	; 

signatureFormalParList
	: formalValuePar (COMMA formalValuePar)*
	;

// 118
signature : extendedIdentifier ;

// 119
testcaseDef
	: TESTCASE IDENTIFIER LEFT_PARENT templateOrValueFormalParList? RIGHT_PARENT
	runsOnSpec systemSpec? statementBlock
	;

// 120
systemSpec : SYSTEM componentType ;

// 121
testcaseInstance
	: EXECUTE LEFT_PARENT extendedIdentifier LEFT_PARENT actualParList? RIGHT_PARENT 
	(COMMA (expression | MINUS) (COMMA singleExpression)?)? RIGHT_PARENT
	;

// 122
altstepDef
	: ALTSTEP IDENTIFIER LEFT_PARENT functionFormalParList? RIGHT_PARENT runsOnSpec? mtcSpec?
	systemSpec? LEFT_BRACE altstepLocalDefList altGuardList RIGHT_BRACE
	;

// 123
altstepLocalDefList 
	: (altstepLocalDef withStatement? SEMICOLON?)* 
	;

// 124
altstepLocalDef
	: varInstance
	| timerInstance
	| constDef
	| templateDef
	;

// 125
altstepInstance 
	: extendedIdentifier LEFT_PARENT actualParList? RIGHT_PARENT 
	;

// 126
importDef 
	: IMPORT FROM moduleId RECURSIVE? 
	( ALL exceptsDef? | LEFT_BRACE (importElement SEMICOLON?)* RIGHT_BRACE)
	;

// 127
exceptsDef 
	: EXCEPT LEFT_BRACE  (exceptElement SEMICOLON?)*  RIGHT_BRACE 
	;

// 128
exceptElement
	: GROUP (qualifiedIdentifierList | ALL)
	| TYPE identifierListOrAll
	| TEMPLATE identifierListOrAll
	| CONST identifierListOrAll
	| TESTCASE identifierListOrAll
	| ALTSTEP identifierListOrAll
	| FUNCTION identifierListOrAll
	| SIGNATURE identifierListOrAll
	| MODULEPAR identifierListOrAll
	;

// 129
identifierListOrAll 
	: identifierList 
	| ALL 
	;

// 130
importElement
	: GROUP (groupRefListWithExcept | allGroupsWithExcept)
	| TYPE identifierListOrAllWithExcept
	| TEMPLATE identifierListOrAllWithExcept
	| CONST identifierListOrAllWithExcept
	| ALTSTEP identifierListOrAllWithExcept
	| TESTCASE identifierListOrAllWithExcept
	| FUNCTION identifierListOrAllWithExcept
	| SIGNATURE identifierListOrAllWithExcept
	| MODULEPAR identifierListOrAllWithExcept
	| IMPORT ALL
	;

// 131
groupRefListWithExcept 
	: qualifiedIdentifierWithExcept (COMMA qualifiedIdentifierWithExcept)* 
	;

// 132
allGroupsWithExcept 
	: ALL (EXCEPT qualifiedIdentifierList)? 
	;

// 133
qualifiedIdentifierWithExcept 
	: qualifiedIdentifier exceptsDef? 
	;

// 134
identifierListOrAllWithExcept 
	: identifierList 
	| allWithExcept 
	;

// 135
allWithExcept
	: ALL (EXCEPT identifierList)?
	;

// 136
groupDef 
	: GROUP IDENTIFIER LEFT_BRACE moduleDefinitionsList? RIGHT_BRACE 
	;

// 137
extFunctionDef
	: EXTERNAL FUNCTION AT_DETERMINISTIC? IDENTIFIER 
	LEFT_PARENT functionFormalParList? RIGHT_PARENT returnType?
	;

// 138
extConstDef 
	: EXTERNAL CONST type IDENTIFIER
	;

// 139
moduleParDef
	: MODULEPAR (modulePar 
			     | LEFT_BRACE multitypedModuleParList RIGHT_BRACE)
	;

multitypedModuleParList
	: (modulePar SEMICOLON?)*
	;

modulePar
	: type moduleParList
	;

// 140
moduleParList
	: IDENTIFIER (ASSIGNMENTCHAR constantExpression)? (COMMA IDENTIFIER (ASSIGNMENTCHAR constantExpression)?)*
	;

// 141
friendModuleDef 
	: FRIEND MODULE IDENTIFIER SEMICOLON? 
	;

// 142
moduleControlPart 
	: CONTROL LEFT_BRACE moduleControlBody RIGHT_BRACE withStatement? SEMICOLON?
	;

// 143
moduleControlBody
	: ((controlStatementOrDef SEMICOLON?)+)?
	;

// 144	
controlStatementOrDef
	: (functionLocalDef | functionLocalInst) withStatement?
	| timerStatements
	| basicStatements
	| behaviourStatements
	| sutStatements
	| STOP
	;

// 145
varInstance
	: VAR ((AT_LAZY | AT_FUZZY)? type varList
		   | (TEMPLATE | restrictedTemplate) (AT_LAZY | AT_FUZZY)? type tempVarList)
	;

// 146
varList 
	: singleVarInstance (COMMA singleVarInstance)* 
	;

// 147
singleVarInstance 
	: IDENTIFIER arrayDef? (ASSIGNMENTCHAR expression)? 
	;

// 148
tempVarList 
	: singleTempVarInstance (COMMA singleTempVarInstance)* 
	;

// 149
singleTempVarInstance 
	: IDENTIFIER arrayDef? (ASSIGNMENTCHAR templateBody)? 
	;

// 150
variableRef 
	: IDENTIFIER extendedFieldReference? 
	;

// 151
timerInstance 
	: TIMER varList 
	;

// 152
arrayIdentifierRef 
	: IDENTIFIER arrayOrBitRef* 
	;

// 153
configurationStatements
	: CONNECT singleConnectionSpec
	| DISCONNECT (singleConnectionSpec | allConnectionsSpec | allPortsSpec | allCompsAllPortsSpec)?
	| MAP singleConnectionSpec paramClause?
	| UNMAP (singleConnectionSpec paramClause? 
			| allConnectionsSpec paramClause?
			| allPortsSpec
			| allCompsAllPortsSpec)?
	| doneStatement
	| killedStatement
	| componentOrDefaultReference DOT START LEFT_PARENT (functionInstance | altstepInstance) RIGHT_PARENT
	| (STOP | (componentReferenceOrLiteral | ALL COMPONENT) DOT STOP)
	| (KILL | (componentReferenceOrLiteral | ALL COMPONENT) DOT KILL)
	;

// 154
configurationOps
	: createOp
	| SELF
	| SYSTEM
	| MTC
	| runningOp
	| aliveOp
	;

// 155
createOp
	: componentType DOT CREATE (LEFT_PARENT (singleExpression | MINUS) (COMMA singleExpression)? RIGHT_PARENT)? ALIVE?
	;

// 156
doneStatement
	: componentOrAny DOT DONE (PortRedirectSymbol valueStoreSpec? indexSpec?)?
	;

// 157
componentOrAny 
	: componentOrDefaultReference
	| ANY (COMPONENT | FROM variableRef)
	| ALL COMPONENT
	;

// 158
valueStoreSpec
	: VALUE variableRef
	;

// 159
indexAssignment
	: PortRedirectSymbol indexSpec
	;

// 160
indexSpec 
	: AT_INDEX valueStoreSpec 
	;

// 161
killedStatement
	: componentOrAny DOT KILLED (PortRedirectSymbol valueStoreSpec? indexSpec?)?
	;

// 162
runningOp 
	: componentOrAny DOT RUNNING indexAssignment? 
	;

// 163
aliveOp 
	: componentOrAny DOT ALIVE indexAssignment? 
	;

// 164
singleConnectionSpec 
	: LEFT_PARENT portRef COMMA portRef RIGHT_PARENT 
	;

// 165
portRef 
	: componentRef COLON arrayIdentifierRef 
	;

// 166
componentRef 
	: componentOrDefaultReference
	| SYSTEM
	| SELF
	| MTC
	;

// 167
allConnectionsSpec 
	: LEFT_PARENT portRef RIGHT_PARENT 
	;

// 168
allPortsSpec 
	:  LEFT_PARENT componentRef COLON ALL PORT RIGHT_PARENT 
	;

// 169
allCompsAllPortsSpec
	: LEFT_PARENT ALL COMPONENT COLON ALL PORT RIGHT_PARENT 
	;

// 170
paramClause 
	: PARAM actualParList 
	;

// 171
componentReferenceOrLiteral
	: componentOrDefaultReference
	| MTC
	| SELF
	;

// 181
componentOrDefaultReference 
	: variableRef 
	| functionInstance ;

// 182
communicationStatements
	: arrayIdentifierRef DOT SEND LEFT_PARENT templateInstance RIGHT_PARENT toClause?
	| arrayIdentifierRef DOT CALL LEFT_PARENT callParameters RIGHT_PARENT toClause? (LEFT_BRACE (callBodyStatement SEMICOLON?)+ RIGHT_BRACE)?
	| arrayIdentifierRef DOT REPLY LEFT_PARENT templateInstance (VALUE templateBody)? RIGHT_PARENT toClause?
	| arrayIdentifierRef DOT RAISE LEFT_PARENT signature COMMA templateInstance RIGHT_PARENT toClause?
	| portOrAny DOT portReceiveOp
	| triggerStatement
	| getCallStatement
	| getReplyStatement
	| catchStatement
	| checkStatement
	| portOrAll DOT CLEAR
	| portOrAll DOT START
	| portOrAll DOT STOP
	| portOrAll DOT HALT
	| (portOrAll | ANY PORT) DOT CHECK LEFT_PARENT singleExpression RIGHT_PARENT
	;

// 183
toClause 
	: TO (templateInstance | addressRefList | ALL COMPONENT) 
	;

// 184
addressRefList 
	: LEFT_PARENT templateInstance (COMMA templateInstance)* RIGHT_PARENT 
	;

// 185
callParameters 
	: templateInstance (COMMA (expression | NOWAIT))? 
	;

// 186
callBodyStatement 
	: altGuardChar getReplyStatement statementBlock 
	| altGuardChar catchStatement statementBlock 
	;

// 187
portOrAny
	: arrayIdentifierRef
	| ANY (PORT | FROM variableRef)
	;

// 188
portReceiveOp
	: RECEIVE (LEFT_PARENT templateInstance RIGHT_PARENT)? fromClause? portRedirect?
	;

// 189
fromClause
	: FROM (templateInstance
			| addressRefList
			| ANY COMPONENT)
	;

// 190
portRedirect
	: PortRedirectSymbol (valueSpec senderSpec? indexSpec?
						 | senderSpec indexSpec?
						 | indexSpec
						 )
	;

// 191
valueSpec
	: VALUE (variableRef
			| LEFT_PARENT singleValueSpec (COMMA singleValueSpec)* RIGHT_PARENT)
	;

// 192
singleValueSpec
	: variableRef (ASSIGNMENTCHAR (AT_DECODED (LEFT_PARENT expression? RIGHT_PARENT)?)? fieldReference extendedFieldReference)?
	;

// 193
senderSpec
	: SENDER variableRef
	;

// 194
triggerStatement
	: portOrAny DOT portTriggerOp
	;

// 195
portTriggerOp
	: TRIGGER (LEFT_PARENT templateInstance RIGHT_PARENT)? fromClause? portRedirect?
	;

// 196
getCallStatement
	: portOrAny DOT portGetCallOp
	;

// 197
portGetCallOp
	: GETCALL (LEFT_PARENT templateInstance RIGHT_PARENT)? fromClause? (PortRedirectSymbol redirectWithParamSpec)?
	;

// 198
redirectWithParamSpec
	: paramSpec senderSpec? indexSpec?
	| senderSpec indexSpec?
	| indexSpec
	;

// 199
paramSpec
	: PARAM paramAssignmentList
	;

// 200
paramAssignmentList
	: LEFT_PARENT (assignmentList | variableList) RIGHT_PARENT
	;

// 201
assignmentList
	: variableAssignment (COMMA variableAssignment)*
	;

// 202
variableAssignment
	: variableRef ASSIGNMENTCHAR (AT_DECODED LEFT_PARENT expression RIGHT_PARENT)? IDENTIFIER
	;

// 203
variableList
	: variableEntry (COMMA variableEntry)*
	;

// 204
variableEntry
	: variableRef
	| MINUS
	;

// 205
getReplyStatement
	: portOrAny DOT portGetReplyOp
	;

// 206
portGetReplyOp
	: GETREPLY (LEFT_PARENT templateInstance (VALUE templateInstance)? RIGHT_PARENT)? fromClause? (PortRedirectSymbol redirectWithValueAndParamSpec)?
	;

// 207
redirectWithValueAndParamSpec
	: valueSpec paramSpec? senderSpec? indexSpec?
	| redirectWithParamSpec
	;

// 208
checkStatement
	: portOrAny DOT CHECK (LEFT_PARENT checkParameter RIGHT_PARENT)?
	;

// 209
checkParameter
	: checkPortOpsPresent
	| fromClausePresent
	| redirectPresent
	;

// 210
fromClausePresent
	: fromClause (PortRedirectSymbol (senderSpec indexSpec?) | indexSpec)?
	;

// 211
redirectPresent
	: PortRedirectSymbol (senderSpec indexSpec? | indexSpec)
	;

// 212
checkPortOpsPresent
	: portReceiveOp
	| portGetCallOp
	| portGetReplyOp
	| portCatchOp
	;

// 213
catchStatement
	: portOrAny DOT portCatchOp
	;

// 214
portCatchOp
	: CATCH (LEFT_PARENT catchOpParameter RIGHT_PARENT)? fromClause? portRedirect?
	;

// 215
catchOpParameter
	: signature COMMA templateInstance
	| TIMEOUT
	;

// 216
portOrAll
	: arrayIdentifierRef 
	| ALL PORT
	;

// 217
timerStatements
	: arrayIdentifierRef DOT START (LEFT_PARENT expression RIGHT_PARENT)?
	| timerRefOrAll DOT STOP
	| timeoutStatement
	;

// 218
timerOps
	: arrayIdentifierRef DOT READ
	| timerRefOrAny DOT RUNNING indexAssignment?
	;

// 219
timerRefOrAll
	: arrayIdentifierRef
	| ALL TIMER
	;

// 220
timeoutStatement
	: timerRefOrAny DOT TIMEOUT indexAssignment?
	;

// 221
timerRefOrAny
	: arrayIdentifierRef
	| ANY TIMER
	| ANY FROM IDENTIFIER
	;

// 222
testcaseOperation
	: TESTCASE DOT STOP (LEFT_PARENT (logItem COMMA?)* RIGHT_PARENT)?
	;

// 223 type
type
	: predefinedType 
	| referencedType
	;

// 224
predefinedType
	: BITSTRING
	| BOOLEAN
	| CHARSTRING
	| UNIVERSAL CHARSTRING
	| INTEGER
	| OCTETSTRING
	| HEXSTRING
	| VERDICTTYPE
	| FLOAT
	| ADDRESS
	| DEFAULT
	| ANYTYPE
	;

// 225
referencedType
	: extendedIdentifier extendedFieldReference?
	;

// 226
typeReference
	: extendedIdentifier
	;

// 227
arrayDef
	: (LEFT_BRACE singleExpression (TWODOT singleExpression)? RIGHT_BRACE)+
	;

// 228 value
value
	: predefinedValue 
	| referencedValue
	;

// 229
predefinedValue
	: BSTRING
	| booleanValue
	| charStringValue
	| NUMBER
	| OSTRING
	| HSTRING
	| verdictValue
	| FLOATVALUE
	| NULL
	| OMIT
	;

verdictValue 	: PASS | FAIL | INCONC | NONE | ERROR ;

// 230 not support usilikeNotation temparaly
charStringValue
	: CSTRING
	| quadruple
	;

// 231
quadruple
	: CHAR LEFT_PARENT NUMBER COMMA NUMBER COMMA NUMBER COMMA NUMBER RIGHT_PARENT
	;

// 232
//floatValue
//	: NUMBER DOT DECIMAL_NUM
//	| NUMBER (DOT DECIMAL_NUM)? EXPONENTIAL MINUS? NUMBER
//	| NaN
//	;

// 233
referencedValue
	: extendedIdentifier (extendedFieldReference | LEFT_PARENT INTEGERVALUE RIGHT_PARENT)?
	;

// parameterization
// 234
formalValuePar
	: (IN | INOUT | OUT)? (AT_LAZY | AT_FUZZY)? type IDENTIFIER 
	(ASSIGNMENTCHAR (expression | MINUS))?
	;

// 235
formalPortPar
	: INOUT? IDENTIFIER IDENTIFIER
	;

// 236
formalTimerPar
	: INOUT? TIMER IDENTIFIER
	;

// 237
formalTemplatePar
	: (IN | OUT | INOUT)? (TEMPLATE | restrictedTemplate) (AT_LAZY | AT_FUZZY)?
	;

// 238
restrictedTemplate
	: OMIT
	| TEMPLATE templateRestriction
	;

// 239
templateRestriction
	: LEFT_PARENT (OMIT | VALUE | PRESENT) RIGHT_PARENT
	;

// statements
// with statement
// 240
withStatement 
	: WITH LEFT_BRACE (singleWithAttrib SEMICOLON?)* RIGHT_BRACE
	;

// 241
singleWithAttrib
	: standardAttribute
	| variantAttribute
	;

// 242
standardAttribute
	: attribKeyword (OVERRIDE | AT_LOCAL)? attribQualifier? freeText
	;

// 243
variantAttribute
	: VARIANT (OVERRIDE | AT_LOCAL)? attribQualifier? (relatedEncoding DOT)? freeText
	;

// 244
relatedEncoding
	: freeText
	| LEFT_BRACE freeText (COMMA freeText)* RIGHT_BRACE
	;

// 245
attribKeyword
	: ENCODE
	| DISPLAY
	| EXTENSION
	| OPTIONAL
	;

// 246
attribQualifier
	: LEFT_PARENT defOrFieldRefList RIGHT_PARENT
	;

// 247
defOrFieldRefList
	: defOrFieldRef (COMMA defOrFieldRef)*
	;

// 248
defOrFieldRef
	: qualifiedIdentifier
	| (fieldReference | LEFT_BRACKET MINUS RIGHT_BRACKET) extendedFieldReference
	| allRef
	;

// 249
qualifiedIdentifier
	: (IDENTIFIER DOT)* IDENTIFIER
	;

// 250
allRef
	: GROUP ALL (EXCEPT LEFT_BRACE qualifiedIdentifierList RIGHT_BRACE)?
	| (TYPE | TEMPLATE | CONST | ALTSTEP | TESTCASE | FUNCTION | SIGNATURE | MODULEPAR) ALL (EXCEPT LEFT_BRACE identifierList RIGHT_BRACE)?
	;


// behaviour statements
// 251
behaviourStatements
	: testcaseInstance
	| functionInstance
	| RETURN templateInstance?
	| ALT LEFT_BRACE altGuardList RIGHT_BRACE
	| INTERLEAVE LEFT_BRACE interleavedGuardList RIGHT_BRACE
	| LABEL IDENTIFIER
	| GOTO IDENTIFIER
	| REPEAT
	| DEACTIVATE (LEFT_PARENT componentOrDefaultReference RIGHT_PARENT)?
	| altstepInstance
	| activateOp
	| BREAK
	| CONTINUE
	;

// 252
setLocalVerdict
	: SETVERDICT LEFT_PARENT singleExpression (COMMA logItem)* RIGHT_PARENT
	;

// 253
sutStatements
	: ACTION LEFT_PARENT actionText (AND_SYM actionText)* RIGHT_PARENT
	;

// 254
altGuardList
	: (guardStatement | LEFT_BRACKET ELSE RIGHT_BRACKET statementBlock SEMICOLON?)*
	;

// 255
guardStatement
	: altGuardChar (altstepInstance statementBlock? | guardOp statementBlock)
	;

// 256
altGuardChar
	: LEFT_BRACKET booleanExpression? RIGHT_BRACKET
	;

// 257
guardOp
	: timeoutStatement
	| portOrAny DOT portReceiveOp
	| triggerStatement
	| getCallStatement
	| catchStatement
	| checkStatement
	| getReplyStatement
	| doneStatement
	| killedStatement
	;

// 258
interleavedGuardList
	: (LEFT_BRACKET RIGHT_BRACKET guardOp statementBlock SEMICOLON?)+
	;

// 259
activateOp
	: ACTIVATE LEFT_PARENT altstepInstance RIGHT_PARENT
	;

// basic statements
// 260
basicStatements
	: assignment
	| logStatement
	| loopConstruct
	| conditionalConstruct
	| selectCaseConstruct
	| statementBlock
	;	

// 261
expression
	: singleExpression
	| compoundExpression
	;

// 262
compoundExpression
	: fieldExpressionList
	| arrayExpression
	;

// 263
fieldExpressionList
	: LEFT_BRACE fieldExpressionSpec (COMMA fieldExpressionSpec)* RIGHT_BRACE
	;

// 264
//zhb 添加(LEFT_PARENT functionInstance RIGHT_PARENT)?
fieldExpressionSpec
	: fieldReference ASSIGNMENTCHAR notUsedOrExpression
	;

// 265
arrayExpression
	: LEFT_BRACE arrayElementExpressionList? RIGHT_BRACE
	;

// 266
arrayElementExpressionList
	: notUsedOrExpression (COMMA notUsedOrExpression)*
	;

// 267
notUsedOrExpression
	: expression
	| MINUS
	;

// 268
constantExpression
	: singleExpression
	| compoundConstExpression
	;

// 269
booleanExpression
	: singleExpression
	;

// 270
compoundConstExpression
	: fieldConstExpressionList
	| arrayConstExpression
	;

// 271
fieldConstExpressionList
	: LEFT_BRACE fieldConstExpressionSpec (COMMA fieldConstExpressionSpec)* RIGHT_BRACE
	;

// 272
fieldConstExpressionSpec
	: fieldReference ASSIGNMENTCHAR constantExpression
	;

// 273
arrayConstExpression
	: LEFT_BRACE arrayElementConstExpressionList? RIGHT_BRACE
	;

// 274
arrayElementConstExpressionList
	: constantExpression (COMMA constantExpression)*
	;

// 275
assignment
	: variableRef ASSIGNMENTCHAR templateBody
	;

// 276
singleExpression
	: xOrExpression (OR xOrExpression)*
	;

// 277
xOrExpression
	: andExpression (XOR andExpression)*
	;

// 278
andExpression
	: notExpression (AND notExpression)*
	;

// 279
notExpression
	: NOT? equalExpression
	;

// 280
equalExpression
	: relExpression (equalOp relExpression)*
	;

// 281
relExpression
	: shiftExpression (relOp shiftExpression)?
	| compoundExpression
	;

// 282
shiftExpression
	: bitOrExpression (shiftOp bitOrExpression)*
	;

// 283
bitOrExpression
	: bitXorExpression (OR4B bitXorExpression)*
	;

// 284
bitXorExpression
	: bitAndExpression (XOR4B bitAndExpression)*
	;

// 285
bitAndExpression
	: bitNotExpression (AND4B bitNotExpression)*
	;

// 286
bitNotExpression
	: NOT4B? addExpression
	;

// 287
addExpression
	: mulExpression (addOp mulExpression)*
	;

// 288
mulExpression
	: unaryExpression (multiplyOp unaryExpression)*
	| compoundExpression
	;

// 289
unaryExpression
	: unaryOp? primary
	;

// 290
primary 
	: opCall
	| value
	| LEFT_PARENT singleExpression RIGHT_PARENT
	;

// 291
extendedFieldReference
	: (DOT (IDENTIFIER | predefinedType)
		   | arrayOrBitRef
		   | LEFT_BRACKET MINUS RIGHT_BRACKET
		   | EQUALRIGHT decodedFieldType)+
	;

// 292
decodedFieldType
	: predefinedType
	| IDENTIFIER
	| LEFT_PARENT type (COMMA expression)? RIGHT_PARENT
	;

// 293
opCall
	: configurationOps
	| GETVERDICT
	| timerOps
	| testcaseInstance
	| functionInstance extendedFieldReference?
	| templateOps extendedFieldReference?
	| activateOp
	| getAttributeOp
	;

// 294
addOp
	: ADD_SYM
	| MINUS
	| AND_SYM
	;

// 295
multiplyOp
	: STAR
	| DIVIDE
	| MOD
	| REM
	;

// 296
unaryOp
	: ADD_SYM
	| MINUS
	;

// 297
relOp
	: SMALLER
	| BIGGER
	| BIGEQUAL
	| SMALLEQUAL
	;

// 298
equalOp
	: EQAUL
	| NOTEQUAL
	;

// 299
shiftOp
	: BIGBIG
	| SMALLSMALL
	| BIGAT
	| SMALLAT
	;

// 300
logStatement
	: LOG LEFT_PARENT logItem (COMMA logItem)* RIGHT_PARENT
	;

// 301
loopConstruct
	: FOR LEFT_PARENT initial SEMICOLON booleanExpression SEMICOLON assignment RIGHT_PARENT statementBlock
	| WHILE LEFT_PARENT booleanExpression RIGHT_PARENT statementBlock
	| DO statementBlock WHILE LEFT_PARENT booleanExpression RIGHT_PARENT
	;

// 302
initial
	: varInstance
	| assignment
	;

// 303
conditionalConstruct
	: IF LEFT_PARENT booleanExpression RIGHT_PARENT statementBlock elseIfClause* elseClause?
	;

// 304
elseIfClause
	: ELSE IF LEFT_PARENT booleanExpression RIGHT_PARENT statementBlock
	;

// 305
elseClause
	: ELSE statementBlock
	;

// 306
selectCaseConstruct
	: SELECT UNION? LEFT_PARENT singleExpression RIGHT_PARENT selectCaseBody
	;

// 307
selectCaseBody
	: LEFT_BRACE selectCase+ caseElse? RIGHT_BRACE
	;

// 308
selectCase
	: CASE (LEFT_PARENT templateInstance (COMMA templateInstance)* RIGHT_PARENT | ELSE) statementBlock
	;

// 309
caseElse
	: CASE ELSE statementBlock
	;

// 310
extendedIdentifier
	: (IDENTIFIER DOT)? IDENTIFIER
	;

// 311
identifierList
	: IDENTIFIER (COMMA IDENTIFIER)*
	;

// 312
qualifiedIdentifierList
	: qualifiedIdentifier (COMMA qualifiedIdentifier)*
	;

// 313
/** 
注释：由于templateInstance会造成间接左递归且环太大太复杂，消除左递归代价太大，所以将此规则中的templateInstance替换成varibleRef
合理性：一般在取值的属性时，使用的是引用（即使用的是variableRef）,要求编写TTCN3程序时，不允许直接用匿名对象直接调用属性
***/
getAttributeOp
	: (type | variableRef) DOT getAttributeSpec
	;

// 314
getAttributeSpec
	: ENCODE
	| VARIANT (LEFT_PARENT freeText RIGHT_PARENT)?
	| DISPLAY
	| EXTENSION
	| OPTIONAL
	;

// 315
//freeText
//	: QUOTATION ExtendedAlpha* QUOTATION
//	;

// 316 
logItem
	: freeText
	| templateInstance
	;

// 317
actionText
	: freeText
	| expression
	;


// 使其可分辨
booleanValue	: TRUE | FALSE ;

// 暂时将freeText用string代替，从标准文档看，似乎没有影响
// 如果后续有改动，直接在freeText中作语义检查即可
freeText 		: CSTRING ;


// 为了避免冲突，将match放入语法分析中
bitStringMatch	
	: BSTRING
	| SINGLE_QUATATION (BIN | QUESTION | STAR)* SINGLE_QUATATION 'B' 
	;

hexStringMatch 	
	: HSTRING
	| SINGLE_QUATATION (HEX | QUESTION | STAR)* SINGLE_QUATATION 'H' 
	;


octStringMatch 	
	: OSTRING
	| SINGLE_QUATATION ((HEX HEX)| QUESTION | STAR) SINGLE_QUATATION 'O' 
	;
