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
    var p0: s0
    var p1: [s1]
  }
  struct s8 {
    var p0: s2
    var p1: [[s1]]
  }
  struct s9 {
    var p0: [s0]
    var p1: s8
  }
  func f11(_ v0: Double) -> Double {
    var v6: Double = v0
    var v1: Double = v6
    var v7: Double = v1
    var v9: Double = v0
    var v5: Double = v6
    var v10: Double = v6
    var v12: Double = v5
    var v8: Double = v10
    var v14: Double = v9
    var v17: Double = v7
    var v13: Double = v8
    let v25: [Double] = [v14, v17, v0, v12, v13, v17]
    var v33: [Double] = v25
    let v22: [[Double]] = [v25, v33, v33]
    let v52: [Double] = v22[0]
    let v70: Double = v52[0]
    return v70
  }
  @inline(never)
  func f0(_ v0: [s9], _ v1: Double) -> Double {
    var v5: Double = v1
    let v15: Double = f11(v5)
    let v20: Double = f11(v1)
    var v22: Double = v5
    let v54: Double = f11(v22)
    let v29: Double = v1 + v20
    v22 = v15
    let v42: Double = f11(v54)
    let v78: Double = f11(v42)
    v22 = v29
    let v198: Double = f11(v78)
    return v198
  }
  func benchmark() {
    let v0: [s9] = [s9(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], p1: s8(p0: s2(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: [s1(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])), s1(p0: [[s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])], [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])], [s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]])]], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])), s1(p0: [[s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]])], [s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]])], [s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])]], p1: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]))]), p1: [[s1(p0: [[s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]])], [s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])], [s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]])]], p1: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]))], [s1(p0: [[s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]])], [s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]])], [s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])]], p1: s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]]))]]))]
    let v1: Double = 92.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 92.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
