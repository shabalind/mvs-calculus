  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: s0, _ v3: s0, _ v4: [s0], _ v5: Double) -> Double {
    let v7: Double = v5 * v5
    let v8: [[Double]] = v1.p0
    let v14: [Double] = v8[0]
    let v34: Double = v14[0]
    let v26: [[Double]] = v2.p1
    let v16: [Double] = v26[2]
    let v42: Double = v16[0]
    var v108: Double = v34
    let v47: Double = v7 - v108
    v108 = v42
    return v47
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])]), s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])]), s1(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])])]
    let v1: s0 = s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])
    let v2: s0 = s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])
    let v3: s0 = s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])
    let v4: [s0] = [s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]]), s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]])]
    let v5: Double = 68.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 68.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
