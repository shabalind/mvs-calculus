  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: [s2]
  }
  struct s4 {
    var p0: [s3]
    var p1: [s1]
  }
  struct s5 {
    var p0: s3
    var p1: [Double]
  }
  struct s6 {
    var p0: s4
    var p1: [s5]
  }
  func f59(_ v0: s6, _ v1: s5) -> s5 {
    let v3: [s5] = v0.p1
    var v2: s6 = v0
    let v5: [s5] = v2.p1
    v2.p1 = v5
    v2.p1 = v5
    v2.p1 = v3
    var v32: [s5] = v5
    v32 = v3
    let v36: s5 = v32[1]
    return v36
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v4: [s5] = v0.p1
    let v3: s5 = v4[1]
    let v2: s5 = f59(v0, v3)
    let v9: s5 = f59(v0, v2)
    let v67: [Double] = v9.p1
    var v71: [Double] = v67
    v71 = v67
    let v63: Double = v71[1]
    let v115: Double = v63 + v63
    return v115
  }
  func benchmark() {
    let v0: s6 = s6(p0: s4(p0: [s3(p0: s2(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), p1: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]), p1: [s2(p0: s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])), p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])])])], p1: [s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])), s1(p0: [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))]), p1: [s5(p0: s3(p0: s2(p0: s1(p0: [s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])], p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])), p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]), p1: [s2(p0: s1(p0: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], p1: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])), p1: [s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])])]), p1: [64.0, 65.0]), s5(p0: s3(p0: s2(p0: s1(p0: [s0(p0: [[66.0]], p1: [[67.0], [68.0], [69.0]])], p1: s0(p0: [[70.0]], p1: [[71.0], [72.0], [73.0]])), p1: [s0(p0: [[74.0]], p1: [[75.0], [76.0], [77.0]])]), p1: [s2(p0: s1(p0: [s0(p0: [[78.0]], p1: [[79.0], [80.0], [81.0]])], p1: s0(p0: [[82.0]], p1: [[83.0], [84.0], [85.0]])), p1: [s0(p0: [[86.0]], p1: [[87.0], [88.0], [89.0]])])]), p1: [90.0, 91.0])])
    let v1: Double = 92.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 92.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
