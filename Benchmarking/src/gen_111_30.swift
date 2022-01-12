  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: s3, _ v2: Double) -> Double {
    let v5: s1 = v1.p0
    let v8: [s0] = v5.p1
    let v4: s0 = v8[0]
    let v3: [[Double]] = v4.p4
    let v14: [Double] = v3[0]
    let v9: [Double] = v3[0]
    let v36: Double = v14[0]
    var v17: Double = v2
    let v20: Double = v9[0]
    let v44: Double = v14[0]
    let v84: [Double] = [v44, v17, v2, v36, v20, v2, v36]
    let v94: Double = v84[1]
    let v98: Double = v94 + v94
    return v98
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0], [4.0], [5.0]], p3: [[6.0], [7.0], [8.0]], p4: [[9.0]]), p1: [s0(p0: [[10.0], [11.0]], p1: [[12.0]], p2: [[13.0], [14.0], [15.0]], p3: [[16.0], [17.0], [18.0]], p4: [[19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0]], p2: [[23.0], [24.0], [25.0]], p3: [[26.0], [27.0], [28.0]], p4: [[29.0]])]), p1: s0(p0: [[30.0], [31.0]], p1: [[32.0]], p2: [[33.0], [34.0], [35.0]], p3: [[36.0], [37.0], [38.0]], p4: [[39.0]]))]
    let v1: s3 = s3(p0: s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0]], p2: [[43.0], [44.0], [45.0]], p3: [[46.0], [47.0], [48.0]], p4: [[49.0]]), p1: [s0(p0: [[50.0], [51.0]], p1: [[52.0]], p2: [[53.0], [54.0], [55.0]], p3: [[56.0], [57.0], [58.0]], p4: [[59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0]], p2: [[63.0], [64.0], [65.0]], p3: [[66.0], [67.0], [68.0]], p4: [[69.0]])]), p1: s0(p0: [[70.0], [71.0]], p1: [[72.0]], p2: [[73.0], [74.0], [75.0]], p3: [[76.0], [77.0], [78.0]], p4: [[79.0]]))
    let v2: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
