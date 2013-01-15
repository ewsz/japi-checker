/*
 * Copyright 2011 William Bernardet
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
package com.googlecode.japi.checker;

public enum Scope {
    PUBLIC(3), PROTECTED(2), PACKAGE(1), PRIVATE(0);
    int scope;
    Scope(int scope) {
        this.scope = scope;
    }
    public int getValue() {
        return scope;
    }
    
    public boolean isMoreVisibleThan(Scope v)
    {
        return this.scope > v.scope;
    }
    
    public boolean isLessVisibleThan(Scope v) {
        return this.scope < v.scope;
    }
}
