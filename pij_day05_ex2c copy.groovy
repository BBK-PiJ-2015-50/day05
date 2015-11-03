println ""
print "Enter number of Hanoi discs: "
int n = Integer.parseInt(System.console().readLine())
println ""
hanoiMoves(n)

void hanoiMoves(int n) {
  if (n == 1) {
  	println "now n = " + n + " so MOVE ONE DISC"
  	println ""
  } else {
  	println "calling method for (n-1) where n=" + n
    hanoiMoves(n-1)
    println "plus one move: MOVE ONE DISC"
    println "calling method for (n-1) where n=" + n
    hanoiMoves(n-1)
  }
}
