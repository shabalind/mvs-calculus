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
    var p0: [s0]
    var p1: s1
  }
  struct s3 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [[s2]]
    var p1: [s3]
  }
  struct s6 {
    var p0: s4
  }
  func f101(_ v0: [Double]) -> [Double] {
    var v3: [Double] = v0
    var v7: [Double] = v0
    let v2: Double = v7[1]
    v7[0] = v2
    let v8: Double = v7[1]
    v3[0] = v2
    let v6: Double = v3[2]
    v3 = v0
    v3[1] = v6
    v3 = v0
    var v10: Double = v8
    var v9: [Double] = v3
    var v11: Double = v10
    v7[0] = v8
    var v12: [Double] = v0
    let v21: Double = v2 + v11
    v3[1] = v21
    v11 = v6
    let v23: Double = v0[0]
    let v29: Double = v3[1]
    var v17: Double = v23
    let v15: Double = v7[1]
    v12[2] = v15
    let v39: [[Double]] = [v9]
    var v35: [[Double]] = v39
    v35[0] = v9
    var v43: [Double] = v7
    let v24: [[[Double]]] = [v35, v39, v35, v35, v35, v35]
    var v53: Double = v29
    var v36: [[[Double]]] = v24
    let v31: [[Double]] = v36[0]
    var v38: [[Double]] = v31
    let v57: [[Double]] = v24[3]
    v38 = v31
    v3[1] = v17
    v12[1] = v8
    let v111: [Double] = v38[0]
    var v51: [Double] = v43
    v38[0] = v12
    v35[0] = v51
    v12[1] = v53
    v36[4] = v57
    return v111
  }
  func f51(_ v0: Double) -> Double {
    var v2: Double = v0
    v2 = v0
    var v7: Double = v2
    let v1: Double = v7 * v0
    let v5: Double = v7 + v1
    let v15: [Double] = [v5]
    var v18: [Double] = v15
    let v9: Double = v15[0]
    let v13: Double = v18[0]
    v18[0] = v9
    var v12: [Double] = v18
    var v23: Double = v13
    v18[0] = v23
    var v17: [Double] = v12
    let v24: [[Double]] = [v12, v17]
    let v67: Double = v18[0]
    let v19: [Double] = v24[0]
    let v42: Double = v19[0]
    v17[0] = v67
    v12[0] = v1
    return v42
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s6, _ v2: Double) -> Double {
    var v5: Double = v2
    var v17: Double = v2
    var v16: Double = v17
    let v12: Double = f51(v16)
    let v26: [Double] = [v2, v2, v17]
    let v69: Double = f51(v5)
    let v61: [Double] = f101(v26)
    let v56: Double = v12 * v2
    var v46: [Double] = v61
    v46[0] = v12
    let v31: Double = v16 / v56
    let v50: Double = v46[0]
    v16 = v69
    v16 = v31
    return v50
  }
  func benchmark() {
    let v0: s4 = s4(p0: [[s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])))]], p1: [s3(p0: s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])), p1: [[s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])]]), s3(p0: s1(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])), p1: [[s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]]), s3(p0: s1(p0: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])), p1: [[s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]])])
    let v1: s6 = s6(p0: s4(p0: [[s2(p0: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])], p1: s1(p0: s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]]), p1: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])))]], p1: [s3(p0: s1(p0: s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]]), p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]])), p1: [[s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])]]), s3(p0: s1(p0: s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), p1: s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])), p1: [[s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])]]), s3(p0: s1(p0: s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]]), p1: s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]])), p1: [[s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]])]])]))
    let v2: Double = 112.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 112.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
