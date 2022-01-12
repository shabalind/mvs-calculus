  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v2: Double = v1
    let v7: Double = v1 * v2
    v2 = v1
    v2 = v7
    var v34: Double = v1
    let v58: Double = v7 - v34
    let v41: Double = v2 - v7
    var v202: Double = v58
    let v83: Double = v41 + v41
    let v63: Double = v83 - v202
    return v63
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]])
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
