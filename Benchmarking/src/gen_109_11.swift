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
    var p0: [s1]
    var p1: s1
  }
  struct s5 {
    var p0: s1
  }
  func f81(_ v0: s2, _ v1: s2) -> s2 {
    return v0
  }
  func f30(_ v0: Double, _ v1: s2) -> s2 {
    let v10: s2 = f81(v1, v1)
    let v6: s1 = v1.p1
    let v5: s5 = s5(p0: v6)
    let v14: s1 = v5.p0
    let v4: s2 = f81(v10, v1)
    var v28: s2 = v4
    v28.p1 = v14
    let v22: s2 = f81(v28, v4)
    v28.p1 = v14
    let v85: s2 = f81(v10, v22)
    return v85
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v5: s2 = f30(v1, v0)
    let v7: s1 = v5.p1
    var v8: s1 = v7
    let v36: [s0] = v8.p1
    v8 = v7
    let v17: s0 = v36[2]
    let v24: s0 = v36[0]
    var v38: [s0] = v36
    v38[2] = v24
    let v67: [[Double]] = v24.p0
    let v29: Double = v1 * v1
    v8.p1 = v38
    let v103: s0 = v38[2]
    v38[2] = v17
    v38[2] = v17
    let v52: [Double] = v67[1]
    let v42: Double = v52[0]
    v38[1] = v17
    let v54: Double = v42 + v29
    var v115: Double = v54
    v38[1] = v103
    return v115
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])]), s1(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])], p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]])])], p1: s1(p0: [s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]])], p1: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0]])]))
    let v1: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
