object FindMax{
	def findMax(list:List[Int]): Int = {
		return findMaxHelper(list.tail, list.head)
	}

	def findMaxHelper(list:List[Int], accumulator:Int) : Int = list match {
		case Nil=> accumulator
		case head::Nil=> head
		case head::tail => 
			if(accumulator < head) {
				findMaxHelper(tail, head)
			}else{
				findMaxHelper(tail, accumulator)
			}
	}

	def main(args: Array[String]){
		val list = List(32,115,23,1,52,28)

		println(findMax(list))
	}
}