package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public record RuleMatchResult(List<MarkupNode> nodes, int matched, MatchingContext context) {
}
