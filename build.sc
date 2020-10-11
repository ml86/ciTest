import mill._
import mill.scalalib._

object ciTest extends ScalaModule {
  def scalaVersion = "2.13.1"
  def millSourcePath = os.pwd
}
