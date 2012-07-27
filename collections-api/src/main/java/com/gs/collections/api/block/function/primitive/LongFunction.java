/*
 * Copyright 2011 Goldman Sachs.
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

package com.gs.collections.api.block.function.primitive;

import java.io.Serializable;

/**
 * LongFunction is a iterator Function which may be used to reduce the overhead
 * of creating big Long objects in places where the iterator long could be used
 */
public interface LongFunction<T>
        extends Serializable
{
    long longValueOf(T anObject);
}
