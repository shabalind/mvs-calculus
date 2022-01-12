  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f109(_ v0: s1) -> s1 {
    var v2: s1 = v0
    let v3: [s1] = [v0, v0, v0, v2, v0, v0, v0]
    var v5: s1 = v2
    let v4: s1 = v3[6]
    var v8: [s1] = v3
    v8[6] = v5
    let v12: s1 = v8[6]
    let v20: s1 = v8[2]
    v8[1] = v0
    let v14: s1 = v8[5]
    v2 = v20
    v8[4] = v4
    v8[3] = v12
    v8[2] = v14
    let v52: s1 = v8[3]
    var v31: s1 = v52
    return v31
  }
  func f102(_ v0: s1) -> s1 {
    let v1: s0 = v0.p0
    var v4: s0 = v1
    let v9: [[Double]] = v4.p0
    let v13: s1 = f109(v0)
    var v18: s1 = v13
    v18.p0 = v1
    v4.p0 = v9
    let v49: s1 = f109(v18)
    var v28: s0 = v4
    let v76: s1 = f109(v49)
    let v87: s1 = f109(v76)
    let v93: s1 = f109(v76)
    v18 = v87
    v18.p1 = v28
    let v128: s1 = f109(v93)
    return v128
  }
  func f100(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    var v1: [[Double]] = v7
    let v5: [Double] = v1[1]
    v1[0] = v5
    let v4: [[Double]] = v0.p0
    var v13: [[Double]] = v1
    let v3: [[Double]] = v0.p0
    var v25: [[Double]] = v4
    let v10: [Double] = v25[0]
    v25[0] = v10
    let v14: [Double] = v1[0]
    var v11: s0 = v0
    let v29: s1 = s1(p0: v11, p1: v11)
    let v21: Double = v5[0]
    var v9: s1 = v29
    var v26: s0 = v11
    let v15: [[Double]] = v26.p0
    let v17: s1 = f109(v9)
    v26.p0 = v3
    let v24: [[Double]] = v0.p0
    v25[1] = v5
    v9.p1 = v26
    v25[1] = v10
    var v35: s0 = v26
    let v34: [Double] = v15[1]
    v35.p0 = v3
    v26.p0 = v13
    let v51: s1 = f109(v17)
    let v76: s1 = f102(v51)
    var v37: [Double] = v34
    let v50: s0 = v76.p1
    v13[0] = v34
    let v70: [Double] = v4[1]
    v13[1] = v10
    v13[1] = v14
    v11.p0 = v13
    v13[0] = v37
    v11.p0 = v24
    let v203: s1 = f102(v51)
    v9.p0 = v50
    var v188: Double = v21
    v37[0] = v188
    var v145: s0 = v35
    v9.p0 = v26
    v25[0] = v70
    let v177: [[Double]] = v145.p0
    let v190: s0 = v203.p0
    v9.p1 = v26
    v13 = v177
    return v190
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: s0 = f100(v0)
    let v11: [[Double]] = v7.p0
    let v10: [Double] = v11[0]
    let v23: [Double] = v11[1]
    let v33: Double = v10[0]
    let v48: Double = v23[0]
    let v44: Double = v33 / v48
    return v44
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]])
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
