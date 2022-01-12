  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: Double
    var p1: s2
  }
  func f110(_ v0: s2) -> s2 {
    let v1: s1 = v0.p1
    let v8: s0 = v1.p0
    var v5: s0 = v8
    var v4: s1 = v1
    var v2: s1 = v4
    var v9: s2 = v0
    var v20: s1 = v2
    v9.p0 = v4
    let v15: s0 = v1.p0
    var v7: s2 = v0
    let v11: Double = v15.p1
    let v6: s0 = v4.p0
    v4.p0 = v15
    let v30: [s2] = [v0, v9, v9, v7, v9]
    v7.p0 = v20
    v4.p0 = v5
    v5.p1 = v11
    v4.p0 = v15
    let v31: s2 = v30[2]
    v7 = v0
    var v36: [s2] = v30
    v36[3] = v31
    var v63: [s2] = v36
    let v58: s2 = v63[0]
    let v70: s2 = v36[3]
    v36[1] = v58
    v36[3] = v7
    v63[0] = v58
    v36[1] = v0
    v20.p0 = v6
    return v70
  }
  func f92(_ v0: s2) -> s2 {
    let v1: s1 = v0.p0
    let v9: s2 = s2(p0: v1, p1: v1)
    let v3: [s1] = [v1, v1, v1, v1, v1, v1]
    var v8: s2 = v9
    var v7: s1 = v1
    let v2: s0 = v7.p0
    let v10: s1 = v0.p1
    v8.p0 = v7
    let v11: s2 = f110(v8)
    let v16: s1 = v3[3]
    let v17: s0 = v1.p0
    let v15: [[Double]] = v17.p0
    let v24: s2 = f110(v9)
    let v12: s1 = v3[3]
    v8.p1 = v12
    let v4: [Double] = v15[1]
    var v20: s1 = v10
    let v14: s1 = v24.p0
    let v34: s0 = v20.p0
    let v26: s2 = f110(v24)
    v20.p0 = v2
    let v48: s0 = v12.p0
    let v19: s2 = f110(v11)
    var v35: s0 = v17
    let v36: [Double] = v15[2]
    v7.p0 = v35
    var v50: s1 = v12
    var v47: s1 = v50
    let v55: s1 = v26.p0
    let v96: s1 = v26.p1
    let v151: Double = v4[0]
    v8.p0 = v10
    v8.p1 = v96
    var v100: s2 = v19
    let v101: Double = v36[0]
    let v83: s0 = v47.p0
    v8.p1 = v16
    v20.p0 = v48
    v35.p1 = v151
    v8.p0 = v14
    v7.p0 = v34
    v35.p1 = v101
    v20.p0 = v83
    let v150: s2 = f110(v100)
    v50.p0 = v2
    v100.p1 = v55
    v8 = v19
    return v150
  }
  func f88(_ v0: s1) -> s1 {
    return v0
  }
  func f86(_ v0: s1) -> s1 {
    let v4: s0 = v0.p0
    let v3: s0 = v0.p0
    let v2: [[Double]] = v4.p0
    let v7: [Double] = v2[0]
    let v5: Double = v3.p1
    let v6: Double = v3.p1
    var v1: s0 = v4
    let v8: [[Double]] = v3.p0
    v1.p0 = v8
    v1.p0 = v2
    let v12: [Double] = v2[0]
    let v14: [s0] = [v4, v4, v3, v1, v1, v3]
    let v9: [Double] = v2[0]
    v1.p1 = v6
    let v23: [[Double]] = [v7, v7, v9, v7, v7, v12]
    let v22: [Double] = v2[1]
    var v47: [Double] = v7
    v1.p1 = v6
    v47[0] = v5
    var v39: [[Double]] = v23
    v39[2] = v47
    let v30: s0 = v0.p0
    let v24: [Double] = v39[5]
    let v59: Double = v24[0]
    v47[0] = v5
    v47[0] = v59
    v1.p1 = v59
    let v42: s0 = v14[2]
    let v37: s1 = f88(v0)
    var v198: s1 = v37
    v47[0] = v59
    v39[0] = v22
    v198.p0 = v42
    v47[0] = v6
    v1.p1 = v5
    v198.p0 = v30
    v47[0] = v6
    return v198
  }
  func f82(_ v0: s2) -> s2 {
    let v3: s2 = f110(v0)
    let v1: s2 = f92(v3)
    var v9: s2 = v1
    let v11: s1 = v1.p1
    v9.p0 = v11
    v9.p0 = v11
    let v10: s2 = f92(v9)
    let v22: s2 = f92(v10)
    var v21: s1 = v11
    let v20: s1 = f86(v21)
    let v19: s1 = f86(v20)
    let v12: s1 = v22.p0
    let v28: s1 = f86(v20)
    let v34: s1 = f86(v12)
    let v14: s1 = f86(v11)
    let v32: s1 = f88(v20)
    v9.p1 = v14
    var v75: s2 = v10
    v75.p0 = v28
    var v44: s1 = v34
    let v64: s1 = f88(v44)
    let v78: s1 = f86(v12)
    let v61: [s1] = [v78, v19, v12, v32]
    let v71: s1 = f88(v64)
    var v159: [s1] = v61
    v159[3] = v14
    v9.p1 = v71
    let v104: s1 = v159[3]
    let v126: s2 = f110(v75)
    v159[3] = v28
    v9.p0 = v104
    return v126
  }
  func f81(_ v0: s1) -> s1 {
    var v5: s1 = v0
    let v6: s0 = v5.p0
    let v9: s1 = f86(v0)
    var v48: s1 = v9
    v48.p0 = v6
    return v48
  }
  func f73(_ v0: s2) -> s2 {
    let v1: s2 = f110(v0)
    let v7: s2 = f82(v1)
    var v6: s2 = v7
    var v2: s2 = v1
    let v3: s1 = v7.p1
    let v9: s2 = s2(p0: v3, p1: v3)
    v6.p1 = v3
    let v29: s1 = f88(v3)
    let v8: [s2] = [v9, v2, v1, v6, v2, v1, v6]
    var v21: [s2] = v8
    v21[1] = v7
    var v39: s2 = v0
    let v17: s2 = v8[5]
    let v30: s2 = f110(v9)
    v21[2] = v30
    let v41: s1 = v2.p1
    let v57: s1 = v7.p0
    v2.p0 = v29
    v21[1] = v39
    v21[1] = v2
    let v104: s2 = f92(v17)
    v39.p1 = v41
    v39.p0 = v57
    let v83: s2 = v21[6]
    v39 = v104
    var v165: s2 = v83
    v21[3] = v165
    return v165
  }
  func f63(_ v0: [s2], _ v1: [[s2]], _ v2: s3) -> [s2] {
    var v7: [[s2]] = v1
    let v3: s2 = v0[0]
    let v6: s2 = f82(v3)
    v7[0] = v0
    let v9: s1 = v6.p1
    let v12: s1 = v6.p1
    var v11: s2 = v6
    let v13: s2 = f82(v3)
    let v16: [s2] = v1[0]
    v11.p1 = v12
    v11 = v13
    var v19: s1 = v9
    v7[0] = v16
    v11.p1 = v19
    v7[0] = v0
    let v24: s0 = v9.p0
    v7[0] = v0
    v19.p0 = v24
    var v42: [s2] = v0
    v7[0] = v42
    let v39: [s2] = v7[0]
    v7[0] = v39
    v42[0] = v11
    var v41: [s2] = v42
    v41 = v39
    v7 = v1
    v7 = v1
    v41[0] = v11
    var v31: [s2] = v41
    v7[0] = v42
    var v97: [s2] = v31
    v42[0] = v11
    return v97
  }
  func f58(_ v0: s1, _ v1: s1) -> s1 {
    let v2: s1 = f88(v0)
    let v10: s1 = f86(v2)
    let v3: s2 = s2(p0: v2, p1: v1)
    var v22: s2 = v3
    v22.p0 = v10
    let v24: s1 = v22.p1
    return v24
  }
  func f38(_ v0: s2) -> s2 {
    let v2: s1 = v0.p1
    let v5: s1 = f86(v2)
    let v3: s1 = f81(v5)
    var v7: s2 = v0
    let v10: s1 = f88(v2)
    v7.p0 = v10
    let v9: s1 = v7.p1
    var v16: s2 = v7
    v16.p1 = v2
    let v25: s1 = f81(v2)
    let v63: s1 = f58(v3, v9)
    v16.p0 = v9
    v16.p0 = v25
    v16.p1 = v25
    let v56: s1 = f86(v63)
    v7.p1 = v56
    return v16
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s2], _ v2: [[s2]], _ v3: Double) -> Double {
    var v4: [s2] = v1
    var v5: [s2] = v4
    let v8: [s2] = f63(v5, v2, v0)
    let v11: s2 = v0.p1
    let v13: s1 = v11.p1
    let v7: s1 = v11.p1
    let v10: s1 = f88(v7)
    var v9: [s2] = v4
    let v31: s2 = f73(v11)
    var v20: s2 = v11
    v20.p0 = v13
    let v15: s2 = v5[0]
    let v27: Double = v3 + v3
    v20.p0 = v10
    v5 = v8
    let v29: s2 = v9[0]
    v4[0] = v29
    let v45: [s2] = [v11]
    var v61: s3 = v0
    let v39: s1 = v20.p0
    let v51: s2 = f38(v31)
    let v62: s2 = s2(p0: v39, p1: v7)
    v4 = v45
    v4[0] = v29
    let v40: Double = v61.p0
    v9[0] = v62
    let v48: s1 = v15.p1
    let v37: s0 = v48.p0
    let v36: Double = v37.p1
    let v70: [Double] = [v36, v27, v3, v36, v40, v36, v36]
    v4[0] = v62
    let v160: Double = v61.p0
    var v168: Double = v160
    let v252: Double = v70[5]
    v9[0] = v51
    let v129: Double = v27 + v168
    let v138: Double = v129 * v252
    return v138
  }
  func benchmark() {
    let v0: s3 = s3(p0: 0.0, p1: s2(p0: s1(p0: s0(p0: [[1.0], [2.0], [3.0]], p1: 4.0)), p1: s1(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: 8.0))))
    let v1: [s2] = [s2(p0: s1(p0: s0(p0: [[9.0], [10.0], [11.0]], p1: 12.0)), p1: s1(p0: s0(p0: [[13.0], [14.0], [15.0]], p1: 16.0)))]
    let v2: [[s2]] = [[s2(p0: s1(p0: s0(p0: [[17.0], [18.0], [19.0]], p1: 20.0)), p1: s1(p0: s0(p0: [[21.0], [22.0], [23.0]], p1: 24.0)))]]
    let v3: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
