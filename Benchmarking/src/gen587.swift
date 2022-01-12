  import Dispatch
  func f16(_ v0: [[Double]]) -> [[Double]] {
    let v3: [Double] = v0[1]
    var v2: [[Double]] = v0
    v2[0] = v3
    let v8: [Double] = v2[1]
    v2[0] = v8
    var v15: [[Double]] = v2
    var v23: [[Double]] = v15
    let v29: [Double] = v15[0]
    v2 = v15
    var v38: [[Double]] = v23
    v38[1] = v29
    return v38
  }
  func f14(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f16(v0)
    let v7: [[Double]] = f16(v0)
    var v9: [[Double]] = v7
    var v3: [[Double]] = v5
    let v11: [Double] = v9[1]
    let v6: [[Double]] = f16(v3)
    let v8: [Double] = v0[1]
    let v1: [[Double]] = [v11, v11, v11, v8, v11]
    var v25: [[Double]] = v6
    var v17: [[Double]] = v1
    v17[3] = v8
    var v14: [Double] = v11
    var v38: [[Double]] = v25
    let v32: [Double] = v17[2]
    let v69: [[Double]] = f16(v38)
    v17[2] = v14
    v38[1] = v32
    return v69
  }
  @inline(never)
  func f0(_ v0: Double, _ v1: [[Double]]) -> Double {
    let v7: [Double] = v1[1]
    var v9: Double = v0
    var v5: [Double] = v7
    var v8: Double = v9
    v5[0] = v0
    let v11: [[Double]] = f14(v1)
    v8 = v9
    v5[0] = v0
    let v24: Double = v5[0]
    let v17: [Double] = v11[0]
    let v12: Double = v17[0]
    let v34: [Double] = [v12, v24, v8, v24, v9]
    let v80: Double = v34[4]
    var v42: [Double] = v34
    var v86: [Double] = v34
    var v52: [Double] = v86
    let v121: [[Double]] = [v52, v52, v52, v42]
    let v254: Double = v34[1]
    let v122: [Double] = v121[3]
    v5[0] = v80
    v86[3] = v254
    let v139: Double = v122[2]
    v5[0] = v80
    return v139
  }
  func benchmark() {
    let v0: Double = 0.0
    let v1: [[Double]] = [[1.0], [2.0]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[1.0], [2.0]]
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
