println ""
print "Enter number of Hanoi discs: "
int n = Integer.parseInt(System.console().readLine())
println ""
int count = 0
println "total moves = " + hanoiMoves(discset)
println ""

HanoiDisks discset = new HanoiDisks(n)
discset.number = n
discset.count = 0

String hanoiMoves(HanoiDisks discset) {
  String result
  if (discset.number == 1) {
  	println "now n = " + discset.number + " so MOVE ONE DISC"
  	count = count +1
  	println ""
  } else {
  	println "calling method 1st time for (n-1) where n=" + n
    hanoiMoves(discset.number-1, count)
    println "plus one move: MOVE ONE DISC"
    count = count +1
    println "calling method 2nd time for (n-1) where n=" + n
    hanoiMoves(discset.number-1, count)
  }
  result = "" + count
  println "result = " + result
  return result
}

class HanoiDisks {
	int number
	int count
}

