  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    var v6: Double = v4
    let v7: Double = v6 - v4
    var v12: Double = v7
    let v11: [Double] = v0[0]
    var v15: Double = v12
    let v13: Double = v11[0]
    var v17: [Double] = v11
    var v20: Double = v13
    v17[0] = v15
    var v29: [Double] = v17
    let v81: Double = v29[0]
    v17 = v11
    v17[0] = v20
    return v81
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0]]
    let v2: [[Double]] = [[2.0]]
    let v3: [[Double]] = [[3.0]]
    let v4: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
