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
    var p0: s0
    var p1: s1
  }
  func f21(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v6: s0 = v4
    let v2: [[Double]] = v0.p0
    var v1: [[Double]] = v2
    var v3: [[Double]] = v1
    let v7: [Double] = v3[0]
    var v5: [Double] = v7
    let v9: [[Double]] = v0.p1
    v1[0] = v5
    let v11: [[Double]] = v6.p1
    v1[0] = v5
    v1[0] = v7
    v4.p1 = v11
    let v16: Double = v7[0]
    v4.p1 = v9
    let v20: [[Double]] = v4.p0
    v1[0] = v7
    v5[0] = v16
    v4.p0 = v1
    let v23: [Double] = v20[0]
    v3[0] = v5
    v3[0] = v23
    return v4
  }
  func f11(_ v0: s0) -> s0 {
    let v18: s0 = f21(v0)
    let v13: s0 = f21(v18)
    return v13
  }
  func f4(_ v0: s0) -> s0 {
    let v7: s0 = f21(v0)
    var v2: s0 = v7
    var v6: s0 = v0
    let v5: [s0] = [v7, v6, v7, v7, v2]
    let v4: s0 = v5[0]
    let v3: s0 = v5[1]
    let v13: [[Double]] = v2.p1
    v6.p0 = v13
    var v9: [s0] = v5
    let v19: s0 = v9[0]
    let v15: [[Double]] = v4.p0
    let v28: s0 = v9[3]
    let v11: [[s0]] = [v5, v5, v9, v9, v9]
    let v33: [[Double]] = v28.p0
    v2.p0 = v33
    let v17: s0 = f11(v4)
    var v38: [[s0]] = v11
    v38[2] = v9
    let v34: s0 = f21(v4)
    let v30: [[Double]] = v19.p0
    var v27: s0 = v3
    var v37: [s0] = v5
    let v53: s0 = f21(v7)
    let v51: [[Double]] = v27.p1
    v27.p0 = v30
    let v36: s0 = v37[2]
    v2 = v7
    v37[3] = v28
    let v104: [[Double]] = v36.p1
    v6.p1 = v104
    let v56: s0 = f11(v4)
    v2 = v7
    v6.p0 = v51
    v37[1] = v34
    let v73: [s0] = v38[2]
    v6.p1 = v15
    let v144: [[Double]] = v17.p1
    let v170: [[Double]] = v53.p0
    v9 = v73
    let v87: s0 = f21(v56)
    let v109: [s0] = v11[1]
    v27.p1 = v51
    let v118: s0 = v109[3]
    v27.p0 = v170
    var v92: [[Double]] = v144
    v9[0] = v6
    v9[0] = v87
    v2.p0 = v92
    return v118
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s2, _ v2: Double) -> Double {
    let v6: s1 = v1.p1
    let v8: s0 = v6.p1
    let v15: s0 = f4(v8)
    let v35: [[Double]] = v15.p1
    let v64: [Double] = v35[0]
    let v70: Double = v64[0]
    return v70
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])]
    let v1: s2 = s2(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]])))
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
