/*******************************************************************************
 * Copyright 2017 Albert Shun-Dat Chan
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.github.javalbert.reflection;

public interface ClassAccess<T> {
	int fieldIndex(String name);

	boolean getBooleanField(T object, int fieldIndex);
	byte getByteField(T object, int fieldIndex);
	char getCharField(T object, int fieldIndex);
	double getDoubleField(T object, int fieldIndex);
	float getFloatField(T object, int fieldIndex);
	int getIntField(T object, int fieldIndex);
	long getLongField(T object, int fieldIndex);
	short getShortField(T object, int fieldIndex);
}
