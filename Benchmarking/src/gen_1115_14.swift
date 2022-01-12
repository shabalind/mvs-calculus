  import Dispatch
  func f72(_ v0: [Double]) -> [Double] {
    var v1: [Double] = v0
    var v7: [Double] = v0
    var v8: [Double] = v7
    let v3: Double = v8[0]
    let v9: Double = v8[0]
    let v4: Double = v3 + v3
    let v10: Double = v7[0]
    let v11: Double = v1[0]
    let v17: Double = v8[0]
    var v12: Double = v9
    v8[0] = v12
    v1[0] = v12
    let v6: [Double] = [v4, v3, v4, v12, v17, v3, v10]
    var v18: [Double] = v6
    let v13: Double = v18[4]
    var v25: [Double] = v7
    var v21: [Double] = v25
    var v32: [Double] = v21
    v21[0] = v13
    v18[0] = v4
    v18[2] = v11
    v8[0] = v11
    var v119: [Double] = v32
    var v201: [Double] = v119
    v7[0] = v11
    return v201
  }
  @inline(never)
  func f0(_ v0: Double) -> Double {
    var v5: Double = v0
    let v7: [Double] = [v5, v0]
    var v4: Double = v0
    let v2: Double = v7[1]
    var v6: [Double] = v7
    let v8: Double = v6[1]
    var v10: [Double] = v7
    let v1: Double = v6[1]
    let v21: Double = v6[1]
    v6[0] = v5
    v10[0] = v21
    let v15: Double = v7[0]
    let v14: Double = v5 - v1
    var v12: [Double] = v10
    v6[0] = v5
    var v17: [Double] = v7
    let v24: Double = v12[0]
    var v28: [Double] = v17
    v17 = v7
    var v18: [Double] = v17
    var v31: [Double] = v10
    v6[1] = v5
    var v27: Double = v15
    v10[0] = v2
    var v39: Double = v5
    let v35: Double = v10[1]
    v10[0] = v21
    var v22: [Double] = v6
    var v79: [Double] = v22
    var v29: [Double] = v12
    v29[1] = v24
    let v43: Double = v29[1]
    v79[0] = v4
    var v46: Double = v27
    var v26: Double = v27
    let v60: Double = v31[1]
    v18[0] = v14
    v27 = v46
    let v41: Double = v12[1]
    var v38: [Double] = v79
    let v66: Double = v29[1]
    v79[1] = v60
    var v56: [Double] = v17
    let v82: [[Double]] = [v18, v29, v17, v28, v56, v38, v18]
    v31[1] = v41
    var v76: [Double] = v29
    v17[1] = v43
    var v25: [[Double]] = v82
    v22[0] = v39
    var v50: Double = v26
    var v45: [[Double]] = v25
    let v69: [Double] = v45[0]
    let v159: Double = v69[1]
    let v163: [Double] = [v159]
    let v129: [Double] = f72(v163)
    let v166: Double = v129[0]
    v17[1] = v50
    v25[5] = v76
    v76[1] = v66
    v12[0] = v8
    v38[0] = v35
    return v166
  }
  func benchmark() {
    let v0: Double = 0.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 0.0
    for _ in 1...1000 {
      result = f0(v0)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
