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

package com.dangdang.ddframe.rdb.sharding.parsing.lexer.token;

/**
 * 词法字面量标记.
 *
 * @author zhangliang
 */
public enum Literals implements TokenType {

    /**
     * 整数
     * 例如，SELECT 1
     */
    INT,
    /**
     * 浮点数
     * 例如，SELECT 1.0
     */
    FLOAT,
    /**
     * 十六进制
     * 例如，SELECT 0x1A
     */
    HEX,
    /**
     * 字符串
     * 例如：SELECT "123"
     */
    CHARS,
    /**
     * 词法关键词
     * 例如：表名，查询字段，函数 等等
     */
    IDENTIFIER,
    /**
     * 变量
     * 例如：SELECT @@VERSION
     */
    VARIABLE
}
