## What is this ?

[テスト駆動開発](https://www.amazon.co.jp/dp/B077D2L69C/ref=dp-kindle-redirect?_encoding=UTF8&btkr=1)の実践の記録

## Why is this repo exist ?

テスト駆動開発の真髄を理解するため

## Openjdk

↓ どっち ?
/usr/local/Cellar/openjdk/18.0.2
export JAVA_HOME="/usr/local/Cellar/openjdk/18.0.2"

/Library/Java/JavaVirtualMachines/
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home

## Test

Maven プロジェクトルートで以下を実行することで JUnit が動く

```bash
mvn test
```

ビルドコマンド実行時にもテストが実行される

```bash
mvn package
```

### junit5 対応

pom.xml に以下を追加

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-launcher</artifactId>
    <version>1.9.0</version>
    <scope>test</scope>
</dependency>
```

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M5</version>
</plugin>
```
