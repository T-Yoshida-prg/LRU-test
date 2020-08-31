# LRU-test(テスト駆動開発,LRUCashe）
kadai1のファイルが完成されたプログラムです。使うときはそれを使ってください。

## 開発環境
vscode


## 使用言語
Java(maven)

## 開発期間
4日


## 実行方法
Vscode上でAppTest.javaファイル上のRun testというところを押せば、実行。

## テストの例
### (1)
cache.put("a", "dataA");
cache.put("b", "dataB");
cache.put("c", "dataC");
cache.get("a") →　Null

### (2)
cache.put("a", "dataA");
cache.put("b", "dataB");
cache.get("a") → dataA
### (3)※2の続き
cache.put("c", "dataC");
cache.get("b") →　Null


## プログラムファイルの説明
Appjava・・・・ほぼ触れていません。

AppTest.java
前準備(全テスト共通)
cache.put("a", "dataA");
cache.put("b", "dataB");

(1)_detaset1
cache.put("c", "dataC");
cache.get("a") →　Null
の確認

(2)_detaset2_1
cache.get("a") → dataA
の確認

(3)_detaset2_2
cache.get("a") → dataA
cache.put("c", "dataC");
cache.get("b") →　Null

LruCashMap.java
maxsize(今回は2つに設定)よりデータが送られたら、
古いデータを削除
getすれば使われたとみなし、新しいデータとして認識。




