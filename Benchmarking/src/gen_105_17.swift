  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    var v6: Double = v1
    var v4: Double = v6
    let v10: [Double] = [v6, v1, v6, v4, v1, v1, v6]
    v6 = v1
    var v17: [Double] = v10
    let v32: Double = v10[5]
    let v42: Double = v4 * v32
    v17[1] = v42
    var v26: [Double] = v17
    let v97: Double = v26[3]
    v26[4] = v1
    return v97
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
