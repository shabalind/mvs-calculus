  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v5: s1 = v0[0]
    let v10: s0 = v5.p0
    let v26: [s0] = v5.p1
    let v2: s0 = v26[1]
    let v8: [Double] = v2.p3
    let v9: Double = v8[1]
    let v36: [[Double]] = v10.p0
    let v76: [Double] = v36[1]
    let v144: Double = v76[0]
    let v93: Double = v144 / v9
    return v93
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0], [7.0]], p3: [8.0, 9.0]), p1: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]], p2: [[15.0], [16.0], [17.0]], p3: [18.0, 19.0]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]], p2: [[25.0], [26.0], [27.0]], p3: [28.0, 29.0])]), s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]], p2: [[35.0], [36.0], [37.0]], p3: [38.0, 39.0]), p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]], p2: [[45.0], [46.0], [47.0]], p3: [48.0, 49.0]), s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]], p2: [[55.0], [56.0], [57.0]], p3: [58.0, 59.0])])]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
