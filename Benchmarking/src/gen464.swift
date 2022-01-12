  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f57(_ v0: [Double]) -> [Double] {
    let v2: Double = v0[0]
    let v5: Double = v0[0]
    let v7: Double = v0[0]
    var v1: [Double] = v0
    v1[0] = v5
    var v8: [Double] = v0
    let v9: Double = v8[0]
    var v6: Double = v9
    var v4: Double = v5
    v1[0] = v2
    var v12: Double = v4
    v1[0] = v7
    let v15: Double = v0[0]
    v8[0] = v15
    let v19: Double = v1[0]
    var v11: [Double] = v1
    v11 = v1
    v8[0] = v9
    var v13: [Double] = v1
    v13[0] = v19
    var v16: [Double] = v8
    v8[0] = v6
    v1[0] = v15
    let v22: Double = v11[0]
    let v42: Double = v11[0]
    let v32: Double = v22 / v22
    var v20: [Double] = v13
    var v28: [Double] = v16
    var v35: [Double] = v20
    let v67: Double = v35[0]
    v11[0] = v5
    var v33: [Double] = v16
    let v72: Double = v20[0]
    v33[0] = v12
    let v50: Double = v28[0]
    let v69: Double = v1[0]
    v13[0] = v69
    var v48: [Double] = v8
    v48[0] = v67
    v1[0] = v50
    let v38: Double = v28[0]
    let v80: [[Double]] = [v35, v28, v33, v0, v11]
    var v76: [[Double]] = v80
    var v46: [[Double]] = v80
    v46[2] = v11
    var v47: [[Double]] = v80
    v76[1] = v48
    v48[0] = v72
    let v56: [Double] = v47[0]
    v8[0] = v50
    let v85: [[[Double]]] = [v47, v76, v47]
    var v115: [[[Double]]] = v85
    var v116: [[[Double]]] = v115
    let v81: [[Double]] = v116[2]
    let v70: Double = v56[0]
    let v66: [Double] = v46[1]
    let v68: [Double] = v81[3]
    v46[2] = v33
    v16[0] = v38
    v48[0] = v7
    v33[0] = v5
    v1[0] = v32
    v28[0] = v70
    v11[0] = v42
    v47[3] = v66
    return v68
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v6: [[s0]] = v0
    let v4: [s0] = v6[0]
    var v7: [s0] = v4
    let v11: [s0] = v6[0]
    let v14: s0 = v7[0]
    v7[0] = v14
    let v30: s0 = v4[0]
    let v40: [s0] = v0[0]
    v6[0] = v4
    v6[0] = v7
    v6[0] = v40
    let v29: [[Double]] = v30.p1
    v6[0] = v7
    let v27: [Double] = v29[0]
    let v50: [Double] = f57(v27)
    v6 = v0
    v6[0] = v4
    v6[0] = v11
    let v104: Double = v50[0]
    v6[0] = v7
    return v104
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]]
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
