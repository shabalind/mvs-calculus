  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v6: Double = v1
    let v9: s1 = v0[2]
    let v4: [s0] = v9.p1
    let v58: s0 = v4[1]
    let v21: [[Double]] = v58.p0
    let v47: [Double] = v21[0]
    let v25: Double = v6 + v6
    let v55: Double = v47[0]
    var v26: [Double] = v47
    v26[0] = v25
    v26[0] = v55
    v26 = v47
    let v102: Double = v26[0]
    return v102
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0]], p3: [[3.0], [4.0], [5.0]])]], p1: [s0(p0: [[6.0]], p1: [[7.0]], p2: [[8.0]], p3: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0]], p2: [[14.0]], p3: [[15.0], [16.0], [17.0]])]), s1(p0: [[s0(p0: [[18.0]], p1: [[19.0]], p2: [[20.0]], p3: [[21.0], [22.0], [23.0]])]], p1: [s0(p0: [[24.0]], p1: [[25.0]], p2: [[26.0]], p3: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0]], p2: [[32.0]], p3: [[33.0], [34.0], [35.0]])]), s1(p0: [[s0(p0: [[36.0]], p1: [[37.0]], p2: [[38.0]], p3: [[39.0], [40.0], [41.0]])]], p1: [s0(p0: [[42.0]], p1: [[43.0]], p2: [[44.0]], p3: [[45.0], [46.0], [47.0]]), s0(p0: [[48.0]], p1: [[49.0]], p2: [[50.0]], p3: [[51.0], [52.0], [53.0]])])]
    let v1: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
