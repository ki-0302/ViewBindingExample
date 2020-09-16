# View Binding Example

## 特徴

Android Developersの説明より

### findViewByIdとの比較

- Viewへの直接参照を作成するため、無効なView IDを参照でNullPointerExceptionが発生しない。

- BindingクラスではXMLレイアウトで使用されている型を使用されるため、ClassCastExceptionが発生しない。

### Data Bindingとの比較

View BindingはData Bindingよりシンプルなケースを想定している。

双方向データバインディングやレイアウト式への対応がないが、コンパイルが高速なことや扱いが楽などのメリットがある。
