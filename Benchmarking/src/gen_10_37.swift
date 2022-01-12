  import Dispatch
  func f84(_ v0: Double) -> Double {
    var v1: Double = v0
    var v2: Double = v1
    var v4: Double = v2
    var v7: Double = v1
    var v3: Double = v0
    var v13: Double = v7
    var v11: Double = v1
    var v8: Double = v0
    var v6: Double = v13
    var v10: Double = v7
    let v17: [Double] = [v13, v4, v10, v3, v10]
    var v25: [Double] = v17
    var v26: Double = v0
    v25[4] = v6
    var v21: [Double] = v17
    v25[1] = v8
    let v27: Double = v21[0]
    v25[2] = v11
    var v71: [Double] = v25
    v25[4] = v26
    var v30: [Double] = v71
    var v70: Double = v26
    let v34: Double = v30[3]
    v21[2] = v70
    v71[3] = v27
    v71[0] = v27
    v25[2] = v70
    v30[2] = v7
    v21[2] = v1
    v21[1] = v27
    return v34
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v6: Double = v1
    let v2: Double = f84(v1)
    let v5: Double = v0[0]
    let v3: Double = v2 * v6
    let v9: Double = v0[0]
    let v7: Double = f84(v1)
    let v16: Double = f84(v7)
    var v11: Double = v5
    let v22: Double = v0[0]
    let v18: Double = f84(v22)
    let v10: Double = f84(v9)
    let v51: Double = v0[0]
    let v24: Double = v0[0]
    var v23: [Double] = v0
    v23[0] = v24
    let v15: [Double] = [v18, v10, v6, v18, v16, v11]
    v23[0] = v51
    let v26: Double = v15[3]
    let v25: Double = f84(v7)
    var v34: [Double] = v23
    v34[0] = v10
    var v65: [Double] = v23
    var v81: [Double] = v65
    v81 = v65
    v81 = v34
    v23 = v0
    v65[0] = v26
    let v121: Double = v81[0]
    let v100: Double = f84(v25)
    v81 = v65
    var v114: Double = v100
    v34[0] = v3
    v34[0] = v114
    return v121
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
