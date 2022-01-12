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
  struct s5 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: [s2], _ v2: Double) -> Double {
    let v6: s2 = v1[0]
    let v9: s0 = v6.p1
    let v15: s2 = v1[1]
    let v4: [[Double]] = v9.p1
    var v19: [[Double]] = v4
    let v11: [Double] = v19[0]
    let v21: Double = v11[0]
    let v24: s1 = v15.p0
    let v22: [Double] = v4[0]
    v19[0] = v22
    let v53: [Double] = [v2, v21, v21]
    let v27: s0 = v24.p0
    var v18: [Double] = v53
    let v17: [[Double]] = v27.p0
    let v30: [Double] = v17[1]
    let v26: Double = v18[2]
    let v115: Double = v18[2]
    v18[2] = v115
    v19[0] = v30
    let v85: Double = v30[0]
    let v55: [Double] = [v26, v85]
    let v90: Double = v18[2]
    let v128: Double = v55[0]
    let v162: Double = v90 - v128
    return v162
  }
  func benchmark() {
    let v0: s5 = s5(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])])
    let v1: [s2] = [s2(p0: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])), s2(p0: s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])), p1: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])), s2(p0: s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])), p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]))]
    let v2: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
