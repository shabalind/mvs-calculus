  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  struct s7 {
    var p0: s3
    var p1: [[s1]]
  }
  func f59(_ v0: Double) -> Double {
    var v2: Double = v0
    v2 = v0
    var v11: Double = v2
    var v12: Double = v11
    return v12
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: [s2], _ v2: Double) -> Double {
    let v6: Double = f59(v2)
    var v20: Double = v6
    var v17: Double = v6
    let v40: Double = f59(v6)
    let v39: Double = f59(v20)
    let v45: Double = v39 - v40
    let v52: Double = v40 - v45
    let v86: Double = v17 - v52
    return v86
  }
  func benchmark() {
    let v0: s7 = s7(p0: s3(p0: s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), p1: s1(p0: [[s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))), p1: [[s1(p0: [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))], [s1(p0: [[s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]], p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]))]])
    let v1: [s2] = [s2(p0: [s1(p0: [[s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])]], p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])), s1(p0: [[s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])]], p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])), s1(p0: [[s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]], p1: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]))], p1: [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])])]
    let v2: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
