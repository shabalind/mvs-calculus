  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: Double
  }
  struct s9 {
    var p0: s1
  }
  func f98(_ v0: Double) -> Double {
    var v6: Double = v0
    let v4: s2 = s2(p0: v6)
    let v19: Double = v4.p0
    return v19
  }
  func f95(_ v0: s2) -> s2 {
    let v7: Double = v0.p0
    let v8: Double = v0.p0
    let v6: [s2] = [v0, v0]
    let v1: Double = f98(v8)
    let v12: s2 = v6[0]
    var v16: s2 = v12
    let v11: Double = f98(v7)
    let v20: Double = f98(v11)
    let v22: Double = v0.p0
    let v24: Double = v22 - v20
    v16.p0 = v1
    v16.p0 = v24
    return v16
  }
  func f52(_ v0: Double) -> Double {
    var v7: Double = v0
    var v2: Double = v0
    let v1: [Double] = [v2, v0, v0, v7, v7]
    let v3: Double = f98(v2)
    var v8: [Double] = v1
    var v6: Double = v3
    var v9: [Double] = v8
    let v11: Double = f98(v6)
    v9[0] = v3
    let v17: Double = f98(v0)
    let v14: Double = v1[2]
    let v16: Double = v8[0]
    var v25: [Double] = v8
    let v19: Double = v9[2]
    let v27: [[Double]] = [v25, v1, v8, v25, v1]
    let v13: s2 = s2(p0: v7)
    let v30: Double = v9[4]
    v7 = v11
    v8[2] = v19
    let v26: [Double] = v27[4]
    var v43: [[Double]] = v27
    let v38: [Double] = v43[2]
    v8[4] = v7
    let v53: Double = v13.p0
    var v36: s2 = v13
    let v42: Double = v36.p0
    var v22: [Double] = v26
    let v51: Double = f98(v0)
    let v125: Double = v38[1]
    let v81: s2 = f95(v13)
    let v90: s2 = f95(v36)
    v36.p0 = v125
    var v77: s2 = v36
    let v32: Double = v77.p0
    v8 = v22
    let v68: s2 = f95(v36)
    let v57: Double = v13.p0
    v77.p0 = v125
    v43[4] = v38
    var v55: s2 = v68
    v22[0] = v42
    let v91: Double = v90.p0
    let v54: [s2] = [v81, v77, v90, v77]
    let v69: s2 = f95(v68)
    v55.p0 = v14
    let v78: s2 = f95(v69)
    v22[4] = v53
    v25[0] = v17
    let v84: Double = v36.p0
    v55.p0 = v16
    v22[2] = v84
    let v179: s2 = f95(v13)
    v55.p0 = v6
    v77.p0 = v91
    let v97: Double = v11 - v57
    let v99: s2 = v54[0]
    v36.p0 = v32
    let v214: s2 = v54[3]
    let v160: Double = v55.p0
    let v203: Double = f98(v19)
    v7 = v19
    v9[2] = v160
    v55.p0 = v203
    v77 = v78
    v36.p0 = v0
    let v279: Double = v214.p0
    v36.p0 = v53
    v8[2] = v51
    v25[4] = v97
    v55.p0 = v279
    let v204: Double = v179.p0
    let v183: s2 = f95(v99)
    v36.p0 = v204
    v36.p0 = v30
    let v266: Double = v183.p0
    return v266
  }
  @inline(never)
  func f0(_ v0: [[s9]], _ v1: Double) -> Double {
    var v8: Double = v1
    let v6: Double = f52(v8)
    let v22: Double = f98(v6)
    let v47: Double = f98(v8)
    v8 = v47
    let v91: Double = v47 - v22
    return v91
  }
  func benchmark() {
    let v0: [[s9]] = [[s9(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0]])))], [s9(p0: s1(p0: s0(p0: [[2.0]], p1: [[3.0]])))]]
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
