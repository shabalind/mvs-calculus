  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v5: s2 = v0
    let v3: s0 = v5.p1
    v5.p1 = v3
    var v6: Double = v1
    var v8: s2 = v5
    var v2: s2 = v0
    var v13: s0 = v3
    v8.p1 = v3
    var v10: s0 = v3
    var v9: s2 = v5
    var v18: s2 = v9
    var v12: s0 = v10
    let v11: s1 = v8.p0
    let v16: [[Double]] = v10.p1
    v18.p1 = v10
    let v15: [Double] = v16[1]
    let v25: Double = v15[0]
    v8.p1 = v13
    let v24: [Double] = v16[1]
    v8.p1 = v13
    let v22: Double = v25 / v1
    var v19: Double = v22
    v5.p1 = v10
    let v29: Double = v1 / v19
    v8.p0 = v11
    let v23: [s1] = [v11, v11, v11, v11]
    let v17: s0 = v11.p1
    v5.p1 = v13
    v10 = v17
    let v48: [[Double]] = v17.p0
    let v59: s1 = s1(p0: v10, p1: v12)
    v18.p0 = v59
    v2.p0 = v11
    let v33: Double = v19 / v6
    var v43: Double = v29
    let v51: s1 = v2.p0
    var v38: [[Double]] = v48
    let v30: [Double] = v48[2]
    v38[0] = v30
    v38[1] = v15
    v38[0] = v24
    v38[0] = v24
    var v50: [[Double]] = v48
    let v67: s1 = v8.p0
    let v35: [[[Double]]] = [v38, v50, v48, v48, v48, v50, v50]
    var v54: [s1] = v23
    let v95: s1 = v54[2]
    let v98: [[Double]] = v35[0]
    v43 = v33
    v8 = v18
    v5.p0 = v95
    v8.p1 = v10
    v12.p0 = v98
    v54[2] = v67
    v54[1] = v51
    return v43
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
