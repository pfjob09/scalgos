package scalgos

import scalgos.BinaryTree._

class BinaryTreeSpec extends RandomData {

  "reconstructBST" should {
    "do a round-trip" in {
      val preOrder = randomSeq()
      preOrderTraversal(reconstructBST(preOrder)) must be equalTo(preOrder)
    }.pendingUntilFixed
  }

  "reconstruct" should {
    "do a round-trip" in {
      val (inOrder, preOrder) = (Seq(1, 2, 3, 4, 5), Seq(5, 4, 3, 2, 1))
      preOrderTraversal(reconstruct(inOrder, preOrder)) must be equalTo(preOrder)
    }
  }
}
