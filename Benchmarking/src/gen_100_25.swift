  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: [[s0]], _ v2: s1, _ v3: Double) -> Double {
    let v8: [s0] = v1[1]
    let v9: s0 = v8[0]
    let v15: [Double] = [v3, v3, v3, v3]
    let v13: [[Double]] = v9.p1
    let v40: [Double] = v13[1]
    let v49: Double = v40[0]
    var v60: [Double] = v40
    let v86: Double = v15[0]
    let v137: Double = v3 + v49
    let v100: [Double] = [v3, v86]
    v60[0] = v137
    let v253: Double = v60[0]
    let v118: Double = v100[0]
    let v179: Double = v118 / v253
    return v179
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]]
    let v1: [[s0]] = [[s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]]
    let v2: s1 = s1(p0: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p2: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])])
    let v3: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
