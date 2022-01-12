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
  func f0(_ v0: [s1], _ v1: s0, _ v2: Double, _ v3: [s0], _ v4: s1, _ v5: [[s0]], _ v6: [[s0]]) -> Double {
    let v10: [s0] = v4.p1
    let v12: s0 = v10[1]
    let v90: [[Double]] = v1.p1
    let v116: [[Double]] = v12.p0
    var v94: [[Double]] = v116
    var v95: [[Double]] = v94
    let v60: [Double] = v95[1]
    let v141: [Double] = v90[1]
    v95[0] = v141
    var v150: [Double] = v60
    let v253: Double = v150[0]
    let v195: Double = v2 + v253
    return v195
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]), s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])])]
    let v1: s0 = s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])
    let v2: Double = 35.0
    let v3: [s0] = [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0]]), s0(p0: [[41.0], [42.0], [43.0]], p1: [[44.0], [45.0]])]
    let v4: s1 = s1(p0: s0(p0: [[46.0], [47.0], [48.0]], p1: [[49.0], [50.0]]), p1: [s0(p0: [[51.0], [52.0], [53.0]], p1: [[54.0], [55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0]])])
    let v5: [[s0]] = [[s0(p0: [[61.0], [62.0], [63.0]], p1: [[64.0], [65.0]])]]
    let v6: [[s0]] = [[s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0]])]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[StructValue(Name(str='s0', ty=None), [[[66.0], [67.0], [68.0]], [[69.0], [70.0]]])]]
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
