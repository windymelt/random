package example

inline def eprintln[A](a: A): Unit = System.err.println(a)

import scala.util.Random

@main def main(args: String*): Unit = args.toList match {
  case _ => // TODO: implement
    eprintln("assuming -ad -n8")
    val r = Random()
    val rs = r.alphanumeric.take(8).mkString
    print(rs)
}
