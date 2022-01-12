  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s5 {
    var p0: s0
    var p1: s0
  }
  func f93(_ v0: s5, _ v1: s0) -> s0 {
    var v5: s5 = v0
    v5 = v0
    let v6: s0 = v5.p1
    let v9: s0 = v0.p0
    let v2: [[Double]] = v6.p1
    let v14: [[Double]] = v9.p0
    var v47: [[Double]] = v2
    let v26: s0 = v0.p1
    let v30: [Double] = v14[1]
    var v49: s0 = v26
    v49.p1 = v2
    v47[0] = v30
    v49.p1 = v47
    return v49
  }
  func f75(_ v0: s5) -> s5 {
    return v0
  }
  func f66(_ v0: s5) -> s5 {
    var v6: s5 = v0
    var v2: s5 = v6
    let v1: s0 = v2.p1
    let v3: [[Double]] = v1.p1
    var v8: [[Double]] = v3
    v2.p1 = v1
    let v10: s5 = f75(v0)
    var v16: s0 = v1
    let v18: s5 = f75(v10)
    let v20: [Double] = v8[0]
    let v27: s0 = v18.p1
    v16.p1 = v3
    let v30: s5 = s5(p0: v27, p1: v16)
    let v26: s5 = f75(v30)
    let v21: [[Double]] = v1.p1
    v8[0] = v20
    v2.p1 = v1
    v16.p1 = v8
    let v97: s5 = f75(v26)
    v16.p1 = v21
    let v106: s0 = v6.p1
    v6.p0 = v106
    return v97
  }
  func f59(_ v0: s5) -> s5 {
    let v5: s5 = f75(v0)
    var v8: s5 = v0
    var v3: s5 = v5
    let v6: s0 = v0.p0
    let v4: [[Double]] = v6.p0
    var v11: s5 = v3
    v3.p1 = v6
    var v19: s0 = v6
    let v17: s5 = f66(v5)
    let v14: s5 = f75(v0)
    var v13: s5 = v17
    let v20: [[Double]] = v6.p0
    let v10: s0 = v11.p1
    let v30: s5 = f75(v17)
    let v16: [Double] = v20[2]
    v11.p0 = v6
    var v18: s0 = v6
    let v27: s0 = v14.p1
    let v48: s5 = f66(v13)
    let v26: s0 = f93(v30, v10)
    v3 = v11
    let v28: s0 = v3.p0
    let v38: s5 = f66(v13)
    let v103: [s5] = [v48, v0, v11, v11, v38, v8, v17]
    let v49: s5 = v103[1]
    v3.p0 = v18
    v8.p0 = v28
    v3.p1 = v26
    let v102: [[Double]] = v27.p1
    var v157: [s5] = v103
    var v44: [[Double]] = v102
    let v65: [[Double]] = v19.p0
    v18.p1 = v44
    var v47: [[Double]] = v4
    v44[0] = v16
    let v54: s0 = v30.p1
    let v74: [Double] = v65[2]
    let v96: s0 = v49.p1
    let v124: s5 = v157[3]
    v11.p0 = v54
    v18.p0 = v47
    v44[0] = v74
    v8.p0 = v96
    var v91: s5 = v124
    v47[1] = v74
    return v91
  }
  func f12(_ v0: s0) -> s0 {
    let v4: s5 = s5(p0: v0, p1: v0)
    let v2: s5 = f59(v4)
    let v1: s0 = v2.p0
    var v3: s0 = v1
    return v3
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v5: s0 = v0[0]
    let v6: s0 = f12(v5)
    let v3: Double = v2 / v2
    let v20: [[Double]] = v6.p1
    let v35: [Double] = v20[0]
    let v103: Double = v35[0]
    var v81: Double = v103
    v81 = v3
    return v81
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]
    let v1: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])
    let v2: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
