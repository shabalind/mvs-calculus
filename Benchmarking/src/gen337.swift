  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: Double) -> Double {
    let v7: s1 = v0[0]
    let v3: s0 = v7.p0
    var v6: Double = v2
    let v14: [[Double]] = v3.p1
    let v13: [[Double]] = v3.p0
    let v11: [Double] = v13[1]
    var v19: [Double] = v11
    var v37: [[Double]] = v14
    v37[0] = v19
    v37[0] = v11
    let v18: [[Double]] = v1.p2
    var v25: [[Double]] = v18
    v19[0] = v6
    let v50: [Double] = v37[0]
    let v21: [Double] = v25[0]
    v37[0] = v21
    let v130: Double = v50[0]
    return v130
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0]], p2: [[10.0], [11.0]])), s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]], p2: [[16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]], p2: [[22.0], [23.0]])), s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]], p2: [[28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]], p2: [[34.0], [35.0]]))]
    let v1: s0 = s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]], p2: [[40.0], [41.0]])
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
