/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.routing;

import com.dangdang.ddframe.rdb.sharding.rewrite.SQLBuilder;

import java.util.Collection;

/**
 *  路由结果接口.
 * 
 * @author zhangliang
 */
public interface RoutingResult {
    
    /**
     * 判断是否为单库表路由.
     *
     * @return 是否为单库表路由
     */
    boolean isSingleRouting();
    
    /**
     * 获取SQL执行单元集合.
     * 
     * @param sqlBuilder SQL构建器
     * @return SQL执行单元集合
     */
    Collection<SQLExecutionUnit> getSQLExecutionUnits(SQLBuilder sqlBuilder);
}
