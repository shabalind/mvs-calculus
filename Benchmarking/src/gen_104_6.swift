  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  func f16(_ v0: Double) -> Double {
    var v7: Double = v0
    var v4: Double = v0
    let v5: Double = v0 / v4
    var v6: Double = v5
    var v11: Double = v0
    var v8: Double = v0
    var v1: Double = v11
    var v9: Double = v4
    var v29: Double = v8
    var v17: Double = v9
    var v20: Double = v8
    var v43: Double = v5
    var v18: Double = v6
    let v34: [Double] = [v20, v29, v17, v18]
    var v24: Double = v18
    var v37: [Double] = v34
    v37[3] = v1
    let v32: Double = v37[2]
    v37[1] = v1
    var v27: [Double] = v34
    v37[2] = v32
    let v19: Double = v37[3]
    var v31: Double = v19
    var v58: [Double] = v27
    v37[2] = v5
    let v59: Double = v58[2]
    var v60: [Double] = v27
    v37[2] = v7
    var v82: [Double] = v60
    v82[1] = v24
    v60[3] = v59
    var v63: [Double] = v37
    let v40: Double = v63[1]
    v63[1] = v40
    v27[1] = v40
    let v50: Double = v37[1]
    var v140: Double = v50
    v27[1] = v31
    v27[1] = v5
    v27[0] = v4
    v82[1] = v43
    v27[1] = v140
    let v78: Double = v82[1]
    return v78
  }
  func f1(_ v0: [Double]) -> [Double] {
    var v1: [Double] = v0
    let v3: Double = v1[0]
    let v4: Double = v0[0]
    let v6: Double = v0[0]
    let v5: [[Double]] = [v1, v1]
    let v2: [Double] = v5[1]
    let v9: Double = v3 * v4
    v1[0] = v3
    var v10: [[Double]] = v5
    v10[0] = v2
    var v21: [Double] = v2
    let v14: Double = v6 * v9
    let v50: Double = f16(v9)
    let v23: Double = f16(v14)
    let v33: [[[Double]]] = [v5, v10]
    var v24: [[[Double]]] = v33
    v21[0] = v50
    v10[1] = v0
    let v72: Double = f16(v23)
    v10[1] = v21
    v24[1] = v10
    let v95: Double = f16(v72)
    let v83: [[Double]] = v24[0]
    v21[0] = v95
    v24[1] = v10
    let v125: [Double] = v83[1]
    return v125
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v9: s1 = v0[2]
    let v7: [[s0]] = v9.p1
    var v15: [[s0]] = v7
    let v13: [s0] = v15[0]
    let v20: Double = f16(v1)
    let v33: [s0] = v15[0]
    let v25: Double = f16(v20)
    let v30: [[s0]] = [v13, v13, v33, v33, v13]
    var v40: [[s0]] = v30
    var v39: [s0] = v13
    let v72: [s0] = v40[1]
    v15[1] = v13
    v15[0] = v33
    let v87: s0 = v39[0]
    var v85: s0 = v87
    let v76: [Double] = v85.p1
    let v83: [Double] = f1(v76)
    v85.p1 = v76
    let v104: Double = v83[0]
    let v380: s0 = v72[0]
    v39[0] = v380
    let v211: Double = v25 + v104
    return v211
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0])], [s0(p0: [[4.0], [5.0], [6.0]], p1: [7.0])], [s0(p0: [[8.0], [9.0], [10.0]], p1: [11.0])]], p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [15.0])], [s0(p0: [[16.0], [17.0], [18.0]], p1: [19.0])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [23.0])]]), s1(p0: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [27.0])], [s0(p0: [[28.0], [29.0], [30.0]], p1: [31.0])], [s0(p0: [[32.0], [33.0], [34.0]], p1: [35.0])]], p1: [[s0(p0: [[36.0], [37.0], [38.0]], p1: [39.0])], [s0(p0: [[40.0], [41.0], [42.0]], p1: [43.0])], [s0(p0: [[44.0], [45.0], [46.0]], p1: [47.0])]]), s1(p0: [[s0(p0: [[48.0], [49.0], [50.0]], p1: [51.0])], [s0(p0: [[52.0], [53.0], [54.0]], p1: [55.0])], [s0(p0: [[56.0], [57.0], [58.0]], p1: [59.0])]], p1: [[s0(p0: [[60.0], [61.0], [62.0]], p1: [63.0])], [s0(p0: [[64.0], [65.0], [66.0]], p1: [67.0])], [s0(p0: [[68.0], [69.0], [70.0]], p1: [71.0])]])]
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
