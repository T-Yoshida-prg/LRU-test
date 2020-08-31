# LRU-test(テスト駆動開発,LRUCashe）
テスト駆動開発でLRUCasheの実装<br>
branchのfinalにあるkadai1のファイルが完成されたプログラムです。使うときはそれを使ってください。

## 開発環境
vscode


## 使用言語
Java(maven)

## 開発期間
4日(8/20~23)


## 実行方法
Vscode上でAppTest.javaファイル上のRun testというところを押せば、実行。

## テストの例
### (1)
cache.put("a", "dataA");<br>
cache.put("b", "dataB");<br>
cache.put("c", "dataC");<br>
cache.get("a") →　Null<br>

### (2)
cache.put("a", "dataA");<br>
cache.put("b", "dataB");<br>
cache.get("a") → dataA<br>
### (3)※2の続き
cache.put("c", "dataC");<br>
cache.get("b") →　Null<br>


## プログラムファイルの説明
### Appjava
ほぼ触れていません。<br>

### AppTest.java
前準備(全テスト共通)<br>
cache.put("a", "dataA");<br>
cache.put("b", "dataB");<br>

(1)_detaset1<br>
cache.put("c", "dataC");<br>
cache.get("a") →　Null<br>
の確認<br>

(2)_detaset2_1<br>
cache.get("a") → dataA<br>
の確認<br>

(3)_detaset2_2<br>
cache.get("a") → dataA<br>
cache.put("c", "dataC");<br>
cache.get("b") →　Null<br>

### LruCashMap.java
maxsize(今回は2つに設定)よりデータが送られたら、<br>
古いデータを削除<br>
getすれば使われたとみなし、新しいデータとして認識。<br>

