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

import com.gs.collections.api.block.procedure.primitive.LongProcedure;
import com.gs.collections.api.iterator.LongIterator;

public interface LongIterable
{
    LongIterator iterator();

    void forEach(LongProcedure procedure);

    int size();

    long sum();

    long max();

    long min();

    double average();

    double median();

    long[] toArray();

    long[] toSortedArray();
}
