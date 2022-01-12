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
    var p0: [[s1]]
    var p1: s1
  }
  func f124(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v1
    var v5: Double = v6
    v6 = v1
    let v7: Double = v6 - v1
    v6 = v7
    v5 = v7
    var v18: Double = v7
    var v10: Double = v1
    v1 = v5
    let v20: Double = v18 + v10
    var v33: Double = v20
    return v33
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v6: Double = f124(v1)
    let v7: Double = f124(v6)
    let v50: Double = f124(v7)
    let v73: Double = f124(v50)
    return v73
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))], [s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))]], p1: s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])))], [s2(p0: [[s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]]))], [s1(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))]], p1: s1(p0: s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), p1: s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])))], [s2(p0: [[s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]]), p1: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]))], [s1(p0: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]))]], p1: s1(p0: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])))]]
    let v1: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
