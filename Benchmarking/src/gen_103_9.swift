  import Dispatch
  func f39(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v1
    let v3: [Double] = [v6]
    let v5: Double = v3[0]
    var v4: [Double] = v3
    var v8: Double = v0
    let v10: Double = v4[0]
    var v2: [Double] = v4
    let v12: Double = v4[0]
    var v14: [Double] = v2
    var v26: [Double] = v4
    var v20: [Double] = v2
    let v13: Double = v14[0]
    v2[0] = v13
    v2[0] = v10
    let v16: Double = v2[0]
    v26[0] = v16
    let v40: [[Double]] = [v26, v20, v3]
    v20[0] = v12
    v14[0] = v5
    let v41: [Double] = v40[1]
    let v49: Double = v41[0]
    v2[0] = v13
    v14[0] = v8
    return v49
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v7: [Double] = v0[0]
    var v2: Double = v1
    var v10: [Double] = v7
    v10[0] = v1
    v10[0] = v1
    v10[0] = v2
    let v23: Double = v10[0]
    v10[0] = v23
    let v17: [Double] = v0[0]
    let v36: Double = v10[0]
    let v33: Double = v17[0]
    let v40: Double = v33 / v36
    let v50: Double = f39(v40)
    return v50
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
