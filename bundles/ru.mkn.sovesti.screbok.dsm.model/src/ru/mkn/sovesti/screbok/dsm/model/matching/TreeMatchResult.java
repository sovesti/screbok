package ru.mkn.sovesti.screbok.dsm.model.matching;

import java.util.List;

import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

public record TreeMatchResult(MarkupNode tree, List<MarkupNode> unmatched) {

}
