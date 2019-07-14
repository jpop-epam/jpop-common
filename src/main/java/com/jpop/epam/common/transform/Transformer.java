package com.jpop.epam.common.transform;

public interface Transformer<T, R> {
	R transform(T t);

	T reverseTransform(R r);
}
