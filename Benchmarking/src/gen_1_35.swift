  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s5]], _ v1: [s1], _ v2: s0, _ v3: Double) -> Double {
    let v8: s1 = v1[0]
    let v6: s0 = v8.p0
    let v10: [[Double]] = v2.p3
    let v9: s1 = v1[0]
    let v13: s0 = v9.p1
    let v15: [Double] = v10[0]
    let v52: [Double] = v10[0]
    let v49: [[Double]] = v13.p2
    let v33: s5 = s5(p0: v6, p1: v13)
    let v38: s0 = v33.p0
    let v40: [[Double]] = v6.p1
    let v28: [[Double]] = v2.p4
    let v56: [[Double]] = v38.p3
    var v81: [[Double]] = v49
    let v108: Double = v15[0]
    let v111: s0 = s0(p0: v108, p1: v28, p2: v81, p3: v56, p4: v40)
    let v123: [[Double]] = v111.p1
    var v160: s0 = v111
    v81[1] = v52
    let v248: Double = v160.p0
    v160.p1 = v123
    return v248
  }
  func benchmark() {
    let v0: [[s5]] = [[s5(p0: s0(p0: 0.0, p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0]], p3: [[6.0]], p4: [[7.0], [8.0], [9.0]]), p1: s0(p0: 10.0, p1: [[11.0], [12.0], [13.0]], p2: [[14.0], [15.0]], p3: [[16.0]], p4: [[17.0], [18.0], [19.0]]))], [s5(p0: s0(p0: 20.0, p1: [[21.0], [22.0], [23.0]], p2: [[24.0], [25.0]], p3: [[26.0]], p4: [[27.0], [28.0], [29.0]]), p1: s0(p0: 30.0, p1: [[31.0], [32.0], [33.0]], p2: [[34.0], [35.0]], p3: [[36.0]], p4: [[37.0], [38.0], [39.0]]))]]
    let v1: [s1] = [s1(p0: s0(p0: 40.0, p1: [[41.0], [42.0], [43.0]], p2: [[44.0], [45.0]], p3: [[46.0]], p4: [[47.0], [48.0], [49.0]]), p1: s0(p0: 50.0, p1: [[51.0], [52.0], [53.0]], p2: [[54.0], [55.0]], p3: [[56.0]], p4: [[57.0], [58.0], [59.0]]))]
    let v2: s0 = s0(p0: 60.0, p1: [[61.0], [62.0], [63.0]], p2: [[64.0], [65.0]], p3: [[66.0]], p4: [[67.0], [68.0], [69.0]])
    let v3: Double = 70.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 70.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
