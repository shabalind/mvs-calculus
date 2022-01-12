  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f11(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    let v7: [s0] = [v0, v0, v0, v0, v0]
    let v2: s0 = v7[3]
    var v11: [s0] = v7
    v11[2] = v0
    let v1: [[Double]] = v2.p0
    let v13: [[Double]] = v0.p0
    var v12: s0 = v2
    var v21: [s0] = v11
    let v17: [[Double]] = v12.p1
    v21[0] = v12
    let v9: [[Double]] = v0.p1
    var v16: [[Double]] = v1
    v12.p1 = v17
    v12.p0 = v1
    let v10: [[Double]] = v12.p1
    v12.p0 = v13
    let v50: [[Double]] = v2.p0
    v12.p1 = v4
    var v26: [s0] = v21
    v12.p0 = v50
    v12.p0 = v16
    let v49: s0 = v26[2]
    let v52: [[Double]] = v12.p0
    v12.p0 = v50
    var v48: [[Double]] = v10
    let v46: s0 = v26[3]
    let v47: [Double] = v52[1]
    var v57: s0 = v49
    v12.p1 = v4
    let v14: s0 = v7[2]
    v57.p0 = v13
    let v67: [[Double]] = v57.p0
    let v72: [[Double]] = v46.p0
    v12.p1 = v9
    v48[0] = v47
    var v38: s0 = v46
    var v108: [s0] = v21
    v57.p0 = v72
    v26[4] = v57
    v108[3] = v14
    v12.p0 = v67
    let v175: s0 = v7[3]
    v12.p1 = v48
    var v124: [[Double]] = v9
    let v106: s0 = v108[0]
    v38.p1 = v124
    v26[1] = v175
    v108[4] = v38
    return v106
  }
  func f8(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    let v4: [Double] = v1[2]
    var v2: [[Double]] = v1
    let v8: s0 = f11(v0)
    let v12: [[Double]] = v8.p0
    v2[1] = v4
    let v15: [[Double]] = v0.p1
    let v5: s0 = s0(p0: v2, p1: v15)
    let v3: s0 = f11(v5)
    let v11: [[Double]] = v3.p0
    let v14: s0 = s0(p0: v12, p1: v15)
    let v28: s0 = f11(v3)
    v2 = v11
    let v35: s0 = f11(v14)
    let v31: s0 = f11(v14)
    let v74: [s0] = [v35, v35, v31, v28]
    let v63: s0 = v74[2]
    return v63
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v7: [s0] = v0[1]
    var v6: [s0] = v7
    let v3: s0 = v6[0]
    v6[0] = v3
    let v2: s0 = f8(v3)
    let v8: s0 = f11(v2)
    let v23: [[Double]] = v8.p1
    let v21: [Double] = v23[0]
    let v44: Double = v21[0]
    var v124: Double = v44
    return v124
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
