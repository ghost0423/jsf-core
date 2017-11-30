/**
 * Copyright 2004-2048 .
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
package com.ipd.jsf.worker.manager;

import java.util.List;

import com.ipd.jsf.worker.domain.SysParam;

public interface SysParamManager {
    public int create(SysParam sysParam) throws Exception;

    public int update(SysParam sysParam) throws Exception;

    public SysParam get(String key, int type) throws Exception;
    
    String findValueBykey(String key);
	List<String> findValuesByKey(String key);
}