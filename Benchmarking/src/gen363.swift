  import Dispatch
  func f21(_ v0: [[Double]]) -> [[Double]] {
    return v0
  }
  func f19(_ v0: [[Double]]) -> [[Double]] {
    let v1: [Double] = v0[1]
    var v3: [[Double]] = v0
    v3[0] = v1
    let v6: [Double] = v3[0]
    let v8: [Double] = v3[0]
    let v5: [[Double]] = f21(v0)
    let v13: [[Double]] = [v1, v8]
    v3[1] = v6
    let v14: [[Double]] = f21(v5)
    v3[1] = v6
    var v100: [[Double]] = v13
    let v60: [Double] = v14[0]
    v3[0] = v60
    return v100
  }
  func f18(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v7: [[[Double]]] = [v1, v0, v1]
    var v5: [[Double]] = v0
    var v4: [[Double]] = v1
    let v3: [[Double]] = f19(v4)
    let v6: [[[Double]]] = [v3]
    let v2: [[Double]] = f21(v5)
    var v11: [[Double]] = v3
    let v15: [[Double]] = f21(v4)
    var v8: [[[Double]]] = v7
    let v9: [Double] = v0[0]
    var v24: [Double] = v9
    v5[0] = v24
    v8[0] = v11
    let v10: Double = v24[0]
    let v23: [Double] = v15[0]
    v11[0] = v23
    var v34: [Double] = v23
    var v19: [[[Double]]] = v8
    let v41: Double = v10 + v10
    v5[1] = v34
    var v28: Double = v41
    v8[1] = v2
    let v22: [[Double]] = f21(v2)
    v24[0] = v10
    var v81: [[[Double]]] = v6
    let v50: [[Double]] = v81[0]
    let v52: [Double] = v22[0]
    v4[1] = v23
    let v49: [Double] = v50[0]
    v4[0] = v9
    v11[0] = v34
    v24[0] = v28
    var v76: [[[Double]]] = v19
    let v101: [[[[Double]]]] = [v76, v19, v76, v8, v76, v8, v7]
    let v75: [[[Double]]] = v101[5]
    v76[1] = v11
    v81 = v6
    v5[1] = v52
    let v149: [[Double]] = v75[0]
    v5[1] = v49
    return v149
  }
  func f16(_ v0: [[Double]]) -> [[Double]] {
    var v4: [[Double]] = v0
    let v7: [Double] = v0[1]
    var v6: [[Double]] = v4
    var v5: [[Double]] = v6
    let v1: [[Double]] = f18(v5, v5)
    v4[1] = v7
    let v2: [[Double]] = f19(v6)
    let v13: [[Double]] = f19(v4)
    let v22: [[Double]] = f19(v6)
    let v35: [[Double]] = f18(v13, v2)
    v5[0] = v7
    let v41: [[Double]] = f21(v13)
    let v34: [Double] = v41[1]
    let v36: [[Double]] = f18(v22, v1)
    let v30: [[Double]] = f19(v5)
    let v19: [[Double]] = f19(v13)
    let v32: [[[Double]]] = [v35, v35, v19, v36, v6, v19, v5]
    let v37: [[Double]] = v32[4]
    var v92: [[[Double]]] = v32
    v92[3] = v37
    var v121: [[[Double]]] = v32
    var v210: [[[Double]]] = v121
    var v97: [[[Double]]] = v92
    let v86: [[[[Double]]]] = [v97, v92, v210, v97, v92, v210, v97]
    v210[0] = v6
    let v131: [[[Double]]] = v86[1]
    let v212: [[Double]] = v131[0]
    v6[0] = v34
    v210[2] = v30
    return v212
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v6: [[Double]] = f16(v0)
    let v5: [Double] = v0[0]
    var v4: Double = v1
    let v7: [Double] = v6[1]
    var v2: [Double] = v5
    let v10: Double = v5[0]
    let v8: Double = v5[0]
    v2[0] = v8
    v2[0] = v10
    v2[0] = v10
    var v21: [[Double]] = v0
    let v28: [[Double]] = f16(v21)
    v2 = v5
    var v26: [[Double]] = v28
    v2[0] = v4
    v21[0] = v7
    let v56: [Double] = v26[1]
    let v41: Double = v56[0]
    v26[1] = v2
    var v114: [[Double]] = v28
    v26 = v114
    return v41
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
