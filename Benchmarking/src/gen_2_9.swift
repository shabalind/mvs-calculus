  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: s0
  }
  struct s4 {
    var p0: [s0]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s3, _ v2: [Double], _ v3: Double) -> Double {
    let v5: Double = v2[1]
    let v4: s2 = v0.p1
    let v14: s0 = v4.p1
    let v18: [[Double]] = v14.p1
    let v13: Double = v2[1]
    let v29: Double = v3 + v3
    let v24: [Double] = v18[0]
    let v49: Double = v24[0]
    let v84: [Double] = [v13, v29, v49, v3, v5]
    let v47: Double = v84[1]
    return v47
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], p1: s2(p0: s1(p0: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p2: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])))
    let v1: s3 = s3(p0: [s2(p0: s1(p0: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])], p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p2: [[s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])], [s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]])]]), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]])), s2(p0: s1(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]])], p1: s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]), p2: [[s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]])], [s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]])]]), p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]]))], p1: s0(p0: [[85.0], [86.0], [87.0]], p1: [[88.0], [89.0]]))
    let v2: [Double] = [90.0, 91.0, 92.0]
    let v3: Double = 93.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 93.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
