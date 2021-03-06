/*
 * Copyright (c) 2011 David Saff
 * Copyright (c) 2011 Christian Gruber
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.junit.contrib.truth.extensiontest;


import org.junit.contrib.truth.FailureStrategy;
import org.junit.contrib.truth.subjects.Subject;

/**
 * A simple example Subject to demonstrate extension.
 * 
 * @author Christian Gruber (christianedwardgruber@gmail.com)
 */
public class MySubject extends Subject<MySubject, MyType> {

  public MySubject(FailureStrategy failureStrategy, MyType subject) {
    super(failureStrategy, subject);
  }

  public And<MySubject> matches(MyType object) {
    if (getSubject().value != object.value) {
      fail("matches", getSubject(), object);
    }
    return nextChain();
  }

}
