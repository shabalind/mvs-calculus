  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s1
    var p1: [s2]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s3, _ v2: Double) -> Double {
    let v6: s1 = v0.p0
    var v5: Double = v2
    let v10: [s0] = v6.p1
    var v16: Double = v5
    var v26: Double = v5
    var v28: Double = v26
    let v40: s0 = v10[0]
    let v35: [Double] = v40.p1
    let v82: Double = v35[0]
    var v59: Double = v16
    v59 = v82
    let v180: Double = v28 - v59
    return v180
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [7.0])]), p1: [s2(p0: s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [11.0]), p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [15.0])]), p1: s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [19.0]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [23.0])]))])
    let v1: s3 = s3(p0: s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [27.0]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [31.0])]), p1: [s2(p0: s1(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [35.0]), p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [39.0])]), p1: s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [43.0]), p1: [s0(p0: [[44.0], [45.0], [46.0]], p1: [47.0])]))])
    let v2: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
