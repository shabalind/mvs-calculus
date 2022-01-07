import Benchmark

func run(_ n: Int) -> Int {
  var arr: [Int] = Array(repeating: 0, count: n)
  var count: Int = 0
  permute(&count, &arr, n)
  return count
}

func permute(_ count: inout Int, _ arr: inout [Int], _ n: Int) {
  count += 1
  if n != 0 {
    let n1 = n - 1
    permute(&count, &arr, n1)
    var i = n1
    while i >= 0 {
      swap(&arr, n1, i)
      permute(&count, &arr, n1)
      swap(&arr, n1, i)
      i -= 1
    }
  }
}

func swap(_ arr: inout [Int], _ i: Int, _ j: Int) {
  let tmp = arr[i]
  arr[i] = arr[j]
  arr[j] = tmp
}

benchmark(CommandLine.arguments, run)
