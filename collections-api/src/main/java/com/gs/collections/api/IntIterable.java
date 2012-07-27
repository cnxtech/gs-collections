/*
 * Copyright 2012 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.api;

import com.gs.collections.api.block.function.primitive.IntToObjectFunction;
import com.gs.collections.api.block.predicate.primitive.IntPredicate;
import com.gs.collections.api.block.procedure.primitive.IntProcedure;
import com.gs.collections.api.iterator.IntIterator;

public interface IntIterable
{
    IntIterator iterator();

    void forEach(IntProcedure procedure);

    int size();

    int count(IntPredicate predicate);

    boolean anySatisfy(IntPredicate predicate);

    boolean allSatisfy(IntPredicate predicate);

    <V> RichIterable<V> collect(IntToObjectFunction<? extends V> function);

    long sum();

    int max();

    int min();

    double average();

    double median();

    int[] toArray();

    int[] toSortedArray();
}
