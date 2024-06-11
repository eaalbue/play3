import sbt._

object Dependencies {
  object com {
    object eed3si9n {
      object expecty {
        val expecty =
          "com.eed3si9n.expecty" %% "expecty" % "0.16.0"
      }
    }

    object lihaoyi {
      val scalatags =
        "com.lihaoyi" %% "scalatags" % "0.13.1"
    }
  }

  object dev {
    object zio {
      val zio =
        "dev.zio" %% "zio" % "2.1.2"
    }
  }

  object org {
    object scalacheck {
      val scalacheck =
        "org.scalacheck" %% "scalacheck" % "1.18.0"
    }

    object scalameta {
      val munit =
        moduleId("munit")

      val `munit-scalacheck` =
        moduleId("munit-scalacheck")

      private def moduleId(artifact: String): ModuleID =
        "org.scalameta" %% artifact % "1.0.0"
    }

    object typelevel {
      val `discipline-munit` =
        "org.typelevel" %% "discipline-munit" % "2.0.0"
    }
  }
}
