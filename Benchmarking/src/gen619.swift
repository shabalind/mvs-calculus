  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  func f35(_ v0: s1) -> s1 {
    var v1: s1 = v0
    var v2: s1 = v0
    let v7: [s0] = v0.p1
    let v4: s0 = v7[0]
    let v3: s0 = v7[0]
    var v9: s1 = v1
    v1.p1 = v7
    var v8: s1 = v0
    var v16: s0 = v4
    v9.p0 = v16
    v9 = v0
    var v12: s1 = v1
    v9 = v2
    v2.p0 = v3
    let v22: [[Double]] = v3.p0
    let v28: [s0] = v12.p1
    v9.p1 = v28
    let v17: [[Double]] = v3.p1
    let v34: s0 = v7[0]
    v1.p0 = v34
    let v52: s0 = v9.p0
    let v64: s0 = v1.p0
    v16.p1 = v17
    v12.p0 = v64
    v12.p0 = v34
    v16.p0 = v22
    v9 = v8
    v9.p0 = v64
    v16 = v52
    return v9
  }
  func f20(_ v0: s1) -> s1 {
    let v1: s1 = f35(v0)
    let v5: s1 = f35(v1)
    let v11: s1 = f35(v0)
    let v3: s1 = f35(v1)
    var v9: s1 = v11
    let v6: [s1] = [v1, v3, v5]
    let v4: [s0] = v9.p1
    let v10: s1 = f35(v5)
    let v2: [s1] = [v10, v3, v3, v11, v11]
    let v14: s1 = f35(v11)
    var v22: [s0] = v4
    let v43: s1 = v6[2]
    v9.p1 = v22
    var v31: [s1] = v2
    v31[4] = v43
    let v42: s1 = f35(v14)
    let v59: s1 = v31[2]
    let v147: s1 = f35(v59)
    let v49: s0 = v42.p0
    v9.p1 = v4
    v22[0] = v49
    let v98: s0 = v147.p0
    let v226: s1 = s1(p0: v98, p1: v22)
    return v226
  }
  func f3(_ v0: s1) -> s1 {
    let v3: s1 = f20(v0)
    let v4: s1 = f20(v0)
    var v2: s1 = v0
    let v8: [s0] = v3.p1
    let v6: s0 = v0.p0
    let v1: s1 = f35(v0)
    let v5: s1 = s1(p0: v6, p1: v8)
    let v7: [s1] = [v3, v0, v5, v1, v1, v5, v0]
    let v10: [s0] = v2.p1
    let v13: s1 = f20(v2)
    v2.p1 = v10
    let v15: s1 = f35(v13)
    var v21: [s1] = v7
    v21[3] = v2
    v2.p1 = v10
    var v14: [s1] = v21
    v21[0] = v0
    let v32: [s0] = v1.p1
    let v22: s1 = v14[1]
    var v27: s1 = v22
    v21[1] = v15
    let v56: s1 = v14[2]
    v21 = v7
    v14[6] = v4
    v2.p0 = v6
    var v67: [s1] = v14
    var v98: [s1] = v67
    let v47: [s0] = v22.p1
    v27.p1 = v8
    v2.p1 = v32
    let v51: s1 = f20(v27)
    v27.p1 = v10
    var v145: [s1] = v98
    v14[1] = v56
    v21[5] = v1
    v14 = v145
    v2.p1 = v47
    return v51
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v5: s0 = v1.p0
    let v6: s0 = v1.p0
    let v7: Double = v2 + v2
    var v9: s1 = v1
    let v17: s0 = v0[2]
    let v10: s3 = s3(p0: v9, p1: v0)
    v9.p0 = v6
    var v11: s0 = v5
    v9.p0 = v17
    var v30: [s0] = v0
    let v16: s0 = v30[0]
    v9.p0 = v16
    let v19: s1 = v10.p0
    let v41: Double = v7 + v7
    v30[2] = v16
    let v24: s0 = v19.p0
    v9.p0 = v5
    let v29: s1 = f3(v9)
    v30[1] = v6
    let v26: [s0] = v29.p1
    v30[2] = v11
    var v32: Double = v2
    var v39: Double = v2
    let v60: [[s0]] = [v30, v30, v30, v30, v0, v0]
    var v44: [[s0]] = v60
    let v50: [[Double]] = v24.p0
    let v85: s0 = v30[2]
    let v54: [s0] = v44[5]
    v11.p0 = v50
    let v74: Double = v2 / v41
    let v149: s0 = v26[0]
    let v51: [[s0]] = [v0, v0, v54, v30, v0, v0, v0]
    v44[2] = v54
    let v33: [s0] = v51[4]
    v9.p0 = v85
    let v121: [Double] = v50[0]
    v44[1] = v30
    let v89: [s0] = v51[6]
    let v61: Double = v121[0]
    var v75: Double = v61
    let v168: [[Double]] = v5.p1
    v9.p0 = v16
    v9.p0 = v149
    let v108: s0 = s0(p0: v50, p1: v168)
    let v115: Double = v74 / v32
    v30 = v33
    let v65: Double = v75 - v39
    v9.p0 = v108
    v44[0] = v89
    let v197: Double = v65 / v115
    return v197
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]
    let v1: s1 = s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])])
    let v2: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
