  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: [[s0]]
  }
  func f97(_ v0: s1, _ v1: s0) -> s0 {
    let v23: [[s0]] = v0.p1
    let v35: [s0] = v23[0]
    let v37: s0 = v35[0]
    return v37
  }
  func f91(_ v0: s0, _ v1: s0) -> s0 {
    var v3: s0 = v0
    var v5: s0 = v3
    var v6: s0 = v0
    let v4: [[Double]] = v6.p0
    let v8: [[Double]] = v5.p1
    let v2: [Double] = v8[1]
    var v7: [[Double]] = v4
    var v9: [[Double]] = v8
    v6.p0 = v7
    let v10: [Double] = v4[1]
    var v11: [[Double]] = v9
    v6.p0 = v4
    v5.p0 = v7
    var v23: [[Double]] = v8
    let v20: [Double] = v7[1]
    v23[0] = v10
    v11 = v23
    v11[1] = v10
    let v16: [[Double]] = v6.p1
    v11[1] = v20
    var v19: [[Double]] = v16
    v3.p1 = v8
    v5.p0 = v4
    let v21: [Double] = v19[0]
    let v24: [[[Double]]] = [v11, v19, v16]
    v6.p0 = v4
    v9[0] = v21
    v19[1] = v2
    let v30: [Double] = v16[0]
    v7[1] = v30
    let v43: [[Double]] = v24[0]
    v6.p1 = v8
    let v32: [[Double]] = v24[0]
    let v75: [[Double]] = v6.p0
    v3.p1 = v43
    v9 = v8
    v3.p0 = v75
    let v45: [[Double]] = v3.p0
    v5.p0 = v45
    v23[1] = v21
    let v48: s0 = s0(p0: v45, p1: v32)
    v5.p0 = v45
    return v48
  }
  func f90(_ v0: s1) -> s1 {
    let v5: [[s0]] = v0.p1
    let v4: [[s0]] = v0.p1
    let v2: [[s0]] = v0.p2
    var v6: [[s0]] = v2
    var v7: s1 = v0
    var v14: [[s0]] = v4
    let v10: [s0] = v14[2]
    let v8: [s0] = v0.p0
    let v3: [s0] = v5[1]
    v7.p1 = v4
    let v1: [s0] = v0.p0
    var v15: [s0] = v1
    v6[0] = v10
    let v24: [s0] = v0.p0
    let v11: [[s0]] = v0.p2
    let v30: [[s0]] = v0.p1
    let v12: s0 = v3[0]
    let v16: s0 = f91(v12, v12)
    var v19: s1 = v0
    v7.p1 = v5
    v15[0] = v12
    v15[2] = v16
    v19.p2 = v6
    v7.p0 = v1
    v7.p0 = v1
    let v36: [[s0]] = [v8, v1, v24, v1]
    let v25: [[s0]] = v19.p1
    v19.p1 = v30
    v19.p2 = v11
    v7.p0 = v15
    let v22: [[s0]] = v7.p2
    v19.p0 = v15
    let v45: [s0] = v5[1]
    v14[0] = v3
    let v27: [s0] = v36[3]
    let v28: [s0] = v36[1]
    v19.p0 = v24
    v6[0] = v45
    v19.p0 = v28
    let v29: [[s0]] = v7.p2
    let v32: s1 = s1(p0: v15, p1: v25, p2: v11)
    v14[2] = v3
    v19.p0 = v28
    v7 = v19
    var v34: [[s0]] = v6
    var v39: [[s0]] = v29
    v39 = v34
    v7.p2 = v39
    let v56: [s0] = v32.p0
    let v73: s1 = s1(p0: v56, p1: v4, p2: v22)
    let v151: [[s0]] = v19.p2
    v19.p0 = v27
    v7.p2 = v6
    var v93: [[s0]] = v4
    v34[0] = v45
    v7.p0 = v24
    v7.p2 = v11
    v19.p1 = v93
    v7.p2 = v151
    v93[1] = v10
    return v73
  }
  func f89(_ v0: s1) -> s1 {
    let v4: [[s0]] = v0.p2
    let v7: [s0] = v4[0]
    var v5: [[s0]] = v4
    v5[0] = v7
    var v9: s1 = v0
    let v3: s0 = v7[0]
    let v8: s0 = v7[0]
    v5[0] = v7
    v9.p2 = v4
    var v13: s0 = v3
    v9.p2 = v4
    let v1: s0 = f97(v9, v13)
    v9.p2 = v4
    let v6: s1 = f90(v9)
    let v10: [[s0]] = v9.p1
    let v11: [s0] = v0.p0
    v9.p2 = v5
    var v18: [s0] = v11
    v5[0] = v7
    v18[2] = v1
    let v12: s0 = f91(v1, v3)
    v5[0] = v7
    let v36: s0 = v7[0]
    v9.p2 = v5
    let v21: [[Double]] = v12.p1
    var v17: [[s0]] = v5
    let v20: [s0] = v6.p0
    v18[0] = v13
    v9.p0 = v18
    v9.p0 = v20
    let v62: [[Double]] = v3.p0
    let v16: [Double] = v62[0]
    v18[0] = v13
    let v41: [s0] = v10[0]
    var v34: [s0] = v41
    var v23: [[Double]] = v21
    let v24: s0 = f91(v36, v8)
    v9.p2 = v17
    v23[0] = v16
    v9.p1 = v10
    let v35: s1 = s1(p0: v18, p1: v10, p2: v5)
    v18[0] = v24
    let v91: [[s0]] = v35.p1
    let v64: s1 = f90(v35)
    v17[0] = v34
    var v44: [[s0]] = v91
    v13.p1 = v23
    v9.p1 = v44
    v34[0] = v13
    v9.p0 = v20
    return v64
  }
  func f87(_ v0: [s0]) -> [s0] {
    var v2: [s0] = v0
    v2 = v0
    let v4: s0 = v0[0]
    v2[0] = v4
    var v6: [s0] = v2
    v2[0] = v4
    let v1: [[Double]] = v4.p1
    var v3: s0 = v4
    let v7: [[s0]] = [v0, v6, v0, v2]
    let v5: [s0] = v7[1]
    var v8: [[Double]] = v1
    var v9: [[Double]] = v8
    let v12: [[Double]] = v4.p0
    let v13: [Double] = v9[0]
    let v11: s0 = f91(v4, v4)
    v9[0] = v13
    v2[0] = v4
    v3.p0 = v12
    var v19: [[s0]] = v7
    let v17: s0 = f91(v3, v4)
    v19[0] = v2
    let v10: [[Double]] = v17.p0
    v3.p0 = v10
    let v15: s0 = f91(v11, v17)
    let v39: s0 = v2[0]
    let v44: Double = v13[0]
    let v16: [[Double]] = v3.p1
    let v28: s0 = f91(v11, v39)
    v3.p0 = v12
    let v55: s0 = v0[0]
    let v23: [[[Double]]] = [v16, v1, v9, v1, v1, v16, v1]
    let v37: [[Double]] = v23[1]
    let v31: s0 = f91(v4, v4)
    var v65: [Double] = v13
    let v50: [[Double]] = v55.p1
    let v43: [[[s0]]] = [v7, v19, v19, v19]
    v6[0] = v15
    var v36: [Double] = v13
    v3.p1 = v37
    v3.p1 = v8
    let v51: [Double] = v9[1]
    let v149: [[Double]] = v55.p1
    v2 = v5
    let v79: s0 = f91(v31, v28)
    let v45: Double = v51[0]
    v9[0] = v36
    v2 = v5
    v3.p1 = v149
    var v82: Double = v44
    v19[1] = v6
    var v141: [Double] = v65
    let v99: [[s0]] = v43[1]
    let v123: [s0] = v99[3]
    v3.p1 = v50
    var v69: Double = v82
    v2[0] = v79
    v141[0] = v69
    let v167: [s0] = v99[3]
    v19[3] = v167
    v8 = v37
    v36 = v141
    v3.p1 = v8
    v36[0] = v45
    return v123
  }
  func f85(_ v0: s1) -> s1 {
    let v2: s1 = f89(v0)
    var v1: s1 = v0
    var v4: s1 = v2
    v1 = v0
    let v5: [[s0]] = v1.p2
    let v10: [s0] = v5[0]
    let v3: [[s0]] = v4.p1
    let v9: [[[s0]]] = [v3, v3]
    let v7: [s0] = v0.p0
    let v12: [s0] = f87(v10)
    v1.p1 = v3
    let v25: s1 = f89(v1)
    let v16: s1 = f90(v4)
    v4.p2 = v5
    let v17: [[s0]] = v2.p2
    let v27: [[s0]] = v9[0]
    let v30: [[s0]] = v16.p2
    var v28: [s0] = v7
    let v26: [[s0]] = v0.p2
    let v23: s1 = f89(v16)
    var v24: [[s0]] = v17
    v4.p2 = v24
    var v42: [[s0]] = v27
    v1 = v25
    v42[2] = v12
    v4.p2 = v26
    let v45: s1 = f89(v23)
    v1.p2 = v26
    var v57: [s0] = v28
    var v139: [[s0]] = v42
    v1.p1 = v139
    v4.p0 = v57
    v1.p0 = v57
    v4.p2 = v26
    v1.p2 = v24
    v4.p2 = v30
    v1.p2 = v17
    v4.p1 = v139
    v4.p1 = v3
    return v45
  }
  func f66(_ v0: s1) -> s1 {
    var v2: s1 = v0
    let v1: [s1] = [v2]
    let v7: s1 = v1[0]
    let v4: [[s0]] = v2.p2
    v2.p2 = v4
    var v3: s1 = v0
    v2.p2 = v4
    let v8: s1 = v1[0]
    v3 = v2
    let v11: s1 = f90(v3)
    let v10: s1 = f90(v11)
    v3 = v7
    var v30: s1 = v10
    let v24: [s0] = v30.p0
    v30.p2 = v4
    v30.p0 = v24
    let v40: [s0] = v8.p0
    v3.p0 = v40
    return v30
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v8: s1 = v0
    let v5: [s0] = v8.p0
    let v2: s0 = v5[0]
    let v6: s0 = v5[2]
    let v7: s1 = f66(v8)
    var v4: s1 = v8
    v8.p0 = v5
    let v13: [[Double]] = v6.p1
    let v15: [[s0]] = v7.p2
    let v25: [Double] = v13[0]
    let v10: [[s0]] = v0.p1
    let v35: [s0] = v15[0]
    var v32: [s0] = v5
    let v53: s0 = v35[0]
    let v21: [[Double]] = v2.p1
    let v30: [s0] = v7.p0
    v32[0] = v53
    let v17: [s0] = v10[1]
    let v34: s0 = f97(v4, v53)
    let v42: [Double] = v21[0]
    let v70: Double = v1 + v1
    var v22: [s0] = v30
    var v43: Double = v70
    var v61: [[s0]] = v10
    let v45: Double = v42[0]
    v61[1] = v17
    v43 = v45
    var v50: [Double] = v25
    let v92: s1 = f85(v4)
    v4.p0 = v32
    let v176: s1 = s1(p0: v22, p1: v61, p2: v15)
    let v215: [[s0]] = v176.p1
    let v163: [[s0]] = v8.p2
    v8.p1 = v215
    v8 = v92
    v50[0] = v43
    v4.p0 = v22
    v32[0] = v34
    v8.p2 = v163
    let v322: Double = v50[0]
    var v226: Double = v322
    var v184: Double = v226
    return v184
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p1: [[s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])]], p2: [[s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])]])
    let v1: Double = 35.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 35.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
