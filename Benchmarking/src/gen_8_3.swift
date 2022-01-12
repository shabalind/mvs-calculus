  import Dispatch
  func f108(_ v0: [[Double]]) -> [[Double]] {
    var v6: [[Double]] = v0
    var v4: [[Double]] = v0
    let v3: [Double] = v6[0]
    v6 = v0
    var v2: [Double] = v3
    let v5: [Double] = v0[1]
    var v7: [Double] = v5
    v6[0] = v2
    v4[0] = v3
    let v1: Double = v3[0]
    v7[0] = v1
    let v12: Double = v5[0]
    v2 = v3
    let v9: Double = v3[0]
    var v15: Double = v9
    v6[0] = v7
    var v32: [[Double]] = v4
    v2[0] = v9
    var v34: [[Double]] = v32
    let v13: [Double] = v0[1]
    var v11: Double = v1
    v32[1] = v13
    var v42: [Double] = v13
    v34 = v4
    v32[1] = v13
    v6[0] = v42
    v4[1] = v2
    v42[0] = v15
    v42[0] = v12
    v2[0] = v11
    return v34
  }
  func f96(_ v0: [[Double]]) -> [[Double]] {
    let v2: [Double] = v0[0]
    let v7: [[Double]] = f108(v0)
    var v3: [Double] = v2
    var v11: [Double] = v3
    let v4: [Double] = v7[1]
    v3 = v2
    var v6: [[Double]] = v0
    let v1: [[Double]] = f108(v0)
    let v9: [[Double]] = f108(v6)
    var v12: [Double] = v4
    var v8: [[Double]] = v1
    let v15: [[Double]] = f108(v9)
    let v17: [[Double]] = [v12, v12, v3, v11, v3, v11]
    var v18: [[Double]] = v8
    var v28: [Double] = v4
    v6[1] = v2
    v18 = v7
    let v22: [Double] = v18[1]
    let v32: Double = v22[0]
    let v44: Double = v32 + v32
    var v26: [[Double]] = v17
    v28[0] = v32
    let v78: [Double] = v26[5]
    v3[0] = v44
    let v121: Double = v22[0]
    var v114: [[Double]] = v15
    v114[1] = v78
    let v138: [[Double]] = f108(v114)
    v12[0] = v32
    v18[0] = v28
    v11[0] = v121
    let v133: [[Double]] = f108(v138)
    return v133
  }
  func f90(_ v0: [[Double]]) -> [[Double]] {
    let v6: [Double] = v0[0]
    var v1: [[Double]] = v0
    let v2: [Double] = v0[1]
    v1 = v0
    let v5: [[[Double]]] = [v1, v0]
    v1[1] = v6
    let v4: [Double] = v0[0]
    var v7: [Double] = v6
    let v8: [[Double]] = f96(v1)
    v1[1] = v2
    var v10: [[Double]] = v8
    v10[1] = v4
    v10[1] = v7
    var v17: [[[Double]]] = v5
    let v16: [[Double]] = v17[1]
    var v23: [Double] = v7
    v1[1] = v4
    v1[1] = v23
    v10 = v16
    let v42: Double = v6[0]
    v1[0] = v7
    v7[0] = v42
    return v10
  }
  func f78(_ v0: [[Double]], _ v1: Double, _ v2: [[Double]]) -> [[Double]] {
    let v8: [Double] = v0[1]
    var v12: Double = v1
    var v3: [[Double]] = v0
    var v15: [Double] = v8
    var v20: [[Double]] = v3
    v20[1] = v15
    let v21: [Double] = v0[0]
    v15[0] = v12
    let v26: Double = v21[0]
    v15[0] = v26
    v15[0] = v26
    return v20
  }
  func f73(_ v0: [[Double]]) -> [[Double]] {
    let v1: [[[Double]]] = [v0, v0, v0, v0, v0, v0]
    let v6: [Double] = v0[0]
    let v4: [[Double]] = f90(v0)
    let v5: Double = v6[0]
    var v3: [[[Double]]] = v1
    var v2: [[Double]] = v4
    var v8: [[Double]] = v4
    let v7: [Double] = v2[1]
    var v16: Double = v5
    let v9: [[Double]] = f108(v8)
    let v18: Double = v7[0]
    let v12: [[Double]] = f78(v0, v5, v9)
    let v35: [[Double]] = f90(v12)
    let v20: [[Double]] = f78(v9, v16, v9)
    let v29: [Double] = v0[0]
    let v45: [Double] = v20[0]
    let v24: [[Double]] = v3[2]
    let v34: Double = v18 * v18
    let v50: [Double] = v20[1]
    v8[1] = v50
    var v39: [[Double]] = v24
    let v26: [[Double]] = f90(v35)
    v3[3] = v26
    let v27: [[Double]] = f90(v12)
    v39[0] = v29
    v8[0] = v45
    let v52: [[Double]] = f108(v39)
    v2[0] = v29
    let v62: [[Double]] = f78(v39, v34, v20)
    let v61: [[Double]] = f96(v62)
    let v98: [Double] = v61[0]
    let v42: [[[Double]]] = [v52]
    let v89: [[Double]] = f90(v27)
    var v48: [[[Double]]] = v3
    v39[1] = v7
    var v162: [[[Double]]] = v42
    var v54: [Double] = v98
    v8[0] = v54
    v3 = v48
    var v38: [[[Double]]] = v162
    var v84: [Double] = v7
    let v164: [[Double]] = v38[0]
    var v212: [[Double]] = v164
    v38[0] = v212
    var v85: [[[Double]]] = v42
    v54 = v84
    v3[0] = v89
    var v123: [[[Double]]] = v38
    let v95: [[[[Double]]]] = [v38, v85, v162, v42, v85, v85, v123]
    let v152: [[[Double]]] = v95[6]
    let v334: [[Double]] = v152[0]
    return v334
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v5: [[Double]] = f73(v0)
    let v6: [Double] = v5[0]
    let v2: [Double] = v5[1]
    let v7: [[Double]] = [v6, v2, v6]
    var v11: Double = v1
    let v8: [Double] = v7[2]
    let v10: [Double] = v0[0]
    let v64: Double = v8[0]
    let v150: Double = v10[0]
    let v114: [Double] = [v64, v150, v1, v11]
    var v223: [Double] = v114
    let v235: Double = v223[0]
    return v235
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
