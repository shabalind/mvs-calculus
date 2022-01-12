  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f28(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v5: s0 = v7
    let v4: [[Double]] = v5.p0
    var v9: [[Double]] = v4
    let v1: [Double] = v4[0]
    v9[0] = v1
    let v6: [[[Double]]] = [v4, v9, v4, v9, v4, v4, v9]
    var v3: [[[Double]]] = v6
    let v10: Double = v1[0]
    let v8: [[Double]] = v5.p1
    let v14: [[Double]] = v0.p0
    let v2: [Double] = v8[0]
    let v20: [[Double]] = v0.p0
    var v15: [[Double]] = v8
    var v13: [Double] = v1
    var v17: [[[Double]]] = v6
    v5.p1 = v15
    let v24: [[Double]] = v5.p0
    let v12: [[Double]] = v5.p1
    let v11: [[Double]] = v0.p0
    let v28: [[Double]] = v17[2]
    v3[2] = v28
    let v29: Double = v10 * v10
    var v19: [Double] = v2
    var v26: [Double] = v1
    v9 = v14
    v3[4] = v28
    v5.p1 = v8
    let v39: [[Double]] = v6[2]
    var v46: s0 = v0
    var v23: [Double] = v26
    let v25: Double = v29 + v10
    var v35: [[Double]] = v8
    let v27: [s0] = [v7, v5, v5]
    var v57: s0 = v46
    v9[1] = v23
    let v67: s0 = v27[1]
    let v48: [[Double]] = v3[1]
    let v44: [[Double]] = v46.p1
    let v37: [[Double]] = v67.p1
    v5.p0 = v24
    let v81: [[Double]] = v0.p1
    let v61: s0 = s0(p0: v48, p1: v12)
    v46.p0 = v11
    let v78: [[Double]] = v67.p1
    let v47: [[[Double]]] = [v48, v39, v20]
    v46 = v61
    v9[2] = v19
    v46.p1 = v44
    v19[0] = v25
    v5.p0 = v20
    var v68: s0 = v57
    v46.p1 = v81
    v9[2] = v13
    let v55: [[Double]] = v47[1]
    v5.p1 = v78
    let v53: [[Double]] = v6[1]
    v7 = v61
    v17[1] = v53
    var v186: s0 = v68
    v186.p1 = v35
    v35 = v37
    v15[0] = v26
    v15[0] = v26
    v68.p0 = v4
    v186.p0 = v24
    v186.p0 = v55
    return v186
  }
  func f10(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v5: [[Double]] = v0.p1
    let v4: [[Double]] = v0.p0
    let v2: [[Double]] = v0.p1
    let v9: [Double] = v4[1]
    var v13: [[Double]] = v5
    let v15: s0 = s0(p0: v3, p1: v13)
    v13[0] = v9
    let v16: [Double] = v13[0]
    v13 = v2
    let v142: s0 = f28(v15)
    v13[0] = v16
    let v59: s0 = f28(v142)
    return v59
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: s0 = f28(v0)
    var v4: s0 = v0
    let v2: [[Double]] = v4.p0
    let v6: s0 = f10(v7)
    var v3: s0 = v0
    let v8: s0 = f28(v0)
    v4 = v8
    let v13: [[[Double]]] = [v2, v2, v2, v2, v2]
    let v18: [[Double]] = v13[0]
    let v16: [Double] = v18[0]
    v4.p0 = v2
    v4.p0 = v18
    let v20: [[Double]] = v3.p1
    v4.p1 = v20
    let v19: [[Double]] = v6.p1
    v4.p1 = v19
    let v35: Double = v16[0]
    let v36: [[Double]] = v0.p1
    v3.p1 = v20
    var v31: [[Double]] = v36
    var v30: [[Double]] = v36
    v4.p1 = v20
    let v90: [[Double]] = v3.p1
    let v58: [Double] = v36[0]
    let v83: [Double] = v30[0]
    v4.p1 = v31
    let v108: Double = v35 + v1
    v4.p1 = v90
    v30[0] = v58
    v3.p1 = v19
    v31[0] = v83
    return v108
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
