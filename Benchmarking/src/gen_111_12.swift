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
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s3], _ v2: s2, _ v3: Double) -> Double {
    let v6: s1 = v2.p0
    let v8: [s0] = v6.p0
    var v21: s2 = v2
    v21.p0 = v6
    let v25: s0 = v8[0]
    v21.p1 = v25
    var v18: s0 = v25
    v21.p0 = v6
    v21.p0 = v6
    var v29: s0 = v25
    v21.p1 = v18
    var v20: s0 = v25
    let v36: s0 = v2.p1
    v21.p1 = v20
    v21.p1 = v29
    let v38: [[Double]] = v36.p1
    let v69: s0 = v21.p1
    let v70: [[Double]] = v36.p1
    v20.p1 = v38
    let v86: [[Double]] = v69.p1
    let v93: [Double] = v86[0]
    v18.p1 = v70
    let v116: Double = v93[0]
    return v116
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))]
    let v1: [s3] = [s3(p0: [s1(p0: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])], p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]))], p1: [[s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])]])]
    let v2: s2 = s2(p0: s1(p0: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])], p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])), p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]))
    let v3: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
