  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s6 {
    var p0: s1
    var p1: s2
  }
  func f56(_ v0: Double) -> Double {
    var v7: Double = v0
    var v3: Double = v7
    var v1: Double = v3
    var v6: Double = v3
    var v8: Double = v7
    var v9: Double = v1
    var v4: Double = v8
    var v22: Double = v1
    let v13: [Double] = [v6]
    var v34: [Double] = v13
    let v18: Double = v13[0]
    let v19: Double = v34[0]
    v34[0] = v18
    let v16: Double = v34[0]
    var v24: Double = v9
    v34[0] = v24
    v34[0] = v18
    var v81: Double = v4
    let v33: [Double] = [v1, v9, v22, v22, v22, v19]
    var v45: [Double] = v33
    v34[0] = v81
    v34[0] = v16
    v45[4] = v6
    let v38: Double = v45[1]
    return v38
  }
  @inline(never)
  func f0(_ v0: [s6], _ v1: Double) -> Double {
    let v8: Double = f56(v1)
    let v2: Double = f56(v8)
    var v17: Double = v2
    return v17
  }
  func benchmark() {
    let v0: [s6] = [s6(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])]), p1: s2(p0: s0(p0: [[2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0]]))), s6(p0: s1(p0: [s0(p0: [[6.0]], p1: [[7.0]])]), p1: s2(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]])))]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
