import Dispatch

@inline(__always)
func now() -> Int {
    return Int(DispatchTime.now().uptimeNanoseconds)
}

@inline(never)
func verify(_ results: [Int], _ expected: Int) {
  for result in results {
    assert(result == expected)
  }
}

@inline(never)
func dump(_ times: [Int]) {
  for time in times {
    print(time)
  }
}

public func benchmark(_ args: [String], _ f: (Int) -> Int) {
  let measurements = Int(args[1])!
  let input        = Int(args[2])!
  let expected     = Int(args[3])!

  assert(measurements >= 1)

  var i       = 0
  var times   = Array(repeating: 0, count: measurements)
  var results = Array(repeating: 0, count: measurements)

  while (i < measurements) {
    let start = now()
    let result = f(input)
    let end = now()
    results[i] = result
    times[i] = end - start
    i += 1
  }

  verify(results, expected)
  dump(times)
}
