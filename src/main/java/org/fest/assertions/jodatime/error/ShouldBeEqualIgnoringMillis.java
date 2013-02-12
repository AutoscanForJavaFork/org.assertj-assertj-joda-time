/*
 * Created on Oct 18, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.jodatime.error;

import org.joda.time.DateTime;

import org.fest.assertions.error.BasicErrorMessageFactory;
import org.fest.assertions.error.ErrorMessageFactory;

/**
 * Creates an error message indicating that an assertion that verifies that two {@link DateTime} have same year, month,
 * day, hour, minute and second failed.
 * 
 * @author Joel Costigliola
 */
public class ShouldBeEqualIgnoringMillis extends BasicErrorMessageFactory {

  /**
   * Creates a new </code>{@link ShouldBeEqualIgnoringMillis}</code>.
   * 
   * @param actual the actual value in the failed assertion.
   * @param other the value used in the failed assertion to compare the actual value to.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldBeEqualIgnoringMillis(Object actual, Object other) {
    return new ShouldBeEqualIgnoringMillis(actual, other);
  }

  private ShouldBeEqualIgnoringMillis(Object actual, Object other) {
    super("\nExpecting:\n  <%s>\nto have same year, month, day, hour, minute and second as:\n  <%s>\nbut had not.",
        actual, other);
  }
}