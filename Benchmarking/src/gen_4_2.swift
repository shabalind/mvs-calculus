  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s4 {
    var p0: s0
    var p1: [s1]
  }
  struct s5 {
    var p0: [s4]
    var p1: s4
    var p2: s2
  }
  func f43(_ v0: [s4]) -> [s4] {
    var v7: [s4] = v0
    var v5: [s4] = v7
    var v4: [s4] = v5
    var v1: [s4] = v5
    let v6: s4 = v1[1]
    let v8: s0 = v6.p0
    var v12: s4 = v6
    let v14: s4 = v5[0]
    v5[0] = v12
    v12.p0 = v8
    v12.p0 = v8
    v12.p0 = v8
    v12.p0 = v8
    v5 = v4
    let v58: s0 = v14.p0
    let v36: s4 = v4[1]
    let v54: s0 = v6.p0
    v7[0] = v36
    let v56: s4 = v5[1]
    let v43: [s1] = v6.p1
    v12.p1 = v43
    let v38: [s1] = v12.p1
    var v51: [s4] = v1
    v12.p1 = v43
    v12.p0 = v58
    v12.p0 = v54
    v12.p1 = v38
    v51[1] = v56
    return v51
  }
  func f42(_ v0: s5, _ v1: s0) -> s5 {
    var v6: s5 = v0
    var v5: s5 = v0
    let v2: [s5] = [v6]
    let v13: s4 = v6.p1
    v6.p1 = v13
    v6 = v0
    var v8: s4 = v13
    let v14: [s1] = v8.p1
    v6.p1 = v8
    var v12: [s5] = v2
    v12 = v2
    v12[0] = v5
    v8.p1 = v14
    v12 = v2
    let v110: s5 = v12[0]
    return v110
  }
  func f41(_ v0: s2, _ v1: s0) -> s2 {
    let v2: s1 = v0.p0
    let v30: [[s0]] = v0.p1
    let v48: s2 = s2(p0: v2, p1: v30)
    var v33: s2 = v48
    let v62: [s2] = [v0, v33, v33, v33, v33, v33, v33]
    let v110: s2 = v62[3]
    return v110
  }
  func f38(_ v0: s1) -> s1 {
    var v7: s1 = v0
    var v4: s1 = v0
    var v3: s1 = v4
    var v6: s1 = v0
    let v2: [s0] = v3.p1
    let v9: [s0] = v6.p0
    var v1: [s0] = v2
    let v10: s0 = v2[0]
    var v8: [s0] = v1
    let v18: s0 = v9[1]
    let v32: [[Double]] = v10.p0
    let v20: [s0] = v6.p0
    let v12: [s0] = v7.p0
    var v14: s0 = v10
    let v21: s1 = s1(p0: v20, p1: v8)
    let v34: s0 = v8[1]
    var v37: [s0] = v9
    v7.p0 = v12
    v14.p0 = v32
    let v15: s0 = v8[0]
    var v52: s0 = v18
    v8[1] = v52
    v6.p1 = v1
    v1[1] = v34
    v8[1] = v18
    v4.p1 = v1
    var v40: s1 = v21
    v4.p0 = v12
    let v43: [s0] = v6.p0
    v6.p0 = v37
    v37[1] = v15
    let v41: [s0] = v0.p1
    v37[1] = v34
    v3.p1 = v1
    v4.p0 = v37
    v3.p1 = v1
    v4.p0 = v43
    v8[0] = v18
    var v122: [s0] = v41
    v40.p1 = v122
    v40.p1 = v41
    let v90: [s1] = [v0, v3, v4, v40, v0, v21, v21]
    v122[1] = v14
    var v81: [s1] = v90
    let v83: s1 = v81[1]
    return v83
  }
  func f37(_ v0: s0, _ v1: s1) -> s1 {
    var v5: s1 = v1
    let v20: s1 = f38(v5)
    return v20
  }
  func f35(_ v0: s1) -> s1 {
    let v7: s1 = f38(v0)
    let v6: s1 = f38(v0)
    let v3: s1 = f38(v0)
    var v2: s1 = v7
    let v4: [s1] = [v3, v2, v7]
    let v5: s1 = f38(v2)
    let v1: [s0] = v5.p0
    v2.p0 = v1
    let v9: s1 = f38(v6)
    v2.p0 = v1
    let v12: [[s0]] = [v1, v1, v1]
    let v21: s0 = v1[0]
    let v31: [s0] = v12[0]
    let v18: s4 = s4(p0: v21, p1: v4)
    v2.p0 = v31
    let v47: [s1] = v18.p1
    let v59: s1 = v47[2]
    v2 = v59
    let v38: [s0] = v9.p0
    let v34: s1 = v47[2]
    v2.p0 = v38
    v2.p0 = v38
    return v34
  }
  func f32(_ v0: [s1], _ v1: s5) -> s5 {
    let v4: s4 = v1.p1
    var v6: s4 = v4
    let v2: s1 = v0[0]
    let v3: s1 = f35(v2)
    let v5: s0 = v6.p0
    let v10: s1 = f38(v2)
    var v11: s5 = v1
    var v8: s5 = v1
    let v20: [s1] = v4.p1
    v8.p1 = v6
    v8.p1 = v4
    var v15: [s1] = v20
    let v13: [s1] = v4.p1
    var v24: s0 = v5
    v15[1] = v2
    let v17: s2 = v11.p2
    v15[0] = v10
    v15[0] = v10
    v15[0] = v10
    let v16: s1 = v20[2]
    v15[2] = v3
    v11.p2 = v17
    let v33: s2 = f41(v17, v5)
    v6.p0 = v24
    v8.p2 = v33
    var v32: [s1] = v15
    let v69: s0 = v6.p0
    var v37: s4 = v4
    v11.p1 = v37
    let v53: [s4] = v8.p0
    v6.p1 = v32
    let v58: [[Double]] = v69.p0
    var v39: [s1] = v0
    v6.p0 = v5
    v39[0] = v16
    let v113: s5 = s5(p0: v53, p1: v37, p2: v33)
    v8.p1 = v4
    v6.p0 = v24
    v32[2] = v16
    v15[0] = v16
    v8.p0 = v53
    v6 = v4
    let v215: s1 = v39[0]
    v15[0] = v215
    v24.p0 = v58
    v6.p1 = v13
    return v113
  }
  func f24(_ v0: s5) -> s5 {
    var v7: s5 = v0
    var v5: s5 = v7
    let v3: s2 = v5.p2
    var v1: s5 = v5
    let v2: [[s0]] = v3.p1
    let v21: [s0] = v2[0]
    v7 = v0
    let v10: s0 = v21[0]
    v5.p2 = v3
    let v11: s2 = f41(v3, v10)
    v7.p2 = v11
    var v9: s0 = v10
    v7 = v1
    let v8: [[Double]] = v9.p0
    let v13: [s4] = v0.p0
    v5.p0 = v13
    var v16: [s4] = v13
    let v12: s0 = v21[0]
    let v15: s0 = v21[0]
    let v29: s5 = f42(v7, v12)
    var v17: [[Double]] = v8
    let v20: [Double] = v17[0]
    let v26: s4 = v29.p1
    v7.p0 = v13
    let v35: s2 = f41(v11, v9)
    let v36: s2 = f41(v35, v15)
    let v32: [s4] = f43(v16)
    v5.p0 = v32
    let v31: s2 = v5.p2
    var v23: s4 = v26
    v7.p2 = v35
    v1.p2 = v36
    let v55: [s4] = f43(v13)
    var v50: [s4] = v13
    var v74: [Double] = v20
    v5.p2 = v36
    v50[1] = v23
    var v86: s5 = v0
    v16 = v55
    let v97: [Double] = v8[1]
    v86.p1 = v23
    v17[1] = v97
    let v64: [s4] = f43(v13)
    v86.p2 = v31
    let v84: s4 = v50[0]
    v9.p0 = v17
    v17[2] = v74
    let v91: [s4] = f43(v32)
    v5.p1 = v84
    v16 = v64
    v5.p0 = v91
    let v106: s5 = f42(v86, v9)
    return v106
  }
  func f11(_ v0: [s1]) -> [s1] {
    var v5: [s1] = v0
    v5 = v0
    var v3: [s1] = v5
    let v4: s1 = v5[2]
    let v11: s1 = f38(v4)
    var v8: [s1] = v3
    v3[0] = v11
    v5[0] = v4
    var v20: [s1] = v8
    return v20
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    var v7: s5 = v0
    let v5: s5 = f24(v0)
    let v2: s5 = f24(v5)
    let v6: s4 = v7.p1
    let v4: [s1] = v6.p1
    var v12: s5 = v7
    var v8: s4 = v6
    let v9: s0 = v6.p0
    let v13: [s1] = v6.p1
    var v18: s0 = v9
    let v15: s0 = v8.p0
    let v14: [s1] = f11(v13)
    let v19: s4 = v12.p1
    var v32: s0 = v9
    let v25: s1 = v13[2]
    let v31: s1 = f37(v32, v25)
    let v20: [s1] = f11(v14)
    var v16: s4 = v19
    let v34: s1 = v13[0]
    let v26: [s1] = [v31]
    let v45: s1 = v4[2]
    let v28: s1 = v4[1]
    var v42: [s1] = v20
    var v33: [s1] = v26
    v16.p1 = v4
    v42[1] = v31
    v42 = v14
    let v49: s2 = v12.p2
    v16.p1 = v13
    let v92: s2 = f41(v49, v15)
    var v52: [s1] = v26
    let v41: s1 = f38(v34)
    v12.p2 = v92
    let v56: s1 = f38(v25)
    var v51: [s1] = v13
    v33[0] = v28
    v16.p1 = v4
    var v37: s2 = v49
    let v50: s5 = f32(v33, v12)
    v52[0] = v25
    let v53: [[Double]] = v18.p0
    v8.p1 = v51
    var v43: [[Double]] = v53
    v52[0] = v25
    var v72: s4 = v16
    v42[0] = v56
    var v47: [[Double]] = v43
    let v97: s1 = f38(v45)
    var v74: s4 = v72
    var v98: [[Double]] = v47
    let v104: s1 = v37.p0
    v7.p2 = v37
    let v73: s0 = v72.p0
    v42[2] = v56
    var v105: [[Double]] = v98
    v12.p2 = v92
    v42[0] = v41
    v8.p1 = v42
    v12 = v2
    v42[0] = v31
    let v125: [Double] = v105[0]
    v52[0] = v104
    v32.p0 = v105
    v33[0] = v97
    v8.p1 = v51
    v98[2] = v125
    let v151: [Double] = v105[1]
    v52[0] = v56
    v12 = v50
    let v120: Double = v151[0]
    let v247: [s1] = v74.p1
    v72.p1 = v247
    v105[0] = v125
    v8.p0 = v73
    let v187: s1 = v52[0]
    v51[2] = v187
    return v120
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s4(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s1(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])]), s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], p1: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])]), s1(p0: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])], p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]]), s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]])])]), s4(p0: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), p1: [s1(p0: [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]]), s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])], p1: [s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]]), s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]]), s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])]), s1(p0: [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]]), s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])], p1: [s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]]), s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]]), s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]])]), s1(p0: [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]]), s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]])], p1: [s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]]), s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]])])])], p1: s4(p0: s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]]), p1: [s1(p0: [s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]]), s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0]])], p1: [s0(p0: [[140.0], [141.0], [142.0]], p1: [[143.0]]), s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]]), s0(p0: [[148.0], [149.0], [150.0]], p1: [[151.0]])]), s1(p0: [s0(p0: [[152.0], [153.0], [154.0]], p1: [[155.0]]), s0(p0: [[156.0], [157.0], [158.0]], p1: [[159.0]])], p1: [s0(p0: [[160.0], [161.0], [162.0]], p1: [[163.0]]), s0(p0: [[164.0], [165.0], [166.0]], p1: [[167.0]]), s0(p0: [[168.0], [169.0], [170.0]], p1: [[171.0]])]), s1(p0: [s0(p0: [[172.0], [173.0], [174.0]], p1: [[175.0]]), s0(p0: [[176.0], [177.0], [178.0]], p1: [[179.0]])], p1: [s0(p0: [[180.0], [181.0], [182.0]], p1: [[183.0]]), s0(p0: [[184.0], [185.0], [186.0]], p1: [[187.0]]), s0(p0: [[188.0], [189.0], [190.0]], p1: [[191.0]])])]), p2: s2(p0: s1(p0: [s0(p0: [[192.0], [193.0], [194.0]], p1: [[195.0]]), s0(p0: [[196.0], [197.0], [198.0]], p1: [[199.0]])], p1: [s0(p0: [[200.0], [201.0], [202.0]], p1: [[203.0]]), s0(p0: [[204.0], [205.0], [206.0]], p1: [[207.0]]), s0(p0: [[208.0], [209.0], [210.0]], p1: [[211.0]])]), p1: [[s0(p0: [[212.0], [213.0], [214.0]], p1: [[215.0]])], [s0(p0: [[216.0], [217.0], [218.0]], p1: [[219.0]])], [s0(p0: [[220.0], [221.0], [222.0]], p1: [[223.0]])]]))
    let v1: Double = 224.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 224.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
