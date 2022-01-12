  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s1]
  }
  struct s3 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: [s2]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s3, _ v2: Double) -> Double {
    let v3: [[s0]] = v0.p1
    let v7: [s0] = v3[0]
    let v8: s0 = v7[0]
    let v16: [[Double]] = v8.p0
    let v32: [[Double]] = v8.p1
    let v40: [Double] = v16[2]
    let v46: [Double] = v16[0]
    var v60: [[Double]] = v32
    let v81: [Double] = v60[1]
    v60[1] = v40
    v60[1] = v46
    let v89: [Double] = v60[1]
    v60[1] = v89
    let v88: Double = v81[0]
    return v88
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]])], [s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0], [11.0]], p2: [[12.0], [13.0]])]], p1: [s1(p0: s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0], [18.0]], p2: [[19.0], [20.0]]), p1: [[s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]], p2: [[26.0], [27.0]])]])]), s2(p0: [[s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0], [32.0]], p2: [[33.0], [34.0]])], [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]], p2: [[40.0], [41.0]])]], p1: [s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]], p2: [[47.0], [48.0]]), p1: [[s0(p0: [[49.0], [50.0], [51.0]], p1: [[52.0], [53.0]], p2: [[54.0], [55.0]])]])])], p1: [[s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0]], p2: [[61.0], [62.0]])]])
    let v1: s3 = s3(p0: s0(p0: [[63.0], [64.0], [65.0]], p1: [[66.0], [67.0]], p2: [[68.0], [69.0]]), p1: [s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]], p2: [[75.0], [76.0]])])
    let v2: Double = 77.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 77.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
