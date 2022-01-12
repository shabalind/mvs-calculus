  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f22(_ v0: Double) -> Double {
    var v5: Double = v0
    var v2: Double = v0
    var v7: Double = v5
    v2 = v7
    var v4: Double = v7
    var v8: Double = v4
    var v6: Double = v2
    var v1: Double = v0
    var v11: Double = v0
    var v17: Double = v8
    let v10: [Double] = [v8, v6]
    var v16: [Double] = v10
    v16[1] = v17
    let v38: Double = v8 / v11
    var v9: [Double] = v16
    var v30: Double = v8
    v16 = v10
    var v23: [Double] = v10
    var v15: Double = v1
    var v22: Double = v2
    let v51: Double = v10[0]
    v16[1] = v51
    let v20: Double = v51 / v22
    var v42: [Double] = v10
    v16[0] = v15
    let v61: Double = v10[1]
    let v21: Double = v16[0]
    let v19: Double = v10[0]
    let v29: [Double] = [v21, v7, v51, v5]
    v16[1] = v19
    var v33: [Double] = v9
    v33 = v9
    let v85: [[Double]] = [v29, v29, v29, v29, v29]
    let v27: Double = v10[0]
    v42[0] = v30
    var v55: [Double] = v29
    let v37: Double = v5 * v0
    let v35: Double = v55[2]
    let v80: Double = v33[1]
    let v36: Double = v23[0]
    let v59: [Double] = v85[2]
    let v122: Double = v59[3]
    let v57: [Double] = [v6, v1, v35]
    v16 = v42
    var v93: [Double] = v57
    let v165: Double = v57[1]
    let v104: Double = v93[1]
    let v44: Double = v33[0]
    v23[0] = v27
    v93 = v57
    let v107: [Double] = [v38, v15, v36, v37, v80, v104, v61]
    var v202: [Double] = v107
    let v65: Double = v202[2]
    var v128: Double = v44
    v33[1] = v165
    v9[0] = v21
    v55[3] = v20
    v202[3] = v122
    v23[1] = v128
    return v65
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: [[Double]] = v0.p1
    let v11: [[Double]] = v0.p0
    let v3: [Double] = v7[2]
    let v8: [Double] = v11[1]
    let v13: Double = f22(v1)
    var v27: Double = v13
    var v19: [[Double]] = v11
    v19[0] = v8
    let v23: [Double] = v19[0]
    v19[1] = v3
    let v31: Double = v23[0]
    let v251: Double = f22(v27)
    let v74: Double = v31 * v251
    return v74
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
