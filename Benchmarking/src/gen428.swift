  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [s1], _ v2: [s1], _ v3: [s1], _ v4: Double) -> Double {
    let v10: s1 = v3[1]
    let v6: s0 = v10.p1
    let v12: [[Double]] = v6.p0
    var v21: Double = v4
    let v30: [Double] = v12[0]
    let v25: Double = v30[0]
    var v99: Double = v21
    var v146: Double = v25
    let v70: Double = v146 * v99
    let v122: Double = v70 + v4
    v21 = v146
    return v122
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))]
    let v1: [s1] = [s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])), s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]))]
    let v2: [s1] = [s1(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))]
    let v3: [s1] = [s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])), s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]))]
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
