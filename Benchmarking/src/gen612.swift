  import Dispatch
  func f7(_ v0: [[Double]]) -> [[Double]] {
    var v6: [[Double]] = v0
    let v4: [[[Double]]] = [v0, v6, v6, v0, v6, v0, v6]
    let v3: [[Double]] = v4[3]
    let v7: [[Double]] = v4[2]
    var v1: [[[Double]]] = v4
    let v5: [[Double]] = v4[4]
    let v2: [[Double]] = v4[2]
    var v15: [[[Double]]] = v1
    let v10: [[Double]] = v4[6]
    var v14: [[[Double]]] = v1
    let v20: [Double] = v6[1]
    var v12: [[Double]] = v6
    var v19: [[[Double]]] = v1
    var v29: [[Double]] = v3
    var v28: [[[Double]]] = v15
    v12[2] = v20
    let v42: [[Double]] = v19[4]
    let v27: [[Double]] = v4[4]
    let v50: [Double] = v10[1]
    v1[3] = v29
    v12[1] = v50
    let v34: Double = v50[0]
    let v57: [[Double]] = v4[2]
    var v43: [Double] = v50
    v1[5] = v5
    v19[0] = v2
    v15[6] = v7
    v14[6] = v57
    let v93: [Double] = v10[0]
    let v83: [[Double]] = v19[6]
    var v56: [Double] = v93
    let v74: [[[[Double]]]] = [v14, v14, v1, v28, v15]
    v15[4] = v12
    v12[1] = v93
    let v98: [[[Double]]] = v74[3]
    v14[0] = v42
    v12[0] = v56
    v43 = v50
    v19[4] = v83
    v56[0] = v34
    let v181: [[Double]] = v98[1]
    v12[2] = v43
    v6 = v27
    v14[4] = v57
    return v181
  }
  func f4(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v8: [Double] = v0[2]
    var v13: [[Double]] = v0
    var v10: [[Double]] = v13
    let v11: [[Double]] = f7(v1)
    let v20: [[Double]] = f7(v11)
    var v34: [[Double]] = v13
    let v66: [[[Double]]] = [v10, v20, v20, v1, v13]
    var v30: [[[Double]]] = v66
    v30[4] = v34
    let v64: [[Double]] = v30[1]
    v34[0] = v8
    return v64
  }
  func f2(_ v0: [[Double]]) -> [[Double]] {
    var v4: [[Double]] = v0
    let v10: [[Double]] = f7(v4)
    let v11: [[Double]] = f4(v4, v10)
    let v1: [[Double]] = f7(v11)
    let v20: [[Double]] = f4(v1, v11)
    let v13: [[Double]] = f4(v10, v0)
    let v21: [[Double]] = f7(v0)
    let v34: [[Double]] = f7(v13)
    let v23: [[[Double]]] = [v10, v21, v1, v20]
    var v30: [[[Double]]] = v23
    v30[0] = v10
    let v47: [[Double]] = v30[3]
    v4 = v34
    return v47
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    let v5: [[Double]] = f2(v0)
    let v14: [Double] = v5[0]
    let v51: Double = v14[0]
    var v77: Double = v51
    return v77
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0]]
    let v2: [[Double]] = [[5.0], [6.0], [7.0]]
    let v3: [[Double]] = [[8.0]]
    let v4: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
