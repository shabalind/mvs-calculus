  import Dispatch
  func f29(_ v0: [Double]) -> [Double] {
    var v3: [Double] = v0
    let v1: Double = v3[2]
    let v7: Double = v0[0]
    var v4: [Double] = v0
    var v6: [Double] = v3
    var v5: Double = v7
    let v15: Double = v4[0]
    let v14: Double = v6[2]
    var v9: [Double] = v3
    let v12: Double = v6[2]
    v9[0] = v5
    var v11: [Double] = v0
    let v10: [Double] = [v1, v15, v14, v14, v15, v15, v1]
    v9[1] = v12
    v11[1] = v14
    var v13: [Double] = v10
    v9 = v3
    let v23: Double = v13[1]
    var v19: [Double] = v9
    let v22: Double = v9[0]
    let v60: Double = v0[2]
    let v62: Double = v22 + v1
    v19[0] = v22
    var v86: [Double] = v19
    v86 = v11
    v3[0] = v60
    v19[0] = v23
    v5 = v15
    v6[2] = v62
    return v86
  }
  func f22(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[2]
    var v2: [Double] = v0
    v2[2] = v6
    let v4: Double = v2[0]
    let v5: Double = v0[1]
    let v1: [Double] = f29(v2)
    v2[0] = v5
    let v9: [Double] = f29(v2)
    let v25: Double = v4 / v4
    let v19: [[Double]] = [v0, v1, v9]
    let v24: [Double] = v19[2]
    var v29: [Double] = v24
    v29[0] = v25
    return v29
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [Double], _ v2: Double) -> Double {
    let v13: Double = v1[0]
    let v11: [Double] = f22(v1)
    var v10: [Double] = v1
    v10 = v11
    v10[2] = v13
    let v18: Double = v11[0]
    v10[1] = v13
    let v33: Double = v10[0]
    var v23: Double = v33
    var v26: [Double] = v11
    v26[0] = v23
    var v61: [Double] = v26
    v10[2] = v18
    let v32: Double = v61[2]
    return v32
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [Double] = [3.0, 4.0, 5.0]
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
