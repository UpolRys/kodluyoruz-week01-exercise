object DifferenceBetweenMaxMin{
	def main(args:Array[String]){
		var list = List(32, 115, 23, 1, 52, 28)

		val result = findDifferenceBetweenMinMax(list)

		println(s"reult is $result")
	}

	def findDifferenceBetweenMinMax(list:List[Int]): Int = {
		if(!list.isEmpty){
			findDifferenceHelper(list.tail, list.head, list.head)
		}else -1
	}

	def findDifferenceHelper(list:List[Int], max:Int, min:Int): Int = {
		list match{
			case Nil => max - min
			case head::tail => if(head < min){
				if(head > max){
					findDifferenceHelper(tail, head, head)
				}else{
					findDifferenceHelper(tail, max, head)
				}
			}else{
				if(head > max){
					findDifferenceHelper(tail, head, min)
				}else{
					findDifferenceHelper(tail, max, min)
				}

			}
		}
	}
}