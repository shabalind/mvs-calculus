  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
    var p2: s0
    var p3: s0
    var p4: [s0]
  }
  struct s3 {
    var p0: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s3, _ v2: Double) -> Double {
    let v3: s1 = v0[0]
    let v8: s0 = v3.p3
    let v24: [[Double]] = v8.p1
    let v32: [[Double]] = v8.p1
    let v30: [[Double]] = v8.p0
    let v14: [Double] = v24[0]
    let v37: [Double] = v32[2]
    var v47: [[Double]] = v24
    var v83: [[Double]] = v47
    v47[0] = v14
    var v35: [[Double]] = v30
    v83[1] = v37
    v35[0] = v37
    v35[0] = v37
    v35[0] = v37
    let v53: [Double] = v35[0]
    let v77: Double = v53[0]
    let v139: [Double] = v83[1]
    v35[0] = v139
    return v77
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p2: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p3: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p4: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])]), s1(p0: [[s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]], p1: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p2: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]), p3: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p4: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])]), s1(p0: [[s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])]], p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]]), p2: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p3: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), p4: [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])])]
    let v1: s3 = s3(p0: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]))
    let v2: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
