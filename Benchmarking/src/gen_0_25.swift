  import Dispatch
  func f46(_ v0: Double) -> Double {
    var v1: Double = v0
    v1 = v0
    var v3: Double = v0
    var v5: Double = v0
    var v8: Double = v1
    var v2: Double = v3
    var v7: Double = v2
    let v6: [Double] = [v1, v3, v7]
    let v9: Double = v6[1]
    var v17: Double = v3
    let v15: Double = v17 + v8
    let v18: [Double] = [v9, v8, v1, v8, v5]
    let v26: Double = v18[4]
    var v24: [Double] = v18
    v24[0] = v7
    let v52: Double = v6[1]
    v24[3] = v52
    v24[4] = v26
    v24[2] = v1
    v24[4] = v15
    var v38: [Double] = v18
    v38 = v24
    var v75: [Double] = v38
    let v81: Double = v75[2]
    return v81
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v6: [Double] = v0
    v6[0] = v1
    let v5: Double = v6[0]
    let v9: Double = f46(v5)
    let v7: Double = v0[0]
    let v2: Double = v0[0]
    let v14: Double = v6[0]
    var v11: [Double] = v6
    let v22: Double = f46(v14)
    var v26: [Double] = v11
    let v20: Double = f46(v7)
    var v18: [Double] = v11
    let v25: Double = v26[0]
    let v32: Double = v26[0]
    v11[0] = v14
    var v31: [Double] = v0
    v18[0] = v25
    var v43: [Double] = v18
    let v19: Double = v31[0]
    let v41: Double = f46(v5)
    var v56: [Double] = v43
    let v51: Double = f46(v22)
    var v28: [Double] = v6
    v11[0] = v41
    v28[0] = v2
    v6[0] = v22
    var v33: [Double] = v56
    let v44: Double = f46(v19)
    v11[0] = v20
    v56[0] = v25
    let v34: [[Double]] = [v33, v18]
    let v108: [[[Double]]] = [v34, v34, v34]
    var v63: [Double] = v0
    v11 = v63
    let v86: [[Double]] = v108[0]
    var v79: [[Double]] = v86
    v6[0] = v51
    let v113: [Double] = v79[0]
    let v66: Double = v113[0]
    let v128: Double = f46(v32)
    let v176: Double = f46(v44)
    var v88: [Double] = v63
    v18[0] = v1
    let v127: Double = f46(v66)
    v18 = v88
    let v102: Double = f46(v176)
    v88[0] = v102
    v18[0] = v128
    v63[0] = v9
    v11 = v28
    return v127
  }
  func benchmark() {
    let v0: [Double] = [0.0]
    let v1: Double = 1.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
