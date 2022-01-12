  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s2
    var p1: [s2]
  }
  struct s6 {
    var p0: [s2]
  }
  func f25(_ v0: s3) -> s3 {
    let v2: s0 = v0.p0
    var v8: s0 = v2
    let v6: [[Double]] = v2.p0
    var v3: s3 = v0
    let v9: s0 = v3.p1
    v3 = v0
    var v7: s0 = v2
    v3.p1 = v9
    v3.p1 = v7
    let v10: s0 = v3.p0
    let v15: [[Double]] = v10.p0
    let v13: [[Double]] = v8.p0
    var v21: s0 = v8
    v7.p0 = v6
    let v20: [[Double]] = v21.p0
    let v33: s0 = v3.p1
    var v24: s0 = v9
    v21.p0 = v13
    v21.p0 = v6
    v21 = v7
    let v22: [[Double]] = v2.p0
    v21 = v10
    v7.p0 = v22
    v7.p0 = v20
    v3.p0 = v24
    let v18: s0 = v0.p1
    var v48: s3 = v3
    v3.p1 = v7
    var v47: s0 = v33
    v24.p0 = v13
    let v36: s0 = v48.p0
    let v41: s3 = s3(p0: v36, p1: v47)
    var v125: s0 = v18
    v3.p0 = v9
    v7.p0 = v15
    let v85: [[Double]] = v125.p0
    v3.p1 = v2
    v47 = v21
    v47.p0 = v6
    v47.p0 = v85
    return v41
  }
  func f14(_ v0: s3) -> s3 {
    let v6: s3 = f25(v0)
    let v3: s3 = f25(v6)
    let v13: s3 = f25(v3)
    let v71: s3 = f25(v13)
    let v22: s3 = f25(v71)
    let v54: s3 = f25(v22)
    return v54
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: s6, _ v2: [[s5]], _ v3: [s2], _ v4: s0, _ v5: s5, _ v6: s5, _ v7: s0, _ v8: Double) -> Double {
    let v14: s3 = s3(p0: v7, p1: v7)
    let v22: s3 = f14(v14)
    let v33: s0 = v22.p1
    let v35: [[Double]] = v33.p0
    let v38: [Double] = v35[0]
    let v109: Double = v38[0]
    return v109
  }
  func benchmark() {
    let v0: s6 = s6(p0: [s2(p0: s1(p0: [s0(p0: [[0.0]])], p1: s0(p0: [[1.0]])), p1: s1(p0: [s0(p0: [[2.0]])], p1: s0(p0: [[3.0]])))])
    let v1: s6 = s6(p0: [s2(p0: s1(p0: [s0(p0: [[4.0]])], p1: s0(p0: [[5.0]])), p1: s1(p0: [s0(p0: [[6.0]])], p1: s0(p0: [[7.0]])))])
    let v2: [[s5]] = [[s5(p0: s2(p0: s1(p0: [s0(p0: [[8.0]])], p1: s0(p0: [[9.0]])), p1: s1(p0: [s0(p0: [[10.0]])], p1: s0(p0: [[11.0]]))), p1: [s2(p0: s1(p0: [s0(p0: [[12.0]])], p1: s0(p0: [[13.0]])), p1: s1(p0: [s0(p0: [[14.0]])], p1: s0(p0: [[15.0]])))])], [s5(p0: s2(p0: s1(p0: [s0(p0: [[16.0]])], p1: s0(p0: [[17.0]])), p1: s1(p0: [s0(p0: [[18.0]])], p1: s0(p0: [[19.0]]))), p1: [s2(p0: s1(p0: [s0(p0: [[20.0]])], p1: s0(p0: [[21.0]])), p1: s1(p0: [s0(p0: [[22.0]])], p1: s0(p0: [[23.0]])))])]]
    let v3: [s2] = [s2(p0: s1(p0: [s0(p0: [[24.0]])], p1: s0(p0: [[25.0]])), p1: s1(p0: [s0(p0: [[26.0]])], p1: s0(p0: [[27.0]]))), s2(p0: s1(p0: [s0(p0: [[28.0]])], p1: s0(p0: [[29.0]])), p1: s1(p0: [s0(p0: [[30.0]])], p1: s0(p0: [[31.0]])))]
    let v4: s0 = s0(p0: [[32.0]])
    let v5: s5 = s5(p0: s2(p0: s1(p0: [s0(p0: [[33.0]])], p1: s0(p0: [[34.0]])), p1: s1(p0: [s0(p0: [[35.0]])], p1: s0(p0: [[36.0]]))), p1: [s2(p0: s1(p0: [s0(p0: [[37.0]])], p1: s0(p0: [[38.0]])), p1: s1(p0: [s0(p0: [[39.0]])], p1: s0(p0: [[40.0]])))])
    let v6: s5 = s5(p0: s2(p0: s1(p0: [s0(p0: [[41.0]])], p1: s0(p0: [[42.0]])), p1: s1(p0: [s0(p0: [[43.0]])], p1: s0(p0: [[44.0]]))), p1: [s2(p0: s1(p0: [s0(p0: [[45.0]])], p1: s0(p0: [[46.0]])), p1: s1(p0: [s0(p0: [[47.0]])], p1: s0(p0: [[48.0]])))])
    let v7: s0 = s0(p0: [[49.0]])
    let v8: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
