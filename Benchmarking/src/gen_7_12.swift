  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [s0]
  }
  struct s4 {
    var p0: s3
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: s0, _ v2: [s2], _ v3: [s1], _ v4: Double) -> Double {
    let v7: [[Double]] = v1.p1
    var v19: s0 = v1
    let v21: [[Double]] = v19.p1
    let v47: [[Double]] = v1.p0
    v19.p1 = v7
    let v43: [Double] = v21[1]
    let v39: Double = v43[0]
    let v137: [Double] = v47[0]
    var v116: [[Double]] = v21
    v19.p1 = v116
    v116[1] = v137
    v116[1] = v43
    return v39
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s3(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]), p1: [s1(p0: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])])]), s4(p0: s3(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]), p1: [s1(p0: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])])])]
    let v1: s0 = s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])
    let v2: [s2] = [s2(p0: s1(p0: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])]), p1: s1(p0: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])])), s2(p0: s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])]), p1: s1(p0: [s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])])), s2(p0: s1(p0: [s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])]), p1: s1(p0: [s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])]))]
    let v3: [s1] = [s1(p0: [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])])]
    let v4: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
