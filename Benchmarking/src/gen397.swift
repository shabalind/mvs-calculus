  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [[s2]]
    var p1: [s0]
  }
  struct s5 {
    var p0: s3
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s5, _ v2: Double) -> Double {
    var v8: Double = v2
    let v3: s0 = v1.p1
    let v10: [[Double]] = v3.p0
    let v11: [Double] = v10[1]
    var v4: Double = v8
    let v17: Double = v11[0]
    let v13: [Double] = v10[1]
    let v14: Double = v4 * v17
    let v25: Double = v13[0]
    var v41: Double = v14
    let v62: [Double] = v10[2]
    var v68: [Double] = v62
    v8 = v41
    var v61: Double = v25
    v68[0] = v61
    v68[0] = v14
    let v77: Double = v68[0]
    return v77
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])]]
    let v1: s5 = s5(p0: s3(p0: [[s2(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), p1: [[s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]])], [s2(p0: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), p1: [[s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])], [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])], [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])]])]], p1: [s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])]), p1: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]))
    let v2: Double = 55.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 55.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
