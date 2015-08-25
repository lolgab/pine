package pl.metastack.metaweb.tree

trait Node {
  def toHtml: String

  def copy(): Node

  def byId[T <: Tag](id: String): T =
    this match {
      case t: Tag => t.byIdOpt(id).get
      case _ => throw new RuntimeException("Root node must be an HTML element")
    }
}
