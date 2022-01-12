  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [[s0]]
    var p3: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s6 {
    var p0: [[s0]]
    var p1: [s2]
  }
  func f27(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v0
    var v2: Double = v3
    v5 = v3
    let v13: Double = v0 + v2
    var v6: Double = v3
    var v8: Double = v13
    let v7: Double = v2 * v0
    var v1: Double = v6
    var v10: Double = v3
    var v11: Double = v0
    v2 = v13
    var v4: Double = v5
    var v14: Double = v4
    let v9: [Double] = [v7, v7, v3, v10, v11]
    var v12: [Double] = v9
    var v17: [Double] = v12
    var v23: Double = v1
    v17[3] = v6
    v17[0] = v23
    var v42: Double = v0
    v10 = v42
    v17[2] = v8
    let v27: Double = v17[1]
    v17[3] = v14
    return v27
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: [s1], _ v2: Double) -> Double {
    var v8: Double = v2
    let v30: Double = v8 / v8
    let v41: Double = f27(v2)
    let v68: Double = v30 + v41
    var v182: Double = v41
    let v175: Double = v68 * v182
    return v175
  }
  func benchmark() {
    let v0: s6 = s6(p0: [[s0(p0: [[0.0]], p1: [1.0])]], p1: [s2(p0: s0(p0: [[2.0]], p1: [3.0]), p1: s0(p0: [[4.0]], p1: [5.0]))])
    let v1: [s1] = [s1(p0: s0(p0: [[6.0]], p1: [7.0]), p1: s0(p0: [[8.0]], p1: [9.0]), p2: [[s0(p0: [[10.0]], p1: [11.0])], [s0(p0: [[12.0]], p1: [13.0])], [s0(p0: [[14.0]], p1: [15.0])]], p3: s0(p0: [[16.0]], p1: [17.0])), s1(p0: s0(p0: [[18.0]], p1: [19.0]), p1: s0(p0: [[20.0]], p1: [21.0]), p2: [[s0(p0: [[22.0]], p1: [23.0])], [s0(p0: [[24.0]], p1: [25.0])], [s0(p0: [[26.0]], p1: [27.0])]], p3: s0(p0: [[28.0]], p1: [29.0])), s1(p0: s0(p0: [[30.0]], p1: [31.0]), p1: s0(p0: [[32.0]], p1: [33.0]), p2: [[s0(p0: [[34.0]], p1: [35.0])], [s0(p0: [[36.0]], p1: [37.0])], [s0(p0: [[38.0]], p1: [39.0])]], p3: s0(p0: [[40.0]], p1: [41.0]))]
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
