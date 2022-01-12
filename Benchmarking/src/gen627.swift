  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
  }
  struct s1 {
    var p0: Double
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [[s1]]
    var p1: s2
  }
  struct s4 {
    var p0: s1
    var p1: [s3]
  }
  func f108(_ v0: s1) -> s1 {
    var v6: s1 = v0
    let v5: Double = v6.p0
    let v2: Double = v0.p0
    let v18: Double = v6.p0
    let v19: s1 = s1(p0: v2)
    v6 = v0
    v6.p0 = v18
    let v26: Double = v19.p0
    v6.p0 = v2
    v6.p0 = v5
    v6.p0 = v26
    return v6
  }
  func f95(_ v0: s2) -> s2 {
    return v0
  }
  func f71(_ v0: s1, _ v1: s3) -> s3 {
    var v131: s3 = v1
    return v131
  }
  func f65(_ v0: s3) -> s3 {
    let v4: [s3] = [v0, v0, v0, v0, v0, v0, v0]
    let v1: s3 = v4[2]
    let v5: s3 = v4[1]
    var v8: s3 = v5
    let v3: s3 = v4[6]
    let v2: [[s1]] = v5.p0
    let v7: [[s1]] = v3.p0
    let v10: [s1] = v2[0]
    let v13: [[s1]] = v0.p0
    v8.p0 = v7
    let v6: s3 = v4[1]
    let v11: s1 = v10[0]
    v8.p0 = v7
    let v12: Double = v11.p0
    var v24: [s3] = v4
    var v22: s1 = v11
    let v16: s3 = v24[6]
    let v19: s1 = v10[0]
    let v18: s3 = f71(v22, v8)
    let v34: Double = v19.p0
    let v20: s3 = f71(v19, v18)
    let v17: s2 = v5.p1
    let v49: s2 = f95(v17)
    let v53: s1 = v10[0]
    var v70: s3 = v8
    let v45: Double = v53.p0
    let v23: s3 = f71(v22, v70)
    v70.p1 = v49
    let v56: s2 = f95(v49)
    v22.p0 = v34
    v8.p1 = v49
    v22.p0 = v12
    v70 = v20
    let v44: [s3] = [v23, v18, v6, v6, v1, v16]
    v22.p0 = v45
    v70.p0 = v13
    let v210: s2 = f95(v56)
    v8.p1 = v210
    var v213: [s3] = v44
    v213[0] = v3
    let v150: s3 = v213[4]
    v8.p0 = v13
    return v150
  }
  func f56(_ v0: s3) -> s3 {
    let v3: s2 = v0.p1
    var v5: s3 = v0
    let v2: [[s1]] = v0.p0
    v5.p0 = v2
    var v7: s2 = v3
    var v8: [[s1]] = v2
    var v4: [[s1]] = v2
    v5.p0 = v4
    let v1: s2 = f95(v3)
    let v14: s2 = f95(v7)
    let v20: s1 = v1.p0
    let v27: [s1] = v8[0]
    v5.p1 = v1
    let v48: s1 = f108(v20)
    let v28: [[s1]] = v5.p0
    v5.p0 = v28
    v5.p1 = v7
    v4[0] = v27
    v5.p1 = v3
    var v75: s1 = v20
    let v67: s3 = s3(p0: v28, p1: v14)
    let v87: s3 = f71(v75, v67)
    v7.p0 = v48
    v5.p1 = v7
    return v87
  }
  func f54(_ v0: s2) -> s2 {
    let v2: s2 = f95(v0)
    let v1: s2 = f95(v2)
    var v4: s2 = v1
    var v6: s2 = v4
    let v8: s1 = v1.p0
    let v7: s1 = v0.p0
    v6.p0 = v7
    let v11: [s1] = [v8, v8, v7, v8, v8]
    let v14: s1 = v11[1]
    var v19: [s1] = v11
    v6.p0 = v7
    let v12: [s1] = [v7, v14, v7, v7]
    let v23: s1 = v19[2]
    let v21: s1 = v12[0]
    v6.p0 = v23
    v6.p0 = v21
    v19[1] = v7
    let v34: [[s1]] = [v19, v19, v19, v19, v19]
    let v25: s1 = v11[2]
    let v26: [s1] = v34[1]
    v19[3] = v25
    v19 = v26
    return v6
  }
  func f41(_ v0: s2, _ v1: s4) -> s4 {
    var v5: s4 = v1
    var v4: s4 = v1
    let v10: [s3] = v5.p1
    let v11: [s3] = v4.p1
    v5.p1 = v11
    v4.p1 = v11
    let v14: [s4] = [v4, v1, v4, v5, v4, v4]
    let v12: s4 = v14[2]
    v4.p1 = v10
    var v23: [s4] = v14
    v5.p1 = v10
    let v38: s4 = v23[4]
    v23[5] = v12
    v23 = v14
    var v51: [s4] = v23
    let v108: s4 = v51[5]
    v51[4] = v38
    let v81: s4 = v51[0]
    v51 = v23
    v51[5] = v108
    var v132: s4 = v5
    v5 = v1
    v23[2] = v132
    return v81
  }
  func f29(_ v0: s4) -> s4 {
    let v4: [s3] = v0.p1
    let v1: [s3] = v0.p1
    var v2: s4 = v0
    v2.p1 = v4
    v2.p1 = v4
    let v7: s3 = v4[0]
    let v6: [s3] = v2.p1
    let v3: s3 = f65(v7)
    var v15: s4 = v2
    let v10: s3 = v1[1]
    var v8: [s3] = v6
    let v12: s3 = f65(v3)
    v2.p1 = v6
    v8[0] = v3
    v8[1] = v7
    var v28: s4 = v15
    v2.p1 = v8
    let v13: s3 = f56(v12)
    let v19: s3 = v6[0]
    let v16: s3 = f56(v13)
    v8[0] = v16
    let v37: [[s1]] = v19.p0
    v8[0] = v10
    v15.p1 = v1
    let v35: [s1] = v37[0]
    let v48: s3 = v8[1]
    let v26: s1 = v35[0]
    v15.p0 = v26
    v28 = v0
    v8[1] = v48
    let v23: s3 = f71(v26, v10)
    let v51: s1 = f108(v26)
    let v39: s1 = f108(v51)
    v2.p0 = v39
    v8[1] = v23
    return v28
  }
  func f27(_ v0: s4) -> s4 {
    var v8: s4 = v0
    return v8
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v2: Double = v1 + v1
    let v7: [[s4]] = [v0, v0, v0, v0, v0, v0]
    var v5: [s4] = v0
    var v9: [[s4]] = v7
    var v4: [s4] = v5
    v9[1] = v0
    let v14: [s4] = v9[0]
    let v6: s4 = v14[2]
    let v8: [s3] = v6.p1
    let v13: s4 = f27(v6)
    v9[3] = v5
    let v3: s4 = f29(v13)
    v5 = v0
    let v17: s3 = v8[1]
    let v28: s2 = v17.p1
    v4[0] = v13
    let v21: s3 = v8[1]
    let v19: s2 = f54(v28)
    let v25: s4 = v0[0]
    let v42: [s4] = v9[0]
    let v40: s1 = v13.p0
    let v27: s3 = f71(v40, v21)
    var v22: s4 = v13
    v9[3] = v5
    let v24: s4 = f41(v19, v25)
    v5[2] = v3
    let v18: s4 = v4[0]
    var v33: [[s4]] = v9
    var v39: [[s4]] = v33
    let v41: s2 = v27.p1
    let v31: s1 = s1(p0: v2)
    v5[2] = v24
    let v45: s0 = v41.p1
    var v48: [[s4]] = v39
    let v53: s2 = s2(p0: v31, p1: v45)
    let v57: [s4] = v48[1]
    let v69: [s4] = v33[0]
    v9[4] = v69
    v33[5] = v0
    let v104: s1 = v53.p0
    v22.p0 = v40
    v5[2] = v22
    v33[4] = v42
    v22.p0 = v104
    let v93: Double = v104.p0
    v33[4] = v57
    var v75: [[s4]] = v39
    let v61: [s4] = v33[0]
    v5[1] = v18
    v33[5] = v61
    v5[1] = v6
    v33[3] = v4
    v9 = v75
    return v93
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s1(p0: 0.0), p1: [s3(p0: [[s1(p0: 1.0)]], p1: s2(p0: s1(p0: 2.0), p1: s0(p0: [[3.0], [4.0], [5.0]], p1: [6.0], p2: [[7.0]], p3: [[8.0]], p4: [[9.0]], p5: [[10.0], [11.0], [12.0]]))), s3(p0: [[s1(p0: 13.0)]], p1: s2(p0: s1(p0: 14.0), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [18.0], p2: [[19.0]], p3: [[20.0]], p4: [[21.0]], p5: [[22.0], [23.0], [24.0]])))]), s4(p0: s1(p0: 25.0), p1: [s3(p0: [[s1(p0: 26.0)]], p1: s2(p0: s1(p0: 27.0), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [31.0], p2: [[32.0]], p3: [[33.0]], p4: [[34.0]], p5: [[35.0], [36.0], [37.0]]))), s3(p0: [[s1(p0: 38.0)]], p1: s2(p0: s1(p0: 39.0), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [43.0], p2: [[44.0]], p3: [[45.0]], p4: [[46.0]], p5: [[47.0], [48.0], [49.0]])))]), s4(p0: s1(p0: 50.0), p1: [s3(p0: [[s1(p0: 51.0)]], p1: s2(p0: s1(p0: 52.0), p1: s0(p0: [[53.0], [54.0], [55.0]], p1: [56.0], p2: [[57.0]], p3: [[58.0]], p4: [[59.0]], p5: [[60.0], [61.0], [62.0]]))), s3(p0: [[s1(p0: 63.0)]], p1: s2(p0: s1(p0: 64.0), p1: s0(p0: [[65.0], [66.0], [67.0]], p1: [68.0], p2: [[69.0]], p3: [[70.0]], p4: [[71.0]], p5: [[72.0], [73.0], [74.0]])))])]
    let v1: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
