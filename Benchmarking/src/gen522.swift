  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
    var p2: [s0]
  }
  struct s11 {
    var p0: s2
    var p1: [[s1]]
  }
  func f85(_ v0: s2) -> s2 {
    var v4: s2 = v0
    let v3: s0 = v0.p0
    var v7: s0 = v3
    v4.p0 = v7
    v4.p0 = v7
    v4 = v0
    v4 = v0
    let v9: [[Double]] = v7.p0
    var v1: s0 = v7
    var v2: s2 = v0
    let v6: [Double] = v9[0]
    var v18: [Double] = v6
    v4.p0 = v1
    let v35: [[Double]] = [v6]
    let v19: [[Double]] = v1.p1
    var v27: [[Double]] = v19
    let v16: [Double] = v35[0]
    let v24: Double = v16[0]
    let v44: [Double] = v19[0]
    v2.p0 = v7
    let v20: [[s1]] = v2.p1
    v27[0] = v18
    var v41: [[s1]] = v20
    let v23: [s0] = v4.p2
    var v105: s2 = v2
    v105.p2 = v23
    v2.p2 = v23
    var v70: s0 = v1
    let v28: [[Double]] = v70.p0
    v1.p1 = v27
    v2.p1 = v41
    let v66: s0 = v23[0]
    v27[0] = v44
    v18[0] = v24
    let v67: [[s1]] = v2.p1
    v27[0] = v44
    v7.p0 = v28
    v2.p1 = v67
    v2.p0 = v66
    return v105
  }
  func f79(_ v0: s1) -> s1 {
    let v6: [s0] = v0.p1
    var v8: s1 = v0
    v8.p1 = v6
    let v7: s0 = v8.p0
    let v3: [[Double]] = v7.p0
    var v1: s0 = v7
    v1.p0 = v3
    let v13: [[Double]] = v1.p0
    var v2: [[Double]] = v13
    v2 = v3
    var v12: [s0] = v6
    v12[2] = v7
    let v14: [Double] = v13[0]
    let v10: s0 = v12[1]
    var v18: [s0] = v6
    var v20: s1 = v8
    var v36: [Double] = v14
    let v21: s0 = v18[1]
    let v17: [s0] = v20.p1
    let v26: s0 = v6[1]
    v8.p0 = v1
    v20.p1 = v18
    v1.p0 = v2
    let v31: s1 = s1(p0: v21, p1: v17)
    let v46: Double = v36[0]
    v18[1] = v26
    v2[1] = v36
    v8.p0 = v10
    let v43: Double = v46 - v46
    var v32: s1 = v31
    let v84: Double = v46 * v43
    v32.p0 = v21
    v36[0] = v84
    return v32
  }
  func f68(_ v0: s2, _ v1: s1) -> s1 {
    let v4: [[s1]] = v0.p1
    var v7: s2 = v0
    let v22: s2 = f85(v7)
    var v8: s2 = v0
    v8.p1 = v4
    let v26: s0 = v8.p0
    v8.p1 = v4
    let v28: [[Double]] = v26.p1
    var v54: s0 = v26
    let v38: [[Double]] = v54.p0
    let v84: [s0] = v1.p1
    let v69: s1 = s1(p0: v54, p1: v84)
    v8 = v22
    v54.p1 = v28
    let v98: [[Double]] = v26.p1
    v54.p0 = v38
    v54.p0 = v38
    v54.p1 = v98
    return v69
  }
  func f21(_ v0: s2) -> s2 {
    let v1: [s0] = v0.p2
    let v6: s0 = v1[0]
    let v4: s0 = v1[0]
    let v19: s2 = f85(v0)
    let v9: [s0] = v19.p2
    let v18: s2 = f85(v19)
    let v13: s2 = f85(v19)
    var v14: s2 = v19
    let v30: [s0] = v19.p2
    let v15: [s0] = v18.p2
    v14.p2 = v1
    let v51: s2 = f85(v14)
    let v16: s0 = v9[0]
    v14.p2 = v1
    v14.p0 = v4
    v14.p0 = v6
    v14.p2 = v1
    let v27: [s0] = v19.p2
    v14.p0 = v4
    v14.p0 = v4
    let v44: [[s1]] = v13.p1
    v14.p0 = v6
    v14 = v18
    var v76: [[s1]] = v44
    let v38: s11 = s11(p0: v14, p1: v76)
    let v58: s2 = f85(v51)
    let v42: s0 = v27[0]
    var v50: s2 = v58
    v50.p2 = v15
    v14.p0 = v42
    v14.p0 = v16
    let v177: [[s1]] = v38.p1
    v50.p1 = v177
    v50.p2 = v30
    return v50
  }
  func f16(_ v0: s11, _ v1: [s1]) -> [s1] {
    let v8: [[s1]] = v0.p1
    var v72: [[s1]] = v8
    let v156: [s1] = v72[0]
    return v156
  }
  func f14(_ v0: s2, _ v1: s1, _ v2: s11) -> s1 {
    var v4: s2 = v0
    var v7: s1 = v1
    var v3: s1 = v7
    var v9: s2 = v0
    let v16: s2 = f85(v4)
    let v18: s0 = v3.p0
    v4.p0 = v18
    let v12: s2 = v2.p0
    let v20: s2 = f21(v9)
    let v43: s1 = f68(v20, v3)
    let v112: s1 = f68(v12, v43)
    let v106: s1 = f68(v16, v112)
    return v106
  }
  func f6(_ v0: s2, _ v1: s11) -> s11 {
    var v2: s11 = v1
    v2.p0 = v0
    let v3: s2 = f21(v0)
    var v6: s2 = v0
    let v7: [[s1]] = v1.p1
    let v5: [s1] = v7[0]
    var v18: s11 = v2
    v6.p1 = v7
    v6.p1 = v7
    let v4: [s1] = v7[0]
    let v8: [[s1]] = v1.p1
    var v9: s11 = v18
    let v12: s1 = v4[0]
    let v15: [s1] = v7[0]
    let v14: [s1] = v8[0]
    v2.p0 = v0
    let v11: s2 = f21(v6)
    let v20: s1 = f68(v11, v12)
    let v25: s1 = f14(v0, v20, v9)
    var v13: [[s1]] = v7
    let v34: s1 = f79(v25)
    v18.p1 = v13
    let v31: s11 = s11(p0: v3, p1: v7)
    let v35: s0 = v34.p0
    let v41: [s1] = f16(v31, v15)
    var v27: s0 = v35
    let v36: [s0] = v25.p1
    v13[0] = v5
    v6.p0 = v27
    v2.p0 = v3
    v13[0] = v14
    let v102: s2 = f85(v0)
    let v49: s0 = v36[2]
    let v51: s2 = v1.p0
    v2 = v18
    var v40: s2 = v102
    v13[0] = v41
    let v78: s0 = v36[0]
    v40.p0 = v78
    let v131: s2 = f85(v11)
    let v67: [s2] = [v51, v102, v3, v131, v40, v6, v51]
    let v62: s2 = v67[6]
    let v128: s11 = s11(p0: v62, p1: v13)
    let v91: s2 = v1.p0
    let v227: s2 = f21(v91)
    let v266: s2 = v67[1]
    v18.p0 = v227
    let v155: [[Double]] = v49.p1
    v27.p1 = v155
    v9.p0 = v266
    return v128
  }
  @inline(never)
  func f0(_ v0: [s11], _ v1: Double) -> Double {
    var v4: [s11] = v0
    let v2: s11 = v0[2]
    let v11: s11 = v4[0]
    v4[2] = v2
    let v13: s11 = v4[2]
    let v15: s2 = v11.p0
    let v23: s11 = f6(v15, v2)
    let v24: s2 = f85(v15)
    v4[1] = v23
    let v43: s11 = v4[0]
    let v42: s0 = v24.p0
    v4[0] = v13
    v4[2] = v13
    let v35: [[Double]] = v42.p1
    let v73: [Double] = v35[0]
    let v103: Double = v73[0]
    v4[1] = v43
    return v103
  }
  func benchmark() {
    let v0: [s11] = [s11(p0: s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [[s1(p0: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])])]], p2: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]), p1: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])])]]), s11(p0: s2(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), p1: [[s1(p0: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), p1: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])])]], p2: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])]), p1: [[s1(p0: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), p1: [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]]), s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])])]]), s11(p0: s2(p0: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]]), p1: [[s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]]), p1: [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]]), s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]])])]], p2: [s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])]), p1: [[s1(p0: s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]]), p1: [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]]), s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])])]])]
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
