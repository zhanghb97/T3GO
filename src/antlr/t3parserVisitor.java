package antlr;
// Generated from t3parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link t3parserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface t3parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link t3parserParser#ttcn3module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtcn3module(t3parserParser.Ttcn3moduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleId(t3parserParser.ModuleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#languageSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageSpec(t3parserParser.LanguageSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleDefinitionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDefinitionsList(t3parserParser.ModuleDefinitionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDefinition(t3parserParser.ModuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#commonDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonDef(t3parserParser.CommonDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(t3parserParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(t3parserParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#typeDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefBody(t3parserParser.TypeDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#structuredTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredTypeDef(t3parserParser.StructuredTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#recordDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDef(t3parserParser.RecordDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#structDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefBody(t3parserParser.StructDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#structFieldDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldDef(t3parserParser.StructFieldDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedTypeDef(t3parserParser.NestedTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedRecordDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRecordDef(t3parserParser.NestedRecordDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedUnionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedUnionDef(t3parserParser.NestedUnionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedSetDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedSetDef(t3parserParser.NestedSetDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedRecordOfDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRecordOfDef(t3parserParser.NestedRecordOfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedSetOfDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedSetOfDef(t3parserParser.NestedSetOfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#nestedEnumDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedEnumDef(t3parserParser.NestedEnumDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#unionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionDef(t3parserParser.UnionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#unionDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionDefBody(t3parserParser.UnionDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#unionFieldDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionFieldDef(t3parserParser.UnionFieldDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#setDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDef(t3parserParser.SetDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#recordOfDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordOfDef(t3parserParser.RecordOfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#structOfDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOfDefBody(t3parserParser.StructOfDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#setOfDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOfDef(t3parserParser.SetOfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#enumDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDef(t3parserParser.EnumDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#enumerationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationList(t3parserParser.EnumerationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#enumeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(t3parserParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#integerValueOrRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValueOrRange(t3parserParser.IntegerValueOrRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#subTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTypeDef(t3parserParser.SubTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#subTypeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTypeSpec(t3parserParser.SubTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allowedValuesSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowedValuesSpec(t3parserParser.AllowedValuesSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateOrRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateOrRange(t3parserParser.TemplateOrRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#stringLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLength(t3parserParser.StringLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortDef(t3parserParser.PortDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portDefAttribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortDefAttribs(t3parserParser.PortDefAttribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#messageAttribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageAttribs(t3parserParser.MessageAttribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#configParamDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigParamDef(t3parserParser.ConfigParamDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#addressDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressDecl(t3parserParser.AddressDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#messageList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageList(t3parserParser.MessageListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allOrTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrTypeList(t3parserParser.AllOrTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(t3parserParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#procedureAttribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAttribs(t3parserParser.ProcedureAttribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#procedureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureList(t3parserParser.ProcedureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allOrSignatureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrSignatureList(t3parserParser.AllOrSignatureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#signatureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureList(t3parserParser.SignatureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#mixedAttribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixedAttribs(t3parserParser.MixedAttribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#mixedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixedList(t3parserParser.MixedListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#procOrTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcOrTypeList(t3parserParser.ProcOrTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#procOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcOrType(t3parserParser.ProcOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDef(t3parserParser.ComponentDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(t3parserParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefList(t3parserParser.ComponentDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentElementDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentElementDef(t3parserParser.ComponentElementDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortInstance(t3parserParser.PortInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortElement(t3parserParser.PortElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(t3parserParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(t3parserParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleConstDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConstDef(t3parserParser.SingleConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDef(t3parserParser.TemplateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#baseTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTemplate(t3parserParser.BaseTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateOrValueFormalParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateOrValueFormalParList(t3parserParser.TemplateOrValueFormalParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateOrValueFormalPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateOrValueFormalPar(t3parserParser.TemplateOrValueFormalParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(t3parserParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#simpleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSpec(t3parserParser.SimpleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#simpleTemplateSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTemplateSpec(t3parserParser.SimpleTemplateSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleTemplateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTemplateExpression(t3parserParser.SingleTemplateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#enumTemplateExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumTemplateExtension(t3parserParser.EnumTemplateExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldSpecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldSpecList(t3parserParser.FieldSpecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldSpec(t3parserParser.FieldSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldReference(t3parserParser.FieldReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayOrBitRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOrBitRef(t3parserParser.ArrayOrBitRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayValueOrAttrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueOrAttrib(t3parserParser.ArrayValueOrAttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayElementSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementSpec(t3parserParser.ArrayElementSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#matchingSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingSymbol(t3parserParser.MatchingSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#decodedContentMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecodedContentMatch(t3parserParser.DecodedContentMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#extraMatchingAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraMatchingAttributes(t3parserParser.ExtraMatchingAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#charStringMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharStringMatch(t3parserParser.CharStringMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#patternParticle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternParticle(t3parserParser.PatternParticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(t3parserParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#escPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscPattern(t3parserParser.EscPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#concate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcate(t3parserParser.ConcateContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#patternElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternElement(t3parserParser.PatternElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#patternChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternChar(t3parserParser.PatternCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#patternClassChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternClassChar(t3parserParser.PatternClassCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#complement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplement(t3parserParser.ComplementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#listOfTemplates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfTemplates(t3parserParser.ListOfTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateListItem(t3parserParser.TemplateListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#subsetMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsetMatch(t3parserParser.SubsetMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#supersetMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupersetMatch(t3parserParser.SupersetMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#permutationMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermutationMatch(t3parserParser.PermutationMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#wildcardLengthMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardLengthMatch(t3parserParser.WildcardLengthMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound(t3parserParser.BoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#actualParAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParAssignment(t3parserParser.ActualParAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateRefWithParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateRefWithParList(t3parserParser.TemplateRefWithParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateInstance(t3parserParser.TemplateInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#actualParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParList(t3parserParser.ActualParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#actualPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualPar(t3parserParser.ActualParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateOps(t3parserParser.TemplateOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(t3parserParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionFormalParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFormalParList(t3parserParser.FunctionFormalParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionFormalPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFormalPar(t3parserParser.FunctionFormalParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(t3parserParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#runsOnSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunsOnSpec(t3parserParser.RunsOnSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#mtcSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMtcSpec(t3parserParser.MtcSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(t3parserParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefList(t3parserParser.FunctionDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatementList(t3parserParser.FunctionStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionLocalInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLocalInst(t3parserParser.FunctionLocalInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionLocalDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLocalDef(t3parserParser.FunctionLocalDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(t3parserParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#functionInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInstance(t3parserParser.FunctionInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#signatureDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureDef(t3parserParser.SignatureDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#signatureFormalParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureFormalParList(t3parserParser.SignatureFormalParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(t3parserParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#testcaseDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestcaseDef(t3parserParser.TestcaseDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#systemSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemSpec(t3parserParser.SystemSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#testcaseInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestcaseInstance(t3parserParser.TestcaseInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#altstepDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltstepDef(t3parserParser.AltstepDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#altstepLocalDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltstepLocalDefList(t3parserParser.AltstepLocalDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#altstepLocalDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltstepLocalDef(t3parserParser.AltstepLocalDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#altstepInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltstepInstance(t3parserParser.AltstepInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#importDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDef(t3parserParser.ImportDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#exceptsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptsDef(t3parserParser.ExceptsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#exceptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptElement(t3parserParser.ExceptElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#identifierListOrAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListOrAll(t3parserParser.IdentifierListOrAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#importElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportElement(t3parserParser.ImportElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#groupRefListWithExcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupRefListWithExcept(t3parserParser.GroupRefListWithExceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allGroupsWithExcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllGroupsWithExcept(t3parserParser.AllGroupsWithExceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#qualifiedIdentifierWithExcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifierWithExcept(t3parserParser.QualifiedIdentifierWithExceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#identifierListOrAllWithExcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListOrAllWithExcept(t3parserParser.IdentifierListOrAllWithExceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allWithExcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllWithExcept(t3parserParser.AllWithExceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#groupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupDef(t3parserParser.GroupDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#extFunctionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtFunctionDef(t3parserParser.ExtFunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#extConstDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtConstDef(t3parserParser.ExtConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleParDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleParDef(t3parserParser.ModuleParDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#multitypedModuleParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultitypedModuleParList(t3parserParser.MultitypedModuleParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#modulePar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulePar(t3parserParser.ModuleParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleParList(t3parserParser.ModuleParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#friendModuleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFriendModuleDef(t3parserParser.FriendModuleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleControlPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleControlPart(t3parserParser.ModuleControlPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#moduleControlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleControlBody(t3parserParser.ModuleControlBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#controlStatementOrDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatementOrDef(t3parserParser.ControlStatementOrDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#varInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInstance(t3parserParser.VarInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(t3parserParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleVarInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarInstance(t3parserParser.SingleVarInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#tempVarList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempVarList(t3parserParser.TempVarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleTempVarInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTempVarInstance(t3parserParser.SingleTempVarInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#variableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableRef(t3parserParser.VariableRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#timerInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimerInstance(t3parserParser.TimerInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayIdentifierRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIdentifierRef(t3parserParser.ArrayIdentifierRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#configurationStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationStatements(t3parserParser.ConfigurationStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#configurationOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationOps(t3parserParser.ConfigurationOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#createOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOp(t3parserParser.CreateOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#doneStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoneStatement(t3parserParser.DoneStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentOrAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentOrAny(t3parserParser.ComponentOrAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#valueStoreSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueStoreSpec(t3parserParser.ValueStoreSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#indexAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAssignment(t3parserParser.IndexAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#indexSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSpec(t3parserParser.IndexSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#killedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKilledStatement(t3parserParser.KilledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#runningOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunningOp(t3parserParser.RunningOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#aliveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliveOp(t3parserParser.AliveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleConnectionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConnectionSpec(t3parserParser.SingleConnectionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortRef(t3parserParser.PortRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentRef(t3parserParser.ComponentRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allConnectionsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllConnectionsSpec(t3parserParser.AllConnectionsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allPortsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllPortsSpec(t3parserParser.AllPortsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allCompsAllPortsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllCompsAllPortsSpec(t3parserParser.AllCompsAllPortsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#paramClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamClause(t3parserParser.ParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentReferenceOrLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentReferenceOrLiteral(t3parserParser.ComponentReferenceOrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#componentOrDefaultReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentOrDefaultReference(t3parserParser.ComponentOrDefaultReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#communicationStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationStatements(t3parserParser.CommunicationStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#toClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToClause(t3parserParser.ToClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#addressRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressRefList(t3parserParser.AddressRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#callParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameters(t3parserParser.CallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#callBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallBodyStatement(t3parserParser.CallBodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portOrAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortOrAny(t3parserParser.PortOrAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portReceiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortReceiveOp(t3parserParser.PortReceiveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(t3parserParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portRedirect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortRedirect(t3parserParser.PortRedirectContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#valueSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueSpec(t3parserParser.ValueSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleValueSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleValueSpec(t3parserParser.SingleValueSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#senderSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenderSpec(t3parserParser.SenderSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#triggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerStatement(t3parserParser.TriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portTriggerOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortTriggerOp(t3parserParser.PortTriggerOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#getCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCallStatement(t3parserParser.GetCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portGetCallOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortGetCallOp(t3parserParser.PortGetCallOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#redirectWithParamSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirectWithParamSpec(t3parserParser.RedirectWithParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#paramSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSpec(t3parserParser.ParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#paramAssignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamAssignmentList(t3parserParser.ParamAssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(t3parserParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(t3parserParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(t3parserParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#variableEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableEntry(t3parserParser.VariableEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#getReplyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetReplyStatement(t3parserParser.GetReplyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portGetReplyOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortGetReplyOp(t3parserParser.PortGetReplyOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#redirectWithValueAndParamSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirectWithValueAndParamSpec(t3parserParser.RedirectWithValueAndParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#checkStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStatement(t3parserParser.CheckStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#checkParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckParameter(t3parserParser.CheckParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fromClausePresent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClausePresent(t3parserParser.FromClausePresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#redirectPresent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirectPresent(t3parserParser.RedirectPresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#checkPortOpsPresent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckPortOpsPresent(t3parserParser.CheckPortOpsPresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(t3parserParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portCatchOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortCatchOp(t3parserParser.PortCatchOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#catchOpParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchOpParameter(t3parserParser.CatchOpParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#portOrAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortOrAll(t3parserParser.PortOrAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#timerStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimerStatements(t3parserParser.TimerStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#timerOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimerOps(t3parserParser.TimerOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#timerRefOrAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimerRefOrAll(t3parserParser.TimerRefOrAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#timeoutStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeoutStatement(t3parserParser.TimeoutStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#timerRefOrAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimerRefOrAny(t3parserParser.TimerRefOrAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#testcaseOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestcaseOperation(t3parserParser.TestcaseOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(t3parserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#predefinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedType(t3parserParser.PredefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#referencedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencedType(t3parserParser.ReferencedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(t3parserParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDef(t3parserParser.ArrayDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(t3parserParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#predefinedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedValue(t3parserParser.PredefinedValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#verdictValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdictValue(t3parserParser.VerdictValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#charStringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharStringValue(t3parserParser.CharStringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#quadruple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuadruple(t3parserParser.QuadrupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#referencedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencedValue(t3parserParser.ReferencedValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#formalValuePar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalValuePar(t3parserParser.FormalValueParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#formalPortPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalPortPar(t3parserParser.FormalPortParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#formalTimerPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalTimerPar(t3parserParser.FormalTimerParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#formalTemplatePar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalTemplatePar(t3parserParser.FormalTemplateParContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#restrictedTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrictedTemplate(t3parserParser.RestrictedTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#templateRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateRestriction(t3parserParser.TemplateRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(t3parserParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleWithAttrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleWithAttrib(t3parserParser.SingleWithAttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttribute(t3parserParser.StandardAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#variantAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantAttribute(t3parserParser.VariantAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#relatedEncoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelatedEncoding(t3parserParser.RelatedEncodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#attribKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribKeyword(t3parserParser.AttribKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#attribQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribQualifier(t3parserParser.AttribQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#defOrFieldRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefOrFieldRefList(t3parserParser.DefOrFieldRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#defOrFieldRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefOrFieldRef(t3parserParser.DefOrFieldRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(t3parserParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#allRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllRef(t3parserParser.AllRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#behaviourStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviourStatements(t3parserParser.BehaviourStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#setLocalVerdict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLocalVerdict(t3parserParser.SetLocalVerdictContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#sutStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSutStatements(t3parserParser.SutStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#altGuardList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltGuardList(t3parserParser.AltGuardListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#guardStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardStatement(t3parserParser.GuardStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#altGuardChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltGuardChar(t3parserParser.AltGuardCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#guardOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardOp(t3parserParser.GuardOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#interleavedGuardList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterleavedGuardList(t3parserParser.InterleavedGuardListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#activateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivateOp(t3parserParser.ActivateOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#basicStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicStatements(t3parserParser.BasicStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(t3parserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#compoundExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpression(t3parserParser.CompoundExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpressionList(t3parserParser.FieldExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldExpressionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpressionSpec(t3parserParser.FieldExpressionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(t3parserParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayElementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementExpressionList(t3parserParser.ArrayElementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#notUsedOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotUsedOrExpression(t3parserParser.NotUsedOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(t3parserParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(t3parserParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#compoundConstExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundConstExpression(t3parserParser.CompoundConstExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldConstExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldConstExpressionList(t3parserParser.FieldConstExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#fieldConstExpressionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldConstExpressionSpec(t3parserParser.FieldConstExpressionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayConstExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstExpression(t3parserParser.ArrayConstExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#arrayElementConstExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementConstExpressionList(t3parserParser.ArrayElementConstExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(t3parserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(t3parserParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#xOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXOrExpression(t3parserParser.XOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(t3parserParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(t3parserParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(t3parserParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#relExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpression(t3parserParser.RelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(t3parserParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#bitOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpression(t3parserParser.BitOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#bitXorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXorExpression(t3parserParser.BitXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#bitAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpression(t3parserParser.BitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#bitNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNotExpression(t3parserParser.BitNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(t3parserParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(t3parserParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(t3parserParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(t3parserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#extendedFieldReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedFieldReference(t3parserParser.ExtendedFieldReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#decodedFieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecodedFieldType(t3parserParser.DecodedFieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#opCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpCall(t3parserParser.OpCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(t3parserParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#multiplyOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyOp(t3parserParser.MultiplyOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(t3parserParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(t3parserParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#equalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOp(t3parserParser.EqualOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(t3parserParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#logStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogStatement(t3parserParser.LogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#loopConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopConstruct(t3parserParser.LoopConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial(t3parserParser.InitialContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#conditionalConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalConstruct(t3parserParser.ConditionalConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#elseIfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClause(t3parserParser.ElseIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(t3parserParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#selectCaseConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCaseConstruct(t3parserParser.SelectCaseConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#selectCaseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCaseBody(t3parserParser.SelectCaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#selectCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCase(t3parserParser.SelectCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(t3parserParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#extendedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedIdentifier(t3parserParser.ExtendedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(t3parserParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#qualifiedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifierList(t3parserParser.QualifiedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#getAttributeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAttributeOp(t3parserParser.GetAttributeOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#getAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAttributeSpec(t3parserParser.GetAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#logItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogItem(t3parserParser.LogItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#actionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionText(t3parserParser.ActionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(t3parserParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#freeText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeText(t3parserParser.FreeTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#bitStringMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitStringMatch(t3parserParser.BitStringMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#hexStringMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexStringMatch(t3parserParser.HexStringMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#octStringMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctStringMatch(t3parserParser.OctStringMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3parserParser#integervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegervalue(t3parserParser.IntegervalueContext ctx);
}