  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s4 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s7 {
    var p0: s0
    var p1: s0
  }
  struct s8 {
    var p0: s4
    var p1: [s7]
  }
  func f2(_ v0: Double) -> Double {
    var v3: Double = v0
    var v6: Double = v3
    var v4: Double = v6
    var v7: Double = v0
    var v5: Double = v3
    var v11: Double = v0
    var v8: Double = v4
    let v2: [Double] = [v5, v3, v4, v8, v3, v7]
    let v1: Double = v11 * v8
    let v10: Double = v2[0]
    let v12: Double = v2[5]
    let v9: Double = v2[2]
    var v17: Double = v9
    let v16: [[Double]] = [v2, v2]
    let v19: [Double] = [v12, v6, v17]
    var v43: Double = v1
    var v22: [Double] = v2
    let v35: [Double] = v16[1]
    let v20: [Double] = v16[1]
    v22[4] = v12
    var v25: [Double] = v19
    let v37: Double = v25[2]
    var v34: [Double] = v22
    var v61: Double = v1
    var v45: Double = v37
    var v40: [Double] = v20
    var v76: [Double] = v2
    var v39: Double = v43
    v34 = v22
    v76 = v35
    let v63: Double = v17 / v39
    let v50: Double = v34[3]
    v40[2] = v12
    v34[3] = v3
    let v67: Double = v76[2]
    let v83: Double = v50 / v67
    v22[4] = v63
    v17 = v45
    v34 = v40
    let v131: Double = v83 / v10
    v5 = v0
    v40[0] = v61
    v34[1] = v3
    return v131
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: Double) -> Double {
    var v3: Double = v1
    let v7: Double = f2(v1)
    let v5: [Double] = [v1, v7, v1, v1, v3]
    let v24: Double = v5[3]
    let v57: Double = f2(v3)
    v3 = v57
    return v24
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s4(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], [s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]]), p1: [s7(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])), s7(p0: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]))]), s8(p0: s4(p0: [[s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]])], [s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])]], p1: [[s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]])], [s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]])], [s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])]]), p1: [s7(p0: s0(p0: [[64.0]], p1: [[65.0], [66.0], [67.0]]), p1: s0(p0: [[68.0]], p1: [[69.0], [70.0], [71.0]])), s7(p0: s0(p0: [[72.0]], p1: [[73.0], [74.0], [75.0]]), p1: s0(p0: [[76.0]], p1: [[77.0], [78.0], [79.0]]))])]
    let v1: Double = 80.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 80.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
