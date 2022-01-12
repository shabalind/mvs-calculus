  import Dispatch
  func f40(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[2]
    let v7: Double = v0[2]
    let v3: Double = v0[2]
    var v5: [Double] = v0
    var v14: [Double] = v5
    v5[0] = v3
    v5[1] = v3
    var v17: Double = v7
    v5[2] = v17
    v14[2] = v6
    var v50: [Double] = v14
    return v50
  }
  @inline(never)
  func f0(_ v0: Double) -> Double {
    var v6: Double = v0
    var v2: Double = v6
    var v4: Double = v0
    var v7: Double = v2
    var v3: Double = v7
    var v1: Double = v7
    var v13: Double = v4
    var v11: Double = v7
    let v9: Double = v11 * v6
    var v10: Double = v7
    var v14: Double = v4
    var v18: Double = v3
    let v17: Double = v14 + v2
    let v25: [Double] = [v0, v11, v13]
    let v19: [Double] = f40(v25)
    var v16: [Double] = v19
    let v38: [Double] = f40(v19)
    let v12: Double = v2 * v9
    v4 = v18
    v16[0] = v12
    let v24: Double = v16[1]
    v4 = v0
    let v20: [Double] = f40(v38)
    let v44: [Double] = f40(v38)
    var v57: [Double] = v20
    let v40: [Double] = f40(v38)
    let v51: [Double] = f40(v57)
    v14 = v7
    let v34: [Double] = f40(v44)
    v57[2] = v1
    let v31: [Double] = f40(v51)
    let v93: [Double] = f40(v31)
    var v64: Double = v24
    v57[2] = v17
    let v84: Double = v93[1]
    var v69: Double = v11
    v64 = v11
    let v98: Double = v34[2]
    let v97: Double = v40[0]
    let v151: [Double] = [v13, v84, v69, v97, v10, v64]
    v16 = v38
    var v178: [Double] = v151
    v13 = v11
    let v122: Double = v178[3]
    v16[1] = v98
    return v122
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
