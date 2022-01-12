  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f10(_ v0: [s0]) -> [s0] {
    let v4: s0 = v0[1]
    var v6: [s0] = v0
    v6[2] = v4
    return v6
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: [s0] = v0.p0
    let v10: s0 = v4[1]
    let v16: s1 = s1(p0: v4, p1: v10)
    let v15: [s0] = v16.p0
    let v49: [s0] = f10(v15)
    let v30: s0 = v49[1]
    let v34: [[Double]] = v30.p1
    let v36: [Double] = v34[0]
    var v48: [Double] = v36
    let v59: Double = v48[0]
    return v59
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]], p3: [7.0, 8.0, 9.0]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]], p2: [[15.0], [16.0]], p3: [17.0, 18.0, 19.0]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]], p2: [[25.0], [26.0]], p3: [27.0, 28.0, 29.0])], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]], p2: [[35.0], [36.0]], p3: [37.0, 38.0, 39.0]))
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
