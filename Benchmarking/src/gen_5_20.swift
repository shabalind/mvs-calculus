  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: Double
    var p1: [s1]
  }
  struct s7 {
    var p0: s4
    var p1: s1
  }
  struct s11 {
    var p0: [s1]
    var p1: [s7]
  }
  func f69(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v7
    var v5: Double = v0
    var v2: Double = v7
    var v1: Double = v6
    var v11: Double = v7
    var v3: Double = v0
    var v8: Double = v3
    var v19: Double = v5
    var v9: Double = v0
    v8 = v4
    var v12: Double = v0
    v19 = v12
    var v25: Double = v1
    var v28: Double = v2
    var v10: Double = v4
    var v14: Double = v4
    var v18: Double = v9
    let v26: [Double] = [v8, v6, v11, v19]
    var v20: [Double] = v26
    var v16: Double = v4
    v20[3] = v25
    var v22: [Double] = v26
    v4 = v5
    let v21: Double = v22[0]
    v22[2] = v10
    let v33: Double = v22[0]
    var v27: Double = v33
    let v60: [[Double]] = [v20]
    v4 = v18
    let v42: [Double] = [v21, v16]
    var v70: [Double] = v42
    v70[0] = v18
    v22[1] = v28
    let v84: [Double] = v60[0]
    let v35: Double = v70[1]
    let v51: Double = v70[0]
    let v41: Double = v42[1]
    let v77: Double = v70[0]
    var v80: [Double] = v42
    var v214: [Double] = v80
    v28 = v11
    var v125: [Double] = v214
    v20[3] = v51
    var v176: [Double] = v125
    v1 = v41
    v3 = v14
    v125[1] = v35
    v214[1] = v27
    v20[3] = v18
    v80[0] = v18
    var v127: [Double] = v176
    let v150: Double = v127[0]
    let v114: Double = v84[2]
    let v145: Double = v114 + v150
    v80[0] = v77
    return v145
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s11, _ v2: Double) -> Double {
    let v4: Double = v2 * v2
    let v3: Double = f69(v4)
    let v11: Double = f69(v3)
    var v32: Double = v11
    let v27: Double = f69(v32)
    return v27
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]
    let v1: s11 = s11(p0: [s1(p0: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])), s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])), s1(p0: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), p1: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]))], p1: [s7(p0: s4(p0: 28.0, p1: [s1(p0: s0(p0: [[29.0]], p1: [[30.0], [31.0], [32.0]]), p1: s0(p0: [[33.0]], p1: [[34.0], [35.0], [36.0]])), s1(p0: s0(p0: [[37.0]], p1: [[38.0], [39.0], [40.0]]), p1: s0(p0: [[41.0]], p1: [[42.0], [43.0], [44.0]]))]), p1: s1(p0: s0(p0: [[45.0]], p1: [[46.0], [47.0], [48.0]]), p1: s0(p0: [[49.0]], p1: [[50.0], [51.0], [52.0]]))), s7(p0: s4(p0: 53.0, p1: [s1(p0: s0(p0: [[54.0]], p1: [[55.0], [56.0], [57.0]]), p1: s0(p0: [[58.0]], p1: [[59.0], [60.0], [61.0]])), s1(p0: s0(p0: [[62.0]], p1: [[63.0], [64.0], [65.0]]), p1: s0(p0: [[66.0]], p1: [[67.0], [68.0], [69.0]]))]), p1: s1(p0: s0(p0: [[70.0]], p1: [[71.0], [72.0], [73.0]]), p1: s0(p0: [[74.0]], p1: [[75.0], [76.0], [77.0]]))), s7(p0: s4(p0: 78.0, p1: [s1(p0: s0(p0: [[79.0]], p1: [[80.0], [81.0], [82.0]]), p1: s0(p0: [[83.0]], p1: [[84.0], [85.0], [86.0]])), s1(p0: s0(p0: [[87.0]], p1: [[88.0], [89.0], [90.0]]), p1: s0(p0: [[91.0]], p1: [[92.0], [93.0], [94.0]]))]), p1: s1(p0: s0(p0: [[95.0]], p1: [[96.0], [97.0], [98.0]]), p1: s0(p0: [[99.0]], p1: [[100.0], [101.0], [102.0]])))])
    let v2: Double = 103.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 103.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
