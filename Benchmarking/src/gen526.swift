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
  struct s8 {
    var p0: [s0]
    var p1: s0
  }
  func f98(_ v0: s2) -> s2 {
    let v7: s0 = v0.p0
    let v3: s1 = v0.p1
    let v6: s1 = v0.p1
    var v5: s1 = v6
    v5 = v3
    var v4: s1 = v6
    v5 = v6
    v4.p0 = v7
    v4.p0 = v7
    v4.p0 = v7
    let v8: s0 = v0.p0
    v4.p0 = v8
    var v1: s0 = v8
    var v13: s0 = v1
    let v11: s0 = v4.p0
    v4.p0 = v11
    let v27: s1 = v0.p1
    v13 = v8
    let v14: s0 = v27.p1
    let v24: s0 = v27.p0
    let v30: [[Double]] = v8.p1
    let v15: [[Double]] = v24.p0
    let v19: s2 = s2(p0: v14, p1: v5)
    var v34: [[Double]] = v15
    v1.p1 = v30
    var v28: [[Double]] = v30
    v5.p1 = v11
    v1.p0 = v15
    let v73: [Double] = v15[1]
    v28[0] = v73
    v13.p1 = v28
    let v65: [Double] = v34[1]
    v5.p1 = v14
    v4.p0 = v13
    v34[0] = v73
    var v38: [[Double]] = v34
    v38[0] = v65
    v1.p0 = v38
    return v19
  }
  func f84(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p1
    let v24: [[Double]] = v0.p0
    var v10: s0 = v0
    v10.p1 = v6
    v10.p0 = v24
    let v19: [[Double]] = v10.p1
    let v30: s1 = s1(p0: v0, p1: v10)
    let v27: s0 = v30.p1
    v10.p1 = v19
    let v40: s2 = s2(p0: v27, p1: v30)
    var v38: s2 = v40
    let v23: s2 = f98(v38)
    v10.p1 = v19
    v38.p1 = v30
    let v88: s0 = v30.p0
    let v78: s1 = v23.p1
    let v97: s0 = v78.p0
    v38.p0 = v88
    v38.p0 = v88
    v10.p0 = v24
    return v97
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s8]], _ v2: Double) -> Double {
    let v6: [s8] = v1[0]
    let v4: s8 = v6[0]
    let v8: s0 = v4.p1
    let v3: s0 = f84(v8)
    let v13: [[Double]] = v3.p1
    let v35: [Double] = v13[0]
    let v49: Double = v35[0]
    let v71: Double = v49 + v2
    let v111: [Double] = [v49, v71]
    var v87: [Double] = v111
    let v83: Double = v87[0]
    return v83
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])))
    let v1: [[s8]] = [[s8(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]))]]
    let v2: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
