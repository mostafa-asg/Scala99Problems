package com.github.logic

/**
  *
  * @author Mostafa Asgari 
  * @since 6/6/16
  */
object P50 {

  abstract class Tree

  class Node( val name : String ,val freq : Int ,val left : Option[Node] ,val right : Option[Node] )
  class Leaf(override val name : String ,override val freq : Int) extends Node(name,freq,None,None)

  def traverseTree( root : Node ) : List[ (String,String) ] = {

    val result = scala.collection.mutable.ListBuffer.empty[(String,String)]

    def traverse( node : Option[Node] , code : String ) : Unit = node match {

      case n if n.isInstanceOf[Some[Leaf]] && n.get.isInstanceOf[Leaf] => result.+=((n.get.name , code))

      case n : Some[Node]  => {
        traverse( n.get.left , code + "0" )
        traverse( n.get.right , code + "1" )
      }

      case None => //DO NOTHING

    }

    traverse(Some(root),"")
    result.toList
  }

  object MinOrder extends Ordering[Node] {

    def compare(a:Node,b:Node) = b.freq compareTo a.freq

  }

  def makeTree( ls : List[(String,Int)] ) : Node = {

    val qu = scala.collection.mutable.PriorityQueue.empty(MinOrder)

    ls foreach { item =>
      qu += new Leaf( item._1 , item._2 )
    }

    while(qu.size > 1){

      val node1 = qu.dequeue()
      val node2 = qu.dequeue()

      val newNode = new Node(node1.name+node2.name,
                         node1.freq+node2.freq,Some(node1),Some(node2))

      qu += newNode
    }

    qu.dequeue()
  }

  def huffman[T]( ls : List[ (String,Int) ]) : List[ (String,String) ] = {

      val treeRoot = makeTree( ls )

      traverseTree( treeRoot )
  }

  def main(args: Array[String]) {

    val huffmanCodes = huffman(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)))

    println( huffmanCodes )

  }

}
