  import Dispatch
  func f57(_ v0: [[Double]]) -> [[Double]] {
    let v2: [Double] = v0[0]
    var v1: [[Double]] = v0
    let v4: [[[Double]]] = [v0, v1]
    var v5: [[Double]] = v0
    v5[0] = v2
    v1[0] = v2
    var v15: [[Double]] = v5
    let v12: [Double] = v15[0]
    var v28: [[[Double]]] = v4
    v15[0] = v12
    var v23: [[[Double]]] = v28
    v23[0] = v15
    v15 = v5
    v28[1] = v1
    let v157: [[Double]] = v23[0]
    return v157
  }
  func f56(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f57(v2)
    var v15: [[Double]] = v5
    var v9: [[Double]] = v15
    return v9
  }
  func f54(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[0]
    let v8: Double = v0[0]
    var v4: Double = v6
    var v3: [Double] = v0
    v3[0] = v4
    v3 = v0
    v3[0] = v8
    return v3
  }
  func f29(_ v0: [[Double]]) -> [[Double]] {
    let v6: [[Double]] = f56(v0, v0, v0, v0)
    let v2: [[Double]] = f57(v6)
    return v2
  }
  func f13(_ v0: [[Double]]) -> [[Double]] {
    let v6: [[Double]] = f56(v0, v0, v0, v0)
    var v5: [[Double]] = v6
    var v9: [[Double]] = v5
    let v104: [[Double]] = f56(v6, v5, v0, v9)
    let v55: [[Double]] = f29(v104)
    return v55
  }
  func f12(_ v0: [[Double]]) -> [[Double]] {
    var v5: [[Double]] = v0
    let v6: [Double] = v5[0]
    let v2: [[Double]] = f13(v5)
    let v1: [Double] = v5[0]
    let v7: Double = v1[0]
    var v4: [Double] = v6
    v5[0] = v6
    let v13: [[Double]] = f56(v2, v0, v5, v0)
    v4[0] = v7
    let v10: [Double] = v2[0]
    v5[0] = v10
    let v15: [[Double]] = f56(v0, v5, v0, v13)
    v5[0] = v4
    let v18: [[Double]] = f57(v15)
    return v18
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [Double], _ v2: Double) -> Double {
    let v11: [[Double]] = f12(v0)
    let v10: [Double] = v11[0]
    let v18: [[Double]] = [v1, v1, v1]
    let v14: [Double] = f54(v10)
    var v20: [[Double]] = v18
    let v46: [Double] = v20[2]
    let v30: Double = v46[1]
    var v22: [Double] = v14
    let v60: Double = v22[0]
    let v32: [[Double]] = [v46, v46]
    var v16: [Double] = v46
    v20[0] = v46
    v16[1] = v60
    var v92: [[Double]] = v32
    var v63: [Double] = v46
    var v54: [[Double]] = v92
    v20[1] = v16
    v92[1] = v46
    let v53: [Double] = v54[0]
    let v98: Double = v53[0]
    v63[2] = v30
    v54[1] = v63
    return v98
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [Double] = [1.0, 2.0, 3.0]
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
