package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import ru.mkn.sovesti.screbok.mlm.model.api.Anchor;

public record TreeContext(Map<String, Anchor> anchors, //
		List<UnmatchedSequence> imaginaries) {

	public TreeContext() {
		this(new HashMap<>(), new ArrayList<>());
	}

	Optional<Anchor> findAnchor(String ref) {
		return Optional.ofNullable(anchors.get(ref));
	}
}
