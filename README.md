# MyBatis Beetl Support  [![Build Status](https://travis-ci.org/hatunet/mybatis-beetl-scripting.svg?branch=master)](https://travis-ci.org/hatunet/mybatis-beetl-scripting) 


## Introduction 

mybatis-beetl is an extension that allows you to use the Beetl scripting language to generate your dynamic SQL queries on the fly.

If you are not familiar with beetl, you can learn it from its documentation site:

[Beetl Reference](http://ibeetl.com/guide/#beetl)

## Install

1. Put the mybatis-beetl-scripting-<version>.jar in your classpath.

    If you are using maven, just add a dependency to:
```
GroupId: com.ifrabbit
ArtifactId: mybatis-beetl-scripting
```

2. Register the language driver alias in your mybatis configuration file:
```xml
<configuration>
  ...
  <typeAliases>
    <typeAlias alias="beetl" type="org.mybatis.scripting.beetl.Driver"/>
  </typeAliases>
  ...
</configuration>

```

3. Optional: Set the beetl as your default scripting language:
```xml
<configuration>
  ...
  <settings>
    <setting name="defaultScriptingLanguage" value="beetl"/>
  </settings>
  ...
</configuration>

```

## Usage

Just write your dynamic queries and use beetl:

Example:


```xml
<select id="findPerson" lang="beetl">
  SELECT *
  FROM person
  WHERE name LIKE #_parameter.name#
</select>
```






## Contributing to Spring Data MyBatis

Here are some ways for you to get involved in the community:

* Github is for social coding: if you want to write code, we encourage contributions through pull requests from [forks of this repository](http://help.github.com/forking/). 

## Help me better - Donation
[![paypal](https://www.paypal.com/en_US/i/btn/x-click-butcc-donate.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=W7PLNCBK5K8JS)

