  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s1
  }
  func f32(_ v0: s0, _ v1: s1) -> s0 {
    let v4: [[s0]] = v1.p1
    var v5: [[s0]] = v4
    let v7: [s0] = v5[2]
    let v6: [s0] = v5[1]
    v5[1] = v7
    let v10: s0 = v1.p0
    var v24: [s0] = v6
    v24[0] = v10
    let v59: s0 = v24[0]
    v24[0] = v10
    return v59
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s5], _ v2: s1, _ v3: s2, _ v4: Double) -> Double {
    var v8: s1 = v2
    let v10: s0 = v3.p0
    let v13: s0 = f32(v10, v8)
    let v16: s0 = f32(v13, v8)
    let v34: [[Double]] = v16.p0
    var v98: [[Double]] = v34
    let v124: [Double] = v98[0]
    var v82: [Double] = v124
    let v78: Double = v82[0]
    return v78
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), s2(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))]
    let v1: [s5] = [s5(p0: s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [[s0(p0: [[15.0], [16.0]], p1: [[17.0]])], [s0(p0: [[18.0], [19.0]], p1: [[20.0]])], [s0(p0: [[21.0], [22.0]], p1: [[23.0]])]]))]
    let v2: s1 = s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0]]), p1: [[s0(p0: [[27.0], [28.0]], p1: [[29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0]])], [s0(p0: [[33.0], [34.0]], p1: [[35.0]])]])
    let v3: s2 = s2(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0]]), p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]]))
    let v4: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
