package ru.mkn.sovesti.screbok.dsm.model.tests;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.ResourceSet;

import ru.mkn.sovesti.screbok.common.emf.LoadedUserResource;
import ru.mkn.sovesti.screbok.dsm.model.api.Library;
import ru.mkn.sovesti.screbok.dsm.model.api.Rule;
import ru.mkn.sovesti.screbok.dsm.model.matching.MatchingContext;
import ru.mkn.sovesti.screbok.dsm.model.matching.RuleMatchedNode;
import ru.mkn.sovesti.screbok.dsm.model.matching.TreeContext;
import ru.mkn.sovesti.screbok.dsm.model.meta.DsmFactory;
import ru.mkn.sovesti.screbok.dsm.model.rules.CollectedRules;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute;
import ru.mkn.sovesti.screbok.mlm.model.api.Placeholder;
import ru.mkn.sovesti.screbok.mlm.model.api.RawText;
import ru.mkn.sovesti.screbok.mlm.model.api.Section;
import ru.mkn.sovesti.screbok.mlm.model.api.SitePage;
import ru.mkn.sovesti.screbok.mlm.model.api.Wildcard;
import ru.mkn.sovesti.screbok.mlm.model.api.WrappingNode;
import ru.mkn.sovesti.screbok.mlm.model.meta.MlmFactory;

final class MatchingTestData {

	SitePage tocTree(ResourceSet rs) {
		return new LoadedUserResource<>(SitePage.class, rs).at("data", "toc.mlm");
	}

	Set<Rule> tocRules(ResourceSet rs) {
		Library root = new LoadedUserResource<>(Library.class, rs).at("data", "toc.dsm");
		return new CollectedRules().fromLibraries(List.of(root));
	}

	Set<Rule> htmlRules() {
		return Set.of( //
				rule(node("html", wildcard(placeholder())), wildcard(placeholder())), //
				rule(node("head", node("title", placeholder())), titledEmptySectionRule()), //
				rule(node("body", wildcard(placeholder())), wildcard(placeholder())), //
				rule(node("div", Map.of("class", "section"), //
						node("h2", placeholder("placeholder1")), //
						placeholder("placeholder2")), titledSectionRule()), //
				rule(node("p", placeholder()), placeholder()));
	}

	MarkupNode htmlTree() {
		return node("html", //
				node("head", //
						node("title", rawText("Apache OpenNLP Developer Documentation"))),
				node("body", //
						node("div", Map.of("class", "section"), //
								node("h2", rawText("Description")), //
								node("p", rawText("The Apache OpenNLP library is a machine learning based toolkit")))));
	}

	RuleMatchedNode matchedRule(MarkupNode pattern, MarkupNode result) {
		return new RuleMatchedNode(realNode(), rule(pattern, result), new MatchingContext(new TreeContext()));
	}

	private Rule rule(MarkupNode pattern, MarkupNode result) {
		Rule rule = DsmFactory.eINSTANCE.createRule();
		rule.getPattern().add(pattern);
		rule.getResult().add(result);
		return rule;
	}

	MarkupNode realNode() {
		WrappingNode real = node("name", Map.of("attr1", "value1", "attr2", "value2"), //
				wrappingNode("name1"), //
				node("child", Map.of("attr3", "value3"), //
						wrappingNode("name2")));
		node("root", real);
		return real;
	}

	MarkupNode emptyPattern() {
		return MlmFactory.eINSTANCE.createWrappingNode();
	}

	MarkupNode namedPattern() {
		WrappingNode node = wrappingNode("name");
		node.getChildren().add(wildcard(placeholder()));
		return node;
	}

	MarkupNode wronglyNamedPattern() {
		WrappingNode node = wrappingNode("othername");
		node.getChildren().add(wildcard(placeholder()));
		return node;
	}

	MarkupNode attributedPattern() {
		return node("name", Map.of("attr1", "value1"), wildcard(placeholder()));
	}

	MarkupNode wronglyAttributedPattern() {
		return node("name", Map.of("attr1", "value2"), wildcard(placeholder()));
	}

	MarkupNode unknownAttributePattern() {
		return node("name", Map.of("attr4", "value111"), wildcard(placeholder()));
	}

	Wildcard wildcard(MarkupNode repeat) {
		Wildcard node = MlmFactory.eINSTANCE.createWildcard();
		node.getRepeated().add(repeat);
		return node;
	}

	MarkupNode placeholder() {
		return placeholder("");
	}

	MarkupNode complexPattern() {
		return node("name", Map.of("attr1", "value1", "attr2", "value2"), //
				placeholder("placeholder1"), //
				node("child", Map.of("attr3", "value3"), //
						placeholder("placeholder2")));
	}

	private WrappingNode node(String name, MarkupNode... children) {
		return node(name, Map.of(), children);
	}

	private WrappingNode node(String name, //
			Map<String, String> attributes, MarkupNode... children) {
		WrappingNode node = wrappingNode(name);
		attributes.entrySet().stream().map(e -> attribute(e.getKey(), e.getValue())).forEach(node.getAttributes()::add);
		Stream.of(children).forEach(node.getChildren()::add);
		return node;
	}

	MarkupNode ignoringRule() {
		return MlmFactory.eINSTANCE.createWrappingNode();
	}

	MarkupNode unwrappingRule() {
		return placeholder();
	}

	MarkupNode titledEmptySectionRule() {
		Section section = MlmFactory.eINSTANCE.createSection();
		section.setTitle(placeholder());
		return section;
	}

	MarkupNode titledSectionRule() {
		Section section = MlmFactory.eINSTANCE.createSection();
		section.setTitle(placeholder("placeholder1"));
		section.getChildren().add(placeholder("placeholder2"));
		return section;
	}

	MarkupNode rawText(String text) {
		RawText node = MlmFactory.eINSTANCE.createRawText();
		node.setText(text);
		return node;
	}

	WrappingNode wrappingNode(String name) {
		WrappingNode node = MlmFactory.eINSTANCE.createWrappingNode();
		node.setName(name);
		return node;
	}

	Placeholder placeholder(String key) {
		Placeholder placeholder = MlmFactory.eINSTANCE.createPlaceholder();
		placeholder.setKey(key);
		return placeholder;
	}

	NodeAttribute attribute(String name, String value) {
		NodeAttribute attribute = MlmFactory.eINSTANCE.createNodeAttribute();
		attribute.setName(name);
		attribute.setValue(value);
		return attribute;
	}
}
