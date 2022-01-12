  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  func f30(_ v0: Double) -> Double {
    var v7: Double = v0
    var v5: Double = v7
    var v9: Double = v0
    var v2: Double = v5
    var v11: Double = v7
    let v15: [Double] = [v5, v7, v2, v2, v5]
    let v21: Double = v15[3]
    var v18: [Double] = v15
    let v8: Double = v18[2]
    v7 = v11
    v18[0] = v2
    v18[4] = v21
    v18[4] = v9
    v18[3] = v9
    return v8
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: s2, _ v3: Double) -> Double {
    let v18: Double = v3 + v3
    var v17: Double = v18
    var v14: Double = v17
    let v19: Double = v3 / v17
    v14 = v19
    let v47: Double = f30(v14)
    v17 = v3
    return v47
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])]], p1: [[s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])]])
    let v1: s0 = s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])
    let v2: s2 = s2(p0: [s1(p0: [[s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]], p1: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])]]), s1(p0: [[s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])]], p1: [[s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])]])], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]]))
    let v3: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
