  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    var v5: Double = v1
    let v13: Double = v5 + v1
    let v3: [Double] = v0[0]
    let v6: Double = v3[0]
    var v10: [Double] = v3
    var v21: Double = v6
    var v11: [Double] = v10
    var v15: [Double] = v3
    var v8: [[Double]] = v0
    v15[0] = v21
    var v19: [Double] = v15
    let v48: [Double] = v8[0]
    v15[0] = v21
    let v25: Double = v19[0]
    let v12: Double = v48[0]
    let v14: Double = v21 + v1
    v8 = v0
    var v23: [Double] = v19
    v19[0] = v25
    let v28: [Double] = v0[1]
    var v43: [[Double]] = v8
    v21 = v12
    v43[0] = v23
    v10[0] = v13
    var v54: Double = v5
    v8[0] = v28
    v15[0] = v14
    let v41: Double = v10[0]
    var v45: Double = v54
    let v86: [Double] = v43[0]
    v43[0] = v23
    let v72: Double = v86[0]
    var v82: Double = v72
    v23 = v10
    v8[0] = v11
    v15[0] = v45
    v11[0] = v41
    return v82
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
