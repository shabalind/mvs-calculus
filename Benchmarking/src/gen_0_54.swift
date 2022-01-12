  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: s2
  }
  struct s6 {
    var p0: s3
    var p1: [s0]
  }
  struct s7 {
    var p0: s0
    var p1: [s6]
    var p2: [[s3]]
    var p3: s2
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v3: [s6] = v0.p1
    let v4: s6 = v3[0]
    var v9: s6 = v4
    let v28: [s0] = v9.p1
    let v14: s0 = v0.p0
    let v54: s0 = v28[1]
    let v56: [[Double]] = v14.p1
    let v46: [Double] = v56[0]
    let v148: [[Double]] = v54.p0
    let v93: [Double] = v148[2]
    let v110: [[Double]] = [v46, v93, v93, v93]
    var v147: [[Double]] = v110
    let v197: [Double] = v147[2]
    let v143: Double = v197[0]
    return v143
  }
  func benchmark() {
    let v0: s7 = s7(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s6(p0: s3(p0: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p1: s2(p0: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])), p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])], p2: [[s3(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: s2(p0: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])]))], [s3(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), p1: s2(p0: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]))]], p3: s2(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]))
    let v1: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
