package ru.mkn.sovesti.screbok.dsm.model.matching;

import ru.mkn.sovesti.screbok.mlm.model.FreshImaginary;
import ru.mkn.sovesti.screbok.mlm.model.api.ImaginaryNode;
import ru.mkn.sovesti.screbok.mlm.model.api.MarkupNode;

record UnmatchedPair(MarkupNode origin, ImaginaryNode imaginary) {

	public UnmatchedPair(MarkupNode origin) {
		this(origin, new FreshImaginary(origin).create());
	}
}
