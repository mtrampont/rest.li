/*
   Copyright (c) 2020 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.linkedin.d2.balancer.strategies.framework;

import java.net.URI;


/**
 * The helper class that creates different error count patterns based on user definition
 */
interface ErrorCountManager {
  /**
   * Provide the total error count for a given interval
   *
   * @param uri The uri of the server host
   * @param hostRequestCount The request count the host received in the last interval
   * @param intervalIndex The index of the current interval
   * @return The total call count that the test will send in the interval
   */
  int getErrorCount(URI uri, int hostRequestCount, int intervalIndex);
}
