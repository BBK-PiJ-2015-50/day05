print "Enter number of Hanoi discs: "
int n = Integer.parseInt(System.console().readLine())
int count = 0
println "for " + n + "discs the number of moves = " + hanoiMoves(n, count)

int hanoiMoves(int n, int count)
  if n == 1 {
  	println "move number " + count
  } else {
    hanoiMoves(n-1, count)
  }
  return count
}
