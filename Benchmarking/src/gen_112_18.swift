  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  func f19(_ v0: Double, _ v1: s1) -> Double {
    let v6: [s0] = v1.p1
    let v4: s0 = v6[0]
    let v17: [[Double]] = v4.p1
    let v18: [Double] = v17[1]
    let v36: Double = v18[0]
    var v72: Double = v36
    return v72
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v6: s2 = v0.p0
    var v3: s2 = v6
    var v11: s2 = v3
    var v10: s2 = v11
    var v8: Double = v1
    let v2: [s1] = v3.p0
    let v7: s2 = v0.p0
    var v21: s3 = v0
    let v9: s1 = v2[0]
    let v20: [s1] = v11.p1
    v21.p0 = v3
    v10.p1 = v2
    let v23: s1 = v2[0]
    let v25: Double = f19(v1, v9)
    let v41: Double = f19(v25, v23)
    let v26: Double = v41 - v1
    v3 = v7
    let v30: s1 = v2[0]
    v21.p1 = v10
    v10.p0 = v20
    var v35: [s1] = v20
    let v34: s2 = v21.p1
    v3.p0 = v35
    v11.p0 = v20
    v21 = v0
    let v45: Double = v26 * v8
    let v63: s2 = v0.p1
    let v230: [s1] = v34.p0
    v3.p0 = v230
    let v87: [s1] = v63.p0
    let v156: Double = f19(v45, v30)
    v3.p1 = v87
    return v156
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]], p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])])], p1: [s1(p0: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])]], p1: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])])]), p1: s2(p0: [s1(p0: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]], p1: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])])], p1: [s1(p0: [[s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])]], p1: [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])])]))
    let v1: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
