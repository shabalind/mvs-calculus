  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    var v4: Double = v2
    var v5: Double = v4
    v4 = v2
    let v22: Double = v4 + v5
    let v36: Double = v5 - v4
    v5 = v4
    var v27: Double = v22
    var v83: Double = v2
    let v34: Double = v27 - v83
    var v62: Double = v34
    v62 = v36
    return v62
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0]]
    let v2: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
