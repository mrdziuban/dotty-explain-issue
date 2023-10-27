# dotty `-explain` issue

This repo demonstrates that enabling the `-explain` flag in Scala 3 (dotty) results in the explanation being printed twice.

To reproduce:

- Clone this repo
- `cd` into it
- Run `sbt compile`

You'll see this printed out:

```
[error] -- [E006] Not Found Error: /Users/matt/dotty-explain-test/src/main/scala/example/Test.scala:3:11
[error] 3 |val test = nonExistent
[error]   |           ^^^^^^^^^^^
[error]   |           Not found: nonExistent
[error]   |-----------------------------------------------------------------------------
[error]   | Explanation (enabled by `-explain`)
[error]   |- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
[error]   | The identifier for `nonExistent` is not bound, that is,
[error]   | no declaration for this identifier can be found.
[error]   | That can happen, for example, if `nonExistent` or its declaration has either been
[error]   | misspelt or if an import is missing.
[error]    -----------------------------------------------------------------------------
[error] Explanation
[error] ===========
[error] The identifier for `nonExistent` is not bound, that is,
[error] no declaration for this identifier can be found.
[error] That can happen, for example, if `nonExistent` or its declaration has either been
[error] misspelt or if an import is missing.
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
```
