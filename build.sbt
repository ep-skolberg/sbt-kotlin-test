enablePlugins(kotlin.KotlinPlugin)

organization := "com.foo.bar"

kotlin.Keys.kotlinVersion := "2.3.0"
kotlin.Keys.kotlincJvmTarget := "17"

Compile / sourceGenerators += Def.task {
  val file = (Compile / sourceManaged).value / "State.kt"
  IO.write(
    file,
    """package com.foo.bar.informationmodel.symbollist
     |
     |enum class State : Symbol {
     |
     |    Idle,
     |
     |    Running,
     |    ;
     |}""".stripMargin
  )
  Seq(file)
}.taskValue
