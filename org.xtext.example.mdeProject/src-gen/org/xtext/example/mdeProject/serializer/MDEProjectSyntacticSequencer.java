/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mdeProject.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mdeProject.services.MDEProjectGrammarAccess;

@SuppressWarnings("all")
public class MDEProjectSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MDEProjectGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Eclass___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_5__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MDEProjectGrammarAccess) access;
		match_Eclass___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEclassAccess().getLeftSquareBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getEclassAccess().getRightSquareBracketKeyword_4_5()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Eclass___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_5__q.equals(syntax))
				emit_Eclass___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) '(' columns+=Eattribute
	 *     name=EString (ambiguity) (rule end)
	 *     type=EString (ambiguity) '(' columns+=Eattribute
	 *     type=EString (ambiguity) (rule end)
	 */
	protected void emit_Eclass___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}