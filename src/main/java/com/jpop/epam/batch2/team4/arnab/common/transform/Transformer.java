package com.jpop.epam.batch2.team4.arnab.common.transform;

public interface Transformer<T, R> {
	R transform(T t);

	T reverseTransform(R r);
}
