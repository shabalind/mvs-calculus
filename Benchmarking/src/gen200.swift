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
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: s1, _ v2: s1, _ v3: s1, _ v4: Double) -> Double {
    let v6: s0 = v2.p0
    let v10: [[Double]] = v6.p1
    var v33: [[Double]] = v10
    let v44: [Double] = v10[0]
    let v80: [Double] = v33[0]
    let v66: Double = v80[0]
    var v86: [Double] = v44
    v33[0] = v86
    let v150: Double = v66 / v66
    let v158: Double = v150 + v150
    let v134: Double = v66 - v158
    let v200: Double = v134 * v150
    return v200
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s2(p0: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])))], [s3(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: s2(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])))]]
    let v1: s1 = s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]))
    let v2: s1 = s1(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]))
    let v3: s1 = s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), p1: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]))
    let v4: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
