  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: [s0]
  }
  struct s11 {
    var p0: [[s1]]
    var p1: [[s3]]
  }
  func f6(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v3
    var v6: Double = v7
    var v16: Double = v6
    var v17: Double = v16
    return v17
  }
  @inline(never)
  func f0(_ v0: s11, _ v1: Double) -> Double {
    let v5: Double = v1 / v1
    let v7: Double = f6(v1)
    var v10: Double = v5
    v10 = v7
    let v86: Double = f6(v10)
    return v86
  }
  func benchmark() {
    let v0: s11 = s11(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]))], [s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]))], [s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))]], p1: [[s3(p0: s2(p0: [[s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]))], [s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]))], [s1(p0: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]))]], p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]]), s0(p0: [[65.0], [66.0], [67.0]], p1: [[68.0], [69.0]]), s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0], [74.0]])]), p1: [s0(p0: [[75.0], [76.0], [77.0]], p1: [[78.0], [79.0]]), s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0], [84.0]])])]])
    let v1: Double = 85.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 85.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
