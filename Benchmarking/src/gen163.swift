  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: s2, _ v2: Double) -> Double {
    var v11: Double = v2
    let v4: [Double] = v0[0]
    let v12: Double = v4[0]
    let v19: Double = v11 * v11
    var v14: [Double] = v4
    var v10: [Double] = v14
    v10[0] = v2
    v10[0] = v12
    v14[0] = v19
    let v50: Double = v4[0]
    v10[0] = v50
    let v99: Double = v10[0]
    return v99
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: s2 = s2(p0: s1(p0: [s0(p0: [[1.0], [2.0]], p1: [3.0, 4.0, 5.0])], p1: [[s0(p0: [[6.0], [7.0]], p1: [8.0, 9.0, 10.0])], [s0(p0: [[11.0], [12.0]], p1: [13.0, 14.0, 15.0])], [s0(p0: [[16.0], [17.0]], p1: [18.0, 19.0, 20.0])]]), p1: s1(p0: [s0(p0: [[21.0], [22.0]], p1: [23.0, 24.0, 25.0])], p1: [[s0(p0: [[26.0], [27.0]], p1: [28.0, 29.0, 30.0])], [s0(p0: [[31.0], [32.0]], p1: [33.0, 34.0, 35.0])], [s0(p0: [[36.0], [37.0]], p1: [38.0, 39.0, 40.0])]]))
    let v2: Double = 41.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 41.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
