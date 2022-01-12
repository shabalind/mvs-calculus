  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: s1
  }
  func f101(_ v0: s2) -> s2 {
    var v1: s2 = v0
    let v5: [[s0]] = v0.p0
    let v6: [s0] = v5[0]
    var v4: s2 = v0
    var v7: s2 = v1
    let v10: [s0] = v4.p1
    let v2: [s0] = v1.p1
    var v8: [s0] = v2
    let v14: s0 = v2[1]
    let v12: [s0] = v7.p1
    v8[1] = v14
    let v9: [s0] = v4.p1
    let v16: s2 = s2(p0: v5, p1: v8)
    v8[1] = v14
    let v21: s0 = v6[0]
    v8[1] = v14
    v8[1] = v21
    v7.p0 = v5
    v7.p0 = v5
    v1.p1 = v12
    let v22: [[s0]] = v7.p0
    v4.p0 = v22
    v7.p1 = v10
    let v36: [s0] = v16.p1
    let v26: [[s0]] = v0.p0
    v4.p0 = v26
    v1.p1 = v36
    v4.p0 = v5
    v4.p0 = v26
    v1.p1 = v10
    let v77: [[s0]] = v16.p0
    var v47: [s0] = v9
    let v81: [s0] = v7.p1
    let v97: s2 = s2(p0: v22, p1: v81)
    v4.p1 = v12
    v7.p0 = v77
    var v98: s2 = v97
    var v88: [s0] = v47
    let v135: [[s0]] = v1.p0
    v98.p0 = v135
    v1.p1 = v88
    return v98
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    var v3: s4 = v0
    let v7: s1 = v3.p1
    let v8: s2 = v3.p0
    v3.p1 = v7
    let v20: s2 = f101(v8)
    v3.p0 = v20
    let v28: [s0] = v20.p1
    let v162: s0 = v28[1]
    let v67: [[Double]] = v162.p1
    let v175: [Double] = v67[0]
    let v177: Double = v175[0]
    return v177
  }
  func benchmark() {
    let v0: s4 = s4(p0: s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), p1: s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]])]))
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
