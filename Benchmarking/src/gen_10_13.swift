  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s4 {
    var p0: [[s0]]
    var p1: s2
  }
  struct s7 {
    var p0: [s4]
    var p1: [[s2]]
  }
  func f98(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v3
    var v2: Double = v5
    var v11: Double = v0
    var v1: Double = v2
    var v9: Double = v2
    var v10: Double = v11
    let v14: [Double] = [v9, v9, v10, v9, v3, v9]
    let v28: [[Double]] = [v14]
    let v20: [Double] = v28[0]
    v10 = v1
    v1 = v10
    let v21: Double = v14[1]
    let v26: [Double] = v28[0]
    let v22: [Double] = v28[0]
    var v34: Double = v9
    let v23: Double = v20[4]
    v10 = v23
    var v16: [[Double]] = v28
    v16[0] = v26
    let v36: [Double] = [v21, v21, v0, v34, v3]
    let v58: [Double] = [v5]
    let v50: [Double] = v28[0]
    let v25: Double = v58[0]
    let v35: [Double] = v28[0]
    v16[0] = v35
    var v120: [Double] = v36
    var v59: [Double] = v120
    let v117: [Double] = v16[0]
    v59[0] = v23
    v16[0] = v22
    v16[0] = v26
    let v68: Double = v120[0]
    var v83: [Double] = v117
    v83[2] = v68
    v120 = v59
    v83[0] = v25
    v83 = v50
    let v175: Double = v83[0]
    return v175
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    var v2: Double = v1
    let v6: Double = f98(v2)
    var v24: Double = v6
    let v15: Double = f98(v24)
    return v15
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: [s4(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])]], p1: s2(p0: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]]))), s4(p0: [[s0(p0: [[9.0]], p1: [[10.0], [11.0]])]], p1: s2(p0: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])]], p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]])))], p1: [[s2(p0: [[s0(p0: [[18.0]], p1: [[19.0], [20.0]])]], p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]]))], [s2(p0: [[s0(p0: [[24.0]], p1: [[25.0], [26.0]])]], p1: s0(p0: [[27.0]], p1: [[28.0], [29.0]]))]]), s7(p0: [s4(p0: [[s0(p0: [[30.0]], p1: [[31.0], [32.0]])]], p1: s2(p0: [[s0(p0: [[33.0]], p1: [[34.0], [35.0]])]], p1: s0(p0: [[36.0]], p1: [[37.0], [38.0]]))), s4(p0: [[s0(p0: [[39.0]], p1: [[40.0], [41.0]])]], p1: s2(p0: [[s0(p0: [[42.0]], p1: [[43.0], [44.0]])]], p1: s0(p0: [[45.0]], p1: [[46.0], [47.0]])))], p1: [[s2(p0: [[s0(p0: [[48.0]], p1: [[49.0], [50.0]])]], p1: s0(p0: [[51.0]], p1: [[52.0], [53.0]]))], [s2(p0: [[s0(p0: [[54.0]], p1: [[55.0], [56.0]])]], p1: s0(p0: [[57.0]], p1: [[58.0], [59.0]]))]]), s7(p0: [s4(p0: [[s0(p0: [[60.0]], p1: [[61.0], [62.0]])]], p1: s2(p0: [[s0(p0: [[63.0]], p1: [[64.0], [65.0]])]], p1: s0(p0: [[66.0]], p1: [[67.0], [68.0]]))), s4(p0: [[s0(p0: [[69.0]], p1: [[70.0], [71.0]])]], p1: s2(p0: [[s0(p0: [[72.0]], p1: [[73.0], [74.0]])]], p1: s0(p0: [[75.0]], p1: [[76.0], [77.0]])))], p1: [[s2(p0: [[s0(p0: [[78.0]], p1: [[79.0], [80.0]])]], p1: s0(p0: [[81.0]], p1: [[82.0], [83.0]]))], [s2(p0: [[s0(p0: [[84.0]], p1: [[85.0], [86.0]])]], p1: s0(p0: [[87.0]], p1: [[88.0], [89.0]]))]])]
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
