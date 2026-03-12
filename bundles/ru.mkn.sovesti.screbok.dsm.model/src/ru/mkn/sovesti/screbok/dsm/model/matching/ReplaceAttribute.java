package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;
import ru.mkn.sovesti.screbok.mlm.model.api.NodeAttribute;

final class ReplaceAttribute {

	private final EObject origin;

	ReplaceAttribute(EObject origin) {
		this.origin = Objects.requireNonNull(origin);
	}

	void of(EObject copy, EAttribute attribute, String value) {
		for (NodeAttribute attr : attributes()) {
			value = replaceAttribute(attr, value);
		}
		copy.eSet(attribute, value);
	}

	private List<NodeAttribute> attributes() {
		return Optional.ofNullable(origin) //
				.stream() //
				.filter(MarkupNode.class::isInstance) //
				.map(MarkupNode.class::cast) //
				.map(MarkupNode::getAttributes) //
				.flatMap(List::stream) //
				.toList();
	}

	private String replaceAttribute(NodeAttribute attribute, String value) {
		return value.replaceAll("\\$\\{" + attribute.getName() + "\\}", attribute.getValue());
	}
}
