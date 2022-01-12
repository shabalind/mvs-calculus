  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f39(_ v0: Double) -> Double {
    var v3: Double = v0
    var v4: Double = v3
    var v2: Double = v3
    var v1: Double = v0
    var v13: Double = v0
    var v6: Double = v1
    var v10: Double = v3
    var v5: Double = v6
    let v16: [Double] = [v6, v2, v2, v5, v3, v4, v5]
    let v15: Double = v16[5]
    var v12: [Double] = v16
    let v35: [[Double]] = [v12, v16, v16, v12, v16, v12, v12]
    let v19: [[Double]] = [v12, v16, v12, v16, v16, v12, v12]
    v12[4] = v4
    var v24: Double = v15
    var v14: [Double] = v12
    let v37: [Double] = v19[1]
    v14[5] = v4
    let v31: Double = v12[4]
    let v23: [Double] = v19[0]
    let v45: [Double] = v19[4]
    var v40: [[Double]] = v35
    v12[4] = v15
    v40[2] = v45
    v14[5] = v6
    let v32: [[[Double]]] = [v40, v35, v19, v40]
    v40[6] = v14
    var v18: [[[Double]]] = v32
    let v28: [Double] = v19[6]
    v40[0] = v28
    let v22: [[Double]] = v18[3]
    v13 = v24
    let v62: [[Double]] = v32[2]
    let v52: Double = v4 - v2
    let v27: [Double] = v35[6]
    v18[3] = v19
    v10 = v3
    var v59: [Double] = v14
    let v51: [Double] = v62[2]
    v14[3] = v10
    let v85: Double = v16[4]
    v12[1] = v13
    let v36: Double = v51[6]
    v59[3] = v24
    let v109: [Double] = v22[5]
    v12 = v51
    let v47: Double = v37[4]
    v40[0] = v28
    v1 = v85
    v18[2] = v19
    let v79: [[Double]] = [v27, v23, v59, v109, v12]
    let v170: [Double] = v79[4]
    v5 = v31
    let v179: Double = v170[2]
    v13 = v52
    v12[6] = v47
    v14[1] = v10
    let v185: Double = v36 - v179
    return v185
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v4: Double = v1
    let v7: [[Double]] = v0.p0
    let v8: [Double] = v7[0]
    let v11: Double = f39(v1)
    let v21: Double = f39(v11)
    let v12: Double = v8[0]
    v4 = v12
    var v50: Double = v4
    let v34: [[Double]] = v0.p1
    let v39: [Double] = v34[0]
    var v175: [Double] = v39
    let v124: Double = v175[0]
    var v77: Double = v21
    let v166: Double = f39(v50)
    v77 = v124
    v175[0] = v166
    return v77
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
